package com.example.root.fragmentdemo;

import android.os.Bundle;
  import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyFragment extends Fragment
{
    TextView tv;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout ll = (LinearLayout) inflater.inflate(
                R.layout.myfragment, container, false);
        tv = (TextView) ll.findViewById(R.id.textView);
        tv.setText("Home");
        return ll;
    }

    public void setData(String text){

        tv.setText(text);
    }

}
