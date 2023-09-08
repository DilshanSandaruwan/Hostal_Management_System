package lk.ijse.dao;

import lk.ijse.hms.dao.custom.impl.*;

public class FactoryDAO {
    private static lk.ijse.hms.dao.FactoryDAO factoryDAO;

    private FactoryDAO() {
    }

    public static lk.ijse.hms.dao.FactoryDAO getFactoryDAO() {
        return factoryDAO == null ? factoryDAO = new lk.ijse.hms.dao.FactoryDAO() : factoryDAO;
    }

    public enum Types {
        STUDENT,
        ROOM,
        RECEPTION,
        JOIN_QUERY,
        USER
    }

    // factory - Object creation logic eka hide krnna.
    // singleton  - object ekak eka parak hadala eka re use karanna

    public SuperDAO getDAO(Types types) {
        switch (types) {
            case STUDENT:
                return new StudentDAOImpl();
            case ROOM:
                return new RoomsDAOImpl();
            case RECEPTION:
                return new ReservationDAOImpl();
            case JOIN_QUERY:
                return new QueryDAOImpl();
            case USER:
                return new UserDAOImpl();
            default:
                return null;
        }
    }
}
