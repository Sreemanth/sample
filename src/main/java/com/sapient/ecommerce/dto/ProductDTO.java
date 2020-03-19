package com.sapient.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper =true)
@EqualsAndHashCode(callSuper = true)

public class ProductDTO extends BaseDTO {

	private String code;
	private String name;
	private String description;
}
