package com.wolfsoft.epower;




import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Tips extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tips); 
		
		// get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
        
   
	}

	
	public void heatcold(View v)
	{
		Intent intent2 = new Intent(Tips.this, Heatcold.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}
	
	
	public void lighttips(View v)
	{
		Intent intent2 = new Intent(Tips.this, Lighttips.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}
	
	public void appliancetips(View v)
	{
		Intent intent2 = new Intent(Tips.this, Appliancetips.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
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
