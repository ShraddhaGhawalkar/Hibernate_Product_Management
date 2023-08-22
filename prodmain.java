package hibernatepack2;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class prodmain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Product p = new Product();
		p.setPname("Mobile");
		p.setPrate(6000);
		
		session.save(p);	//hql (for insertion)
		t.commit();
		session.close();
		System.out.println("Success...");
	}

}
