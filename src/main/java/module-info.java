module projetift2935.projet_ift2935 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;


    opens projetift2935.projet_ift2935 to javafx.fxml;
    exports projetift2935.projet_ift2935;
}