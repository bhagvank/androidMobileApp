package org.city.travelmgmt;

import android.support.v7.app.ActionBarActivity;

import com.turbizo.corporateportal.R.color;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		changeColorButton();
	}
	
	
	private void changeColorButton()
	{
		Button button = (Button) findViewById(R.id.button1);
		button.setBackgroundColor(color.material_deep_teal_200);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		final Context context = this;
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view)
			{
			 Intent intent = new Intent(context,VehiclesViewActivity.class);
			 startActivity(intent);
			}
		});
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
