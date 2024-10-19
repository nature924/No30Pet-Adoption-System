package com.entity.view;

import com.entity.ChongwurenlingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 宠物认领
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwurenling")
public class ChongwurenlingView extends ChongwurenlingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String chongwulingyangValue;
		/**
		* 是否找到主人的值
		*/
		private String jieshuValue;



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

	public ChongwurenlingView() {

	}

	public ChongwurenlingView(ChongwurenlingEntity chongwurenlingEntity) {
		try {
			BeanUtils.copyProperties(this, chongwurenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
