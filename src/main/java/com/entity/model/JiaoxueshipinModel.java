package com.entity.model;

import com.entity.JiaoxueshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教学视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoxueshipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 视频标题
     */
    private String jiaoxueshipinName;


    /**
     * 视频类型
     */
    private Integer jiaoxueshipinTypes;


    /**
     * 封面
     */
    private String jiaoxueshipinPhoto;


    /**
     * 视频
     */
    private String jiaoxueshipinVideo;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 详情
     */
    private String jiaoxueshipinContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：视频标题
	 */
    public String getJiaoxueshipinName() {
        return jiaoxueshipinName;
    }


    /**
	 * 设置：视频标题
	 */
    public void setJiaoxueshipinName(String jiaoxueshipinName) {
        this.jiaoxueshipinName = jiaoxueshipinName;
    }
    /**
	 * 获取：视频类型
	 */
    public Integer getJiaoxueshipinTypes() {
        return jiaoxueshipinTypes;
    }


    /**
	 * 设置：视频类型
	 */
    public void setJiaoxueshipinTypes(Integer jiaoxueshipinTypes) {
        this.jiaoxueshipinTypes = jiaoxueshipinTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getJiaoxueshipinPhoto() {
        return jiaoxueshipinPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setJiaoxueshipinPhoto(String jiaoxueshipinPhoto) {
        this.jiaoxueshipinPhoto = jiaoxueshipinPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getJiaoxueshipinVideo() {
        return jiaoxueshipinVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setJiaoxueshipinVideo(String jiaoxueshipinVideo) {
        this.jiaoxueshipinVideo = jiaoxueshipinVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：详情
	 */
    public String getJiaoxueshipinContent() {
        return jiaoxueshipinContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJiaoxueshipinContent(String jiaoxueshipinContent) {
        this.jiaoxueshipinContent = jiaoxueshipinContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
