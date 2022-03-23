module com.mycompany.tictactoe_csc311 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tictactoe_csc311 to javafx.fxml;
    exports com.mycompany.tictactoe_csc311;
}
