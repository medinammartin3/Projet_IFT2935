package projetift2935.projet_ift2935;

import jakarta.persistence.*;

@Entity
public class Lieu {
    @Id
    private String ville;
    private String pays;
    public Lieu() {}

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }
}
