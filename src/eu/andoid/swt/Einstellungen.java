package eu.andoid.swt;

import android.app.Activity;
import android.os.Bundle;

public class Einstellungen extends Activity 
{
	public static boolean ang_flak= false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.einstellungen);
	}
}