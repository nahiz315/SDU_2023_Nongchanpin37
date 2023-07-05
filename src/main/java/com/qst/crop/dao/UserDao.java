package com.qst.crop.dao;

import com.qst.crop.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
@Mapper
public interface UserDao {

    User selectByPrimaryKey(String userName);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    List<User> selectAll();

    int deleteByPrimaryKey(String userName);
}
