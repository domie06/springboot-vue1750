package com.dao;

import com.entity.BanjiadingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjiadingdanVO;
import com.entity.view.BanjiadingdanView;


/**
 * 搬家订单
 * 
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiadingdanDao extends BaseMapper<BanjiadingdanEntity> {
	
	List<BanjiadingdanVO> selectListVO(@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);
	
	BanjiadingdanVO selectVO(@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);
	
	List<BanjiadingdanView> selectListView(@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);

	List<BanjiadingdanView> selectListView(Pagination page,@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);
	
	BanjiadingdanView selectView(@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);
	
}
