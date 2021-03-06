package com.stash.mapper;

import com.stash.model.DailyRateModel;
import com.stash.model.DailyRateModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyRateModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	long countByExample(DailyRateModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int deleteByExample(DailyRateModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int insert(DailyRateModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int insertSelective(DailyRateModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	List<DailyRateModel> selectByExample(DailyRateModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	DailyRateModel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByExampleSelective(@Param("record") DailyRateModel record,
			@Param("example") DailyRateModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByExample(@Param("record") DailyRateModel record, @Param("example") DailyRateModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByPrimaryKeySelective(DailyRateModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily_rate
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	int updateByPrimaryKey(DailyRateModel record);
}