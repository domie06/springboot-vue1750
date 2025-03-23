package com.dao;

import com.entity.BanjiaxuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjiaxuzhiVO;
import com.entity.view.BanjiaxuzhiView;


/**
 * 搬家须知
 * 
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiaxuzhiDao extends BaseMapper<BanjiaxuzhiEntity> {
	
	List<BanjiaxuzhiVO> selectListVO(@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);
	
	BanjiaxuzhiVO selectVO(@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);
	
	List<BanjiaxuzhiView> selectListView(@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);

	List<BanjiaxuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);
	
	BanjiaxuzhiView selectView(@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);
	
}
