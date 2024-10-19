package com.entity.model;

import com.entity.ChongwulingyangshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物领养审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChongwulingyangshenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物领养
     */
    private Integer chongwulingyangId;


    /**
     * 领养用户
     */
    private Integer yonghuId;


    /**
     * 认领理由
     */
    private String chongwurenlingshenheText;


    /**
     * 申请状态
     */
    private Integer chongwulingyangshenheYesnoTypes;


    /**
     * 创建时间 show3 photoShow
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
	 * 获取：宠物领养
	 */
    public Integer getChongwulingyangId() {
        return chongwulingyangId;
    }


    /**
	 * 设置：宠物领养
	 */
    public void setChongwulingyangId(Integer chongwulingyangId) {
        this.chongwulingyangId = chongwulingyangId;
    }
    /**
	 * 获取：领养用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：领养用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：认领理由
	 */
    public String getChongwurenlingshenheText() {
        return chongwurenlingshenheText;
    }


    /**
	 * 设置：认领理由
	 */
    public void setChongwurenlingshenheText(String chongwurenlingshenheText) {
        this.chongwurenlingshenheText = chongwurenlingshenheText;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getChongwulingyangshenheYesnoTypes() {
        return chongwulingyangshenheYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setChongwulingyangshenheYesnoTypes(Integer chongwulingyangshenheYesnoTypes) {
        this.chongwulingyangshenheYesnoTypes = chongwulingyangshenheYesnoTypes;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
