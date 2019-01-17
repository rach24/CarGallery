package com.example.akshitagupta.project02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] brands={"Audi","BMW","Bugatti","Ferrari","Lamborghini","Maserati","Mercedes","Renault"};

    //initializing images as static final to access in imagefull class
    static final int[] imgs={R.drawable.audi,R.drawable.bmw,R.drawable.bugatti,R.drawable.ferrari,R.drawable.lamborghini,R.drawable.maserati,R.drawable.mercedes,R.drawable.renault};
    static final ArrayList<Uri> mUriList= new ArrayList<Uri>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing gridView
        gridView=(GridView) findViewById(R.id.gridView1);

        Adapter adapter=new Adapter(this, getcar());
        gridView.setAdapter(adapter);


        //short click
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),brands[i],Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),ImageFull.class);
                intent.putExtra("Index", i);
                startActivity(intent);
            }
        });

        registerForContextMenu(gridView);  //for long click

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //for long click
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //for long click selected
        AdapterView.AdapterContextMenuInfo contextmenu = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        initializeCarUris();  //to instantiate mUrilist
        //for 3 menus
        switch (item.getItemId())
        {
            case R.id.shortclick:
                Intent intent=new Intent(getApplicationContext(),ImageFull.class);
                intent.putExtra("Index", contextmenu.position);
                startActivity(intent);
                break;

            case R.id.web:
                Uri aUri =mUriList.get(contextmenu.position);
                Intent int1 = new Intent(Intent.ACTION_VIEW);
                int1.setData(aUri);
                int1.addCategory(Intent.CATEGORY_BROWSABLE);
                startActivity(int1);
                break;

            case R.id.list3:
                Intent deal=new Intent(getApplicationContext(),dealers.class);
                deal.putExtra("Index", contextmenu.position);
                startActivity(deal);
                break;


            default:
                return super.onContextItemSelected(item);


        }

        return super.onContextItemSelected(item);
    }

    private ArrayList<Cars> getcar(){
        //arraylist to add respective car brand and image
        ArrayList<Cars> car= new ArrayList<Cars>();
        car.add(new Cars(brands[0],imgs[0]));
        car.add(new Cars(brands[1],imgs[1]));
        car.add(new Cars(brands[2],imgs[2]));
        car.add(new Cars(brands[3],imgs[3]));
        car.add(new Cars(brands[4],imgs[4]));
        car.add(new Cars(brands[5],imgs[5]));
        car.add(new Cars(brands[6],imgs[6]));
        car.add(new Cars(brands[7],imgs[7]));



        return car;
    }

    static final  void initializeCarUris(){
        //adding all car websites
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
