
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		onboarding_3
	 *	@date 		Thursday 05th of October 2023 08:12:53 AM
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
import android.widget.ImageView;
import android.widget.TextView;

	public class onboarding_3_activity extends Activity {


		private View _bg__bg_img2_1_ek2;
		private ImageView mask_group;
		private View _bg__frame_2_ek1;
		private ImageView frame_3;
		private TextView know_all_the_government_schemes_available;
		private Button ContinueButton;
		private Button skipButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.onboarding_3);


		_bg__bg_img2_1_ek2 = (View) findViewById(R.id._bg__bg_img2_1_ek2);
		mask_group = (ImageView) findViewById(R.id.page2img);
		_bg__frame_2_ek1 = (View) findViewById(R.id._bg__frame_2_ek1);
		frame_3 = (ImageView) findViewById(R.id.frame_3);
		know_all_the_government_schemes_available = (TextView) findViewById(R.id.know_all_the_government_schemes_available);

		ContinueButton = findViewById(R.id.ContinueButton);
		skipButton = findViewById(R.id.skipButton);

		// Set click listeners for buttons
		ContinueButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle the "Get Started" button click
				// Add your code to navigate to the next screen or perform an action
				// For example, you can start a new activity
				Intent intent = new Intent(onboarding_3_activity.this, onboarding_4_activity.class);
				startActivity(intent);
			}
		});

		skipButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle the "Skip" button click
				// Add your code to skip the introduction and proceed
			}
		});
		
		//custom code goes here
	
	}
}
	
	