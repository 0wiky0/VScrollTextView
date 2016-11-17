package com.wiky.vscrolltextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wiky.vstextview.VScrollTextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VScrollTextView vScrollTxtView = (VScrollTextView) findViewById(R.id.vScrollTV);
        List<String> data = new ArrayList<>();
        data.add("I have a pen");
        data.add("I have an apple");
        data.add("ah , Apple pen");
        vScrollTxtView.setDataSource(data);
        vScrollTxtView.startPlay();

        VScrollTextView vScrollTxtView1 = (VScrollTextView) findViewById(R.id.vScrollTV1);
        vScrollTxtView1.setDataSource(data);
        vScrollTxtView1.startPlay();
    }
}
