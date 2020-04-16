package com.zx.mvvmdemo.helper;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.zx.mvvmdemo.R;

/**
 * 作者： 周旭 on 2017年10月17日 0017.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class ImageHelper {
    /**
     * mv_vm xml 传入url 加载图片
     * imageUrl 为xml中 的命名
     *
     * @param imageView imageView
     * @param url       图片路径
     */
    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .placeholder(R.mipmap.placeholder)
                .into(imageView);
    }

    /**
     * mv_vm xml 设置 mipmap Resource
     *
     * @param iv    imageView
     * @param resId resource id
     */
    @BindingAdapter({"resId"})
    public static void loadMipmapResource(ImageView iv, int resId) {
        iv.setImageResource(resId);
    }
}
