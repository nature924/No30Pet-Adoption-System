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
 * 宠物认领审核
 *
 * @author 
 * @email
 */
@TableName("chongwurenlingshenhe")
public class ChongwurenlingshenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwurenlingshenheEntity() {

	}

	public ChongwurenlingshenheEntity(T t) {
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
     * 宠物认领
     */
    @TableField(value = "chongwurenling_id")

    private Integer chongwurenlingId;


    /**
     * 认领用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 认领理由
     */
    @TableField(value = "chongwurenlingshenhe_text")

    private String chongwurenlingshenheText;


    /**
     * 申请状态
     */
    @TableField(value = "chongwurenlingshenhe_yesno_types")

    private Integer chongwurenlingshenheYesnoTypes;


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
	 * 设置：宠物认领
	 */
    public Integer getChongwurenlingId() {
        return chongwurenlingId;
    }


    /**
	 * 获取：宠物认领
	 */

    public void setChongwurenlingId(Integer chongwurenlingId) {
        this.chongwurenlingId = chongwurenlingId;
    }
    /**
	 * 设置：认领用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：认领用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：认领理由
	 */
    public String getChongwurenlingshenheText() {
        return chongwurenlingshenheText;
    }


    /**
	 * 获取：认领理由
	 */

    public void setChongwurenlingshenheText(String chongwurenlingshenheText) {
        this.chongwurenlingshenheText = chongwurenlingshenheText;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getChongwurenlingshenheYesnoTypes() {
        return chongwurenlingshenheYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setChongwurenlingshenheYesnoTypes(Integer chongwurenlingshenheYesnoTypes) {
        this.chongwurenlingshenheYesnoTypes = chongwurenlingshenheYesnoTypes;
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
        return "Chongwurenlingshenhe{" +
            "id=" + id +
            ", chongwurenlingId=" + chongwurenlingId +
            ", yonghuId=" + yonghuId +
            ", chongwurenlingshenheText=" + chongwurenlingshenheText +
            ", chongwurenlingshenheYesnoTypes=" + chongwurenlingshenheYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
