package eu.andoid.swt;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

import eu.andoid.swt.R;

public class MapViewAct extends MapActivity {
	
	MapView mMapView;
	MapController mMapController;
	
	GeoPoint mGeoPoint = new GeoPoint(51493807, 7420339);
	GeoPoint point = new GeoPoint(51493807,7420339);
	OverlayItem overlayitem = new OverlayItem(point, "Emil-Figge-Str.42", "Test");

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.map);
		mMapView = 
			(MapView) findViewById(R.id.mapview);
		mMapView.setBuiltInZoomControls(true);
		mMapView.setSatellite(true);
		
		mMapController = mMapView.getController();
		mMapController.setCenter(mGeoPoint);
		mMapController.animateTo(mGeoPoint);
		mMapController.setZoom(19);
		
		System.out.println(mMapView.getMapCenter().getLatitudeE6());
		System.out.println(mMapView.getMapCenter().getLongitudeE6());
		
		List<Overlay> mapOverlays = mMapView.getOverlays();
		Drawable drawable = this.getResources().getDrawable(R.drawable.androidmarker2);
		mapOverlay itemizedoverlay = new mapOverlay(drawable);
		
		itemizedoverlay.addOverlay(overlayitem);
		mapOverlays.add(itemizedoverlay);
		
	}
	
	

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		System.out.println(mMapView.getMapCenter().getLatitudeE6());
		System.out.println(mMapView.getMapCenter().getLongitudeE6());
	}



	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	

	

}
