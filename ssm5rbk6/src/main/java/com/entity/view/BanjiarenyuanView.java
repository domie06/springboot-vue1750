package com.entity.view;

import com.entity.BanjiarenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 搬家人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
@TableName("banjiarenyuan")
public class BanjiarenyuanView  extends BanjiarenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjiarenyuanView(){
	}
 
 	public BanjiarenyuanView(BanjiarenyuanEntity banjiarenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, banjiarenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
