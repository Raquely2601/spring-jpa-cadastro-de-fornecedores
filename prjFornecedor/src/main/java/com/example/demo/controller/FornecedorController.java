package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Fornecedor;
import com.example.demo.service.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

	private final FornecedorService fornecedorService;

	@Autowired
	public FornecedorController(FornecedorService fornecedorService) {
		this.fornecedorService = fornecedorService;
	}

	@PostMapping
	public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.salvarFornecedor(fornecedor);
	}

	@GetMapping("/{id}")
	public Fornecedor buscaFornecedorPorId(@PathVariable Long id) {
		return fornecedorService.getFornecedorById(id);
	}

	@GetMapping
	public List<Fornecedor> listarTodosFornecedores() {
		return fornecedorService.getAllFornecedores();
	}

	@DeleteMapping("/{id}")
	public void deletarFornecedor(@PathVariable Long id) {
		fornecedorService.deletarFornecedor(id);
	}
}