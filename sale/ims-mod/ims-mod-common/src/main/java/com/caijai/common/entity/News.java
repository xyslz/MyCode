package com.caijai.common.entity;

import com.caijai.base.anno.Column;
import com.caijai.base.anno.Table;
import com.caijai.base.entity.BaseTable;

/**
* 
* @author whd
* @Date 2019-05-17
* 企业新闻表
* 数据表COMMON_NEWS映射bean，由Mybaits自动生成工具生成
*/
@Table(name="COMMON_NEWS")
public class News extends BaseTable{

	private static final long serialVersionUID = 743970885096012136L;

	/**
     * 主键ID
	 * 列名:id 类型:NVARCHAR(100) 允许空:false 缺省值:null
     */
    @Column(name = "id",primary=true)
    private String id;

    /**
     * 新闻标题
	 * 列名:news_title 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "news_title")
    private String newsTitle;

    /**
     * 新闻副标题
	 * 列名:new_subtitle 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "new_subtitle")
    private String newSubtitle;

    /**
     * 新闻封面图片
	 * 列名:news_cover_image 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "news_cover_image")
    private String newsCoverImage;

    /**
     * 新闻信息类别
	 * 列名:news_category 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "news_category")
    private String newsCategory;

    /**
     * 新闻关键字
	 * 列名:news_keyword 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "news_keyword")
    private String newsKeyword;

    /**
     * 导读
	 * 列名:news_guide_reading 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "news_guide_reading")
    private String newsGuideReading;

    /**
     * 新闻内容
	 * 列名:news_content 类型:LONGVARCHAR(2147483647) 允许空:true 缺省值:null
     */
    @Column(name = "news_content")
    private String newsContent;
    /**
     * 存储位置
	 * 列名:news_position 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "news_position")
    private String newsPosition;

    /**
     * 新闻作者
	 * 列名:news_author 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "news_author")
    private String newsAuthor;

    /**
     * 浏览次数（点击次数）
	 * 列名:news_browse_times 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "news_browse_times")
    private Integer newsBrowseTimes;

    /**
     * 是否推送到首页  1代表是   0代表否
	 * 列名:news_is_push 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "news_is_push")
    private Integer newsIsPush;

    /**
     * 是否已发布    1代表是   0代表否
	 * 列名:news_is_release 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "news_is_release")
    private Integer newsIsRelease;

    /**
     * 发布时间
	 * 列名:news_date 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "news_Date")
    private String newsDate;

    /**
     * 是否审核   1代表是   0代表否
	 * 列名:news_is_examine 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "news_is_examine")
    private Integer newsIsExamine;

    /**
     * 是否置顶   1代表是   0代表否
	 * 列名:news_is_top 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "news_is_top")
    private Integer newsIsTop;

    /**
     * 是否允许评论   1代表是   0代表否
	 * 列名:news_is_comments 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "news_is_comments")
    private Integer newsIsComments;

    /**
     * 新闻描述
	 * 列名:news_describe 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "news_describe")
    private String newsDescribe;

    /**
     * 新闻状态
	 * 列名:news_status 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "news_status")
    private String newsStatus;

    /**
     * 删除标识 1代表是   0代表否
	 * 列名:dr 类型:INTEGER(10) 允许空:true 缺省值:null
     */
    @Column(name = "dr")
    private Integer dr;

    /**
     * 时间戳
	 * 列名:ts 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "ts")
    private String ts;

    /**
     * 创建时间
	 * 列名:createdOn 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "createdOn")
    private String createdOn;

    /**
     * 创建人
	 * 列名:createdBy 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "createdBy")
    private String createdBy;

    /**
     * 修改时间
	 * 列名:modifiedOn 类型:TIMESTAMP(23) 允许空:true 缺省值:null
     */
    @Column(name = "modifiedOn")
    private String modifiedOn;

    /**
     * 修改人
	 * 列名:modifiedBy 类型:NVARCHAR(100) 允许空:true 缺省值:null
     */
    @Column(name = "modifiedBy")
    private String modifiedBy;

