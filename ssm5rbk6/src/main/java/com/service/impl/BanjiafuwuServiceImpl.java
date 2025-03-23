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


import com.dao.BanjiafuwuDao;
import com.entity.BanjiafuwuEntity;
import com.service.BanjiafuwuService;
import com.entity.vo.BanjiafuwuVO;
import com.entity.view.BanjiafuwuView;

@Service("banjiafuwuService")
public class BanjiafuwuServiceImpl extends ServiceImpl<BanjiafuwuDao, BanjiafuwuEntity> implements BanjiafuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjiafuwuEntity> page = this.selectPage(
                new Query<BanjiafuwuEntity>(params).getPage(),
                new EntityWrapper<BanjiafuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjiafuwuEntity> wrapper) {
		  Page<BanjiafuwuView> page =new Query<BanjiafuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjiafuwuVO> selectListVO(Wrapper<BanjiafuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjiafuwuVO selectVO(Wrapper<BanjiafuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjiafuwuView> selectListView(Wrapper<BanjiafuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjiafuwuView selectView(Wrapper<BanjiafuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
