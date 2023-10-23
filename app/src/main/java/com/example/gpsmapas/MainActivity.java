package com.example.gpsmapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {
    EditText txtLatitud, txtLongitud;

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        VideoView Mivideo = findViewById(R.id.videoView2);
        String video = "android.recourse://"+getPackageName()+"/"+R.raw.st;
        Uri uri = Uri.parse(video);
        Mivideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        Mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(Mivideo);

        txtLatitud=findViewById(R.id.txt_latitud);
        txtLongitud=findViewById(R.id.txt_longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
    }

    public void onMapReady(GoogleMap googleMap){
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng arica = new LatLng(-18.4833853, -70.3206752);
        mMap.addMarker(new MarkerOptions().position(arica).title("StomasArica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arica));

        LatLng iquique = new LatLng(-19.5052407, -73.0133629);
        mMap.addMarker(new MarkerOptions().position(iquique).title("stomasIquique:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(iquique));

        LatLng antofagasta = new LatLng(-23.6347315, -70.3966275);
        mMap.addMarker(new MarkerOptions().position(antofagasta).title("stomasAntofagasta:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(antofagasta));

        LatLng serena = new LatLng(-29.908667, -71.2932751);
        mMap.addMarker(new MarkerOptions().position(serena).title("stomasLaSerena:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(serena));

        LatLng viña = new LatLng(-33.0375927, -71.5581628);
        mMap.addMarker(new MarkerOptions().position(viña).title("stomasViñaDelMar:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(viña));

        LatLng stgo = new LatLng(-33.4489738, -70.6633554);
        mMap.addMarker(new MarkerOptions().position(stgo).title("stomasSantiago:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stgo));

        LatLng Talca = new LatLng(-33.4493141, -70.666913);
        mMap.addMarker(new MarkerOptions().position(Talca).title("stomasTalca:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));

        LatLng conce = new LatLng(-36.8263376, -73.0706375);
        mMap.addMarker(new MarkerOptions().position(conce).title("stomasConce:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(conce));

        LatLng ang = new LatLng(-37.4720562, -73.0133629);
        mMap.addMarker(new MarkerOptions().position(ang).title("stomasLosAngeles:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ang));

        LatLng tco = new LatLng(-38.7346589, -74.9091068);
        mMap.addMarker(new MarkerOptions().position(tco).title("stomasTemuco:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tco));

        LatLng val = new LatLng(-38.7198272, -74.9091854);
        mMap.addMarker(new MarkerOptions().position(val).title("stomasValdivia:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(val));

        LatLng oso = new LatLng(-40.5717908, -73.1402901);
        mMap.addMarker(new MarkerOptions().position(oso).title("stomasOsorno:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(oso));

        LatLng pto = new LatLng(-41.4627937, -72.9528833);
        mMap.addMarker(new MarkerOptions().position(pto).title("stomasPuertoMontt:)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pto));

    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);

    }
}