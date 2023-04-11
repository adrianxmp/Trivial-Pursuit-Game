module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires javafx.base;


    opens com.example.demo2 to javafx.fxml;
    exports com.example.demo2;
}