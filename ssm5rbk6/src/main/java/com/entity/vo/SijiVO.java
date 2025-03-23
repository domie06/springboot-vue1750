package com.entity.vo;

import com.entity.SijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 司机
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public class SijiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 司机姓名
	 */
	
	private String sijixingming;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 驾龄
	 */
	
	private Integer jialing;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 车辆品牌
	 */
	
	private String cheliangpinpai;
		
	/**
	 * 货车类型
	 */
	
	private String huocheleixing;
		
	/**
	 * 司机电话
	 */
	
	private String sijidianhua;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：司机姓名
	 */
	 
	public void setSijixingming(String sijixingming) {
		this.sijixingming = sijixingming;
	}
	
	/**
	 * 获取：司机姓名
	 */
	public String getSijixingming() {
		return sijixingming;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：驾龄
	 */
	 
	public void setJialing(Integer jialing) {
		this.jialing = jialing;
	}
	
	/**
	 * 获取：驾龄
	 */
	public Integer getJialing() {
		return jialing;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：车辆品牌
	 */
	 
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
				
	
	/**
	 * 设置：货车类型
	 */
	 
	public void setHuocheleixing(String huocheleixing) {
		this.huocheleixing = huocheleixing;
	}
	
	/**
	 * 获取：货车类型
	 */
	public String getHuocheleixing() {
		return huocheleixing;
	}
				
	
	/**
	 * 设置：司机电话
	 */
	 
	public void setSijidianhua(String sijidianhua) {
		this.sijidianhua = sijidianhua;
	}
	
	/**
	 * 获取：司机电话
	 */
	public String getSijidianhua() {
		return sijidianhua;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
