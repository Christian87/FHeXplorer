package eu.andoid.swt;

import com.google.android.maps.MapView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.*;

public class Startseite extends Activity {
    

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      
    }
    
    public void oeffne_anmelden(final View view)
    {
    	if(Anmelden.ang_flak==false) 
    	{
    		startActivity(new Intent(this, Anmelden.class));
    	}
    	else
    	{
    		Anmelden.ang_flak=false;
    		final Button an = (Button) findViewById(R.id.sf_anmelden);
    		an.setText("Anmelden");
    		
    		final ImageButton save = (ImageButton) findViewById(R.id.imageButton2); 
    		save.setVisibility(View.INVISIBLE);
    	}
    }
    
    public void oeffne_map(final View view)
    {
    
    	startActivity(new Intent(this, MapViewAct.class));
    }
    
    public void oeffne_Einstellungen(final View view)
    {
    	startActivity(new Intent(this, Einstellungen.class));
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	
    	if(Anmelden.ang_flak==true) 
    	{
    		
    		final ImageButton save = (ImageButton) findViewById(R.id.imageButton2); 
    		save.setVisibility(View.VISIBLE);
    		
    		final Button an = (Button) findViewById(R.id.sf_anmelden);
    		an.setText("Abmelden");
    	}
    }
    
}