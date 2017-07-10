package com.samples.res.tweenanimationlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TweenAnimationActivity extends AppCompatActivity
        implements View.OnClickListener{

    private LinearLayout layout;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        layout = (LinearLayout)findViewById(R.id.layout_anim);
        animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.circle);
    }

    @Override
    public void onClick(View view) {
        layout.startAnimation(animation);
    }
}
