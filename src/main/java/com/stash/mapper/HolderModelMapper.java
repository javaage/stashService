package com.stash.mapper;

import com.stash.model.HolderModel;
import com.stash.model.HolderModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolderModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	long countByExample(HolderModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByExample(HolderModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insert(HolderModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insertSelective(HolderModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	List<HolderModel> selectByExample(HolderModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	HolderModel selectByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExampleSelective(@Param("record") HolderModel record, @Param("example") HolderModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExample(@Param("record") HolderModel record, @Param("example") HolderModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKeySelective(HolderModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.holder
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKey(HolderModel record);
}