
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		onboarding_5
	 *	@date 		Friday 06th of October 2023 12:04:36 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


	package com.farmwiseai.exportdesign;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class onboarding_5_activity extends Activity {

	
	private View _bg__onboarding_5_ek2;
	private View _bg__headergroup__avoid_making_changes__ek1;
	private View _bg__notificationbar_ek1;
	private TextView _1_42;
	private View _bg__frame_3_ek1;
	private View _bg__signal_cellular_4_bar_black_24dp_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private View _bg__battery_full_black_24dp_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private View _bg__header_ek1;
	private View _bg__businessdetails_ek1;
	private View _bg__businessname_ek1;
	private TextView greetings____;
	private View _bg___2__outlined_b__activated_ek1;
	private View _bg__assistive_ek1;
	private ImageView label;
	private View _bg__input_ek1;
	private TextView ____input_text;
	private View cursor;
	private View _bg__label_ek2;
	private TextView ____label;
	private ImageView upper_surface;
	private View _bg__group_158_ek1;
	private ImageView ellipse_1;
	private View _bg__group_157_ek1;
	private View _bg__upload_fill0_wght400_grad0_opsz48_1_ek1;
	private View _bg__edit_icon_ek1;
	private ImageView vector_ek4;
	private View _bg__group_160_ek1;
	private ImageView frame_86;
	private Button SaveButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.onboarding_5);

		
		_bg__onboarding_5_ek2 = (View) findViewById(R.id._bg__onboarding_5_ek2);
		_bg__headergroup__avoid_making_changes__ek1 = (View) findViewById(R.id._bg__headergroup__avoid_making_changes__ek1);
		_bg__notificationbar_ek1 = (View) findViewById(R.id._bg__notificationbar_ek1);
		_1_42 = (TextView) findViewById(R.id._1_42);
		_bg__frame_3_ek1 = (View) findViewById(R.id._bg__frame_3_ek1);
		_bg__signal_cellular_4_bar_black_24dp_ek1 = (View) findViewById(R.id._bg__signal_cellular_4_bar_black_24dp_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		_bg__battery_full_black_24dp_ek1 = (View) findViewById(R.id._bg__battery_full_black_24dp_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_bg__header_ek1 = (View) findViewById(R.id._bg__header_ek1);
		_bg__businessdetails_ek1 = (View) findViewById(R.id._bg__businessdetails_ek1);
		_bg__businessname_ek1 = (View) findViewById(R.id._bg__businessname_ek1);
		greetings____ = (TextView) findViewById(R.id.greetings____);
		_bg___2__outlined_b__activated_ek1 = (View) findViewById(R.id._bg___2__outlined_b__activated_ek1);
		_bg__assistive_ek1 = (View) findViewById(R.id._bg__assistive_ek1);
		label = (ImageView) findViewById(R.id.label);
		_bg__input_ek1 = (View) findViewById(R.id._bg__input_ek1);
		____input_text = (TextView) findViewById(R.id.____input_text);
		cursor = (View) findViewById(R.id.cursor);
		_bg__label_ek2 = (View) findViewById(R.id._bg__label_ek2);
		____label = (TextView) findViewById(R.id.____label);
		upper_surface = (ImageView) findViewById(R.id.upper_surface);
		//_bg__group_158_ek1 = (View) findViewById(R.id._bg__group_158_ek1);
		ellipse_1 = (ImageView) findViewById(R.id.ellipse_1);
		_bg__group_157_ek1 = (View) findViewById(R.id._bg__group_157_ek1);
		_bg__upload_fill0_wght400_grad0_opsz48_1_ek1 = (View) findViewById(R.id._bg__upload_fill0_wght400_grad0_opsz48_1_ek1);
		_bg__edit_icon_ek1 = (View) findViewById(R.id._bg__edit_icon_ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		_bg__group_160_ek1 = (View) findViewById(R.id._bg__group_160_ek1);
		frame_86 = (ImageView) findViewById(R.id.frame_86);
	
		
		//custom code goes here
		SaveButton = findViewById(R.id.SaveButton);


		// Set click listeners for buttons
		SaveButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle the "Get Started" button click
				// Add your code to navigate to the next screen or perform an action
				// For example, you can start a new activity
				Intent intent = new Intent(onboarding_5_activity.this, screen1.class);
				startActivity(intent);
			}
		});
	
	}
}
	
	