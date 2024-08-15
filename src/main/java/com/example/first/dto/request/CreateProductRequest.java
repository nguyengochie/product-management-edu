package com.example.first.dto.request;

public class CreateProductRequest {
	private String description, image, name;
	private Long cid;
	private int quantity;
	private double price;

	public CreateProductRequest() {
		super();
	}

	public CreateProductRequest(String description, String image, String name, Long cid, int quantity, double price) {
		super();
		this.description = description;
		this.image = image;
		this.name = name;
		this.cid = cid;
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

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
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

}
