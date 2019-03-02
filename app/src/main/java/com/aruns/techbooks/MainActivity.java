package com.aruns.techbooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridView gridView;
//String book1="Java.pdf";
//String book2="Android.pdf";
int[] image={R.drawable.java,R.drawable.python,R.drawable.cpp,R.drawable.c,R.drawable.php,R.drawable.android};
String[] text={"java","python","c++","C programming","php","Android"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomGrid adapter=new CustomGrid(this,text,image);
        gridView=(GridView)findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(MainActivity.this,"you clicked at"+text[position],Toast.LENGTH_LONG).show();
                //Main2Activity mn=new Main2Activity();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle b=new Bundle();
                b.putString("position",position+"");
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
