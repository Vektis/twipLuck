package com.company;
import java.lang.Math;

/**
 * Created by vr834 on 10/10/16.
 */
public class randNum {
    public String name;
    public int ranNum;

    public randNum(String n){
        name = n;
    }
    public int perfectRandom(){
        int minimum = 1;
        int maximum = 46340;
        ranNum = minimum + (int)(Math.random() * maximum);
        return (ranNum * ranNum);
    }


}
