package br.alef.com.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.alef.com.exerciciossb.model.entities.Produto;
import br.alef.com.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

//	@PostMapping
//	public @ResponseBody Produto novoProduto(
//			@RequestParam String nome, @RequestParam double preco,
//			@RequestParam double desconto) {
//		Produto produto = new Produto(nome,preco,desconto);
//		produtoRepository.save(produto);
//
//		return produto;
//	}

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Produto novoProduto2(@Valid Produto produto) {
		produtoRepository.save(produto);

		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}

	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(
			@PathVariable String parteNome) {
		//return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNameLike(parteNome);
	}

	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorID(@PathVariable int id) {
		return produtoRepository.findById(id);
	}

	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutoPorPagina(
			@PathVariable int numeroPagina) {
		Pageable page = PageRequest.of(numeroPagina, 3);
		return produtoRepository.findAll(page);
	}
	
	

	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}

//	@PutMapping
//	public @ResponseBody Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//
//		return produto;
//	}
}
