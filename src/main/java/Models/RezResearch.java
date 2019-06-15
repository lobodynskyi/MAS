package Models;


import javax.persistence.*;

@Entity
@Table(name = "rezResearch")
public class RezResearch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRezResearch")
    private int idRezResearch;
    @ManyToOne
    private Klient klient;
    @Column(name="rez")
    private String rez;

    public RezResearch(Klient klient, String rez) {
        this.klient = klient;
        this.rez = rez;
    }

    public RezResearch() {
    }

    public int getIdRezResearch() {
        return idRezResearch;
    }

    public void setIdRezResearch(int idRezResearch) {
        this.idRezResearch = idRezResearch;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public String getRez() {
        return rez;
    }

    public void setRez(String rez) {
        this.rez = rez;
    }
}
