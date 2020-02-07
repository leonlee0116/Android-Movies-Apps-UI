package com.leonlee.moviesapps;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ViewMovie extends AppCompatActivity {

    private ImageView iv1, iv2, iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_movie);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv_back = findViewById(R.id.iv_back);

        Glide.with(this).load("https://assets.2ser.com/wp-content/aws/uploads/2018/02/17204756/BlackPanther.jpg").into(iv1);
        Glide.with(this).load("https://is5-ssl.mzstatic.com/image/thumb/Video124/v4/09/dc/bf/09dcbfa8-b7ba-26e1-ab77-a62155a500e6/source/600x600bb.jpg").into(iv2);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
