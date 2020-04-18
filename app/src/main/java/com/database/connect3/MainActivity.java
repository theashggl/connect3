package com.database.connect3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView i00,i01,i02,i10,i11,i12,i20,i21,i22;
TextView p1,p2;
int n=0,m=1;
Drawable d;
Boolean p=Boolean.FALSE;
@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
protected void setitfor1(ImageView x)
{
    if(x.getImageAlpha()!=0)
    {
        x.setImageResource(R.drawable.red);
        x.setAlpha(1f);
        x.setClickable(false);
    }
    if(!p)
    {p2.setBackgroundColor(Color.parseColor("#0000FE"));
    p1.setBackground(d);
    }
    p=true;
}
@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
protected void setitfor2(ImageView x)
{
    if(x.getImageAlpha()!=0)
    {
        x.setImageResource(R.drawable.blue);
        x.setAlpha(1f);
        x.setClickable(false);
    }
    if(p) {
        p1.setBackgroundColor(Color.parseColor("#FE0000"));
        p2.setBackground(d);
    }
    p=false;
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i00=(ImageView) findViewById(R.id.imageView00);
        i01=(ImageView)findViewById(R.id.imageView01);
        i02=(ImageView)findViewById(R.id.imageView02);
        i10=(ImageView)findViewById(R.id.imageView10);
        i11=(ImageView)findViewById(R.id.imageView11);
        i12=(ImageView)findViewById(R.id.imageView12);
        i20=(ImageView)findViewById(R.id.imageView20);
        i21=(ImageView)findViewById(R.id.imageView21);
        i22=(ImageView)findViewById(R.id.imageView22);
        p1=(TextView)findViewById(R.id.person1);
        p2=(TextView)findViewById(R.id.person2);
        i00.setAlpha(0f);
        i01.setAlpha(0f);
        i02.setAlpha(0f);
        i10.setAlpha(0f);
        i11.setAlpha(0f);
        i12.setAlpha(0f);
        i20.setAlpha(0f);
        i21.setAlpha(0f);
        i22.setAlpha(0f);
        d=p1.getBackground();
        Toast.makeText(this, "Its player 1's turn", Toast.LENGTH_SHORT).show();
        p1.setBackgroundColor(Color.parseColor("#FE0000"));
        i00.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i00);
                else
                    setitfor2(i00);
            }
        });
        i01.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i01);
                else
                    setitfor2(i01);
            }
        });
        i02.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i02);
                else
                    setitfor2(i02);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i10);
                else
                    setitfor2(i10);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i11);
                else
                    setitfor2(i11);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i12);
                else
                    setitfor2(i12);
            }
        });
        i20.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i20);
                else
                    setitfor2(i20);
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i21);
                else
                    setitfor2(i21);
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                if(p==false)
                    setitfor1(i22);
                else
                    setitfor2(i22);
            }
        });
    }
}
