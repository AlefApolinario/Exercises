package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "F")
public class PessoaFisica extends Pessoa{
	
	private String cpf;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome,String tipo,String cpf) {
		super(nome,tipo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
