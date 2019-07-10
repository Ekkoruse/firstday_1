package com.example.firstday_2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.provider.ContactsContract;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    static int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction=
                getSupportFragmentManager()
                        .beginTransaction();
        transaction.addToBackStack(null);
        transaction
                .replace(R.id.fragmentA ,new FragmentA())
                .commit();
       // TabLayout maytag;
       // maytag=findViewById(R.id.maytag);
      //  maytag.addTab(maytag.newTab().setText("F1").setIcon(R.mipmap.ic_launcher));
      //  maytag.addTab(maytag.newTab().setText("F2").setIcon(R.mipmap.ic_launcher));
      //  maytag.addTab(maytag.newTab().setText("F3").setIcon(R.mipmap.ic_launcher));
        Button btn1;
        btn1=findViewById(R.id.button_3);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(a==0)
                {
                    FragmentTransaction transaction =
                            getSupportFragmentManager()
                                    .beginTransaction();
                    transaction.addToBackStack(null);
                    transaction
                            .replace(R.id.fragmentA, new FragmentB())
                            .commit();
                    a=1;
                }
                else
                {
                    a=0;
                    FragmentTransaction transaction =
                            getSupportFragmentManager()
                                    .beginTransaction();
                    transaction.addToBackStack(null);
                    transaction
                            .replace(R.id.fragmentA, new FragmentA())
                            .commit();
                }
            }
        });



//        String[] a=new String[100];
//        ReAdapter ra1;
//        Button btn1;
//     //   btn1=findViewById(R.id.button);
//     /*   btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(MainActivity.this, hotpoint.class);
//                startActivity(intent);
//            }
//        });*/
//     for(int i=0;i<100;i++)
//     {
//         a[i]="null";
//     }
//        a[0]="首都新阶层奔跑追梦";
//        a[1]="喜多川去世";
//        a[2]="张晓晨结婚";
//        a[3]="阿联酋富豪拖南极冰山回国";
//        a[4]="皮肤黑却漂亮的女生";
//        a[5]="曾经很火但消失了的品牌";
//        a[6]="第一次见过这么长的自拍杆 ";
//        a[7]="迪士尼公主戒指";
//        a[8]="人社部回应80后无养老金";
//        a[9]="驾轿车撞学生致6死20伤案被告死刑";
//        a[10]="英国将为男孩免费接种HPV疫苗";
//        RecyclerView recyclerView;
//        recyclerView = findViewById(R.id.recyclerView);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        ra1= new ReAdapter(this);
//        List<Data> list=new ArrayList<>();
//        for(int i=0;i<100;i++)
//        {
//            Data data=new Data("   "+(1+i)+".","","",""+(412314-9867*i),a[i]);
//            list.add(data);
//        }
//        ra1.setData(list);
//        recyclerView.setAdapter(ra1);
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
