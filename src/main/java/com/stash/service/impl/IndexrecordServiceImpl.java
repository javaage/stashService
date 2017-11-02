/**
 * 
 */
package com.stash.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stash.mapper.IndexrecordModelMapper;
import com.stash.model.IndexrecordModel;
import com.stash.service.IndexrecordService;

/**
 * @author P9030576
 *
 */
@Service
public class IndexrecordServiceImpl implements IndexrecordService {
	
	@Autowired 
	private SqlSession sqlSession;
	
	/* (non-Javadoc)
	 * @see com.stash.service.IndexrecordService#save(java.util.List)
	 */
	@Override
	public void save(List<IndexrecordModel> listIndexrecordModel) {
		IndexrecordModelMapper indexrecordModelMapper = sqlSession.getMapper(IndexrecordModelMapper.class);
		for(IndexrecordModel indexrecordModel : listIndexrecordModel){
			indexrecordModelMapper.insert(indexrecordModel);
		}
	}
}
