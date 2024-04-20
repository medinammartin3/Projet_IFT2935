package projetift2935.projet_ift2935;

import jakarta.persistence.*;

@Entity
public class Equipe {
    @Id
    private int equipeID;
    private String pays;
    private int annee;

    public Equipe() {
    }
    public int getEquipeID() {
        return equipeID;
    }
    public String getPays() {
        return pays;
    }
    public int getAnnee() {
        return annee;
    }
}
