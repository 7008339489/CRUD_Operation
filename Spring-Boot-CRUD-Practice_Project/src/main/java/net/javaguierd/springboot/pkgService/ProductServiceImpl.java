package net.javaguierd.springboot.pkgService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import net.javaguierd.springboot.pkgEntity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	List<Product> prod;
	
	{
	prod = new ArrayList<>();
	prod.add(new Product(1,"JAVA","Java is a good Language"));
	prod.add(new Product(2,"PYTHON","Python is very demanding Language"));
	prod.add(new Product(3,"C","C is a mother Language"));
	}

	@Override
	public List<Product> getAllProducts() {
		return prod;
	}

	@Override
	public Product getById(int id) {
		return prod.stream().filter(i -> i.getId()==id).collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Product> getAllProductsByAddOne(Product p) {
		prod.add(p);
		return getAllProducts();
	}

	@Override
	public List<Product> getProductAfterUpdate(Product update) {
		for (Product product : prod) {
			if(product.getId() == update.getId()) {
				product.setName(update.getName());
				product.setDesc(update.getDesc());
			}
		}
		return prod;
	}

	@Override
	public List<Product> deleteProd(int iD) {
		
		for (Product product : prod) {
			if(product.getId() == iD) {
				prod.remove(product);
			}
		}
		return prod;
	}
	
	

}
