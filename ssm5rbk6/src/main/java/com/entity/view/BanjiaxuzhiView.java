package com.entity.view;

import com.entity.BanjiaxuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 搬家须知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
@TableName("banjiaxuzhi")
public class BanjiaxuzhiView  extends BanjiaxuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjiaxuzhiView(){
	}
 
 	public BanjiaxuzhiView(BanjiaxuzhiEntity banjiaxuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, banjiaxuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
