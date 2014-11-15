package com.wolfsoft.epower;




import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Links extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.links); 
		
		// get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
        
   
	}

	
	public void geda(View v)
	{
		Uri uri = Uri.parse("http://www.geda.org.in/");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
	
	
	public void geb(View v)
	{
		Uri uri = Uri.parse("http://www.gseb.com/");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
	
	public void gil(View v)
	{

		Uri uri = Uri.parse("http://gil.gujarat.gov.in/");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) { 
	    switch (item.getItemId()) {
	    case android.R.id.home:
			Intent intent = new Intent(this,MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
			startActivity(intent);
			 overridePendingTransition(R.anim.anim_slide_in_left,
		                R.anim.anim_slide_out_right);
	            default:
	            return super.onOptionsItemSelected(item); 
	    }
}
}
