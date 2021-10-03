package com.ecommerce.pojo;

public class Brand
{
	private int brandId;
	private String brandTitle,brandDescription;
	
	public Brand(String brandTitle, String brandDescription) {
		super();
		this.brandTitle = brandTitle;
		this.brandDescription = brandDescription;
	}

	public Brand(int brandId, String brandTitle, String brandDescription) {
		super();
		this.brandId = brandId;
		this.brandTitle = brandTitle;
		this.brandDescription = brandDescription;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandTitle() {
		return brandTitle;
	}

	public void setBrandTitle(String brandTitle) {
		this.brandTitle = brandTitle;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}
	
}
