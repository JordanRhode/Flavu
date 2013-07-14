package com.flavu.activities;

import com.flavu.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Flavorites extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flavorites);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flavorites, menu);
		return true;
	}

}
