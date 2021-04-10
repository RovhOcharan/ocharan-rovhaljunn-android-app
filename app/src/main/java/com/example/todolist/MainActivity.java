package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listview;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.ListView);
        button = findViewById(R.id.button);

        button.setOnclick(View view){
            addItem(view);
        }};
    }

    items = new ArrayList();
    itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item);
    listView.setAdapter(itemsAdapter);
    setUpListViewListener();
}

    private void setUpListViewListener(){
    listView.setOnItemLongClickListener(new AdapterView.OnItemLongCLickListener(){
    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView,View view,int i,long 1){
        }
        }};
    }

