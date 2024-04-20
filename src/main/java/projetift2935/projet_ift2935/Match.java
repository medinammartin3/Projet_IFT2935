package projetift2935.projet_ift2935;

import jakarta.persistence.*;

@Entity
public class Match {
    @Id
    private int matchID;
    private String stade;
    private String date;

}
