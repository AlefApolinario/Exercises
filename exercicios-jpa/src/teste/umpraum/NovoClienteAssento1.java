package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("11D");
		Cliente cliente = new Cliente("Jessica",assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.AbrirTransacao()
			.incluir(assento)
			.incluir(cliente)
			.FecharTransacao()
			.fechar();
		
		
	}
}
