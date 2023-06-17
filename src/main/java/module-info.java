module com.example.mergebasevulnerable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mergebasevulnerable to javafx.fxml;
    exports com.example.mergebasevulnerable;
}