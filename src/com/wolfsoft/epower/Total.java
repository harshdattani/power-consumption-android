package com.wolfsoft.epower;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Total extends Activity{
	
	int total;
	String badge;
	Integer img;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.total); 
		
		// get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
		
		TextView score = (TextView)findViewById(R.id.score);
		ImageView iView = (ImageView) findViewById(R.id.badge);
	
		//getting variable total from previous question using intent
		Intent intent = getIntent();
	    total = intent.getIntExtra("total", 0);
	    
		  if(total==0)
		  {
		  badge="Learner";
		  img=R.drawable.badge_learner;
		  iView.setImageResource(img);
		    score.setText("You won : " +badge+" Bagde.You need to learn how to save energy!! Your Score is " +total);
		  } 
	  
	  if(total>0&&total<20)
	  {
		  img=R.drawable.badge_newbee;
		  iView.setImageResource(img);  
	  badge="Newbee";
	    score.setText("You won : " +badge+" Bagde.You know how to save energy!! Your Score is " +total);
	  } 
	  if(total>=20)
	  {
		  img=R.drawable.badge_greenbee;
		  iView.setImageResource(img);
		  badge="Greenbee";
	    score.setText("You won : " +badge+" Bagde.You are expert in saving energy!! Your Score is " +total);
	  } 
	}

	
	public void share(View v)
	{
		if(total==0)
		{
		
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/badge_learner");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	   }
		
		if(total>0&&total<20)
		{
		
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/badge_newbee");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	   }
		
		if(total>=20)
		{
		
		Uri imageUri = Uri.parse("android.resource://com.wolfsoft.epower/drawable/badge_greenbee");
	      Intent intent = new Intent(Intent.ACTION_SEND);
	      intent.setType("image/png");

	      intent.putExtra(Intent.EXTRA_STREAM, imageUri);
	      startActivity(Intent.createChooser(intent , "Share"));
	   }
		
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
	
	public void tips(View V)
	{
	
		Intent intent2 = new Intent(this, Tips.class);
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}
}