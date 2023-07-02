package net.javaguierd.springboot.pkgController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguierd.springboot.pkgEntity.Product;
import net.javaguierd.springboot.pkgService.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/product")
	public String Product() {
		return "Test Product";
	}
	
	@GetMapping("/allProducts")
	public List<Product> getAllProduct() {
		return this.productService.getAllProducts();
	}
	
	@GetMapping("/getById/{ID}")
	public Product getById(@PathVariable int ID) {
		return this.productService.getById(ID);
	}
	
	@PostMapping("/addProduct/{add}")
	public List<Product> addProduct(@RequestBody Product add){
		return this.productService.getAllProductsByAddOne(add);
	}
	
	@PutMapping("/updateProduct/{update}")
	public List<Product> updateProduct(@RequestBody Product update){
		return this.productService.getProductAfterUpdate(update);
	}
	
	@DeleteMapping("/deleteProduct/{ID}")
	public List<Product> deleteProduct(@PathVariable int ID){
		return this.productService.deleteProd(ID);
	}

}
