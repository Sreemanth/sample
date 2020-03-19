package com.sapient.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sapient.ecommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("select p from Product p , ProductVariant pv , ProductVariantValue pvv   where pv.product.id = p.id and pvv.productVariant.id = pv.id and pvv.optionValue.option.name = :optionName")
	public List<Product> groupBy(@Param("optionName") String optionName);

}
