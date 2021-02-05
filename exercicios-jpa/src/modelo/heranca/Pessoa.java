package modelo.heranca;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("P")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPessoa;

	private String nome;

	@Column(insertable = false, updatable = false)
	private String tipo;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome ,String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	public Long getIdPessoa() {
		return idPessoa;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

}
