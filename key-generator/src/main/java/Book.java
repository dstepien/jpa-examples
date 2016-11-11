import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {

  @Id
  @GeneratedValue(generator = "books_sequence")
  // Creates a cusomized sequence:
  @SequenceGenerator(name = "books_sequence", sequenceName = "book_id_sequence", allocationSize = 1, initialValue = 30)
  private Long id;

  private String name;

  public void setName(String name) {
    this.name = name;
  }
}
