/*
 * Kasun Miuranga
 * Copyright (c) 2023
 */

package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.UserBO;
import lk.ijse.dao.FactoryDAO;
import lk.ijse.dao.custom.UserDAO;

public class UserBOImpl implements UserBO {
    UserDAO userDAO = (UserDAO) FactoryDAO.getFactoryDAO().getDAO(FactoryDAO.Types.USER);

    @Override
    public String getUser(String id) {
        return userDAO.getUser(id);
    }

    @Override
    public String getPassword(String id) {
        return userDAO.getPassword(id);
    }

    @Override
    public boolean updateUser_Pw(String newUserName, String newPw) {
        return userDAO.updateUser_Pw(newUserName,newPw);
    }
}
