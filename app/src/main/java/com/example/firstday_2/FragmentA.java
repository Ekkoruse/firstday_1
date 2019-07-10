package com.example.firstday_2;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedIns)
    {
        return inflater.inflate(R.layout.frame,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView im_1;
        im_1= view.findViewById(R.id.images);
        im_1.setImageResource(R.drawable.gra);
        AnimationSet ani=new AnimationSet(true);
        Animation iiy=AnimationUtils.loadAnimation(getContext(),R.anim.scale);
        ani.addAnimation(iiy);
        Animation iii=AnimationUtils.loadAnimation(getContext(),R.anim.alpha);
        iii.setRepeatCount(100);
        ani.addAnimation(iii);
        // Animation sca= AnimationUtils.loadAnimation(getContext(),R.anim.scale);
        RotateAnimation ii=new RotateAnimation(0,360);
        ii.setRepeatCount(100);
        ii.setDuration(2000);
        ani.addAnimation(ii);
        im_1.startAnimation(ani);
    }


}

