package com.stash.mapper;

import com.stash.model.AttendModel;
import com.stash.model.AttendModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	long countByExample(AttendModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByExample(AttendModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insert(AttendModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insertSelective(AttendModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	List<AttendModel> selectByExample(AttendModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	AttendModel selectByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExampleSelective(@Param("record") AttendModel record, @Param("example") AttendModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExample(@Param("record") AttendModel record, @Param("example") AttendModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKeySelective(AttendModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.attend
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKey(AttendModel record);
}