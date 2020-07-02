package com.ubdi.dao.mapper;

import com.ubdi.domain.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    /**
     * 根据用户名获取密码
     *
     * @param loginName
     * @return
     */
    String getPassword(String loginName);

    /**
     * 根据用户名获取登陆用户
     *
     * @param loginName
     * @return
     */
    User selectByLoginName(String loginName);


    int updatePassword(@Param(value = "userId") Long userId,
                       @Param(value = "password") String password);


    List<User> selectUserByCid(@Param(value = "createUser") Long createUser);


    /**
     * 根据用户id获取角色
     *
     * @param userId
     * @return
     */
    List<Integer> getRole(@Param(value = "userId") Long userId);

}