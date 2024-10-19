package com.entity.vo;

import com.entity.ChongwurenlingshenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物认领审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwurenlingshenhe")
public class ChongwurenlingshenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
