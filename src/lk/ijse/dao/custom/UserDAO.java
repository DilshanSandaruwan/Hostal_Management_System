/*
 * Kasun Miuranga
 * Copyright (c) 2023
 */

package lk.ijse.dao.custom;

import lk.ijse.dao.CrudDAO;
import lk.ijse.entity.User;

public interface UserDAO extends CrudDAO<User> {
    String getUser(String id);

    String getPassword(String id);

    boolean updateUser_Pw(String newUserName, String newPw);
}
