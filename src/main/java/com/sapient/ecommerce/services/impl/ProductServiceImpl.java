package com.sapient.ecommerce.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.ecommerce.dto.ProductDTO;
import com.sapient.ecommerce.dto.ProductsDTO;
import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.repositories.ProductRepository;
import com.sapient.ecommerce.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product newProduct) {
		return productRepository.save(newProduct);
	}

	@Override
	public ProductsDTO findAllProducts() {
		List<Product> products = productRepository.findAll();
		return convertListToDTO(products);

	}

	private ProductsDTO convertListToDTO(List<Product> products) {
		List<ProductDTO> productDtos = new ArrayList<ProductDTO>();
		for (Product product : products) {
			ProductDTO dto = new ProductDTO();
			BeanUtils.copyProperties(product, dto);
			productDtos.add(dto);
		}
		return ProductsDTO.builder().products(productDtos).build();
	}

	public ProductsDTO groupBy(String groupBy) {
		return convertListToDTO(productRepository.groupBy(groupBy));
	}

}
