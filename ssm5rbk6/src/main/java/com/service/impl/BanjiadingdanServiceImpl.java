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


import com.dao.BanjiadingdanDao;
import com.entity.BanjiadingdanEntity;
import com.service.BanjiadingdanService;
import com.entity.vo.BanjiadingdanVO;
import com.entity.view.BanjiadingdanView;

@Service("banjiadingdanService")
public class BanjiadingdanServiceImpl extends ServiceImpl<BanjiadingdanDao, BanjiadingdanEntity> implements BanjiadingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjiadingdanEntity> page = this.selectPage(
                new Query<BanjiadingdanEntity>(params).getPage(),
                new EntityWrapper<BanjiadingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjiadingdanEntity> wrapper) {
		  Page<BanjiadingdanView> page =new Query<BanjiadingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjiadingdanVO> selectListVO(Wrapper<BanjiadingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjiadingdanVO selectVO(Wrapper<BanjiadingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjiadingdanView> selectListView(Wrapper<BanjiadingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjiadingdanView selectView(Wrapper<BanjiadingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
