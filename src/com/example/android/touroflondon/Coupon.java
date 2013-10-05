package com.example.android.touroflondon;

import java.util.Date;

public class Coupon  {

	private Integer id;
	private String storeName;
	private String address;
	private Double longitude;
	private Double latitude;
	private String title;
	private String details;
	private Date expiredTime;
	private String imageUrl;

	public Coupon(Integer id, String storeName, String title, String details) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.storeName = storeName;
		this.title = title;
		this.details = details;
	}
	
	public Coupon(Integer id, String storeName, String title, String details, Double latitude, Double longitude) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.storeName = storeName;
		this.title = title;
		this.details = details;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
