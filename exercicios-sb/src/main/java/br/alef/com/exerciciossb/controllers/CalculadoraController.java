package br.alef.com.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public Integer somar(@PathVariable Integer a, @PathVariable Integer b) {
		return a + b;
	}

	@GetMapping("/subtrair")
	public Integer subtrair(@RequestParam(name = "a") Integer a
			, @RequestParam("b") Integer b ) {
		return a - b;
	}
}
