package net.javaguierd.springboot.pkgService;

import java.util.List;

import net.javaguierd.springboot.pkgEntity.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getById(int id);

	public List<Product> getAllProductsByAddOne(Product p);

	public List<Product> getProductAfterUpdate(Product update);

	public List<Product> deleteProd(int iD);

}
