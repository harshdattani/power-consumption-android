package com.wolfsoft.epower;





import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Question2 extends Activity {
	

	int total;
	int waittime=3000;
	int i = 0;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.question2); 
		
		
		Intent intent = getIntent();
	    
		total = intent.getIntExtra("total", 0);
		
		// get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
		
		
		findViewById(R.id.wrong1).setOnClickListener(new View.OnClickListener() {

			
			
		    @Override
		    public void onClick(View v) {
		    	
		    	Toast display= Toast.makeText(getApplicationContext(), 
			   			 "Wrong Answer", 0);  
			   	
			   	 
			   				display.setGravity(Gravity.BOTTOM, 0, 0);
			   				display.setDuration(Toast.LENGTH_SHORT);
			   			    display.show();

		    	TextView right = (TextView)findViewById(R.id.right);
				TextView wrong1 = (TextView)findViewById(R.id.wrong1);
				wrong1.setTextColor(Color.parseColor("#ED2E2E"));
				right.setTextColor(Color.parseColor("#3775A6"));
				
			
				Thread mythread = new Thread() {
					public void run() {
					try {
					while (i < waittime) {
					
					i=i+200;
					sleep(100);
					   
					}
					} 
					catch(Exception e) {}
					finally {
					Intent q2 = new Intent(Question2.this, Question3.class);
					q2.putExtra("total", total);
					startActivity(q2);
					 overridePendingTransition(R.anim.anim_slide_in_left,
				                R.anim.anim_slide_out_right);
					}
					}
					};
					mythread.start();
					}
		    });
		
		findViewById(R.id.wrong2).setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    	
		    	Toast display= Toast.makeText(getApplicationContext(), 
			   			 "Wrong Answer", 0);  
			   	
			   	 
			   				display.setGravity(Gravity.BOTTOM, 0, 0);
			   				display.setDuration(Toast.LENGTH_SHORT);
			   			    display.show();

		    	TextView right = (TextView)findViewById(R.id.right);
				TextView wrong2 = (TextView)findViewById(R.id.wrong2);
				wrong2.setTextColor(Color.parseColor("#ED2E2E"));
				right.setTextColor(Color.parseColor("#3775A6"));
				
			
				Thread mythread = new Thread() {
					public void run() {
					try {
					while (i < waittime) {
					
					i=i+200;
					sleep(100);
					   
					}
					} 
					catch(Exception e) {}
					finally {
					Intent q2 = new Intent(Question2.this, Question3.class);
					q2.putExtra("total", total);
					startActivity(q2);
					 overridePendingTransition(R.anim.anim_slide_in_left,
				                R.anim.anim_slide_out_right);
					}
					}
					};
					mythread.start();
					}
		    });
		
		findViewById(R.id.right).setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    	
		    	Toast display= Toast.makeText(getApplicationContext(), 
			   			 "Right Answer", 0);  
			   	
			   	 
			   				display.setGravity(Gravity.BOTTOM, 0, 0);
			   				display.setDuration(Toast.LENGTH_SHORT);
			   			    display.show();

		    	total+=10;
		    	
		    	
		    	TextView right = (TextView)findViewById(R.id.right);
				right.setTextColor(Color.parseColor("#3775A6"));
				
			
				Thread mythread = new Thread() {
					public void run() {
					try {
					while (i < waittime) {
					
					i=i+200;
					sleep(100);
					   
					}
					} 
					catch(Exception e) {}
					finally {
					Intent q2 = new Intent(Question2.this, Question3.class);
					q2.putExtra("total", total);
					startActivity(q2);
					 overridePendingTransition(R.anim.anim_slide_in_left,
				                R.anim.anim_slide_out_right);
					}
					}
					};
					mythread.start();
					}
		    });
		
	}
	
	
	public void hint(View v)
	{
AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
		
		alertDialogBuilder.setTitle("Hint!!");
		alertDialogBuilder
		.setMessage("White color reflects 80% of the light, any light color can be painted in room to get more light and hence to save power")
		.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				// if this button is clicked, close
				// current activity
				dialog.cancel();
			}
		  });
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
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
