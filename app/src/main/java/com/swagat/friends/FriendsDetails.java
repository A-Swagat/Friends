package com.swagat.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

// class to show friends detail on a new activity
public class FriendsDetails extends AppCompatActivity {

    TextView tvFriendName;
    CircleImageView ivFriendsImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_details);

        //receaving intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String url = intent.getStringExtra("imgUrl");

        //setting image and name
        tvFriendName = findViewById(R.id.tvFriendName);
        ivFriendsImg = findViewById(R.id.ivFriendImg);
        tvFriendName.setText(name);
        Picasso.get().load(url).into(ivFriendsImg);
    }
}