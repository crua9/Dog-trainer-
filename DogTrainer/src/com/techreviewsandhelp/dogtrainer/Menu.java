package com.techreviewsandhelp.dogtrainer;

import com.techreviewsandhelp.disability.Data;
import com.techreviewsandhelp.disability.InputMainActivity;
import com.techreviewsandhelp.disability.R;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends ActionBarActivity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu); ;
        
        final Context c = this;
        
        Button menu = (Button) findViewById(R.id.back);
		menu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(c, MainActivity.class));
			}
		});
		}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		SharedPreferences preferences = PreferenceManager
				.getDefaultSharedPreferences(this);
		String name = "Hi, my name is "
				+ preferences.getString(Data.Name, Data.default_Name);
		final String phonenumber = preferences.getString(Data.Phonenumber,
				Data.default_Phonenumber);
		String symptomps = preferences.getString(Data.Symptomps,
				Data.default_Symptomps);
		String disString = preferences.getString(Data.Disability,
				Data.default_Disability);

		settext(R.id.e1, disString);
		settext(R.id.e2, phonenumber);
		settext(R.id.symphtoms, symptomps);
		settext(R.id.name, name);
	}
	public void settext(int id, String text) {

		TextView txt = (TextView) findViewById(id);
		txt.setText(text);
	}

		
		
	}