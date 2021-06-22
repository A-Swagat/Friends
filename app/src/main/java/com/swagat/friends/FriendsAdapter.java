package com.swagat.friends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder> {

    private final ArrayList<String> mFriendsList;
    private LayoutInflater mInflater;

    public FriendsAdapter(Context context, ArrayList<String> mFriendsList) {
        this.mFriendsList = mFriendsList;
        this.mInflater = LayoutInflater.from(context);
    }

    class FriendsViewHolder extends RecyclerView.ViewHolder {
        public final TextView friendItemview;
        final FriendsAdapter mAdapter;


        public FriendsViewHolder(View itemView, FriendsAdapter adapter){
            super(itemView);
            friendItemview = itemView.findViewById(R.id.tvitem);
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
        String mCurrent = mFriendsList.get(position);
        holder.friendItemview.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mFriendsList.size();
    }
}
