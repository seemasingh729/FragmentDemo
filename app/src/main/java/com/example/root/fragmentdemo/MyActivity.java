package com.example.root.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class MyActivity extends FragmentActivity {
    ListView lv;
    MyFragment myFragment;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        lv = (ListView)findViewById(R.id.listView1);
        al = new ArrayList<String>();
        al.add("Clothing");
        al.add("Footwear");
        al.add("Watch");
        al.add("Jwellary");
        al.add("Wallets");
        al.add("Handbags");
        al.add("Belt");
        al.add("Makeup");
        al.add("Jeans");
        al.add("Jacket");
        al.add("Tops");
        al.add("Shirt");
        al.add("Coat");



        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View v, int spos,
                                    long dpos) {

                String item = al.get(spos);

                FragmentManager fm = getSupportFragmentManager();
                myFragment = (MyFragment) fm.findFragmentById(R.id.fr1);
                if (myFragment != null) {

                    myFragment.setData(item);
                }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

}
