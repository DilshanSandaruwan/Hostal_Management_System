/*
 * Kasun Miuranga
 * Copyright (c) 2023
 */

package lk.ijse.dao.custom;


import lk.ijse.dao.SuperDAO;
import lk.ijse.entity.CustomEntity;

import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomEntity> getData();
}
