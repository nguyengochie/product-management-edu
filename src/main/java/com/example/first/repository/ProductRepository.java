package com.example.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.first.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
	
	

	@Query(value = "SELECT * FROM products order by price limit 5", nativeQuery = true)
	public List<ProductEntity> findTop5Cheapest();

	@Query(value = "select  cid from products group by cid order by count(cid) desc", nativeQuery = true)
	public List<Long> findMostCid();

//	public List<ProductEntity> findByCid(Long id);

	@Query(value = "SELECT * FROM products where cid = ?1", nativeQuery = true)
	public List<ProductEntity> findByCid(Long id);

}
