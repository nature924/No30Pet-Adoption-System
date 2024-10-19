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
 * 感谢信
 *
 * @author 
 * @email
 */
@TableName("ganxiexin")
public class GanxiexinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GanxiexinEntity() {

	}

	public GanxiexinEntity(T t) {
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
     * 标题
     */
    @TableField(value = "ganxiexin_name")

    private String ganxiexinName;


    /**
     * 发布用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 内容
     */
    @TableField(value = "ganxiexin_content")

    private String ganxiexinContent;


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
	 * 设置：标题
	 */
    public String getGanxiexinName() {
        return ganxiexinName;
    }


    /**
	 * 获取：标题
	 */

    public void setGanxiexinName(String ganxiexinName) {
        this.ganxiexinName = ganxiexinName;
    }
    /**
	 * 设置：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：内容
	 */
    public String getGanxiexinContent() {
        return ganxiexinContent;
    }


    /**
	 * 获取：内容
	 */

    public void setGanxiexinContent(String ganxiexinContent) {
        this.ganxiexinContent = ganxiexinContent;
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
        return "Ganxiexin{" +
            "id=" + id +
            ", ganxiexinName=" + ganxiexinName +
            ", yonghuId=" + yonghuId +
            ", ganxiexinContent=" + ganxiexinContent +
            ", createTime=" + createTime +
        "}";
    }
}