    /**
     * 组织ID
	 * 列名:org 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "org")
    private String org;

    /**
     * 预留字段1
	 * 列名:def1 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def1")
    private String def1;

    /**
     * 预留字段1
	 * 列名:def2 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def2")
    private String def2;

    /**
     * 预留字段1
	 * 列名:def3 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def3")
    private String def3;

    /**
     * 预留字段1
	 * 列名:def4 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def4")
    private String def4;

    /**
     * 预留字段1
	 * 列名:def5 类型:NVARCHAR(500) 允许空:true 缺省值:null
     */
    @Column(name = "def5")
    private String def5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewSubtitle() {
        return newSubtitle;
    }

    public void setNewSubtitle(String newSubtitle) {
        this.newSubtitle = newSubtitle == null ? null : newSubtitle.trim();
    }

    public String getNewsCoverImage() {
        return newsCoverImage;
    }

    public void setNewsCoverImage(String newsCoverImage) {
        this.newsCoverImage = newsCoverImage == null ? null : newsCoverImage.trim();
    }

    public String getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(String newsCategory) {
        this.newsCategory = newsCategory == null ? null : newsCategory.trim();
    }

    public String getNewsKeyword() {
        return newsKeyword;
    }

    public void setNewsKeyword(String newsKeyword) {
        this.newsKeyword = newsKeyword == null ? null : newsKeyword.trim();
    }

    public String getNewsGuideReading() {
        return newsGuideReading;
    }

    public void setNewsGuideReading(String newsGuideReading) {
        this.newsGuideReading = newsGuideReading == null ? null : newsGuideReading.trim();
    }

    public String getNewsPosition() {
        return newsPosition;
    }

    public void setNewsPosition(String newsPosition) {
        this.newsPosition = newsPosition == null ? null : newsPosition.trim();
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor == null ? null : newsAuthor.trim();
    }

    public Integer getNewsBrowseTimes() {
        return newsBrowseTimes;
    }

    public void setNewsBrowseTimes(Integer newsBrowseTimes) {
        this.newsBrowseTimes = newsBrowseTimes;
    }

    public Integer getNewsIsPush() {
        return newsIsPush;
    }

    public void setNewsIsPush(Integer newsIsPush) {
        this.newsIsPush = newsIsPush;
    }

    public Integer getNewsIsRelease() {
        return newsIsRelease;
    }

    public void setNewsIsRelease(Integer newsIsRelease) {
        this.newsIsRelease = newsIsRelease;
    }

    public String getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

	public Integer getNewsIsExamine() {
        return newsIsExamine;
    }

    public void setNewsIsExamine(Integer newsIsExamine) {
        this.newsIsExamine = newsIsExamine;
    }

    public Integer getNewsIsTop() {
        return newsIsTop;
    }

    public void setNewsIsTop(Integer newsIsTop) {
        this.newsIsTop = newsIsTop;
    }

    public Integer getNewsIsComments() {
        return newsIsComments;
    }

    public void setNewsIsComments(Integer newsIsComments) {
        this.newsIsComments = newsIsComments;
    }

    public String getNewsDescribe() {
        return newsDescribe;
    }

    public void setNewsDescribe(String newsDescribe) {
        this.newsDescribe = newsDescribe == null ? null : newsDescribe.trim();
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus == null ? null : newsStatus.trim();
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }


    public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

	@Override
	public String toString() {
		return "CommonNews [id=" + id + ", newsTitle=" + newsTitle + ", newSubtitle=" + newSubtitle
				+ ", newsCoverImage=" + newsCoverImage + ", newsCategory=" + newsCategory + ", newsKeyword="
				+ newsKeyword + ", newsGuideReading=" + newsGuideReading + ", newsContent=" + newsContent
				+ ", newsPosition=" + newsPosition + ", newsAuthor=" + newsAuthor + ", newsBrowseTimes="
				+ newsBrowseTimes + ", newsIsPush=" + newsIsPush + ", newsIsRelease=" + newsIsRelease + ", newsDate="
				+ newsDate + ", newsIsExamine=" + newsIsExamine + ", newsIsTop=" + newsIsTop + ", newsIsComments="
				+ newsIsComments + ", newsDescribe=" + newsDescribe + ", newsStatus=" + newsStatus + ", dr=" + dr
				+ ", ts=" + ts + ", createdon=" + createdOn + ", createdby=" + createdBy + ", modifiedon=" + modifiedOn
				+ ", modifiedby=" + modifiedBy + ", org=" + org + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3
				+ ", def4=" + def4 + ", def5=" + def5 + "]";
	}
}