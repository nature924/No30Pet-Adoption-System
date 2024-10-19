package com.entity.view;

import com.entity.ChongwulingyangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 宠物领养
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwulingyang")
public class ChongwulingyangView extends ChongwulingyangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String chongwulingyangValue;
		/**
		* 是否被认领的值
		*/
		private String jieshuValue;



	public ChongwulingyangView() {

	}

	public ChongwulingyangView(ChongwulingyangEntity chongwulingyangEntity) {
		try {
			BeanUtils.copyProperties(this, chongwulingyangEntity);
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
			* 获取： 是否被认领的值
			*/
			public String getJieshuValue() {
				return jieshuValue;
			}
			/**
			* 设置： 是否被认领的值
			*/
			public void setJieshuValue(String jieshuValue) {
				this.jieshuValue = jieshuValue;
			}














}
