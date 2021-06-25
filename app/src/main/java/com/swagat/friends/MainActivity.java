package com.swagat.friends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String[] myFriendsName = {"Sanjay", "Diptesh", "jatin", "sidheswar", "Aniket", "Arvind", "Kunal", "Suraj"};
    String[] myFriendsUrl = {"https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-9/195975920_1404364733267495_2856970325255338382_n.jpg?_nc_cat=105&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=0KW8EtNoTpkAX_nVZHl&_nc_ht=scontent.fccu4-2.fna&oh=db4f96f3b924073e91723cc03afb1d50&oe=60DB0ADE",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-9/104851687_170689951096408_6282892584355601725_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=zNEDP3N8EsYAX-dr8fY&_nc_oc=AQkfbzmzsKVopLGP6yYA0tRIUh9-FVusKmLRrk7p6cGi4LyXJpHbeV5cjJSf00dI7wFC9vHY_rYiCRDZdlZVNP8n&_nc_ht=scontent.fccu4-2.fna&oh=03b3822c406fc54f0eb35976b461cb96&oe=60DBAECA",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-9/121063079_1005196486560974_137256229755269135_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=uELI_6qHMfYAX_lzmv8&_nc_ht=scontent.fccu4-2.fna&oh=1fcd523316848fa3b5038fdcf646fa51&oe=60DAAE04",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-9/71186623_197174144636044_5127584016710500352_n.jpg?_nc_cat=109&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=qP-Pw18uwhgAX8DzD6K&_nc_ht=scontent.fccu4-2.fna&oh=4bf37451c93961e240c1073ec680e048&oe=60DAE5D1",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-9/183353871_1950753091751275_120154804602218835_n.jpg?_nc_cat=109&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=tYCOpBKdB4IAX-H77pS&_nc_ht=scontent.fccu4-2.fna&oh=3c218ac5f39bde282c7b35510802065e&oe=60D9B625",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-9/88169067_1196892603982757_6189963874096119808_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=M5jhYEtYU3IAX8AM8Ms&_nc_ht=scontent.fccu4-2.fna&oh=170b96b12088b849321ec0d72b6b2012&oe=60DB3135",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.6435-1/p200x200/132008294_902355747174942_9093822824775921030_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=7206a8&_nc_ohc=qy7FN51b-toAX-Q_sdW&_nc_ht=scontent.fccu4-2.fna&tp=6&oh=355f075188c9b7651f2851f3aa8b7fb3&oe=60D9CD94",
    "https://scontent.fccu4-2.fna.fbcdn.net/v/t1.18169-9/21617760_240481973147845_2328709735234705042_n.jpg?_nc_cat=105&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=5HDAI84qqVoAX9RzXNi&_nc_ht=scontent.fccu4-2.fna&oh=c3dfcc1654e4e5ee348ff9d034bf74d6&oe=60D9E645"};

    private FriendsAdapter mAdapter;
    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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