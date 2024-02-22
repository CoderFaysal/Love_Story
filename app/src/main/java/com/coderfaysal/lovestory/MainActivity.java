package com.coderfaysal.lovestory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ITEMS();

        recyclerView = findViewById(R.id.recyclerView);
        MainAdapter mainAdapter = new MainAdapter();
        recyclerView.setAdapter(mainAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));


    }



    private class MainAdapter extends RecyclerView.Adapter <MainAdapter.HomeViewHolder>{

        @NonNull
        @Override
        public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.main_items, parent, false);

            return new HomeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
            hashMap = arrayList.get(position);

            String name = hashMap.get("title");
            holder.title.setText(name);


            holder.lay_click.setOnClickListener(view -> {

                if (name.equals("Love Quotes")){
                    LOVE();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Care Quotes")){
                    CARE();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Huff Quotes")){
                    OVIMANI();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Sad Quotes")){
                    SAD();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Broke Quotes")){
                    BROKE();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                } else if (name.equals("Cute Quotes")){
                    CUTE();
                    Status.CLASS_NAME = name;
                    startActivity(new Intent(MainActivity.this, Status.class));
                }


            });
        }


        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class HomeViewHolder extends RecyclerView.ViewHolder{

            TextView title;
            LinearLayout lay_click;

            public HomeViewHolder(@NonNull View itemView) {
                super(itemView);

                title = itemView.findViewById(R.id.title);
                lay_click = itemView.findViewById(R.id.lay_click);

            }
        }

    }




    public void ITEMS(){

        hashMap = new HashMap<>();
        hashMap.put("title", "Love Quotes");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Care Quotes");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Huff Quotes");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Sad Quotes");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Broke Quotes");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Cute Quotes");
        arrayList.add(hashMap);



    }


    public void LOVE(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Love is that condition in which the happiness of another person is essential to your own.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "The best thing to hold onto in life is each other.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I need you like a heart needs a beat.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "If I had a flower for every time I thought of you... I could walk through my garden forever.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Take my hand, take my whole life too. For I can’t help falling in love with you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You’re the closest to heaven, that I’ll ever be.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I will never stop trying. Because when you find the one... you never give up.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void CARE(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "It’s always better when we’re together.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I love you for all that you are, all that you have been and all that you will be.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "To the world you may be one person, but to one person you are the world.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Two are better than one.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I’ve tried so many times to think of a new way to say it, and it’s still I love you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "When you realize you want to spend the rest of your life with somebody, you want the rest of your life to start as soon as possible.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I love you and that’s the beginning and end of everything.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "If I know what love is, it is because of you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "My soul and your soul are forever tangled.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I love you more than I have ever found a way to say to you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I have found the one whom my soul loves.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Sometimes all you need is a hug from the right person and all your stress will melt away.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "In all the world, there is no heart for me like yours. In all the world, there is no love for you like mine.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void OVIMANI(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "If you remember me, then I don’t care if everyone else forgets.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Love is when you sit beside someone doing nothing, yet you feel perfectly happy.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "He's more myself than I am. Whatever our souls are made of, his and mine are the same.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You are, and always have been, my dream.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I love that you are the last person I want to talk to before I go to sleep at night.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Love is composed of a single soul inhabiting two bodies.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "If you find someone you love in your life, then hang on to that love.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Come near now, and kiss me.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I need you like a heart needs a beat.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Our love is like the wind. I can’t see it, but I can feel it.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Loving you never was an option. It was a necessity.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void SAD(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "There are moments when I wish I could roll back the clock and take all the sadness away, but I have the feeling that if I did, the joy would be gone as well.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Life's under no obligation to give us what we expect.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Learning is a gift. Even when pain is your teacher.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You see, I usually find myself among strangers because I drift here and there trying to forget the sad things that happened to me.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Don't go around saying the world owes you a living. The world owes you nothing. It was here first.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Things change. And friends leave. And life doesn't stop for anybody.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "One must not let oneself be overwhelmed by sadness.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "The word 'happy' would lose its meaning if it were not balanced by sadness.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Life is a moderately good play with a badly written third act");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I have learned now that while those who speak about one's miseries usually hurt, those who keep silence hurt more.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "The excursion is the same when you go looking for your sorrow as when you go looking for your joy.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I wish I could go back to the day I met you and just walk away.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void BROKE(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "So it's true, when all is said and done, grief is the price we pay for love.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Our dead are never dead to us until we have forgotten them.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "What is hardest to accept about the passage of time is that the people who once mattered the most to us wind up in parentheses.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "The bitterest tears shed over graves are for words left unsaid and deeds left undone.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "It is the unknown we fear when we look upon death and darkness, nothing more.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "It's sad when someone you know becomes someone you knew.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "There is a time for departure, even when there's no certain place to go.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You meet everyone twice in this life, when they come and when they go.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Grief is not as heavy as guilt, but it takes more away from you.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Death is a great revealer of what is in a man, and in its solemn shadow appear the naked lineaments of the soul.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "You know, a heart can be broken, but it keeps on beating, just the same.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }


    public void CUTE(){
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("title", "It’s always better when we’re together.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I would rather spend one lifetime with you, than face all the ages of this world alone.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "My love for you has no depth, its boundaries are ever-expanding.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "When I see your face, there’s not a thing that I would change, ’cause you’re amazing – just the way you are.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Because of you, I can feel myself slowly, but surely, becoming the me I have always dreamed of being.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "We loved with a love that was more than love.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "True love is rare, and it's the only thing that gives life real meaning.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I am my beloved’s and my beloved is mine");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "It was love at first sight, at last sight, at ever and ever sight.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "In real love you want the other person's good. In romantic love you want the other person.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Love does not consist in gazing at each other, but in looking outward together in the same direction.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "When I saw you I fell in love, and you smiled because you knew.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "True love is putting someone else before yourself.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "All that you are is all that I’ll ever need.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "I love being one half of a romantic couple.");
        arrayList.add(hashMap);



        Status.listArrayList = arrayList;

    }



}