package com.example.a592java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
    recyclerView = findViewById(R.id.main_recyclerView);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

    getAdapter(data());
    }
    ArrayList<Feeds> data(){
        ArrayList<Feeds> list = new ArrayList<>();
        list.add(new Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm));
        list.add(new Feeds(R.drawable.rasms,"Alisher Daminov","Sep 21 - ",R.drawable.rasms));
        list.add(new Feeds(R.drawable.ali,"Alisher Daminov","Sep 21 - ",R.drawable.ali));
        list.add(new Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm));
        list.add(new Feeds(R.drawable.rasms,"Alisher Daminov","Sep 21 - ",R.drawable.rasms));
        list.add(new Feeds(R.drawable.ali,"Alisher Daminov","Sep 21 - ",R.drawable.ali));
        list.add(new Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm));
        list.add(new Feeds(R.drawable.rasms,"Alisher Daminov","Sep 21 - ",R.drawable.rasms));
        list.add(new Feeds(R.drawable.ali,"Alisher Daminov","Sep 21 - ",R.drawable.ali));
        list.add(new Feeds(R.drawable.rasm,"Alisher Daminov","Sep 21 - ",R.drawable.rasm));
        list.add(new Feeds(R.drawable.rasms,"Alisher Daminov","Sep 21 - ",R.drawable.rasms));
        list.add(new Feeds(R.drawable.ali,"Alisher Daminov","Sep 21 - ",R.drawable.ali));

        return list;
    }
    void getAdapter(ArrayList<Feeds> list){
        FeedsAdapter feedsAdapter = new FeedsAdapter(this,list);
        recyclerView.setAdapter(feedsAdapter);
    }
}