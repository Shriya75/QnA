

	/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		screen_11
     *	@date 		Sunday 08th of October 2023 07:32:49 PM
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

    public class screen1 extends Activity {


        private View _bg__screen_11_ek2;
        private View _bg__group_171_ek1;
        private ImageView frame_86;
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
        private View _bg__group_169_ek1;
        private View _bg__ulavan_icon_ek1;
        private View ellipse_2;
        private ImageView ellipse_3;
        private TextView ulavan;
        private View _bg__more_icon_ek1;
        private View _bg__more_vert_black_24dp_1_ek1;
        private ImageView vector_ek4;
        private ImageView vector_ek5;
        private View _bg__group_170_ek1;
        private View _bg__group_154_ek1;
        private View _bg__frame_55_ek1;
        private ImageView blue_robot_mascot_logo_icon_design_675467_55_1__traced___1_;
        private ImageView frame_54;
        private View _bg__chat_bubbles_ek1;
        private View _bg__message_ek1;
        private TextView do_you_like_it_;
        private Button morebutton;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.screen1_activity);


            _bg__screen_11_ek2 = (View) findViewById(R.id._bg__screen_11_ek2);
            _bg__group_171_ek1 = (View) findViewById(R.id._bg__group_171_ek1);
            frame_86 = (ImageView) findViewById(R.id.frame_86);
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
            _bg__group_169_ek1 = (View) findViewById(R.id._bg__group_169_ek1);
            _bg__ulavan_icon_ek1 = (View) findViewById(R.id._bg__ulavan_icon_ek1);
            ellipse_2 = (View) findViewById(R.id.ellipse_2);
            ellipse_3 = (ImageView) findViewById(R.id.ellipse_3);
            ulavan = (TextView) findViewById(R.id.ulavan);
            _bg__more_icon_ek1 = (View) findViewById(R.id._bg__more_icon_ek1);
            _bg__more_vert_black_24dp_1_ek1 = (View) findViewById(R.id._bg__more_vert_black_24dp_1_ek1);
            vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
            vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
            _bg__group_170_ek1 = (View) findViewById(R.id._bg__group_170_ek1);
            _bg__group_154_ek1 = (View) findViewById(R.id._bg__group_154_ek1);
            _bg__frame_55_ek1 = (View) findViewById(R.id._bg__frame_55_ek1);
            blue_robot_mascot_logo_icon_design_675467_55_1__traced___1_ = (ImageView) findViewById(R.id.blue_robot_mascot_logo_icon_design_675467_55_1__traced___1_);
            frame_54 = (ImageView) findViewById(R.id.frame_54);
            _bg__chat_bubbles_ek1 = (View) findViewById(R.id._bg__chat_bubbles_ek1);
            _bg__message_ek1 = (View) findViewById(R.id._bg__message_ek1);
            do_you_like_it_ = (TextView) findViewById(R.id.do_you_like_it_);



            //custom code goes here
            morebutton = findViewById(R.id.morebutton);
            //custom code goes here
            morebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle the "Get Started" button click
                    // Add your code to navigate to the next screen or perform an action
                    // For example, you can start a new activity
                    Intent intent = new Intent(screen1.this, screen_7_activity.class);
                    startActivity(intent);
                }
            });

        }
    }

