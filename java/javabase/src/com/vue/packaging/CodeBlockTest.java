package com.vue.packaging;

import org.junit.Test;
//代码块
public class CodeBlockTest {
    public static String desc;

    static {
        System.out.println("CodeBlockTest code block");
    }

    @Test
    public void test1() {
//        String desc = CodeBlockTest.desc;
//        System.out.println(desc);
        System.out.println("11111");
        CodeBlockTest codeBlockTest1 = new CodeBlockTest();
        CodeBlockTest codeBlockTest2 = new CodeBlockTest();

    }
}
