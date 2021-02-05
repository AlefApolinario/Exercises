package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Carlos");
		usuario.setEmail("carlos@lanche.com");
		
		//em.merge(usuario); estado gerenciavel,não precisa explicitar o comando de alteração
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
