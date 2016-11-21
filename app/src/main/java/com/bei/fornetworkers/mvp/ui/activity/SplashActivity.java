package com.bei.fornetworkers.mvp.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bei.fornetworkers.MainActivity;
import com.bei.fornetworkers.R;
import com.bei.fornetworkers.app.WEApplication;
import com.bei.fornetworkers.di.component.AppComponent;
import com.bei.fornetworkers.mvp.ui.common.WEActivity;
import com.bei.fornetworkers.utils.InvokeStartActivityUtils;

/**
 * des:启动页
 * Created by fb
 */
public class SplashActivity extends WEActivity {
  @BindView(R.id.iv_logo) ImageView ivLogo;
  @BindView(R.id.tv_name) TextView tvName;

  @Override protected View initView() {
    return LayoutInflater.from(this).inflate(R.layout.act_splash, null, false);
  }

  public void initAniView() {
    FullScreencall();
    PropertyValuesHolder alpha = PropertyValuesHolder.ofFloat("alpha", 0.3f, 1f);
    PropertyValuesHolder scaleX = PropertyValuesHolder.ofFloat("scaleX", 0.3f, 1f);
    PropertyValuesHolder scaleY = PropertyValuesHolder.ofFloat("scaleY", 0.3f, 1f);
    ObjectAnimator objectAnimator1 =
        ObjectAnimator.ofPropertyValuesHolder(tvName, alpha, scaleX, scaleY);
    ObjectAnimator objectAnimator2 =
        ObjectAnimator.ofPropertyValuesHolder(ivLogo, alpha, scaleX, scaleY);

    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(objectAnimator1, objectAnimator2);
    animatorSet.setInterpolator(new AccelerateInterpolator());
    animatorSet.setDuration(2000);
    animatorSet.addListener(new Animator.AnimatorListener() {
      @Override public void onAnimationStart(Animator animator) {

      }

      @Override public void onAnimationEnd(Animator animator) {
        InvokeStartActivityUtils.startActivity(WEApplication.getContext(), SplashActivity.class,
            null, true);
      }

      @Override public void onAnimationCancel(Animator animator) {

      }

      @Override public void onAnimationRepeat(Animator animator) {

      }
    });
    animatorSet.start();
  }

  @Override protected void initData() {
    initAniView();
  }

  @Override protected void setupActivityComponent(AppComponent appComponent) {

  }
}
