package com.quiquicheandco.sportwithmimi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.quiquicheandco.sportwithmimi.model.MainPagerModel;

public class MainPagerAdapter extends PagerAdapter {

    private Context context;

    public MainPagerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup collection, int position) {
        MainPagerModel mainPagerModel = MainPagerModel.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(mainPagerModel.getLayoutResourceId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, @NonNull Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return MainPagerModel.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        MainPagerModel customPagerEnum = MainPagerModel.values()[position];
        return customPagerEnum.getTitleResourceId();
    }
}
