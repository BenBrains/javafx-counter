module com.fyxren.counter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fyxren.counter to javafx.fxml;
    exports com.fyxren.counter;
}