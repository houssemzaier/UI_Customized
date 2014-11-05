package com.example.seekbarexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
//	http://stackoverflow.com/questions/16163215/android-styling-seek-bar
//	http://stackoverflow.com/questions/15111402/how-can-i-create-a-border-around-an-android-linearlayout
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}  
 
	@Override 
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
