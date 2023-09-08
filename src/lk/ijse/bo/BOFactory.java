package lk.ijse.bo;

import lk.ijse.bo.custom.impl.ReservationBOImpl;
import lk.ijse.bo.custom.impl.RoomsBOImpl;
import lk.ijse.bo.custom.impl.StudentBOImpl;
import lk.ijse.bo.custom.impl.UserBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public enum Type {
        STUDENT,
        ROOM,
        RECEPTION,
        USER
    }

    public SuperBO getBO(Type type) {
        switch (type) {
            case STUDENT:
                return (SuperBO) new StudentBOImpl();
            case ROOM:
                return new RoomsBOImpl();
            case RECEPTION:
                return (SuperBO) new ReservationBOImpl();
            case USER:
                return (SuperBO) new UserBOImpl();
            default:
                return null;
        }
    }
}
