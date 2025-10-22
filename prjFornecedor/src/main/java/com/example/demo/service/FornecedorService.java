package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fornecedor;
import com.example.demo.repository.FornecedorRepository;

@Service
public class FornecedorService {

	private final FornecedorRepository fornecedorRepository;

	@Autowired
	public FornecedorService(FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}

	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

	public Fornecedor getFornecedorById(Long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}

	public List<Fornecedor> getAllFornecedores() {
		return fornecedorRepository.findAll();
	}

	public void deletarFornecedor(Long id) {
		fornecedorRepository.deleteById(id);
	}
}