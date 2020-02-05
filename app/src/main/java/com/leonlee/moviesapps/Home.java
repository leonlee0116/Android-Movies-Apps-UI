package com.leonlee.moviesapps;

/**
 * Inspired by Balance from Dribble
 * https://dribbble.com/shots/6724418-Movie-app/attachments/1436036
 */

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Home extends AppCompatActivity {

    private ImageView iv1, iv2, iv3, iv4, iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);

        Glide.with(this).load("https://assets.2ser.com/wp-content/aws/uploads/2018/02/17204756/BlackPanther.jpg").centerCrop().into(iv1);
        Glide.with(this).load("https://picsum.photos/350/200").into(iv2);
        Glide.with(this).load("https://picsum.photos/350/200").into(iv3);

        Glide.with(this).load("https://is5-ssl.mzstatic.com/image/thumb/Video128/v4/f2/0b/fa/f20bfa07-96dc-e39b-d8db-1c2f8aae8482/source/600x600bb.jpg").into(iv4);
        Glide.with(this).load("https://is3-ssl.mzstatic.com/image/thumb/Video113/v4/c4/2a/ad/c42aadfb-764e-db99-300b-c0888604a06b/pr_source.lsr/600x600bb.jpg").into(iv5);
    }
}
