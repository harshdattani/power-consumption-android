package com.wolfsoft.epower;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;




public class EstimateCost extends Activity{
	
	float total=0;
	float total1=0;
	float total2=0;
	float total3=0;
	float reset;
	float kwh=0;
	float kwhfan=0;
	float kwhtel=0;
	float kwhcom=0;
	float kwhgey=0;
	float kwhair=0;
	float kwhref=0;
	float kwhiron=0;
	float kwhwashm=0;
    float kwh3=0;
    double cost=0;
    double cost1=0;
    double cost2=0;
    double cost3=0;
    double cost4=0;
    String kwhf="0";
    String totalf="0";
    String costf="0";
    String shortname="0";
	
    

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.estimate_cost);
		
	
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
		
		alertDialogBuilder.setTitle("How to Use!!");
		alertDialogBuilder
		.setMessage("Add Appliance Details and scroll to see total. \n Calculation of consumption per month is totally approximate and it is just for idea for your monthly electric consumption.")
		.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				// if this button is clicked, close
				// current activity
				dialog.cancel();
			}
		  });
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
		
		 findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {

			    @Override
			    public void onClick(View v) {

			    	TextView output = (TextView)findViewById(R.id.output);
					TextView output2 = (TextView)findViewById(R.id.output2);
					TextView output3 = (TextView)findViewById(R.id.output3);
					TextView output4 = (TextView)findViewById(R.id.output4);
					TextView output5 = (TextView)findViewById(R.id.output5);
					TextView output6 = (TextView)findViewById(R.id.output6);
					TextView output7 = (TextView)findViewById(R.id.output7);
					TextView output8 = (TextView)findViewById(R.id.output8);
					TextView total_out = (TextView)findViewById(R.id.total);
					output.setText(""); 
					output2.setText(""); 
					output3.setText(""); 
					output4.setText(""); 
					output5.setText(""); 
					output6.setText(""); 
					output7.setText(""); 
					output8.setText("");
					total_out.setText("");
					total=0;
					total1=0;
					total2=0;
					total3=0;
					cost=0;
					cost2=0;
					cost3=0;
					cost1=0;
					costf="0";
					kwh=0;
					kwhfan=0;
					kwhtel=0;
					kwhcom=0;
					kwhgey=0;
					kwhair=0;
					kwhref=0;
					kwhwashm=0;
				    kwh3=0;
				    kwhiron=0;
				    kwhf="0";
				    totalf="0";
				    Toast display= Toast.makeText(getApplicationContext(), 
							 "Reset Done", 0); 
				    display.setGravity(Gravity.BOTTOM, 0, 0);
					display.setDuration(Toast.LENGTH_SHORT);
				    display.show();
			    }
			});
	
		
}
	
	
	
	public void add_appliance(View V)
	{
		
		Spinner appliance = (Spinner) findViewById(R.id.appliance);
		Spinner number = (Spinner) findViewById(R.id.number);
		Spinner hour = (Spinner) findViewById(R.id.hour);
		TextView selection = (TextView)findViewById(R.id.selection);
		TextView output = (TextView)findViewById(R.id.output);
		TextView output2 = (TextView)findViewById(R.id.output2);
		TextView output3 = (TextView)findViewById(R.id.output3);
		TextView output4 = (TextView)findViewById(R.id.output4);
		TextView output5 = (TextView)findViewById(R.id.output5);
		TextView output6 = (TextView)findViewById(R.id.output6);
		TextView output7 = (TextView)findViewById(R.id.output7);
		TextView output8 = (TextView)findViewById(R.id.output8);
		TextView total_out = (TextView)findViewById(R.id.total);
		
    String appliance_usage=String.valueOf(appliance.getSelectedItem());	
	String hour_usage=String.valueOf(hour.getSelectedItem());
	String quantity_usage=String.valueOf(number.getSelectedItem());	
	
	float hour_usagef=Float.parseFloat(hour_usage);
    float quantity_usagef=Float.parseFloat(quantity_usage);
    
    selection.setText("Your Selection:");
    if(appliance_usage.equals("Fan (60-100 WATTS)"))
    {
    
    kwh=hour_usagef*quantity_usagef*75/1000;
    kwhfan=kwh*30;
    kwhf = String.format("%.2f", kwhfan);
    shortname="Fan";
    
			output.setText( quantity_usage +" "  +shortname + " usage at "
		                + hour_usage + " hours/day using " + kwhf+ " units per month" ); 
    
    }
    
    
    if(appliance_usage.equals("Television (200 WATTS)"))
    {
    
   kwh=hour_usagef*quantity_usagef*200/1000;
    kwhtel=kwh*30;
    kwhf = String.format("%.2f", kwhtel);
    shortname="Television";
    output2.setText( quantity_usage +" "  +shortname + " usage at "
            + hour_usage + " hours/day using " + kwhf+ " kwh per month"); 
   
    
    }
    
    
    if(appliance_usage.equals("Computer (200 WATTS)"))
    {
    
   kwh=hour_usagef*quantity_usagef*200/1000;
    kwhcom=kwh*30;
    shortname="Computer";
   kwhf = String.format("%.2f", kwhcom);
    output3.setText( quantity_usage +" "  +shortname + " usage at "
            + hour_usage + " hours/day using " + kwhf+ " kwh per month"); 
    
   
    }
    
    if(appliance_usage.equals("Geyser (1000-2000 WATTS)"))
    {
    
   kwh=hour_usagef*quantity_usagef*2000/1000;
    kwhgey=kwh*30;
    shortname="Geyser";
    kwhf = String.format("%.2f", kwhgey);
    output4.setText( quantity_usage +" "  +shortname + " usage at "
            + hour_usage + " hours/day using " + kwhf+ " kwh per month"); 
   
    
    }
   
    if(appliance_usage.equals("A/C 1.5 ton (1000-2000 WATTS)"))
    {
    
   kwh=hour_usagef*quantity_usagef*2000/1000;
    kwhair=kwh*30;
    kwhf = String.format("%.2f", kwhair);
    shortname="A.C";
    output5.setText( quantity_usage+" "  +shortname + " usage at "
            + hour_usage + " hours/day using " + kwhf+ " kwh per month"); 
    
    
    }
    
    if(appliance_usage.equals("Refrigerator (200 WATTS)"))
    {
    
   kwh=hour_usagef*quantity_usagef*200/1000;
    kwhref=kwh*30;
    kwhf = String.format("%.2f", kwhref);
    shortname="Refrigerator";
    output6.setText( quantity_usage+" "  +shortname + " usage at "
            + hour_usage + " hours/day using " + kwhf+ " kwh per month"); 
    
    
    }
    if(appliance_usage.equals("Electric IRON (600-1000 WATTS)"))
    {
    
   kwh=hour_usagef*quantity_usagef*1000/1000;
    kwhiron=kwh*30;
    kwhf = String.format("%.2f", kwhiron);
    shortname="Electric Iron";
    output7.setText( quantity_usage+" "  +shortname + " usage at "
            + hour_usage + " hours/day using " + kwhf+ " kwh per month"); 
    
    
    }
    
    if(appliance_usage.equals("Washing Machine (200 WATTS)"))
    {
    
    kwh=hour_usagef*quantity_usagef*200/1000;
    kwhwashm=kwh*30;
    kwhf = String.format("%.2f", kwhwashm);
    shortname="Washing Machine";
    
			output8.setText( quantity_usage +" "  +shortname + " usage at "
		                + hour_usage + " hours/day using " + kwhf+ " units per month" ); 
    
    }
    
    total=kwhfan+kwhtel+kwhref+kwhair+kwhgey+kwhcom+kwhiron+kwhwashm;
    
    if(total<=50)
    {
    	cost=total*3.15;
    }
    
    if(total>50)
    {
    	total1=total-50;
    	cost1=50*3.15;
    	
    	if(total1>50)
    	{
    		cost2=50*3.60;
    		total2=total1-50;
    	}
    	
    	if(total1<=50)
    	{
    		cost2=total1*3.60;
    	}
    	
    	if(total2>150)
    	{
    		cost3=150*4.25;
    		total3=total2-150;
    		cost4=total3*5.20;
    	}

    	if(total2<=150)
    	{
    		cost3=total2*4.25;
    	}
    	
    	cost=cost1+cost2+cost3+cost4;
    }
    
    totalf = String.format("%.2f", total);	
    costf = String.format("%.2f", cost);
    total_out.setText("Total Units per Month: " +totalf+ "* And Approximate Monthly Cost is Rs. "+costf+ "* \n \n*(This Calculation is Approximate, and can varry in actual Bill, this is just for judgement)"); 
    Toast display= Toast.makeText(getApplicationContext(), 
			 "Appliance Added ", 0);  
	
	 
				display.setGravity(Gravity.BOTTOM, 0, 0);
				display.setDuration(Toast.LENGTH_SHORT);
			    display.show();
		 total=0;
		
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

