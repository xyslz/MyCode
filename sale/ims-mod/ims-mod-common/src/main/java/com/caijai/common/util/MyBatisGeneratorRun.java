package com.caijai.common.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * mybatis自动生成实体启动类
 * @author WHD
 *
 */
public class MyBatisGeneratorRun {

	public static void main(String[] args) throws Exception {
		MyBatisGeneratorRun app = new MyBatisGeneratorRun();
		app.generator();
	}

	public void generator() throws Exception {
		
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("mybatisgenerator.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(resourceAsStream);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);

		for (String warning : warnings) {
			System.out.println(warning);
		}
	}
}