package com.Hibernate.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name="productos")
public class Product {
	@Id
	@Column (name="IdProduct")
	private int idProduct;
	@Column (name="nombreProducto")
	private String productName;
	@Column (name="precioProducto")
	private double productPrice;
	
	public Product() {}

	public Product (int idProduct, String productName, double productPrice) {
		this.idProduct =  idProduct;
		this.productName = productName;
		this.productPrice = productPrice;
		
		
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "product [idProduct="+idProduct+", productName="+productName+", productPrice="+productPrice+"]";
				
	}
}
