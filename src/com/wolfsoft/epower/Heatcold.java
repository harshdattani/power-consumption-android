package com.wolfsoft.epower;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Heatcold extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.heatcold); 
		
		// get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
	}
	
	
	public void share1(View v)
	{
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/tip1");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	}
	public void share2(View v)
	{
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/tip2");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	}
	public void share3(View v)
	{
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/tip3");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	}
	
	public void share4(View v)
	{
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/tip4");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	}
	
	public void share5(View v)
	{
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/tip5");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) { 
	    switch (item.getItemId()) {
	    case android.R.id.home:
			Intent intent = new Intent(this,Tips.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
			startActivity(intent);
			 overridePendingTransition(R.anim.anim_slide_in_left,
		                R.anim.anim_slide_out_right);
	            default:
	            return super.onOptionsItemSelected(item); 
	    }
}
}
