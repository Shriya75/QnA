
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		screen_8
	 *	@date 		Saturday 07th of October 2023 08:15:39 AM
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

public class screen_8_activity extends Activity {

	
	private View _bg__screen_8_ek2;
	private ImageView __img___freebg_screen_8;
	private View _bg__frame_44_ek1;
	private View _bg__wrapper_ek1;
	private View _bg__icon_ek1;
	private ImageView vector;
	private TextView search_previous_questions;
	private View _bg__group_167_ek1;
	private View _bg__headergroup__avoid_making_changes__ek1;
	private View _bg__notificationbar_ek1;
	private TextView _1_42;
	private View _bg__frame_3_ek1;
	private View _bg__signal_cellular_4_bar_black_24dp_ek1;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private View _bg__battery_full_black_24dp_ek1;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private View _bg__header_ek1;
	private View _bg__businessdetails_ek1;
	private View _bg__businessname_ek1;
	private TextView history;
	private View _bg__close_icon_ek1;
	private ImageView ___color;
	private View _bg__chat_bubbles_ek1;
	private View _bg__message_ek1;
	private TextView do_you_like_it_;
	private View _bg__content_content_block_small_ek1;
	private TextView what_are_the_government_schemes_for_farme___;
	private TextView here_some_of_the_government_schemes_for_farmers_in_tamil_nadu__agriculture___farmers_welfare_schemes___;
	private ImageView divider_line;
	private Button closehistorybutton;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_8);

		
		_bg__screen_8_ek2 = (View) findViewById(R.id._bg__screen_8_ek2);
		__img___freebg_screen_8 = (ImageView) findViewById(R.id.__img___freebg_screen_8);
		_bg__frame_44_ek1 = (View) findViewById(R.id._bg__frame_44_ek1);
		_bg__wrapper_ek1 = (View) findViewById(R.id._bg__wrapper_ek1);
		_bg__icon_ek1 = (View) findViewById(R.id._bg__icon_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		search_previous_questions = (TextView) findViewById(R.id.search_previous_questions);
		_bg__group_167_ek1 = (View) findViewById(R.id._bg__group_167_ek1);
		_bg__headergroup__avoid_making_changes__ek1 = (View) findViewById(R.id._bg__headergroup__avoid_making_changes__ek1);
		_bg__notificationbar_ek1 = (View) findViewById(R.id._bg__notificationbar_ek1);
		_1_42 = (TextView) findViewById(R.id._1_42);
		_bg__frame_3_ek1 = (View) findViewById(R.id._bg__frame_3_ek1);
		_bg__signal_cellular_4_bar_black_24dp_ek1 = (View) findViewById(R.id._bg__signal_cellular_4_bar_black_24dp_ek1);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		_bg__battery_full_black_24dp_ek1 = (View) findViewById(R.id._bg__battery_full_black_24dp_ek1);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		_bg__header_ek1 = (View) findViewById(R.id._bg__header_ek1);
		_bg__businessdetails_ek1 = (View) findViewById(R.id._bg__businessdetails_ek1);
		_bg__businessname_ek1 = (View) findViewById(R.id._bg__businessname_ek1);
		history = (TextView) findViewById(R.id.history);
		_bg__close_icon_ek1 = (View) findViewById(R.id._bg__close_icon_ek1);
		___color = (ImageView) findViewById(R.id.___color);
		_bg__chat_bubbles_ek1 = (View) findViewById(R.id._bg__chat_bubbles_ek1);
		_bg__message_ek1 = (View) findViewById(R.id._bg__message_ek1);
		do_you_like_it_ = (TextView) findViewById(R.id.do_you_like_it_);
		_bg__content_content_block_small_ek1 = (View) findViewById(R.id._bg__content_content_block_small_ek1);
		what_are_the_government_schemes_for_farme___ = (TextView) findViewById(R.id.what_are_the_government_schemes_for_farme___);
		here_some_of_the_government_schemes_for_farmers_in_tamil_nadu__agriculture___farmers_welfare_schemes___ = (TextView) findViewById(R.id.here_some_of_the_government_schemes_for_farmers_in_tamil_nadu__agriculture___farmers_welfare_schemes___);
		divider_line = (ImageView) findViewById(R.id.divider_line);
	
		
		//custom code goes here
		closehistorybutton = findViewById(R.id.closehistorybutton);
		closehistorybutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Handle the "Get Started" button click
				// Add your code to navigate to the next screen or perform an action
				// For example, you can start a new activity
				Intent intent = new Intent(screen_8_activity.this, screen_7_activity.class);
				startActivity(intent);
			}
		});
	}
}
	
	