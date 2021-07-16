package com.swagat.friends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String[] myFriendsName = {"Sanjay", "Diptesh", "jatin", "sidheswar", "Aniket", "Arvind", "Kunal", "Suraj"};
    String[] myFriendsUrl = {"https://cdn.pixabay.com/photo/2015/10/07/22/54/pen-spinning-976930_960_720.jpg",
    "https://cdn.pixabay.com/photo/2019/02/22/12/01/sit-4013410_960_720.jpg",
    "https://cdn.pixabay.com/photo/2020/05/16/09/53/boy-5176798_960_720.jpg",
    "https://cdn.pixabay.com/photo/2018/10/26/06/55/anime-3773979_960_720.png",
    "https://cdn.pixabay.com/photo/2018/01/15/02/01/halloween-3083036_960_720.jpg",
    "https://cdn.pixabay.com/photo/2018/11/14/12/12/young-3815074_960_720.jpg",
    "https://cdn.pixabay.com/photo/2018/09/15/11/19/male-3679138_960_720.jpg",
    "https://cdn.pixabay.com/photo/2019/06/10/10/10/pink-fella-4263836_960_720.jpg"};

    private FriendsAdapter mAdapter;
    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i1 = getIntent();

        //load name and url
        ArrayList<FriendsData> friendsData = new ArrayList<>();
        for(int i = 0; i < myFriendsName.length && i < myFriendsUrl.length; i++){
            FriendsData fd = new FriendsData();
            fd.setName(myFriendsName[i]);
            fd.setUrl(myFriendsUrl[i]);
            friendsData.add(fd);
        }

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new FriendsAdapter(this, friendsData);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}