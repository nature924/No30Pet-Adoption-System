package com.entity.view;

import com.entity.JiaoxueshipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教学视频
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoxueshipin")
public class JiaoxueshipinView extends JiaoxueshipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 视频类型的值
		*/
		private String jiaoxueshipinValue;



	public JiaoxueshipinView() {

	}

	public JiaoxueshipinView(JiaoxueshipinEntity jiaoxueshipinEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoxueshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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














}
