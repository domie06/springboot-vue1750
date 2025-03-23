package com.dao;

import com.entity.BanjiafuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjiafuwuVO;
import com.entity.view.BanjiafuwuView;


/**
 * 搬家服务
 * 
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiafuwuDao extends BaseMapper<BanjiafuwuEntity> {
	
	List<BanjiafuwuVO> selectListVO(@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);
	
	BanjiafuwuVO selectVO(@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);
	
	List<BanjiafuwuView> selectListView(@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);

	List<BanjiafuwuView> selectListView(Pagination page,@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);
	
	BanjiafuwuView selectView(@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);
	
}
