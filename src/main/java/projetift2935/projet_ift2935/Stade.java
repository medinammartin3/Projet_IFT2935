package projetift2935.projet_ift2935;

import jakarta.persistence.*;

@Entity
public class Stade {
    @Id
    private String nomDuStade;
    private String pays;
    private String ville;

    public Stade() {}

    public String getNomDuStade() {
        return nomDuStade;
    }

    public String getPays() {
        return pays;
    }

    public String getVille() {
        return ville;
    }
}
