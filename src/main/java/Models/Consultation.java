package Models;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;


@Entity
@Table(name="consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idConsultation")
    private int idConsultation;
    @Column(name="topic")
    private String topic;
    @Column(name="price")
    private int price;

    @ManyToOne
    private Klient klient;

    @OneToOne
    private Raport raport;

    @OneToMany(
            mappedBy = "consultation",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<MedicalConsultant_Consultation> consultationsList;

    public Consultation() {
    }

    public Consultation(String topic, int price, Klient klient) {
        this.topic = topic;
        this.price = price;
        this.klient = klient;
        consultationsList = new LinkedList<>();
    }

    public List<MedicalConsultant_Consultation> getConsultationsList() {
        return consultationsList;
    }

    public void setConsultationsList(List<MedicalConsultant_Consultation> consultationsList) {
        this.consultationsList = consultationsList;
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
