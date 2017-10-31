package com.stash.mapper;

import com.stash.model.BkrecordModel;
import com.stash.model.BkrecordModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BkrecordModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	long countByExample(BkrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByExample(BkrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insert(BkrecordModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insertSelective(BkrecordModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	List<BkrecordModel> selectByExample(BkrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	BkrecordModel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExampleSelective(@Param("record") BkrecordModel record, @Param("example") BkrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExample(@Param("record") BkrecordModel record, @Param("example") BkrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKeySelective(BkrecordModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.bkrecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKey(BkrecordModel record);
}