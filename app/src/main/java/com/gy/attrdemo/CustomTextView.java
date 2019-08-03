package com.gy.attrdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;

public class CustomTextView extends AppCompatTextView {

    public CustomTextView(Context context) {
        this(context,null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        /*四个参数 介绍*/
        /*第一个参数 AttributeSet 一个和xml中的标签关联的存放属性的集合*/
        /*第二个参数 int[] attrs 就是我们要在xml中读取的属性*/
        /*第三个参数 当前主题中的一个属性，其中包含对为TypedArray提供默认值的样式资源的引用。可以为0以不寻找默认值*/
        /*第四个参数 是具体的style资源。为TypedArray提供默认值的样式资源的资源标识符，仅当defStyleAttr为0或在主题中找不到时才使用*/
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.CustomTextView,R.attr.attr_defstyle,R.style.defStyle);

        /*获取属性值的优先级别*/
        /*1 先获取xml中设置的值 2 获取在布局中设置的style中的值*/
        /*3 获取第三个参数设置的值 如果第三个参数设置了值 直接跳过第四个参数  即使 第三个参数没有设置值 第三个参数如果没有定义 比如传递0 那么就从第四个参数取值*/
        /*4 最后从theme 中取值*/
        String text1 = typedArray.getString(R.styleable.CustomTextView_text1);
        Log.i("cccccccccccc","text1==="+text1);
        String text2 = typedArray.getString(R.styleable.CustomTextView_text2);
        Log.i("cccccccccccc","text2==="+text2);
        String text3 = typedArray.getString(R.styleable.CustomTextView_text3);
        Log.i("cccccccccccc","text3==="+text3);
        String text4 = typedArray.getString(R.styleable.CustomTextView_text4);
        Log.i("cccccccccccc","text1==="+text4);
    }

}
