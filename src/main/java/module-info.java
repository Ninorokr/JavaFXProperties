module com.silverlink.javafxproperties {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.silverlink.javafxproperties to javafx.fxml;
    exports com.silverlink.javafxproperties;
}