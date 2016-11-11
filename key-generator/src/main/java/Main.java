import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) throws Exception {
    Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    config.addAnnotatedClass(User.class);
    config.addAnnotatedClass(Bus.class);
    config.addAnnotatedClass(Car.class);
    config.addAnnotatedClass(Book.class);

    Session session = config.buildSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    User user = new User();
    user.setName("Dawid");

    Bus bus = new Bus();
    bus.setName("1");

    Car car = new Car();
    car.setName("Tesla");

    Book book = new Book();
    book.setName("Java Persistence");

    session.persist(user);
    session.persist(bus);
    session.persist(car);
    session.persist(book);

    transaction.commit();
    session.close();

    System.out.println("Successfully saved");
    System.exit(0);
  }
}
