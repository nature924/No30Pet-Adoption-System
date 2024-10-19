package com.entity.vo;

import com.entity.ChongwulingyangshenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物领养审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwulingyangshenhe")
public class ChongwulingyangshenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
