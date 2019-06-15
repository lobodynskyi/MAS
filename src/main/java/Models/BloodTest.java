package Models;



import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "bloodTest")
@Table(name = "bloodTest")
public abstract class BloodTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloodTest")
    private int idBloodTest;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private int price;
    @Column(name="description")
    private String description;

    public BloodTest(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public BloodTest() {
    }

    public int getIdBloodTest() {
        return idBloodTest;
    }

    public void setIdBloodTest(int idBloodTest) {
        this.idBloodTest = idBloodTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
