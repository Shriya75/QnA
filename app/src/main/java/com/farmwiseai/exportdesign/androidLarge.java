package com.farmwiseai.exportdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class androidLarge extends Activity {

	private View _bg__android_large___1_ek2;
	private View _bg__bg_img1_1_ek1;
	private ImageView mask_group;
	private View _bg__rectangle_2;
	private View rectangle_2_ek4;
	private View _bg__rectangle_3;
	private View _bg__rectangle_2_ek6;
	private View rectangle_2_ek7;
	private View _bg__rectangle_4;
	private View _bg__rectangle_4_ek5;
	private View rectangle_2_ek8;
	private View _bg__frame_2_ek1;
	private ImageView frame_3;
	private TextView we_understand_being_a_farmer_is_not_easy;
	private Button getStartedButton;
	private Button skipButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_androidlarge);

		// Initialize views
		_bg__android_large___1_ek2 = findViewById(R.id._bg__android_large___1_ek2);
		_bg__bg_img1_1_ek1 = findViewById(R.id._bg__bg_img1_1_ek1);
		mask_group = findViewById(R.id.mask_group);
		_bg__rectangle_2 = findViewById(R.id._bg__rectangle_2);
		rectangle_2_ek4 = findViewById(R.id.rectangle_2_ek4);
		_bg__rectangle_3 = findViewById(R.id._bg__rectangle_3);
		_bg__rectangle_2_ek6 = findViewById(R.id._bg__rectangle_2_ek6);
		rectangle_2_ek7 = findViewById(R.id.rectangle_2_ek7);
		_bg__rectangle_4 = findViewById(R.id._bg__rectangle_4);
		_bg__rectangle_4_ek5 = findViewById(R.id._bg__rectangle_4_ek5);
		rectangle_2_ek8 = findViewById(R.id.rectangle_2_ek8);
		_bg__frame_2_ek1 = findViewById(R.id._bg__frame_2_ek1);
		frame_3 = findViewById(R.id.frame_3);
		we_understand_being_a_farmer_is_not_easy = findViewById(R.id.we_understand_being_a_farmer_is_not_easy);

		// Initialize buttons
		getStartedButton = findViewById(R.id.getStartedButton);
		skipButton = findViewById(R.id.skipButton);

		// Set click listeners for buttons
		getStartedButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle the "Get Started" button click
				// Add your code to navigate to the next screen or perform an action
				// For example, you can start a new activity
				Intent intent = new Intent(androidLarge.this, Onboarding2.class);
				startActivity(intent);
			}
		});

		skipButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle the "Skip" button click
				// Add your code to skip the introduction and proceed
				Intent intent = new Intent(androidLarge.this, onboarding_4_activity.class);
				startActivity(intent);
			}
		});

		// Your custom code goes here
	}
}

	
	