module com.example.gitgame2thesequel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitgame2thesequel to javafx.fxml;
    exports com.example.gitgame2thesequel;
}