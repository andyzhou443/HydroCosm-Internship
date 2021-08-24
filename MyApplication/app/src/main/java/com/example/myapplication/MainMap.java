package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Marker;

//import androidx.fragment.app.FragmentActivity;
public class MainMap extends AppCompatActivity implements OnMapReadyCallback
{

    private ImageButton mapButton, bookmarkButton, tripButton, profileButton;
    public LatLng AlbanyWaterBoard, AlbanyFeuraBushPlant, WashingtonParkInn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

        mapButton = (ImageButton) findViewById(R.id.mapButton);
        bookmarkButton = (ImageButton) findViewById(R.id.bookmarkButton);
        tripButton = (ImageButton) findViewById(R.id.tripButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);
        // Get a handle to the fragment and register the callback.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * In this case, we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to
     * install it inside the SupportMapFragment. This method will only be triggered once the
     * user has installed Google Play services and returned to the app.
     */
    public void onMapReady(GoogleMap googleMap) { //google map point
        GoogleMap mMap = googleMap;

        LatLng AlbanyWaterBoard = new LatLng(42.6704464, -73.7322982);
        googleMap.addMarker(new MarkerOptions().position(AlbanyWaterBoard).title("Albany Water Board"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(AlbanyWaterBoard));

        LatLng AlbanyFeuraBushPlant = new LatLng(42.5509376, -73.8684123);
        googleMap.addMarker(new MarkerOptions().position(AlbanyFeuraBushPlant).title("Albany Feura Bush Plant"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(AlbanyFeuraBushPlant));

        LatLng WashingtonParkInn = new LatLng(42.6564274, -73.7750971);
        googleMap.addMarker(new MarkerOptions().position(WashingtonParkInn).title("Washington Park Inn"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(WashingtonParkInn));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(WashingtonParkInn,11));

/*
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override

            public boolean onMarkerClick(Marker marker) {
                if (marker.getTitle().equals("Albany Water Board")) {
                    Intent intent = new Intent(MainMap.this, WaterBoardImage.class);
                    startActivity(intent);
                    return false;
                }
                if (marker.getTitle().equals("Albany Feura Bush Plant")) {
                    Intent intent = new Intent(MainMap.this, FeuraImage.class);
                    startActivity(intent);
                    return false;
                }
                if (marker.getTitle().equals("Washington Park Inn")) {
                    Intent intent = new Intent(MainMap.this, WashingtonParkImage.class);
                    startActivity(intent);
                    return false;
                } else {
                    return true;
                }

            })
        }
                */
    }

    @Override
    public boolean onMarkerClick(final LatLng marker) {

        if (marker.latitude == 42.6704464) {
            Intent intent = new Intent(MainMap.this, WaterBoardImage.class);
            startActivity(intent);
            return false;
        }

        else{
            return true;
        }
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bookmarkButton:
                Intent intent = new Intent (MainMap.this, BookmarkActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.tripButton:
                intent = new Intent (MainMap.this, CarActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.profileButton:
                intent = new Intent (MainMap.this, ProfileActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.filterButton:
                Toast.makeText(MainMap.this, "Feature not Implemented", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

