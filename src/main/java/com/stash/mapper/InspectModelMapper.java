package com.stash.mapper;

import com.stash.model.InspectModel;
import com.stash.model.InspectModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	long countByExample(InspectModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int deleteByExample(InspectModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int insert(InspectModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int insertSelective(InspectModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	List<InspectModel> selectByExample(InspectModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	InspectModel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByExampleSelective(@Param("record") InspectModel record, @Param("example") InspectModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByExample(@Param("record") InspectModel record, @Param("example") InspectModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByPrimaryKeySelective(InspectModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.inspect
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByPrimaryKey(InspectModel record);
}