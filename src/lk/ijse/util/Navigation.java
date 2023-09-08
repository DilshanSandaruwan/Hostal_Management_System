package lk.ijse.util;

import animatefx.animation.FadeIn;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;

    public static void navigate(lk.ijse.hms.util.Routes route, AnchorPane pane) throws IOException {
        lk.ijse.hms.util.Navigation.pane = pane;
        lk.ijse.hms.util.Navigation.pane.getChildren().clear();
        Stage window = (Stage) lk.ijse.hms.util.Navigation.pane.getScene().getWindow();

        switch (route) {
            case LOGIN:
                window.setTitle("24D Hostel Management System | Login");
                initUI("Login.fxml");
                break;
            case DASHBOARD:
                window.setTitle("24D Hostel Management System | Dashboard");
                initUI("Dashboard.fxml");
                break;
            case STUDENT:
                window.setTitle("24D Hostel Management System | Student");
                initUI("Student.fxml");
                break;
            case ROOMS:
                window.setTitle("24D Hostel Management System | Rooms");
                initUI("Rooms.fxml");
                break;
            case RESERVATION:
                window.setTitle("24D Hostel Management System | Reservation");
                initUI("Reservation.fxml");
                break;
            case CHANGE_PASSWORD:
                window.setTitle("24D Hostel Management System | Change Password");
                initUI("ChangePassword.fxml");
                break;
            default:
                new Alert(Alert.AlertType.ERROR, "UI Not Found!").show();
        }
    }
    public static void initUI(String location) throws IOException {
        lk.ijse.hms.util.Navigation.pane.getChildren()
                .add(FXMLLoader.load(lk.ijse.hms.util.Navigation.class.getResource("/resources/view/" + location)));
        new FadeIn(pane).setSpeed(3).play();
    }
}
