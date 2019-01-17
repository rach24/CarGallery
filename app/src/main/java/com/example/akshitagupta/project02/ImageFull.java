package com.example.akshitagupta.project02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageFull extends AppCompatActivity {

    final ArrayList<Uri> mUriList= new ArrayList<Uri>();  //array for the webpages
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_full);

        Intent intent=getIntent();

        i=intent.getExtras().getInt("Index");  //get the index on which shortclick was performed



        final ImageView img= (ImageView) findViewById(R.id.imageView2);
        img.setImageResource(MainActivity.imgs[i]);

        initializeCarUris();  //initializing mUrilist with webpage links


        //open respective webpage on click
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri aUri =mUriList.get(i);
                Intent aIntent = new Intent(Intent.ACTION_VIEW);
                aIntent.setData(aUri);
                aIntent.addCategory(Intent.CATEGORY_BROWSABLE);//to browse web
                startActivity(aIntent);
            }
        });
    }

    private void initializeCarUris(){

        mUriList.add(Uri.parse("https://www.audiusa.com/"));
        mUriList.add(Uri.parse("https://www.bmwusa.com/"));
        mUriList.add(Uri.parse("https://www.bugatti.com/home/"));
        mUriList.add(Uri.parse("https://www.ferrari.com/"));
        mUriList.add(Uri.parse("https://www.lamborghini.com/"));
        mUriList.add(Uri.parse("https://www.maserati.com/maserati/international/en"));
        mUriList.add(Uri.parse("https://www.mbusa.com/mercedes/index"));
        mUriList.add(Uri.parse("https://group.renault.com/en/"));
    }
}
