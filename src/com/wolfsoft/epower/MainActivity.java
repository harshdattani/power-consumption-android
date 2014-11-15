package com.wolfsoft.epower;



import java.util.Random;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		String[] qoutes;
		String[] qoutes2;
		final Random rgenerator = new Random();
		final Random rgenetator2 = new Random();
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		// get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(false);
      
        
        Resources res = getResources();

        qoutes = res.getStringArray(R.array.qoutes); 
        qoutes2 = res.getStringArray(R.array.qoutes2); 
        String headqoute = qoutes[rgenerator.nextInt(qoutes.length)];
        String headqoute1 = qoutes2[rgenetator2.nextInt(qoutes.length)];
		
		TextView tView = (TextView) findViewById(R.id.headline);
		tView.setSelected(true);
		tView.setText("\""+headqoute+"\"  \""+headqoute1+"\"");
		
		
	}
	

	public void estimate_cost(View V)
	{
	
		Intent intent2 = new Intent(MainActivity.this, EstimateCost.class);
		
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}
	
	public void takequiz(View V)
	{
	
		Intent intent2 = new Intent(MainActivity.this, Takequiz.class);
		
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}
	public void tips(View V)
	{
	
		Intent intent2 = new Intent(MainActivity.this, Tips.class);
		
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}

	public void links(View V)
	{
	
		Intent intent2 = new Intent(MainActivity.this, Links.class);
		
        startActivity(intent2);
        overridePendingTransition(R.anim.anim_slide_in_left,
                R.anim.anim_slide_out_right);
	}
	
}
