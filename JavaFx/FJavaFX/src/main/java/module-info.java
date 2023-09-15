module com.example.fjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fjavafx to javafx.fxml;
    exports com.example.fjavafx;
}