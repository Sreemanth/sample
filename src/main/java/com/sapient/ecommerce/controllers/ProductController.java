package com.sapient.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sapient.ecommerce.dto.ProductsDTO;
import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(path = "/product", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@RequestMapping(path = "/products", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ProductsDTO listProducts() {
		return productService.findAllProducts();
	}

	@RequestMapping(path = "/groupByBrand", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ProductsDTO groupByBrand() {
		return productService.groupBy("brand");
	}

	@RequestMapping(path = "/groupByPrice", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ProductsDTO groupByPrice() {
		return productService.groupBy("price");
	}

	@RequestMapping(path = "/groupByColor", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ProductsDTO groupByColor() {
		return productService.groupBy("color");
	}

	@RequestMapping(path = "/groupBySize", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ProductsDTO groupBySize() {
		return productService.groupBy("size");
	}
}
