package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuocheleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuocheleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuocheleixingView;


/**
 * 货车类型
 *
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface HuocheleixingService extends IService<HuocheleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuocheleixingVO> selectListVO(Wrapper<HuocheleixingEntity> wrapper);
   	
   	HuocheleixingVO selectVO(@Param("ew") Wrapper<HuocheleixingEntity> wrapper);
   	
   	List<HuocheleixingView> selectListView(Wrapper<HuocheleixingEntity> wrapper);
   	
   	HuocheleixingView selectView(@Param("ew") Wrapper<HuocheleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuocheleixingEntity> wrapper);
   	
}

