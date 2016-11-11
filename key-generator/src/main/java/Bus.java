import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bus {

  @Id
  // The default strategy is GenerationType.AUTO and in our case
  // Hibernate picks GenerationType.SEQUENCE. This strategy
  // creates and uses hibernate_sequence sequence.
  @GeneratedValue
  private Long id;

  private String name;

  public void setName(String name) {
    this.name = name;
  }
}
