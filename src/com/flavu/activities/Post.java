package com.flavu.activities;

import com.flavu.R;
import com.flavu.R.layout;
import com.flavu.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Post extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_post);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.post, menu);
		return true;
	}

}
