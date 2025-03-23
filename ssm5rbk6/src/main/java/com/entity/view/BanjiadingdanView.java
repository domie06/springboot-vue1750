package com.entity.view;

import com.entity.BanjiadingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 搬家订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
@TableName("banjiadingdan")
public class BanjiadingdanView  extends BanjiadingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjiadingdanView(){
	}
 
 	public BanjiadingdanView(BanjiadingdanEntity banjiadingdanEntity){
 	try {
			BeanUtils.copyProperties(this, banjiadingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
