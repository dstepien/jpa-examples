import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) throws Exception {
    Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    config.addAnnotatedClass(Message.class);

    Session session = config.buildSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    Message message= new Message();
    message.setText("Hello World!");

    session.persist(message);
    transaction.commit();
    session.close();

    System.out.println("Successfully saved");
    System.exit(0);
  }
}
