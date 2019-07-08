package com.example.firstday_2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        final Switch sw1=findViewById(R.id.switch1);
        final TextView tv1=findViewById(R.id.textView);
        final ImageView iv1=findViewById(R.id.imageView);
        final CheckBox cb1=findViewById(R.id.checkBox);
        final RadioGroup rg1=findViewById(R.id.radioGroup2);
        final TextView tv2=findViewById(R.id.textView2);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                //tv1.setText("aasd");
                iv1.setVisibility(View.INVISIBLE);
                sw1.setVisibility(View.INVISIBLE);
                cb1.setVisibility(View.INVISIBLE);
                tv1.setVisibility(View.INVISIBLE);
                rg1.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
               // tv1.setText("aasd");
                iv1.setVisibility(View.VISIBLE);
                sw1.setVisibility(View.VISIBLE);
                cb1.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.VISIBLE);
                rg1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
            }
        });
        Switch sw2=findViewById(R.id.switch1);
        sw2.setOnClickListener(new View.OnClickListener(){
            int i=1;
            @Override
            public void onClick(View v)
            {
                if(i==0)
                {
                    i=1;
                    tv1.setText("Hello world!");
                }
                else
                {
                    tv1.setText("你好世界！");
                    i=0;
                }
            }
        });
        CheckBox cb2=findViewById(R.id.checkBox);
        cb2.setOnClickListener(new View.OnClickListener(){
            int i=1;
            @Override
            public void onClick(View v)
            {
                if(i==0)
                {
                    i=1;
                    tv1.setVisibility(View.VISIBLE);
                }
                else
                {
                    tv1.setVisibility(View.INVISIBLE);
                    i=0;
                }
            }
        });
        RadioGroup rag1=findViewById(R.id.radioGroup2);
        rag1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group,int checkedId)
            {
                if(checkedId==2131230847)       //this is one id of 3 radiobutton
                                                //i dont know how to identify this
                {
                    tv2.setText("choose 1");
                }
                else if(checkedId==2131230848)
                {
                    tv2.setText("choose 2");
                }
                else
                {
                    tv2.setText("choose 3");
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
