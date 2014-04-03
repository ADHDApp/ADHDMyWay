package com.example.adhdmyway;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ADHDRegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adhd_register);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.adhdregister, menu);
		return true;
	}

}
