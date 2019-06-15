package Models;

import javax.persistence.*;

@Entity
@Table(name="raport")
public class Raport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRaport")
    private int idRaport;
    @Column(name="klientHistory")
    private String klientHistory;
    @Column(name="medicalReport")
    private String medicalReport;

    @OneToOne
    private Consultation consultation;

    public Raport() {
    }

    public int getIdRaport() {
        return idRaport;
    }

    public void setIdRaport(int idRaport) {
        this.idRaport = idRaport;
    }

    public String getKlientHistory() {
        return klientHistory;
    }

    public void setKlientHistory(String klientHistory) {
        this.klientHistory = klientHistory;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
