package com.coderfaysal.lovestory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Status extends AppCompatActivity {

    RecyclerView status_view;
    public static ArrayList<HashMap<String, String>> listArrayList = new ArrayList<>();
    MainAdapter mainAdapter = new MainAdapter(listArrayList);
    public static String CLASS_NAME = "";
    TextView toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);


        status_view = findViewById(R.id.status_view);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setText(CLASS_NAME);

        status_view.setAdapter(mainAdapter);
        status_view.setLayoutManager(new LinearLayoutManager(Status.this));


    }


    private class MainAdapter extends RecyclerView.Adapter <MainAdapter.HomeViewHolder>{

        ArrayList<HashMap<String, String>> listArrayList;

        public MainAdapter(ArrayList<HashMap<String, String>> listArrayList) {
            this.listArrayList = listArrayList;
        }


        @NonNull
        @Override
        public MainAdapter.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.items, parent, false);

            return new MainAdapter.HomeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MainAdapter.HomeViewHolder holder, int position) {
            HashMap<String, String> hashMap = listArrayList.get(position);

            String name = hashMap.get("title");
            holder.title.setText(name);

            holder.copy.setOnClickListener(view -> {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("TextView", name);
                assert clipboardManager!= null;
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(getApplicationContext(), "Text Copied", Toast.LENGTH_SHORT).show();
            });

            holder.share.setOnClickListener(view -> {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, name);
                shareIntent.setType("text/plain");
                shareIntent = Intent.createChooser(shareIntent, "Share Via:");
                startActivity(shareIntent);
            });



        }


        @Override
        public int getItemCount() {
            return listArrayList.size();
        }

        private class HomeViewHolder extends RecyclerView.ViewHolder{

            TextView title;
            ImageView copy, share;

            public HomeViewHolder(@NonNull View itemView) {
                super(itemView);

                title = itemView.findViewById(R.id.title);
                copy = itemView.findViewById(R.id.copy);
                share = itemView.findViewById(R.id.share);

            }
        }

    }


}