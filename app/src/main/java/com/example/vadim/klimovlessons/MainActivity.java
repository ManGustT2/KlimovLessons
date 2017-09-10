package com.example.vadim.klimovlessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.vadim.klimovlessons.model.Lesson;
import com.example.vadim.klimovlessons.view.lesson16.lessonSixteen;
import com.example.vadim.klimovlessons.view.lesson17.Sunrise;
import com.example.vadim.klimovlessons.view.lesson18.MyBrowser;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManeger;

  //  private ArrayList<Lesson> lessons = new ArrayList<Lesson>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myDataset = getDataSet();

        mRecyclerView = (RecyclerView) findViewById(R.id.rvMain);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManeger = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManeger);
        }

        private String[] getDataSet(){
            String[] mDataSet = new String[15];
            for (int i=0; i<15; i++ ){
                mDataSet[i] = "Lesson" + i;
            }
            return mDataSet;



//        fillData();

//        ListView LVMain = (ListView) findViewById(R.id.lvMain);
//
//        LVMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = null;
//                switch (position){
//                    case  0:
//                        intent = new Intent(MainActivity.this, lessonSixteen.class);
//                        break;
//                    case 1:
//                        intent = new Intent(MainActivity.this, Sunrise.class);
//                        break;
//                    case 2:
//                        intent = new Intent(MainActivity.this, MyBrowser.class);
//                        break;
//
//                }
//
//                startActivity(intent);

//            }
//        });

//    }


    }
}
