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
 * 宠物领养审核
 *
 * @author 
 * @email
 */
@TableName("chongwulingyangshenhe")
public class ChongwulingyangshenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwulingyangshenheEntity() {

	}

	public ChongwulingyangshenheEntity(T t) {
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
     * 宠物领养
     */
    @TableField(value = "chongwulingyang_id")

    private Integer chongwulingyangId;


    /**
     * 领养用户
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
    @TableField(value = "chongwulingyangshenhe_yesno_types")

    private Integer chongwulingyangshenheYesnoTypes;


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
	 * 设置：宠物领养
	 */
    public Integer getChongwulingyangId() {
        return chongwulingyangId;
    }


    /**
	 * 获取：宠物领养
	 */

    public void setChongwulingyangId(Integer chongwulingyangId) {
        this.chongwulingyangId = chongwulingyangId;
    }
    /**
	 * 设置：领养用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：领养用户
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
    public Integer getChongwulingyangshenheYesnoTypes() {
        return chongwulingyangshenheYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setChongwulingyangshenheYesnoTypes(Integer chongwulingyangshenheYesnoTypes) {
        this.chongwulingyangshenheYesnoTypes = chongwulingyangshenheYesnoTypes;
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
        return "Chongwulingyangshenhe{" +
            "id=" + id +
            ", chongwulingyangId=" + chongwulingyangId +
            ", yonghuId=" + yonghuId +
            ", chongwurenlingshenheText=" + chongwurenlingshenheText +
            ", chongwulingyangshenheYesnoTypes=" + chongwulingyangshenheYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
