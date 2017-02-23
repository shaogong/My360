package com.myb.bj.my360.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.myb.bj.my360.R;

public class MainActivity extends AppCompatActivity {

    private GridView gv_360;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv_360 = (GridView) findViewById(R.id.gv_360);

        initData();


    }

    private void initData() {
        gv_360.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:
                        break;
                }
            }
        });
    }
}
