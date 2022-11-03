module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.login to javafx.fxml;
    exports com.example.login;
    exports com.example.login.Controllers;
    exports com.example.login.Users;
    opens com.example.login.Controllers to javafx.fxml;
}