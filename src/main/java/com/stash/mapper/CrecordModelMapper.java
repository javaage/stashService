package com.stash.mapper;

import com.stash.model.CrecordModel;
import com.stash.model.CrecordModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrecordModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	long countByExample(CrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByExample(CrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insert(CrecordModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insertSelective(CrecordModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	List<CrecordModel> selectByExample(CrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	CrecordModel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExampleSelective(@Param("record") CrecordModel record, @Param("example") CrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExample(@Param("record") CrecordModel record, @Param("example") CrecordModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKeySelective(CrecordModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.crecord
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKey(CrecordModel record);
}