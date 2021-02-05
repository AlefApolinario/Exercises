package br.alef.com.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.alef.com.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(10, "Alef", "123.456.789-00");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorID1(@PathVariable Integer id) {
		return new Cliente(id, "Alef", "987.654.321-00");
	}

	@GetMapping
	public Cliente obterClientePorID2(
			@RequestParam(name = "id",defaultValue = "1") Integer id) {
		return new Cliente(id, "Jessica", "987.654.321-00");
	}
}
