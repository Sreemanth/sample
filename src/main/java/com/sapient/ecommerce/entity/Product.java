package com.sapient.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "sku" }) })
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Product extends IDEntity {

	private String name;
	private String description;
	private String sku;
	private Boolean available;

}
