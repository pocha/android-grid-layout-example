package com.codelearn.gridlayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GridLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.grid_layout, menu);
		return true;
	}

}
