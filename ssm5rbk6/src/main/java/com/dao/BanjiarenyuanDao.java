package com.dao;

import com.entity.BanjiarenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjiarenyuanVO;
import com.entity.view.BanjiarenyuanView;


/**
 * 搬家人员
 * 
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiarenyuanDao extends BaseMapper<BanjiarenyuanEntity> {
	
	List<BanjiarenyuanVO> selectListVO(@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);
	
	BanjiarenyuanVO selectVO(@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);
	
	List<BanjiarenyuanView> selectListView(@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);

	List<BanjiarenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);
	
	BanjiarenyuanView selectView(@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);
	
}
