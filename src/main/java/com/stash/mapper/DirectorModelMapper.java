package com.stash.mapper;

import com.stash.model.DirectorModel;
import com.stash.model.DirectorModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectorModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	long countByExample(DirectorModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByExample(DirectorModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insert(DirectorModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int insertSelective(DirectorModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	List<DirectorModel> selectByExample(DirectorModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	DirectorModel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExampleSelective(@Param("record") DirectorModel record, @Param("example") DirectorModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByExample(@Param("record") DirectorModel record, @Param("example") DirectorModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKeySelective(DirectorModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.director
	 * @mbg.generated  Tue Oct 31 17:57:38 CST 2017
	 */
	int updateByPrimaryKey(DirectorModel record);
}