package com.example.p.myapplication;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.p.myapplication.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private Context mContext;
    private List<User> mUsers;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView nameTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.item_name);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Log.d("Adapter onClick", "position : " + position);

            if (position != RecyclerView.NO_POSITION) {
                User user = mUsers.get(position);
                showDialog(user);
            }
        }
    }

    public UserAdapter(Context context) {
        this.mContext = context;
        mUsers = new ArrayList<>();
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_recycler_view, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("BindViewHolder", "position : " + position);
        User user = mUsers.get(position);

        TextView textView = holder.nameTextView;
        textView.setText(user.getName());
    }

    public void setData(List<User> users) {
        this.mUsers = users;

        notifyDataSetChanged();
    }

    private void showDialog(User user) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setMessage(user.createMessage());
        builder.show();
    }
}
