package com.sapient.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Group {

	private Long id;
	private ProductDTO dto;

	public Group() {

	}

	public Group(Long id, ProductDTO dto) {
		this.id = id;
		this.dto = dto;

	}
}
