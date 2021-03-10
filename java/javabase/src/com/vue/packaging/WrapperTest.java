package com.vue.packaging;

import org.junit.Test;

//包装类
public class WrapperTest {
    //基本类型====》包装类
    @Test
    public void test1() {
        Integer integer = new Integer("222");
        System.out.println(integer);
    }

    //包装类====》基本类型
    @Test
    public void test2() {
        Integer integer = new Integer(111);
        System.out.println(integer.intValue());
    }

    //基本类型，包装类====》String
    @Test
    public void test3() {
        Integer integer = new Integer("333");
        String str1 = integer + "";
        String str2 = String.valueOf(integer);
        System.out.println(str1);
        System.out.println(str2);
    }

    //String====》基本类型，包装类
    @Test
    public void test4() {
        String str1 = "123";
        int aaa = Integer.parseInt(str1);
        System.out.println(aaa);

        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);

        Integer int1 = 1;
        Integer int2 = 1;
        System.out.println(int1==int2);//true

        Integer int3 = 128;
        Integer int4 = 128;
        System.out.println(int3==int4);//false

    }
}
