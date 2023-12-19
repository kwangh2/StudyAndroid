package com.example.project02_last.map;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project02_last.R;
import com.example.project02_last.databinding.FragmentJkhMapBinding;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraAnimation;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.CameraUpdate;
import com.naver.maps.map.LocationSource;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.NaverMapOptions;
import com.naver.maps.map.NaverMapSdk;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.util.FusedLocationSource;

public class JkhMapFragment extends Fragment implements OnMapReadyCallback {
    FragmentJkhMapBinding binding;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1000;
    private FusedLocationSource locationSource;
    private NaverMap naverMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentJkhMapBinding.inflate(inflater,container,false);
        NaverMapSdk.getInstance(getContext()).setClient(
                new NaverMapSdk.NaverCloudPlatformClient("네이버 아이디"));
        locationSource =
                new FusedLocationSource(this, LOCATION_PERMISSION_REQUEST_CODE);

        binding.mapView.getMapAsync(this);


        return binding.getRoot();
    }


    @Override
    @UiThread
    public void onMapReady(@NonNull NaverMap naverMap) {
//        naverMap.setMapType(NaverMap.MapType.Satellite);
//        naverMap.setLayerGroupEnabled(NaverMap.LAYER_GROUP_BUILDING, false);
//        naverMap.setLayerGroupEnabled(NaverMap.LAYER_GROUP_TRANSIT, true);
//        naverMap.setIndoorEnabled(true);
        this.naverMap = naverMap;
        naverMap.setLocationSource(locationSource);
        Marker marker = new Marker();
        marker.setPosition(new LatLng(37.5670135, 126.9783740));
        marker.setMap(naverMap);
        CameraUpdate cameraUpdate = CameraUpdate.scrollTo(new LatLng(37.5666102, 126.9783881))
                .animate(CameraAnimation.Easing, 2000)
                .finishCallback(() -> {
                    Toast.makeText(getContext(), "카메라 이동 완료", Toast.LENGTH_SHORT).show();
                })
                .cancelCallback(() -> {
                    Toast.makeText(getContext(), "카메라 이동 취소", Toast.LENGTH_SHORT).show();
                });
        naverMap.moveCamera(cameraUpdate);
    }
}