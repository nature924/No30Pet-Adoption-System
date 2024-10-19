package com.entity.model;

import com.entity.ChongwurenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物认领
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwurenlingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String chongwurenlingName;


    /**
     * 类型
     */
    private Integer chongwulingyangTypes;


    /**
     * 宠物图片
     */
    private String chongwurenlingPhoto;


    /**
     * 发布用户
     */
    private Integer yonghuId;


    /**
     * 是否找到主人
     */
    private Integer jieshuTypes;


    /**
     * 宠物详情
     */
    private String chongwurenlingContent;


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
	 * 获取：标题
	 */
    public String getChongwurenlingName() {
        return chongwurenlingName;
    }


    /**
	 * 设置：标题
	 */
    public void setChongwurenlingName(String chongwurenlingName) {
        this.chongwurenlingName = chongwurenlingName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getChongwulingyangTypes() {
        return chongwulingyangTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setChongwulingyangTypes(Integer chongwulingyangTypes) {
        this.chongwulingyangTypes = chongwulingyangTypes;
    }
    /**
	 * 获取：宠物图片
	 */
    public String getChongwurenlingPhoto() {
        return chongwurenlingPhoto;
    }


    /**
	 * 设置：宠物图片
	 */
    public void setChongwurenlingPhoto(String chongwurenlingPhoto) {
        this.chongwurenlingPhoto = chongwurenlingPhoto;
    }
    /**
	 * 获取：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：发布用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：是否找到主人
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 设置：是否找到主人
	 */
    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 获取：宠物详情
	 */
    public String getChongwurenlingContent() {
        return chongwurenlingContent;
    }


    /**
	 * 设置：宠物详情
	 */
    public void setChongwurenlingContent(String chongwurenlingContent) {
        this.chongwurenlingContent = chongwurenlingContent;
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
