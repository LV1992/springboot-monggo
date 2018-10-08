package com.mongo.mapper;

import com.mongo.model.UserModel;

public interface UserDao {

    /**
     * 创建对象
     * @param user
     */
    void saveUser(UserModel user);

    /**
     * 根据用户名查询对象
     * @param userName
     * @return
     */
    UserModel findUserByUserName(String userName);

    /**
     * 更新对象
     * @param user
     */
    void updateUser(UserModel user);
    /**
     * 删除对象
     * @param id
     */
    void deleteUserById(Long id);
}
