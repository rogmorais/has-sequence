import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class VeiculoTest {

	public static void main(String[] args) {
		Veiculo edit = new Veiculo();
		edit.setPlaca("ASF1210");
		edit.setAno(2018);
		edit.setCor("Rosa");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA2Q");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(edit);
		em.getTransaction().commit();
		em.close();
	}
}
