package com.sapient.ecommerce.services;

import com.sapient.ecommerce.dto.ProductsDTO;
import com.sapient.ecommerce.entity.Product;

public interface ProductService {

	Product addProduct(Product newProduct);

	ProductsDTO findAllProducts();

	ProductsDTO groupBy(String groupBy);
}
