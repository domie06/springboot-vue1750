package com.entity.vo;

import com.entity.BanjiaxuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 搬家须知
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public class BanjiaxuzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收费标准
	 */
	
	private String shoufeibiaozhun;
		
	/**
	 * 搬家流程
	 */
	
	private String banjialiucheng;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 附件
	 */
	
	private String fujian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：收费标准
	 */
	 
	public void setShoufeibiaozhun(String shoufeibiaozhun) {
		this.shoufeibiaozhun = shoufeibiaozhun;
	}
	
	/**
	 * 获取：收费标准
	 */
	public String getShoufeibiaozhun() {
		return shoufeibiaozhun;
	}
				
	
	/**
	 * 设置：搬家流程
	 */
	 
	public void setBanjialiucheng(String banjialiucheng) {
		this.banjialiucheng = banjialiucheng;
	}
	
	/**
	 * 获取：搬家流程
	 */
	public String getBanjialiucheng() {
		return banjialiucheng;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
