package com.vue.packaging;

//代码块
public class CodeBlockTest1 {
    public static String desc;

    public CodeBlockTest1(){
        System.out.println("CodeBlockTest construction.....");
    }

    {
        System.out.println("CodeBlockTest1 code block");
    }

}

class CodeBlockTest1Test {
    public static void main(String[] args) {
        CodeBlockTest1 codeBlockTest1 = new CodeBlockTest1();
        CodeBlockTest1 codeBlockTest2 = new CodeBlockTest1();
    }
}

