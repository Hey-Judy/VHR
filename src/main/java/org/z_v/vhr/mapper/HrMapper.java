package org.z_v.vhr.mapper;

import org.springframework.stereotype.Repository;
import org.z_v.vhr.model.Hr;

@Repository
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);
    /*
     *Create ON 2020/9/21 1:30 BY Z_V
     * 33B3  创建loadUserByUsername(String username)方法，
     * 目的   通过username 找到对应的Hr数据
     * 具体实现由HrMapper.xml实现
     * TO HrMapper.xml
     */

    Hr loadUserByUsername(String username);
}