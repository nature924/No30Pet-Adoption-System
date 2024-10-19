package com.entity.vo;

import com.entity.ChongwulingyangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物领养
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chongwulingyang")
public class ChongwulingyangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "chongwulingyang_name")
    private String chongwulingyangName;


    /**
     * 类型
     */

    @TableField(value = "chongwulingyang_types")
    private Integer chongwulingyangTypes;


    /**
     * 宠物图片
     */

    @TableField(value = "chongwulingyang_photo")
    private String chongwulingyangPhoto;


    /**
     * 是否被认领
     */

    @TableField(value = "jieshu_types")
    private Integer jieshuTypes;


    /**
     * 宠物详情
     */

    @TableField(value = "chongwulingyang_content")
    private String chongwulingyangContent;


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
    public String getChongwulingyangName() {
        return chongwulingyangName;
    }


    /**
	 * 获取：标题
	 */

    public void setChongwulingyangName(String chongwulingyangName) {
        this.chongwulingyangName = chongwulingyangName;
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
    public String getChongwulingyangPhoto() {
        return chongwulingyangPhoto;
    }


    /**
	 * 获取：宠物图片
	 */

    public void setChongwulingyangPhoto(String chongwulingyangPhoto) {
        this.chongwulingyangPhoto = chongwulingyangPhoto;
    }
    /**
	 * 设置：是否被认领
	 */
    public Integer getJieshuTypes() {
        return jieshuTypes;
    }


    /**
	 * 获取：是否被认领
	 */

    public void setJieshuTypes(Integer jieshuTypes) {
        this.jieshuTypes = jieshuTypes;
    }
    /**
	 * 设置：宠物详情
	 */
    public String getChongwulingyangContent() {
        return chongwulingyangContent;
    }


    /**
	 * 获取：宠物详情
	 */

    public void setChongwulingyangContent(String chongwulingyangContent) {
        this.chongwulingyangContent = chongwulingyangContent;
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
