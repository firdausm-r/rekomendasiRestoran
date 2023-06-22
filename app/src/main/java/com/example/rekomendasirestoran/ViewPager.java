package com.example.rekomendasirestoran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

// NAMA : FIRDAUS MUHAMMAD RIDHO
// NIM : 10120082
// KELAS : IF-2

public class ViewPager extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<viewpageritem> viewpagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {R.drawable.a,R.drawable.b,R.drawable.c};
        String[] heading = {"Maps.Resto","Menampilkan Lokasi Pengguna","Selamat Datang"};
        String[] desc = {getString(R.string.a_desc),
                getString(R.string.b_desc),
                getString(R.string.c_desc)};

        viewpagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){

            viewpageritem viewpagerItem = new viewpageritem(images[i],heading[i],desc[i]);
            viewpagerItemArrayList.add(viewpagerItem);

        }

        VPAdapter vPadapter = new VPAdapter(ViewPager.this, viewpagerItemArrayList);

        viewPager2.setAdapter(vPadapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}
