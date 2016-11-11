import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) throws Exception {
    Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    config.addAnnotatedClass(User.class);

    Session session = config.buildSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    User user = new User();
    user.setName("Dawid");
    user.setAddress(new Address("Kowalskiego", "Warsaw", "12-123"));

    session.persist(user);
    transaction.commit();
    session.close();

    System.out.println("Successfully saved");
    System.exit(0);
  }
}
