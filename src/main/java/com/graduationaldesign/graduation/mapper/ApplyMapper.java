package com.graduationaldesign.graduation.mapper;

import com.graduationaldesign.graduation.pojo.Apply;
import com.graduationaldesign.graduation.pojo.ApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplyMapper {
    /**
     *  根据指定的条件获取数据库记录数,t_apply
     *
     * @param example
     */
    long countByExample(ApplyExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,t_apply
     *
     * @param example
     */
    int deleteByExample(ApplyExample example);

    /**
     *  根据主键删除数据库的记录,t_apply
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,t_apply
     *
     * @param record
     */
    int insert(Apply record);

    /**
     *  动态字段,写入数据库记录,t_apply
     *
     * @param record
     */
    int insertSelective(Apply record);

    /**
     * ,t_apply
     *
     * @param example
     */
    List<Apply> selectByExampleWithBLOBs(ApplyExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,t_apply
     *
     * @param example
     */
    List<Apply> selectByExample(ApplyExample example);

    /**
     *  根据指定主键获取一条数据库记录,t_apply
     *
     * @param id
     */
    Apply selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,t_apply
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     * ,t_apply
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,t_apply
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,t_apply
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Apply record);

    /**
     * ,t_apply
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(Apply record);

    /**
     *  根据主键来更新符合条件的数据库记录,t_apply
     *
     * @param record
     */
    int updateByPrimaryKey(Apply record);

    int insertBatchSelective(List<Apply> records);

    int updateBatchByPrimaryKeySelective(List<Apply> records);
}