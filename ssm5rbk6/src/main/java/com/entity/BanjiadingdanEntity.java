package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 搬家订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
@TableName("banjiadingdan")
public class BanjiadingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanjiadingdanEntity() {
		
	}
	
	public BanjiadingdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 司机账号
	 */
					
	private String sijizhanghao;
	
	/**
	 * 司机姓名
	 */
					
	private String sijixingming;
	
	/**
	 * 司机电话
	 */
					
	private String sijidianhua;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 搬家人员
	 */
					
	private String banjiarenyuan;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 家属电话
	 */
					
	private String jiashudianhua;
	
	/**
	 * 搬家价格
	 */
					
	private String banjiajiage;
	
	/**
	 * 服务类型
	 */
					
	private String fuwuleixing;
	
	/**
	 * 货车类型
	 */
					
	private String huocheleixing;
	
	/**
	 * 预约时间
	 */
					
	private String yuyueshijian;
	
	/**
	 * 搬家起点
	 */
					
	private String banjiaqidian;
	
	/**
	 * 搬家目的地
	 */
					
	private String banjiamudedi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：司机账号
	 */
	public void setSijizhanghao(String sijizhanghao) {
		this.sijizhanghao = sijizhanghao;
	}
	/**
	 * 获取：司机账号
	 */
	public String getSijizhanghao() {
		return sijizhanghao;
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
	 * 设置：搬家人员
	 */
	public void setBanjiarenyuan(String banjiarenyuan) {
		this.banjiarenyuan = banjiarenyuan;
	}
	/**
	 * 获取：搬家人员
	 */
	public String getBanjiarenyuan() {
		return banjiarenyuan;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：家属电话
	 */
	public void setJiashudianhua(String jiashudianhua) {
		this.jiashudianhua = jiashudianhua;
	}
	/**
	 * 获取：家属电话
	 */
	public String getJiashudianhua() {
		return jiashudianhua;
	}
	/**
	 * 设置：搬家价格
	 */
	public void setBanjiajiage(String banjiajiage) {
		this.banjiajiage = banjiajiage;
	}
	/**
	 * 获取：搬家价格
	 */
	public String getBanjiajiage() {
		return banjiajiage;
	}
	/**
	 * 设置：服务类型
	 */
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
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
	 * 设置：预约时间
	 */
	public void setYuyueshijian(String yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public String getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：搬家起点
	 */
	public void setBanjiaqidian(String banjiaqidian) {
		this.banjiaqidian = banjiaqidian;
	}
	/**
	 * 获取：搬家起点
	 */
	public String getBanjiaqidian() {
		return banjiaqidian;
	}
	/**
	 * 设置：搬家目的地
	 */
	public void setBanjiamudedi(String banjiamudedi) {
		this.banjiamudedi = banjiamudedi;
	}
	/**
	 * 获取：搬家目的地
	 */
	public String getBanjiamudedi() {
		return banjiamudedi;
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
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
