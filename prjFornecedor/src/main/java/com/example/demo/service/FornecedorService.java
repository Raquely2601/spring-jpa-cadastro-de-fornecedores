package com.example.demo.service;

import java.util.List;
import java.util.Optional;

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
	public Fornecedor updateFornecedor(long id, Fornecedor fornecedorAtualizado) {
		// produto a ser procurado ser procurado pelo id
		Optional<Fornecedor> fornecedorOptional = fornecedorRepository.findById(id);
	   if (fornecedorOptional.isPresent()) {
		   // se existir -> atualiza
		   Fornecedor fornecedor = fornecedorOptional.get();
		   fornecedor.setRazaoSocial(fornecedorAtualizado.getRazaoSocial());
		   fornecedor.setNomefantasia(fornecedorAtualizado.getNomefantasia());
			fornecedor.setRazaoSocial(fornecedorAtualizado.getRazaoSocial());
			fornecedor.setFone(fornecedorAtualizado.getFone());
			fornecedor.setEndereco(fornecedorAtualizado.getEndereco());
			fornecedor.setEmail(fornecedorAtualizado.getEmail());
			fornecedor.setCnpj(fornecedorAtualizado.getCnpj());

			return fornecedorRepository.save(fornecedor);

		} else {

			return null;

		}


	   }
	}


