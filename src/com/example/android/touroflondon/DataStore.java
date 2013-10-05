package com.example.android.touroflondon;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

	public static List<Coupon> getAllCoupons() {
		List<Coupon> coupons = new ArrayList<Coupon>();
		Coupon coupon = new Coupon(0, "KFC", "<h1>Special</h1>", "special details", 51.503324, -0.119543);
		coupons.add(coupon);
		coupon = new Coupon(1, "Subway", "<h1>Special</h1>", "Chicken wings $1 for 3", 51.5072912, -0.0767194);
		coupons.add(coupon);
		coupon = new Coupon(2, "Hungry Jack", "<h1>Special</h1>", "special details", 51.5075744, -0.0992315);
		coupons.add(coupon);
		return coupons;	
	}
	
	public static Coupon getCouponByStoreName(String storeName) {
		for (Coupon coupon: getAllCoupons()) {
			if (coupon.getStoreName().equalsIgnoreCase(storeName)) {
				return coupon;
			}
		}		
		return null;
	}
}
