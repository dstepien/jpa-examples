import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  private Address address;

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
