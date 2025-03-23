package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiadingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjiadingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiadingdanView;


/**
 * 搬家订单
 *
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiadingdanService extends IService<BanjiadingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjiadingdanVO> selectListVO(Wrapper<BanjiadingdanEntity> wrapper);
   	
   	BanjiadingdanVO selectVO(@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);
   	
   	List<BanjiadingdanView> selectListView(Wrapper<BanjiadingdanEntity> wrapper);
   	
   	BanjiadingdanView selectView(@Param("ew") Wrapper<BanjiadingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjiadingdanEntity> wrapper);
   	
}

