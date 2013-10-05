package com.example.android.touroflondon;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class CouponDetailDialog extends AboutDialog {
	public String title;
	
    public CouponDetailDialog(String title) {
    	this.title = title;
    }

	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Build the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        
        Coupon coupon = DataStore.getCouponByStoreName(this.title);
        builder.setTitle(coupon.getStoreName());

        // Inflate the layout and get views
        View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_about,null);
        TextView text = (TextView) v.findViewById(R.id.about_text);

        // Generate and set text
        StringBuffer buffer = new StringBuffer();
        buffer.append(coupon.getTitle());
        buffer.append(coupon.getDetails());
        text.setText(Html.fromHtml(buffer.toString()));
        // set the view as dialog content
        builder.setView(v);

        return builder.create();
    }
}
