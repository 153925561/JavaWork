package com.dao;

import com.pojo.Outers;
import java.util.List;

public interface OutersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outers
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long outid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outers
     *
     * @mbg.generated
     */
    int insert(Outers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outers
     *
     * @mbg.generated
     */
    Outers selectByPrimaryKey(Long outid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outers
     *
     * @mbg.generated
     */
    List<Outers> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outers
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Outers record);
}