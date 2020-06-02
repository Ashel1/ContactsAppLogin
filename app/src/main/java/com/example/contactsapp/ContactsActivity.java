package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


public class ContactsActivity extends AppCompatActivity {

    private static final String TAG="ContactsActivity";

    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mPhone_no=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Log.d(TAG,"onCreate: started");

        np();
    }
    private void np(){

        mNames.add("Elon Musk");
        mPhone_no.add("7864235984");

        mNames.add("Tony Stark");
        mPhone_no.add("8456217953");

        mNames.add("Steve Rogers");
        mPhone_no.add("9845672315");

        mNames.add("Bruce Banner");
        mPhone_no.add("9988756423");

        mNames.add("Natasha");
        mPhone_no.add("9999885674");

        mNames.add("Thor");
        mPhone_no.add("9512357895");

        mNames.add("Peter Parker");
        mPhone_no.add("9874563210");

        mNames.add("Jason Grace");
        mPhone_no.add("9510354789");

        mNames.add("Goku");
        mPhone_no.add("7410258963");

        mNames.add("Vegeta");
        mPhone_no.add("8403216579");

        mNames.add("Light Yagami");
        mPhone_no.add("9465120320");

        mNames.add("Harry Potter");
        mPhone_no.add("9800005476");





        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,mPhone_no);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}