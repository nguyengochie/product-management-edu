package com.example.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.dto.request.CreateCategoryRequest;
import com.example.first.dto.response.CategoryDTO;
import com.example.first.entity.CategoryEntity;
import com.example.first.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@GetMapping("/list")
	public List<CategoryDTO> getCategory() {
		return categoryService.getListCategory();
	}

	@PostMapping("/create")
	public CategoryDTO createCategory(@RequestBody CreateCategoryRequest bodyCreateCategory) {

		CategoryEntity newCate = new CategoryEntity();
		newCate.setName(bodyCreateCategory.getName());
		newCate.setDescription(bodyCreateCategory.getDescription());

		return categoryService.saveCategory(newCate);
	}

	@PutMapping("/update/{id}")
	public CategoryDTO updateCategory(@PathVariable Long id, @RequestBody CreateCategoryRequest bodyCreateCategory) {

		CategoryEntity newCate = new CategoryEntity();
		newCate.setId(id);
		newCate.setName(bodyCreateCategory.getName());
		newCate.setDescription(bodyCreateCategory.getDescription());

		return categoryService.saveCategory(newCate);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteCategory(@PathVariable Long id) {
		return categoryService.deleteCategory(id);

	}

	@GetMapping("/detail/{id}")
	public CategoryDTO getDetailCategory(@PathVariable Long id) {
		return categoryService.getDetailCategory(id);

	}

}
