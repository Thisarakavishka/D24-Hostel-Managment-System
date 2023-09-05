package com.example.bo;

import com.example.bo.bos.impl.ReservationBOImpl;
import com.example.bo.bos.impl.RoomBOImpl;
import com.example.bo.bos.impl.StudentBOImpl;
import com.example.bo.bos.impl.UserBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBOFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes {STUDENT, USER, ROOM, RESERVATION}

    public SuperBO getBO(BOTypes boTypes) {
        switch (boTypes) {
            case USER:
                return new UserBOImpl();
            case ROOM:
                return new RoomBOImpl();
            case STUDENT:
                return new StudentBOImpl();
            case RESERVATION:
                return new ReservationBOImpl();
            default:
                return null;
        }
    }
}
