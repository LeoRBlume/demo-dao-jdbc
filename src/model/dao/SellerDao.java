package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	//Insere um Vendedor no BD
	void insert(Seller obj);
	
	//Atualiza um vendedor
	void update(Seller obj);
	
	//Deleta um vendedor pelo Id
	void deleteById(Integer id);
	
	//Acha um vendedor pelo Id
	Seller findById(Integer id);
	
	//Retorna uma lista com todos os vendedores
	List<Seller> findAll();
}