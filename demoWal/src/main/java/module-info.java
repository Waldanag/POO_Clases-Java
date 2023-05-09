module com.example.demowal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demowal to javafx.fxml;
    exports com.example.demowal;
}