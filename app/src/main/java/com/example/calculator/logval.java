package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class logval extends Activity {

    Button before;
    public ArrayList<String> logdata = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        Intent getintent = getIntent();
        logdata = getintent.getStringArrayListExtra("logvalue");

        before = (Button) findViewById(R.id.before);
        before.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent back = new Intent(logval.this, MainActivity.class);
                back.putStringArrayListExtra("return2", logdata);

                setResult(4, back);
                finish();
            }
        });

        ArrayAdapter<String> Adapter2;
        Adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, logdata);

        ListView list2 = (ListView) findViewById(R.id.loglist);
        list2.setAdapter(Adapter2);

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent gointent = new Intent(logval.this, MainActivity.class);
                gointent.putExtra("pick", logdata.get(position));

                setResult(3, gointent);
                finish();


            }
        });
    }
}

