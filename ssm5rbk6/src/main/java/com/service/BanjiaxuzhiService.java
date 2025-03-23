package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiaxuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjiaxuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiaxuzhiView;


/**
 * 搬家须知
 *
 * @author 
 * @email 
 * @date 2021-04-21 21:07:30
 */
public interface BanjiaxuzhiService extends IService<BanjiaxuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjiaxuzhiVO> selectListVO(Wrapper<BanjiaxuzhiEntity> wrapper);
   	
   	BanjiaxuzhiVO selectVO(@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);
   	
   	List<BanjiaxuzhiView> selectListView(Wrapper<BanjiaxuzhiEntity> wrapper);
   	
   	BanjiaxuzhiView selectView(@Param("ew") Wrapper<BanjiaxuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjiaxuzhiEntity> wrapper);
   	
}

