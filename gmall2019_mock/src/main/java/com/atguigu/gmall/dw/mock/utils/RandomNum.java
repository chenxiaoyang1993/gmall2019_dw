package com.atguigu.gmall.dw.mock.utils; /**
 * Author:chenxiaoyang
 * Date:
 * Version:
 */
import java.util.Random;

public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
