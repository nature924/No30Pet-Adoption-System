package com.entity.vo;

import com.entity.ChongwurenlingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物认领
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwurenling")
public class ChongwurenlingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "chongwurenling_name")
    private String chongwurenlingName;


    /**
     * 类型
     */

    @TableField(value = "chongwulingyang_types")
    private Integer chongwulingyangTypes;


    /**
     * 宠物图片
     */

    @TableField(value = "chongwurenling_photo")
    private String chongwurenlingPhoto;


    /**
     * 发布用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 是否找到主人
     */

    @TableField(value = "jieshu_types")
    private Integer jieshuTypes;


    /**
     * 宠物详情
     */

    @TableField(value = "chongwurenling_content")
    private String chongwurenlingContent;


    /**
     * 创建时间  show1 show2 photoShow
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
    public String getChongwurenlingName() {
        return chongwurenlingName;
    }


    /**
	 * 获取：标题
	 */

    public void setChongwurenlingName(String chongwurenlingName) {
        this.chongwurenlingName = chongwurenlingName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getChongwulingyangTypes() {
        return chongwulingyangTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setChongwulingyangTypes(Integer chongwulingyangTypes) {
        this.chongwulingyangTypes = chongwulingyangTypes;
    }
    /**
	 * 设置：宠物图片
	 */
    public String getChongwurenlingPhoto() {
        return chongwurenlingPhoto;
    }


    /**
	 * 获取：宠物图片
	 */

    public void setChongwurenlingPhoto(String chongwurenlingPhoto) {
        this.chongwurenlingPhoto = chongwurenlingPhoto;
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
	 * 设置：是否找到主人
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 获取：是否找到主人
	 */

    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 设置：宠物详情
	 */
    public String getChongwurenlingContent() {
        return chongwurenlingContent;
    }


    /**
	 * 获取：宠物详情
	 */

    public void setChongwurenlingContent(String chongwurenlingContent) {
        this.chongwurenlingContent = chongwurenlingContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
