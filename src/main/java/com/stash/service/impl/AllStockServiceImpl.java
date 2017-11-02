/**
 * 
 */
package com.stash.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stash.mapper.AllStockModelMapper;
import com.stash.model.AllStockModel;
import com.stash.service.AllStockService;

/**
 * @author P9030576
 *
 */
@Service
public class AllStockServiceImpl implements AllStockService {
	
	@Autowired 
	private SqlSession sqlSession;
	
	
	/* (non-Javadoc)
	 * @see com.stash.service.AllStockService#getAllStock()
	 */
	@Override
	public List<AllStockModel> getAllStock() {
		AllStockModelMapper allStockModelMapper = sqlSession.getMapper(AllStockModelMapper.class);
		List<AllStockModel> listAllStockModel = allStockModelMapper.selectByExample(null);
		return listAllStockModel;
	}

}
