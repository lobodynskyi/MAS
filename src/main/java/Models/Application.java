package Models;


import javax.persistence.*;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idApplication")
    private int idApplication;

    @Column(name="idResearch")
    private int idResearch;
    @Column(name="sendRez")
    private boolean sendRez;
    @Column(name="paymentMethod")
    private boolean paymentMethod;
    @Column(name="status")
    private String status;
    @ManyToOne
    private Klient klient;

    public Application(int idResearch, boolean sendRez, boolean paymentMethod, String status, Klient klient) {
        this.idResearch = idResearch;
        this.sendRez = sendRez;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.klient = klient;
    }

    public Application() {
    }

    public int getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(int idApplication) {
        this.idApplication = idApplication;
    }

    public int getIdResearch() {
        return idResearch;
    }

    public void setIdResearch(int idResearch) {
        this.idResearch = idResearch;
    }

    public boolean isSendRez() {
        return sendRez;
    }

    public void setSendRez(boolean sendRez) {
        this.sendRez = sendRez;
    }

    public boolean isPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(boolean paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}
