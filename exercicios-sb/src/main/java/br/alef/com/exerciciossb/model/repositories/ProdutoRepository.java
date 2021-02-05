package br.alef.com.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.alef.com.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends
	PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
//usando a convenção é possível que o spring faça a implementação do método automaticamente	
//	findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//	
//	findByNomeStartsWith
//	findByNomeEndsWith
//	
//	findByNomeNotContaining
	
	@Query("SELECT p FROM Produto p where p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
