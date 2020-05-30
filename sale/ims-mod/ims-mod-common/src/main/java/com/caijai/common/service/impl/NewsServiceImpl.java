package com.caijai.common.service.impl;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.caijai.common.entity.News;
import com.caijai.common.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService{

	@Override
	public String upload(MultipartFile file) {
		// 保存相对路径到数据库 图片写入服务器
		String newFileName = "";
        if (file != null && !file.isEmpty()) {
        	// 获取图片的文件名
            String fileName = file.getOriginalFilename();
            // 获取图片的扩展名
            String extensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
            // 新的图片文件名 = 获取时间戳+"."图片扩展名
            newFileName = String.valueOf(System.currentTimeMillis()) + "." + extensionName;
            saveFile(newFileName, file);
        }
        return newFileName;
	}
	
   private void saveFile(String newFileName, MultipartFile filedata) {
        // 根据配置文件获取服务器图片存放路径
        String picDir = "C:/MESSYS/othor-resources/images";
        String saveFilePath = picDir;

        /* 构建文件目录 */
        File fileDir = new File(saveFilePath);
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }

        try {
            FileOutputStream out = new FileOutputStream(saveFilePath + "\\" + newFileName);
            // 写入文件
            out.write(filedata.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	private void deleteFile(String oldPicName) {
        String picDir = "C:/MESSYS/othor-resources/images";
        /* 构建文件目录 */
        File fileDir = new File(picDir+"/"+oldPicName);
        if (fileDir.exists()) {
            //把修改之前的图片删除 以免太多没用的图片占据空间
            fileDir.delete();
        }
	}
}
