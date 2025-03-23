package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiarenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjiarenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiarenyuanView;


/**
 * 搬家人员
 *
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiarenyuanService extends IService<BanjiarenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjiarenyuanVO> selectListVO(Wrapper<BanjiarenyuanEntity> wrapper);
   	
   	BanjiarenyuanVO selectVO(@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);
   	
   	List<BanjiarenyuanView> selectListView(Wrapper<BanjiarenyuanEntity> wrapper);
   	
   	BanjiarenyuanView selectView(@Param("ew") Wrapper<BanjiarenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjiarenyuanEntity> wrapper);
   	
}

