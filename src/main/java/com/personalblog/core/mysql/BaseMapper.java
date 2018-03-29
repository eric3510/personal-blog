package com.personalblog.core.mysql;

import com.personalblog.core.annotation.MybatisMapperMysql;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 王强
 * @version 创建时间：2017/08/16 14:34
 *          BaseMapper
 **/
@MybatisMapperMysql
@Mapper
public interface BaseMapper{
    List<Map<String, Object>> listByKeys(SqlTemplate SqlTemplate);

    List<Map<String, Object>> select(SqlTemplate SqlTemplate);

    List<Map<String,Object>> selectByBaseDO(SqlTemplate SqlTemplate);

    int count(SqlTemplate SqlTemplate);

    int saveBatch(SqlTemplate saveDO);

    int update(SqlTemplate updateParamTemplate);

    int remove(SqlTemplate SqlTemplate);
}

