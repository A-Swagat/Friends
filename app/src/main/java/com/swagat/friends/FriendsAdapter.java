package com.swagat.friends;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.LinkedList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder> {

    private final ArrayList<FriendsData> friendsData;
    private LayoutInflater mInflater;

    public FriendsAdapter(Context context, ArrayList<FriendsData> friendsData) {
        this.friendsData = friendsData;
        this.mInflater = LayoutInflater.from(context);
    }

    class FriendsViewHolder extends RecyclerView.ViewHolder {
        public final TextView friendItemview;
        public final CircleImageView imageView;
        final FriendsAdapter mAdapter;


        public FriendsViewHolder(View itemView, FriendsAdapter adapter){
            super(itemView);
            friendItemview = itemView.findViewById(R.id.tvitem);
            imageView = itemView.findViewById(R.id.imageView);
            this.mAdapter = adapter;
        }
    }



    @NonNull
    @Override
    public FriendsAdapter.FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.friend_item,
                parent, false);
        return new FriendsViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsAdapter.FriendsViewHolder holder, int position) {
        String mName = friendsData.get(position).getName();
        holder.friendItemview.setText(mName);
        String mUrl = friendsData.get(position).getUrl();

        //using picasso to load img from url
        Picasso.get().load(friendsData.get(position).getUrl()).into(holder.imageView);

        holder.friendItemview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //starting a new activity with intent
                Intent intent1 = new Intent(mInflater.getContext(),FriendsDetails.class);
                intent1.putExtra("name",mName);
                intent1.putExtra("imgUrl", mUrl);
                mInflater.getContext().startActivity(intent1);

            }
        });
    }

    @Override
    public int getItemCount() {
        return friendsData.size();
    }
}
