package com.example.premiereappli;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView text = null;
	String hello = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
		hello = getResources().getString(R.string.hello_world);
		hello = hello.toUpperCase();

		text = new TextView(this);
		text.setText(hello);

		setContentView(text);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }






    
    
}
