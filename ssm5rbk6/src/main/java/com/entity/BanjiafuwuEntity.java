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
 * 搬家服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
@TableName("banjiafuwu")
public class BanjiafuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanjiafuwuEntity() {
		
	}
	
	public BanjiafuwuEntity(T t) {
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
	 * 搬家须知
	 */
					
	private String banjiaxuzhi;
	
	/**
	 * 服务类型
	 */
					
	private String fuwuleixing;
	
	/**
	 * 货车类型
	 */
					
	private String huocheleixing;
	
	/**
	 * 收费标准
	 */
					
	private String shoufeibiaozhun;
	
	/**
	 * 搬家价格
	 */
					
	private Integer banjiajiage;
	
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
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：搬家须知
	 */
	public void setBanjiaxuzhi(String banjiaxuzhi) {
		this.banjiaxuzhi = banjiaxuzhi;
	}
	/**
	 * 获取：搬家须知
	 */
	public String getBanjiaxuzhi() {
		return banjiaxuzhi;
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
	 * 设置：搬家价格
	 */
	public void setBanjiajiage(Integer banjiajiage) {
		this.banjiajiage = banjiajiage;
	}
	/**
	 * 获取：搬家价格
	 */
	public Integer getBanjiajiage() {
		return banjiajiage;
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
