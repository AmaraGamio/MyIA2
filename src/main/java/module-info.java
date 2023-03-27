module com.example.myia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myia to javafx.fxml;
    exports com.example.myia;
}