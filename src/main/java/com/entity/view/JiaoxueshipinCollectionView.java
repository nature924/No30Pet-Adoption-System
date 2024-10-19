package com.entity.view;

import com.entity.JiaoxueshipinCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 视频收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoxueshipin_collection")
public class JiaoxueshipinCollectionView extends JiaoxueshipinCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String jiaoxueshipinCollectionValue;



		//级联表 jiaoxueshipin
			/**
			* 视频标题
			*/
			private String jiaoxueshipinName;
			/**
			* 视频类型
			*/
			private Integer jiaoxueshipinTypes;
				/**
				* 视频类型的值
				*/
				private String jiaoxueshipinValue;
			/**
			* 封面
			*/
			private String jiaoxueshipinPhoto;
			/**
			* 视频
			*/
			private String jiaoxueshipinVideo;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 详情
			*/
			private String jiaoxueshipinContent;

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

	public JiaoxueshipinCollectionView() {

	}

	public JiaoxueshipinCollectionView(JiaoxueshipinCollectionEntity jiaoxueshipinCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoxueshipinCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getJiaoxueshipinCollectionValue() {
				return jiaoxueshipinCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setJiaoxueshipinCollectionValue(String jiaoxueshipinCollectionValue) {
				this.jiaoxueshipinCollectionValue = jiaoxueshipinCollectionValue;
			}






















				//级联表的get和set jiaoxueshipin
					/**
					* 获取： 视频标题
					*/
					public String getJiaoxueshipinName() {
						return jiaoxueshipinName;
					}
					/**
					* 设置： 视频标题
					*/
					public void setJiaoxueshipinName(String jiaoxueshipinName) {
						this.jiaoxueshipinName = jiaoxueshipinName;
					}
					/**
					* 获取： 视频类型
					*/
					public Integer getJiaoxueshipinTypes() {
						return jiaoxueshipinTypes;
					}
					/**
					* 设置： 视频类型
					*/
					public void setJiaoxueshipinTypes(Integer jiaoxueshipinTypes) {
						this.jiaoxueshipinTypes = jiaoxueshipinTypes;
					}


						/**
						* 获取： 视频类型的值
						*/
						public String getJiaoxueshipinValue() {
							return jiaoxueshipinValue;
						}
						/**
						* 设置： 视频类型的值
						*/
						public void setJiaoxueshipinValue(String jiaoxueshipinValue) {
							this.jiaoxueshipinValue = jiaoxueshipinValue;
						}
					/**
					* 获取： 封面
					*/
					public String getJiaoxueshipinPhoto() {
						return jiaoxueshipinPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setJiaoxueshipinPhoto(String jiaoxueshipinPhoto) {
						this.jiaoxueshipinPhoto = jiaoxueshipinPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getJiaoxueshipinVideo() {
						return jiaoxueshipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setJiaoxueshipinVideo(String jiaoxueshipinVideo) {
						this.jiaoxueshipinVideo = jiaoxueshipinVideo;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 详情
					*/
					public String getJiaoxueshipinContent() {
						return jiaoxueshipinContent;
					}
					/**
					* 设置： 详情
					*/
					public void setJiaoxueshipinContent(String jiaoxueshipinContent) {
						this.jiaoxueshipinContent = jiaoxueshipinContent;
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
