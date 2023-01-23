module com.kensoftph.toolbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.toolbar to javafx.fxml;
    exports com.kensoftph.toolbar;
}