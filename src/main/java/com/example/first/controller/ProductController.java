package com.example.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.dto.request.CreateProductRequest;
import com.example.first.dto.response.ProductDTO;
import com.example.first.entity.ProductEntity;
import com.example.first.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	// 400, 401, 403, 500, 503, 200

	@GetMapping("/list")
	public Page<ProductDTO> getListProducts(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int pageSize) {
		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("name"));

		return productService.getListProducts(pageable);
	}

	@GetMapping("/list-top5")
	public List<ProductDTO> getListTop5Products() {
		return productService.getTop5Products();
	}

	@GetMapping("/list-most")
	public List<ProductDTO> getLostMostProducts() {
		return productService.getListMostProduct();
	}

	@GetMapping("/detail/{id}")
	public ProductDTO getDetailProduct(@PathVariable Long id) {
		return productService.getDetailProduct(id);
	}

	@PostMapping("/create")
	public ProductDTO createProduct(@RequestBody CreateProductRequest bodyRequest) {
		ProductDTO newProduct = productService.createProduct(bodyRequest);
		return newProduct;
	}

	@PutMapping("/update/{id}")
	public ProductDTO createProduct(@RequestBody CreateProductRequest bodyRequest, @PathVariable Long id) {
		ProductDTO newProduct = productService.updateProduct(bodyRequest, id);
		return newProduct;
	}

}
