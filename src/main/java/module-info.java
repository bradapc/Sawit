module com.example.filmtracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filmtracker to javafx.fxml;
    exports com.example.filmtracker;
}