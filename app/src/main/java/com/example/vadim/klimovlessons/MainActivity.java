package com.example.vadim.klimovlessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.vadim.klimovlessons.adapter.MyAdapter;
import com.example.vadim.klimovlessons.model.Lesson;
import com.example.vadim.klimovlessons.view.lesson16.lessonSixteen;
import com.example.vadim.klimovlessons.view.lesson17.Sunrise;
import com.example.vadim.klimovlessons.view.lesson18.MyBrowser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillData();
        myAdapter = new MyAdapter(this, lessons);

        ListView LVMain = (ListView) findViewById(R.id.lvMain);
        LVMain.setAdapter(myAdapter);

        LVMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position){
                    case  0:
                        intent = new Intent(MainActivity.this, lessonSixteen.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Sunrise.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, MyBrowser.class);
                        break;

                }

                startActivity(intent);

            }
        });

    }


    void fillData() {
        for (int i =1; i<=15; i++){
            lessons.add(new Lesson("Lesson" + " " + i));

        }
    }
}
