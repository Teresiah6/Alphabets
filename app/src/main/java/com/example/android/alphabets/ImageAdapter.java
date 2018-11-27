package com.example.android.alphabets;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by hp on 11/25/2018.
 */

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int [] mImageIds = new int[]{ R.drawable.a, R.drawable.b,R.drawable.c, R.drawable.d,R.drawable.e, R.drawable.f,R.drawable.g,
    R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q,
    R.drawable.r, R.drawable.s, R.drawable.t,R.drawable.u, R.drawable.v, R.drawable.w,R.drawable.x, R.drawable.y, R.drawable.z};
    ImageAdapter(Context context){
        mContext=context;
    }


    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView= new ImageView (mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
      container.removeView((ImageView) object);
    }


}
