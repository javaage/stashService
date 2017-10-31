package com.stash.mapper;

import com.stash.model.BkTransModel;
import com.stash.model.BkTransModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BkTransModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	long countByExample(BkTransModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByExample(BkTransModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insert(BkTransModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insertSelective(BkTransModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	List<BkTransModel> selectByExample(BkTransModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	BkTransModel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExampleSelective(@Param("record") BkTransModel record, @Param("example") BkTransModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExample(@Param("record") BkTransModel record, @Param("example") BkTransModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKeySelective(BkTransModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.candidate
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKey(BkTransModel record);
}