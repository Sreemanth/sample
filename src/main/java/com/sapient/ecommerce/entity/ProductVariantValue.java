package com.sapient.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductVariantValue extends IDEntity {

	@ManyToOne
	@JoinColumn(name = "product_variant_id")
	private ProductVariant productVariant;

	@ManyToOne
	@JoinColumn(name = "option_value_id")
	private OptionValue optionValue;

}
