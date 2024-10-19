package com.entity.vo;

import com.entity.GanxiexinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 感谢信
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ganxiexin")
public class GanxiexinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show2 nameShow
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
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
