package eu.andoid.swt;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

//Hallo Leon

public class Anmelden extends Activity 
{
	public static boolean ang_flak= false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anmelden);
	}
	
	public void anmelden (final View view)
	{
		String name;
		String passwort;
		
		final EditText n = (EditText) findViewById(R.id.editText1);
		final EditText p = (EditText) findViewById(R.id.editText2);
		
		name = n.getText().toString();
		passwort = p.getText().toString();
		
		
		if(name.equals("Christian") && passwort.equals("123456"))
		{
			ang_flak=true;
			this.finish();
		}
	}
	
}
