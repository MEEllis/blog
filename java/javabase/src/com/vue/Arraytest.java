package com.vue;

 class Arraytest {
    public static void main(String[] args) {
        //杨辉三角
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    yanghui[i] = new int[i + 1];
                }
                if (j == i || j == 0) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println("");
        }

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String str1="abc";
        Arraytest.aa(str1);
        System.out.println(str1);
        char[] chars1 =new char[]{'a','b'};
        System.out.println(chars1);
    }

    public static void aa(String arg){
        arg = "ccc";
    }
}
