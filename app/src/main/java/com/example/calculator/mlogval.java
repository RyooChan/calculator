package com.example.calculator;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class mlogval extends Activity {
    Button goback;
    public ArrayList<String> logmdata = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mlog);

        Intent intent = getIntent();
        logmdata = intent.getStringArrayListExtra("value");

        goback = (Button) findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent back = new Intent(mlogval.this, MainActivity.class);
                back.putStringArrayListExtra("return", logmdata);

                setResult(2, back);
                finish();
            }
        });

        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, logmdata);

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(Adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(mlogval.this, MainActivity.class);
                intent.putExtra("onepick", logmdata.get(position));

                setResult(1, intent);
                finish();


            }
        });
    }
}

