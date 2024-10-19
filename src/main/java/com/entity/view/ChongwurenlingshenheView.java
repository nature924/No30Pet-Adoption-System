package com.entity.view;

import com.entity.ChongwurenlingshenheEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 宠物认领审核
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwurenlingshenhe")
public class ChongwurenlingshenheView extends ChongwurenlingshenheEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申请状态的值
		*/
		private String chongwurenlingshenheYesnoValue;



		//级联表 chongwurenling
			/**
			* 标题
			*/
			private String chongwurenlingName;
			/**
			* 类型
			*/
			private Integer chongwulingyangTypes;
			/**
			* 类型
			*/
			private Integer yonghuIdJilian;

	public Integer getYonghuIdJilian() {
		return yonghuIdJilian;
	}

	public void setYonghuIdJilian(Integer yonghuIdJilian) {
		this.yonghuIdJilian = yonghuIdJilian;
	}

	/**
				* 类型的值
				*/
				private String chongwulingyangValue;
			/**
			* 宠物图片
			*/
			private String chongwurenlingPhoto;
			/**
			* 是否找到主人
			*/
			private Integer jieshuTypes;
				/**
				* 是否找到主人的值
				*/
				private String jieshuValue;
			/**
			* 宠物详情
			*/
			private String chongwurenlingContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 个人地址
			*/
			private String yonghuAddress;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public ChongwurenlingshenheView() {

	}

	public ChongwurenlingshenheView(ChongwurenlingshenheEntity chongwurenlingshenheEntity) {
		try {
			BeanUtils.copyProperties(this, chongwurenlingshenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请状态的值
			*/
			public String getChongwurenlingshenheYesnoValue() {
				return chongwurenlingshenheYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setChongwurenlingshenheYesnoValue(String chongwurenlingshenheYesnoValue) {
				this.chongwurenlingshenheYesnoValue = chongwurenlingshenheYesnoValue;
			}










				//级联表的get和set chongwurenling
					/**
					* 获取： 标题
					*/
					public String getChongwurenlingName() {
						return chongwurenlingName;
					}
					/**
					* 设置： 标题
					*/
					public void setChongwurenlingName(String chongwurenlingName) {
						this.chongwurenlingName = chongwurenlingName;
					}
					/**
					* 获取： 类型
					*/
					public Integer getChongwulingyangTypes() {
						return chongwulingyangTypes;
					}
					/**
					* 设置： 类型
					*/
					public void setChongwulingyangTypes(Integer chongwulingyangTypes) {
						this.chongwulingyangTypes = chongwulingyangTypes;
					}


						/**
						* 获取： 类型的值
						*/
						public String getChongwulingyangValue() {
							return chongwulingyangValue;
						}
						/**
						* 设置： 类型的值
						*/
						public void setChongwulingyangValue(String chongwulingyangValue) {
							this.chongwulingyangValue = chongwulingyangValue;
						}
					/**
					* 获取： 宠物图片
					*/
					public String getChongwurenlingPhoto() {
						return chongwurenlingPhoto;
					}
					/**
					* 设置： 宠物图片
					*/
					public void setChongwurenlingPhoto(String chongwurenlingPhoto) {
						this.chongwurenlingPhoto = chongwurenlingPhoto;
					}
					/**
					* 获取： 是否找到主人
					*/
					public Integer getJieshuTypes() {
						return jieshuTypes;
					}
					/**
					* 设置： 是否找到主人
					*/
					public void setJieshuTypes(Integer jieshuTypes) {
						this.jieshuTypes = jieshuTypes;
					}


						/**
						* 获取： 是否找到主人的值
						*/
						public String getJieshuValue() {
							return jieshuValue;
						}
						/**
						* 设置： 是否找到主人的值
						*/
						public void setJieshuValue(String jieshuValue) {
							this.jieshuValue = jieshuValue;
						}
					/**
					* 获取： 宠物详情
					*/
					public String getChongwurenlingContent() {
						return chongwurenlingContent;
					}
					/**
					* 设置： 宠物详情
					*/
					public void setChongwurenlingContent(String chongwurenlingContent) {
						this.chongwurenlingContent = chongwurenlingContent;
					}

























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 个人地址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 个人地址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
