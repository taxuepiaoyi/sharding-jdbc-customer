package com.bruce.shardingjdbc.customer.mapper;

import com.bruce.shardingjdbc.customer.entity.UserEntity;
import com.bruce.shardingjdbc.customer.query.UserQueryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserEntity> queryUserList(@Param("userQuery")UserQueryDTO userQueryDTO) ;
}
