package com.example.android.touroflondon;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

	public static List<Coupon> getAllCoupons() {
		List<Coupon> coupons = new ArrayList<Coupon>();
		Coupon coupon = new Coupon(0, "KFC, 1 Pitt St, Sydney", "<h1>Family Special</h1>", "Buy one get one free", -33.873651, 151.2068896);
		coupons.add(coupon);
		coupon = new Coupon(1, "Subway, Sydney", "<h1>Meals discount</h1>", "20% discount for all meals", -33.872651, 151.2668896);
		coupons.add(coupon);
		coupon = new Coupon(2, "Hungry Jack, Sydney", "<h1>Lunch Special</h1>", "Chicken wings $1 for 3", -33.973651, 151.2268896);
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
