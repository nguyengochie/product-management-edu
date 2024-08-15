package com.example.first.model;

public class Product {
	private String id;
	private String name;
	private int quantity;
	private double price;
	private String releaseDate;
	private String description;
	private String image;
	private String cid;

	public Product() {
	}

	public Product(String id, String name, int quantity, double price, String releaseDate, String description,
			String image, String cid) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.releaseDate = releaseDate;
		this.description = description;
		this.image = image;
		this.cid = cid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
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

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}
