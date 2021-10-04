package com.example.adapterlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);

        String[] name = {"chf", "wy", "lda", "zh"};
        String[] age = {"19", "20", "21", "22"};
        String[] high = {"165cm", "175cm", "185cm", "195cm"};
        // int[] maps={R.drawable.};
        // this入口，放置数据的布局，数据
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item, name);
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 4; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("姓名", name[i]);
            item.put("年龄", age[i]);
            item.put("身高", high[i]);
            list.add(item);
        }
        SimpleAdapter adapter1 = new SimpleAdapter(this, list, R.layout.item, new String[]{"姓名", "年龄", "身高"}, new int[]{R.id.textView1, R.id.textView2, R.id.textView3});
        listView.setAdapter(adapter1);
    }
}