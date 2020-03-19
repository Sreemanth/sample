package com.sapient.ecommerce.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@Builder
public class ProductsDTO {

	private List<ProductDTO> products;

}
