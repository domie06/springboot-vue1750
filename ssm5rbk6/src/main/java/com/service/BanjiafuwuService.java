package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiafuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjiafuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiafuwuView;


/**
 * 搬家服务
 *
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiafuwuService extends IService<BanjiafuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjiafuwuVO> selectListVO(Wrapper<BanjiafuwuEntity> wrapper);
   	
   	BanjiafuwuVO selectVO(@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);
   	
   	List<BanjiafuwuView> selectListView(Wrapper<BanjiafuwuEntity> wrapper);
   	
   	BanjiafuwuView selectView(@Param("ew") Wrapper<BanjiafuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjiafuwuEntity> wrapper);
   	
}

