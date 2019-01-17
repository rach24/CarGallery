package com.example.akshitagupta.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class dealers extends AppCompatActivity {

    //initialize listview
    ListView list_View;
    List<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapt;
    int pos = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealers);

        Intent int1=getIntent();
        pos = int1.getExtras().getInt("Index");  //get the index, on which long click is performed
        list_View=(ListView) findViewById(R.id.listview1);

        switch(pos)
        {
            case 0:
                list.add("1. Fletcher Jones Audi: 1523 W North Ave, Chicago, IL 60642");
                list.add("2. Audi Morton Grove: 7000 Golf Rd, Morton Grove, IL 60053");
                list.add("3. Audi Westmont: 276 E Ogden Ave, Westmont, IL 60559");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 1:
                list.add("1. Perillo BMW: 1035 N Clark St, Chicago, IL 60610");
                list.add("2. Elmhurst BMW: 466 W Lake St, Elmhurst, IL 60126");
                list.add("3. Laurel BMW: 430 E Ogden Ave, Westmont, IL 60559");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 2:
                list.add("1. Bentley Gold Coast: 834 N Rush St, Chicago, IL 60611");
                list.add("2. Gold Coast Exotic Motors Two: 834 N Rush St, Chicago, IL 60611");
                list.add("3. World Discount Auto: 800 S Western Ave, Chicago, IL 60612");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 3:
                list.add("1. McLaren Chicago Showroom: 645 W Randolph St, Chicago, IL 60661");
                list.add("2. Mancuso Motorsports: 677 N Clark St, Chicago, IL 60654");
                list.add("3. Ferrari Lake Forest: 990 N Shore Dr, Lake Bluff, IL 60044");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 4:
                list.add("1. Lamborghini Gold Coast Showroom: 834 N Rush St, Chicago, IL 60611");
                list.add("2. Global Luxury Imports: 101 Tower Dr, Burr Ridge, IL 60527");
                list.add("3. Loeber Motors: 4255 W Touhy Ave, Lincolnwood, IL 60712");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 5:
                list.add("1. McLaren Chicago Showroom: 645 W Randolph St, Chicago, IL 60661");
                list.add("2. Maserati of Chicago: 834 N Rush St, Chicago, IL 60611");
                list.add("3. Fields Maserati: 250 Skokie Valley Rd, Highland Park, IL 60035");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 6:
                list.add("1. Mercedes-Benz of Chicago: 1520 W North Ave, Chicago, IL 60642");
                list.add("2. Mercedes-Benz of Westmont: 200 E Ogden Ave, Westmont, IL 60559");
                list.add("3. Mercedes-Benz of Orland Park: 8430 W 159th St, Orland Park, IL 60462");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;

            case 7:
                list.add("1. McLaren Chicago Showroom: 645 W Randolph St, Chicago, IL 60661");
                list.add("2. Gold Coast Exotic Motors Two: 834 N Rush St, Chicago, IL 60611");
                list.add("3. McGrath Lexus of Chicago Sales Center: 1250 W Division St, Chicago, IL 60642");
                adapt= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,list);
                list_View.setAdapter(adapt);
                break;
        }

    }
}
