package com.stash.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DailyModelExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public DailyModelExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andOpenIsNull() {
			addCriterion("open is null");
			return (Criteria) this;
		}

		public Criteria andOpenIsNotNull() {
			addCriterion("open is not null");
			return (Criteria) this;
		}

		public Criteria andOpenEqualTo(Double value) {
			addCriterion("open =", value, "open");
			return (Criteria) this;
		}

		public Criteria andOpenNotEqualTo(Double value) {
			addCriterion("open <>", value, "open");
			return (Criteria) this;
		}

		public Criteria andOpenGreaterThan(Double value) {
			addCriterion("open >", value, "open");
			return (Criteria) this;
		}

		public Criteria andOpenGreaterThanOrEqualTo(Double value) {
			addCriterion("open >=", value, "open");
			return (Criteria) this;
		}

		public Criteria andOpenLessThan(Double value) {
			addCriterion("open <", value, "open");
			return (Criteria) this;
		}

		public Criteria andOpenLessThanOrEqualTo(Double value) {
			addCriterion("open <=", value, "open");
			return (Criteria) this;
		}

		public Criteria andOpenIn(List<Double> values) {
			addCriterion("open in", values, "open");
			return (Criteria) this;
		}

		public Criteria andOpenNotIn(List<Double> values) {
			addCriterion("open not in", values, "open");
			return (Criteria) this;
		}

		public Criteria andOpenBetween(Double value1, Double value2) {
			addCriterion("open between", value1, value2, "open");
			return (Criteria) this;
		}

		public Criteria andOpenNotBetween(Double value1, Double value2) {
			addCriterion("open not between", value1, value2, "open");
			return (Criteria) this;
		}

		public Criteria andCurrentIsNull() {
			addCriterion("current is null");
			return (Criteria) this;
		}

		public Criteria andCurrentIsNotNull() {
			addCriterion("current is not null");
			return (Criteria) this;
		}

		public Criteria andCurrentEqualTo(Double value) {
			addCriterion("current =", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentNotEqualTo(Double value) {
			addCriterion("current <>", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentGreaterThan(Double value) {
			addCriterion("current >", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentGreaterThanOrEqualTo(Double value) {
			addCriterion("current >=", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentLessThan(Double value) {
			addCriterion("current <", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentLessThanOrEqualTo(Double value) {
			addCriterion("current <=", value, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentIn(List<Double> values) {
			addCriterion("current in", values, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentNotIn(List<Double> values) {
			addCriterion("current not in", values, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentBetween(Double value1, Double value2) {
			addCriterion("current between", value1, value2, "current");
			return (Criteria) this;
		}

		public Criteria andCurrentNotBetween(Double value1, Double value2) {
			addCriterion("current not between", value1, value2, "current");
			return (Criteria) this;
		}

		public Criteria andHighIsNull() {
			addCriterion("high is null");
			return (Criteria) this;
		}

		public Criteria andHighIsNotNull() {
			addCriterion("high is not null");
			return (Criteria) this;
		}

		public Criteria andHighEqualTo(Double value) {
			addCriterion("high =", value, "high");
			return (Criteria) this;
		}

		public Criteria andHighNotEqualTo(Double value) {
			addCriterion("high <>", value, "high");
			return (Criteria) this;
		}

		public Criteria andHighGreaterThan(Double value) {
			addCriterion("high >", value, "high");
			return (Criteria) this;
		}

		public Criteria andHighGreaterThanOrEqualTo(Double value) {
			addCriterion("high >=", value, "high");
			return (Criteria) this;
		}

		public Criteria andHighLessThan(Double value) {
			addCriterion("high <", value, "high");
			return (Criteria) this;
		}

		public Criteria andHighLessThanOrEqualTo(Double value) {
			addCriterion("high <=", value, "high");
			return (Criteria) this;
		}

		public Criteria andHighIn(List<Double> values) {
			addCriterion("high in", values, "high");
			return (Criteria) this;
		}

		public Criteria andHighNotIn(List<Double> values) {
			addCriterion("high not in", values, "high");
			return (Criteria) this;
		}

		public Criteria andHighBetween(Double value1, Double value2) {
			addCriterion("high between", value1, value2, "high");
			return (Criteria) this;
		}

		public Criteria andHighNotBetween(Double value1, Double value2) {
			addCriterion("high not between", value1, value2, "high");
			return (Criteria) this;
		}

		public Criteria andLowIsNull() {
			addCriterion("low is null");
			return (Criteria) this;
		}

		public Criteria andLowIsNotNull() {
			addCriterion("low is not null");
			return (Criteria) this;
		}

		public Criteria andLowEqualTo(Double value) {
			addCriterion("low =", value, "low");
			return (Criteria) this;
		}

		public Criteria andLowNotEqualTo(Double value) {
			addCriterion("low <>", value, "low");
			return (Criteria) this;
		}

		public Criteria andLowGreaterThan(Double value) {
			addCriterion("low >", value, "low");
			return (Criteria) this;
		}

		public Criteria andLowGreaterThanOrEqualTo(Double value) {
			addCriterion("low >=", value, "low");
			return (Criteria) this;
		}

		public Criteria andLowLessThan(Double value) {
			addCriterion("low <", value, "low");
			return (Criteria) this;
		}

		public Criteria andLowLessThanOrEqualTo(Double value) {
			addCriterion("low <=", value, "low");
			return (Criteria) this;
		}

		public Criteria andLowIn(List<Double> values) {
			addCriterion("low in", values, "low");
			return (Criteria) this;
		}

		public Criteria andLowNotIn(List<Double> values) {
			addCriterion("low not in", values, "low");
			return (Criteria) this;
		}

		public Criteria andLowBetween(Double value1, Double value2) {
			addCriterion("low between", value1, value2, "low");
			return (Criteria) this;
		}

		public Criteria andLowNotBetween(Double value1, Double value2) {
			addCriterion("low not between", value1, value2, "low");
			return (Criteria) this;
		}

		public Criteria andClmnIsNull() {
			addCriterion("clmn is null");
			return (Criteria) this;
		}

		public Criteria andClmnIsNotNull() {
			addCriterion("clmn is not null");
			return (Criteria) this;
		}

		public Criteria andClmnEqualTo(Double value) {
			addCriterion("clmn =", value, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnNotEqualTo(Double value) {
			addCriterion("clmn <>", value, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnGreaterThan(Double value) {
			addCriterion("clmn >", value, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnGreaterThanOrEqualTo(Double value) {
			addCriterion("clmn >=", value, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnLessThan(Double value) {
			addCriterion("clmn <", value, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnLessThanOrEqualTo(Double value) {
			addCriterion("clmn <=", value, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnIn(List<Double> values) {
			addCriterion("clmn in", values, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnNotIn(List<Double> values) {
			addCriterion("clmn not in", values, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnBetween(Double value1, Double value2) {
			addCriterion("clmn between", value1, value2, "clmn");
			return (Criteria) this;
		}

		public Criteria andClmnNotBetween(Double value1, Double value2) {
			addCriterion("clmn not between", value1, value2, "clmn");
			return (Criteria) this;
		}

		public Criteria andDateIsNull() {
			addCriterion("date is null");
			return (Criteria) this;
		}

		public Criteria andDateIsNotNull() {
			addCriterion("date is not null");
			return (Criteria) this;
		}

		public Criteria andDateEqualTo(Date value) {
			addCriterionForJDBCDate("date =", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("date <>", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThan(Date value) {
			addCriterionForJDBCDate("date >", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("date >=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThan(Date value) {
			addCriterionForJDBCDate("date <", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("date <=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateIn(List<Date> values) {
			addCriterionForJDBCDate("date in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("date not in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("date between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("date not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andAvg20IsNull() {
			addCriterion("avg20 is null");
			return (Criteria) this;
		}

		public Criteria andAvg20IsNotNull() {
			addCriterion("avg20 is not null");
			return (Criteria) this;
		}

		public Criteria andAvg20EqualTo(Double value) {
			addCriterion("avg20 =", value, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20NotEqualTo(Double value) {
			addCriterion("avg20 <>", value, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20GreaterThan(Double value) {
			addCriterion("avg20 >", value, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20GreaterThanOrEqualTo(Double value) {
			addCriterion("avg20 >=", value, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20LessThan(Double value) {
			addCriterion("avg20 <", value, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20LessThanOrEqualTo(Double value) {
			addCriterion("avg20 <=", value, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20In(List<Double> values) {
			addCriterion("avg20 in", values, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20NotIn(List<Double> values) {
			addCriterion("avg20 not in", values, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20Between(Double value1, Double value2) {
			addCriterion("avg20 between", value1, value2, "avg20");
			return (Criteria) this;
		}

		public Criteria andAvg20NotBetween(Double value1, Double value2) {
			addCriterion("avg20 not between", value1, value2, "avg20");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.daily
	 * @mbg.generated  Wed Nov 01 16:41:19 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.daily
     *
     * @mbg.generated do_not_delete_during_merge Tue Oct 31 17:43:08 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}