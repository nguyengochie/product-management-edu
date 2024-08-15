package com.example.first.dto.response;

public class ProductDTO {
	private Long id;
	private String description, image, name;
	private CategoryDTO category;
	private int quantity;
	private double price;

	public ProductDTO() {
		super();
	}

	public ProductDTO(Long id,String description, String image, String name, CategoryDTO category, int quantity, double price) {
		super();
		this.id = id;
		this.description = description;
		this.image = image;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
