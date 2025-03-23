package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BanjiaxuzhiDao;
import com.entity.BanjiaxuzhiEntity;
import com.service.BanjiaxuzhiService;
import com.entity.vo.BanjiaxuzhiVO;
import com.entity.view.BanjiaxuzhiView;

@Service("banjiaxuzhiService")
public class BanjiaxuzhiServiceImpl extends ServiceImpl<BanjiaxuzhiDao, BanjiaxuzhiEntity> implements BanjiaxuzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjiaxuzhiEntity> page = this.selectPage(
                new Query<BanjiaxuzhiEntity>(params).getPage(),
                new EntityWrapper<BanjiaxuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjiaxuzhiEntity> wrapper) {
		  Page<BanjiaxuzhiView> page =new Query<BanjiaxuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjiaxuzhiVO> selectListVO(Wrapper<BanjiaxuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjiaxuzhiVO selectVO(Wrapper<BanjiaxuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjiaxuzhiView> selectListView(Wrapper<BanjiaxuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjiaxuzhiView selectView(Wrapper<BanjiaxuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
