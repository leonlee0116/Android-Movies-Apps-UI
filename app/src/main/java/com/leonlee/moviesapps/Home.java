package com.leonlee.moviesapps;

/**
 * Inspired by Balance from Dribble
 * https://dribbble.com/shots/6724418-Movie-app/attachments/1436036
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        Glide.with(this).load("https://scontent.fkul15-1.fna.fbcdn.net/v/t1.0-9/s960x960/51107093_2024212304341197_4647198740765999104_o.jpg?_nc_cat=107&_nc_ohc=xkwHdyhuGL8AX9qVtve&_nc_ht=scontent.fkul15-1.fna&oh=8cf507762379c39b5065d23284ff7a7f&oe=5EC47A45").into(iv2);
        Glide.with(this).load("https://www.thevocket.com/app/uploads/2018/12/MIB-Cover.jpeg").into(iv3);
        Glide.with(this).load("https://is5-ssl.mzstatic.com/image/thumb/Video128/v4/f2/0b/fa/f20bfa07-96dc-e39b-d8db-1c2f8aae8482/source/600x600bb.jpg").into(iv4);
        Glide.with(this).load("https://is3-ssl.mzstatic.com/image/thumb/Video113/v4/c4/2a/ad/c42aadfb-764e-db99-300b-c0888604a06b/pr_source.lsr/600x600bb.jpg").into(iv5);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ViewMovie.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
