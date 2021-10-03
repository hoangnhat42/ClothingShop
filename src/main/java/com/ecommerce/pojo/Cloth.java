package com.ecommerce.pojo;

public class Cloth
{
	private int clothId;
	private String clothTitle,clothDescription;
	
	public Cloth(String clothTitle, String clothDescription) {
		super();
		this.clothTitle = clothTitle;
		this.clothDescription = clothDescription;
	}

	public Cloth(int clothId, String clothTitle, String clothDescription) {
		super();
		this.clothId = clothId;
		this.clothTitle = clothTitle;
		this.clothDescription = clothDescription;
	}

	public int getClothId() {
		return clothId;
	}

	public void setClothId(int clothId) {
		this.clothId = clothId;
	}

	public String getClothTitle() {
		return clothTitle;
	}

	public void setClothTitle(String clothTitle) {
		this.clothTitle = clothTitle;
	}

	public String getClothDescription() {
		return clothDescription;
	}

	public void setClothDescription(String clothDescription) {
		this.clothDescription = clothDescription;
	}
	
	
}
