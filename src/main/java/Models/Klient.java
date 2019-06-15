package Models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


@Entity(name = "klient")
@DiscriminatorValue(value = "klient")
public class Klient extends Osoba{
    @Column(name="discont")
    private int discont;

    @Column(name="password")
    private String password;

    @Column(name="allergy")
    private String allergy;

    @OneToMany(
            mappedBy = "klient",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Consultation> consultList;

    @OneToMany(
            mappedBy = "klient",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Application> applicationListList;

    @OneToMany(
            mappedBy = "klient",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<RezResearch> rezResearchListList;

    public Klient() {
    }

    public Klient(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday, int discont, String password, String allergy) {
        super(name, lastName, phoneNr, email, pasel, birthday);
        this.discont = discont;
        this.password = password;
        this.allergy = allergy;
        consultList = new LinkedList<>();
        applicationListList = new LinkedList<>();
        rezResearchListList = new LinkedList<>();
    }

    public Klient(String name, String lastName, int phoneNr, String email, String pasel, LocalDate birthday, String password) {
        super(name, lastName, phoneNr, email, pasel, birthday);
        this.password = password;
    }

    public int getDiscont() {
        return discont;
    }

    public void setDiscont(int discont) {
        this.discont = discont;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
}
