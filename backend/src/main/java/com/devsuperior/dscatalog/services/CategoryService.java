package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

// @Service serve pra registrar a classe como componente que irá participar
// do sistema de injeção de dependencia automatizado do spring

@Service 
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true) //Coloco essa anotação caso eu queira que a operação do método tenha transação com o banco
	public List<Category> findAll() {
		return repository.findAll();
	}
}
