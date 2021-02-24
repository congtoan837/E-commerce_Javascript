package com.poly.services;

import java.util.List;
import java.util.Optional;

import com.poly.model.Product;

public interface ProductService {

	void deleteAll();

	void deleteAll(List<Product> entities);

	void delete(Product entity);

	void deleteById(Integer id);

	long count();

	List<Product> findAllById(List<Integer> ids);

	Iterable<Product> findAll();

	boolean existsById(Integer id);

	Optional<Product> findById(Integer id);

	List<Product> saveAll(List<Product> entities);

	Product save(Product entity);

}
