package org.heminjian.mybatis_generator.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.heminjian.mybatis_generator.entity.AlertLevelStatistics;
import org.heminjian.mybatis_generator.entity.AlertLevelStatisticsExample;

public interface AlertLevelStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    long countByExample(AlertLevelStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int deleteByExample(AlertLevelStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int insert(AlertLevelStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int insertSelective(AlertLevelStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    List<AlertLevelStatistics> selectByExample(AlertLevelStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    AlertLevelStatistics selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") AlertLevelStatistics record, @Param("example") AlertLevelStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int updateByExample(@Param("record") AlertLevelStatistics record, @Param("example") AlertLevelStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int updateByPrimaryKeySelective(AlertLevelStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alert_level_statistics
     *
     * @mbg.generated Fri Aug 17 11:45:47 CST 2018
     */
    int updateByPrimaryKey(AlertLevelStatistics record);
}