package com.sapient.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Option extends IDEntity {

	private String name;
	private String description;

	
}
