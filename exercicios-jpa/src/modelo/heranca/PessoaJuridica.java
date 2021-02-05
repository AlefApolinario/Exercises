package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	

	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome,String tipo,String cnpj) {
		super(nome,tipo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
