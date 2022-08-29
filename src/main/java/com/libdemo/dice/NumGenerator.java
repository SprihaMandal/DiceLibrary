package com.libdemo.dice;
import android.content.Context;
import java.lang.Math;


public class NumGenerator {
    public static int diceGenerator(Context context, int limit){
       int res=(int)(Math.random()*(limit-0+1)+0);
       return res;
    }
}
