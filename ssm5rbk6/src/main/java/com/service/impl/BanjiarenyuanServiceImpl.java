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


import com.dao.BanjiarenyuanDao;
import com.entity.BanjiarenyuanEntity;
import com.service.BanjiarenyuanService;
import com.entity.vo.BanjiarenyuanVO;
import com.entity.view.BanjiarenyuanView;

@Service("banjiarenyuanService")
public class BanjiarenyuanServiceImpl extends ServiceImpl<BanjiarenyuanDao, BanjiarenyuanEntity> implements BanjiarenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjiarenyuanEntity> page = this.selectPage(
                new Query<BanjiarenyuanEntity>(params).getPage(),
                new EntityWrapper<BanjiarenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjiarenyuanEntity> wrapper) {
		  Page<BanjiarenyuanView> page =new Query<BanjiarenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjiarenyuanVO> selectListVO(Wrapper<BanjiarenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjiarenyuanVO selectVO(Wrapper<BanjiarenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjiarenyuanView> selectListView(Wrapper<BanjiarenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjiarenyuanView selectView(Wrapper<BanjiarenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
