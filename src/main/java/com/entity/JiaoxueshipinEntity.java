package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教学视频
 *
 * @author 
 * @email
 */
@TableName("jiaoxueshipin")
public class JiaoxueshipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoxueshipinEntity() {

	}

	public JiaoxueshipinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 视频标题
     */
    @TableField(value = "jiaoxueshipin_name")

    private String jiaoxueshipinName;


    /**
     * 视频类型
     */
    @TableField(value = "jiaoxueshipin_types")

    private Integer jiaoxueshipinTypes;


    /**
     * 封面
     */
    @TableField(value = "jiaoxueshipin_photo")

    private String jiaoxueshipinPhoto;


    /**
     * 视频
     */
    @TableField(value = "jiaoxueshipin_video")

    private String jiaoxueshipinVideo;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 详情
     */
    @TableField(value = "jiaoxueshipin_content")

    private String jiaoxueshipinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：视频标题
	 */
    public String getJiaoxueshipinName() {
        return jiaoxueshipinName;
    }


    /**
	 * 获取：视频标题
	 */

    public void setJiaoxueshipinName(String jiaoxueshipinName) {
        this.jiaoxueshipinName = jiaoxueshipinName;
    }
    /**
	 * 设置：视频类型
	 */
    public Integer getJiaoxueshipinTypes() {
        return jiaoxueshipinTypes;
    }


    /**
	 * 获取：视频类型
	 */

    public void setJiaoxueshipinTypes(Integer jiaoxueshipinTypes) {
        this.jiaoxueshipinTypes = jiaoxueshipinTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getJiaoxueshipinPhoto() {
        return jiaoxueshipinPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setJiaoxueshipinPhoto(String jiaoxueshipinPhoto) {
        this.jiaoxueshipinPhoto = jiaoxueshipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getJiaoxueshipinVideo() {
        return jiaoxueshipinVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setJiaoxueshipinVideo(String jiaoxueshipinVideo) {
        this.jiaoxueshipinVideo = jiaoxueshipinVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：详情
	 */
    public String getJiaoxueshipinContent() {
        return jiaoxueshipinContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJiaoxueshipinContent(String jiaoxueshipinContent) {
        this.jiaoxueshipinContent = jiaoxueshipinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaoxueshipin{" +
            "id=" + id +
            ", jiaoxueshipinName=" + jiaoxueshipinName +
            ", jiaoxueshipinTypes=" + jiaoxueshipinTypes +
            ", jiaoxueshipinPhoto=" + jiaoxueshipinPhoto +
            ", jiaoxueshipinVideo=" + jiaoxueshipinVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", jiaoxueshipinContent=" + jiaoxueshipinContent +
            ", createTime=" + createTime +
        "}";
    }
}
