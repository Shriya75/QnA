
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		onboarding_4
	 *	@date 		Friday 06th of October 2023 11:47:39 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


	package com.farmwiseai.exportdesign;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class onboarding_4_activity extends Activity {

	
	private View _bg__onboarding_4_ek2;
	private ImageView __img___freebg_onboarding_4;
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
	private View _bg___2__outlined_a__inactive_ek1;
	private ImageView text_field_outline;
	private TextView ____input_text;
	private View _bg__group_159_ek1;
	private ImageView frame_86;
	private View _bg__group_158_ek1;
	private View ellipse_1;
	private View _bg__group_157_ek1;
	private View _bg__upload_icon_ek1;
	private ImageView vector_ek4;
	private TextView upload_your_picture;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.onboarding_4);

		
		_bg__onboarding_4_ek2 = (View) findViewById(R.id._bg__onboarding_4_ek2);
		__img___freebg_onboarding_4 = (ImageView) findViewById(R.id.__img___freebg_onboarding_4);
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
		_bg___2__outlined_a__inactive_ek1 = (View) findViewById(R.id._bg___2__outlined_a__inactive_ek1);
		//text_field_outline = (ImageView) findViewById(R.id.text_field_outline);
		____input_text = (TextView) findViewById(R.id.____input_text);
		_bg__group_159_ek1 = (View) findViewById(R.id._bg__group_159_ek1);
		//frame_86 = (ImageView) findViewById(R.id.savedup);
		_bg__group_158_ek1 = (View) findViewById(R.id._bg__group_158_ek1);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		_bg__group_157_ek1 = (View) findViewById(R.id._bg__group_157_ek1);
		_bg__upload_icon_ek1 = (View) findViewById(R.id._bg__upload_icon_ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		upload_your_picture = (TextView) findViewById(R.id.upload_your_picture);


		//custom code goes here
		EditText textArea = findViewById(R.id.text_area);
		textArea.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Define your intent to navigate to the TargetActivity
				Intent intent = new Intent(onboarding_4_activity.this, onboarding_5_activity.class);

				// Start the TargetActivity
				startActivity(intent);
			}
		});
	}
}
	
	