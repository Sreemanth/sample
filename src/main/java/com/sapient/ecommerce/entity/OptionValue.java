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
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OptionValue extends IDEntity {

	private String value;

	@ManyToOne
	@JoinColumn(name = "option_id")
	private Option option;

}
