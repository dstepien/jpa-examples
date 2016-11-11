import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE) // Creates hibernate_sequences table
  private Long id;

  private String name;

  public void setName(String name) {
    this.name = name;
  }
}
