package com.vagner.aula22mvc;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	private Model mModel = new Model();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mModel.setDelegate(this);
	}
	
	 public void btnClicked(View v) {
	    	// pega o int do EditText e passa para o Array , e apaga o EditText
	    	EditText et = (EditText) findViewById(R.id.editTextNumeros);
	    	int numero = Integer.parseInt(et.getText().toString());
	    	et.setText("");
	    	mModel.addToArray(numero);
	    }
	 
	 public void arrayIsFull() {
		 //quando a Array estiver cheio no caso com 5 numeros ele dá a media dos numeros
	    	float average = mModel.getAverage();
	    	TextView tv = (TextView) findViewById(R.id.textViewResultado);
	    	tv.setText(String.format("%f", average));
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
