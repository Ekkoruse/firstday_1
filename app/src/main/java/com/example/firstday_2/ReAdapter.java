package com.example.firstday_2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReAdapter extends RecyclerView.Adapter {
    List<Data> list_1=new ArrayList<>();
    int[] a= new int[100];
    static int k=0;
    Context mContext;

    ReAdapter(Context context)
    {
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view =inflater.inflate(R.layout.youmyfather,parent,false);
        ViewH vH = new ViewH(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        ImageView im = ((ViewH) holder).i1;
        TextView tv= ((ViewH) holder).i2;
        TextView cont=((ViewH) holder).cont;
        final TextView index=((ViewH) holder).index;
        final Button bb= ((ViewH) holder).i3;
        index.setTextSize(12);
        cont.setTextSize(13);
        if(a[position]==0)
        {
            bb.setText("赞");
            bb.setTextColor(Color.BLACK);
            bb.setBackgroundColor(Color.parseColor("#99ffffff"));
        }
        else
        {
            bb.setText("已赞");
            bb.setTextColor(Color.parseColor("#e6face15"));
            bb.setBackgroundColor(Color.parseColor("#161823"));
        }
        if(position<3)
        {
            tv.setTextColor(Color.parseColor("#e6face15"));
        }
        else
        {
            tv.setTextColor(Color.parseColor("#99ffffff"));
        }
        if(position<5)
        {
            im.setImageResource(R.drawable.hot);
        }
        else
        {
            im.setImageResource(0);
        }
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[position]==0)
                {
                    bb.setText("已赞");
                    bb.setTextColor(Color.parseColor("#e6face15"));
                    bb.setBackgroundColor(Color.parseColor("#161823"));
                    index.setText("" + (Integer.parseInt(index.getText().toString()) + 1));
                    a[position] = 1;
                }
                else
                {
                    bb.setText("赞");
                    bb.setTextColor(Color.BLACK);
                    bb.setBackgroundColor(Color.parseColor("#99ffffff"));
                    index.setText("" + (Integer.parseInt(index.getText().toString()) - 1));
                    a[position] = 0;
                }
            }
        });
        tv.setText(list_1.get(position).text);
        index.setText(list_1.get(position).times);
        cont.setText(list_1.get(position).cont);

    }

    @Override
    public int getItemCount() {
        return list_1.size();
    }

    public void setData(List<Data> list)
    {
        list_1=list;
        for (int i=0;i<list.size();i++) {
            a[i]=0;
        }
    }

    class ViewH extends RecyclerView.ViewHolder{
        ImageView i1;
        TextView i2,index,cont;
        Button i3;
        public ViewH(@NonNull View itemView) {
            super(itemView);
            i1=itemView.findViewById(R.id.imageView);
            i2=itemView.findViewById(R.id.textView);
            i3=itemView.findViewById(R.id.button2);
            index=itemView.findViewById(R.id.textView_3);
            cont=itemView.findViewById(R.id.textView_2);
        }
    }

}
