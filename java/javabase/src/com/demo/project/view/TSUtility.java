package com.demo.project.view;

import java.util.Scanner;

/**
 * Scanner 工具类
 */
public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);


    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.println("选择错误，请重新输入！");
            } else {
                break;
            }
        }
        return c;
    }

    public static void readReturn() {
        System.out.println("按回车继续.....");
        readKeyBoard(100, true);
    }

    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入有误，请重新输入！");
            }
        }
        return  n;
    }


    public static char readConfirmSelection(){
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c != 'Y' && c != 'N') {
                System.out.println("选择错误，请重新输入！");
            } else {
                break;
            }
        }
        return c;
    }

    public static void close(){
        scanner.close();
    }

    private static String readKeyBoard(int len, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) {
                    return line;
                } else {
                    continue;
                }
            }
            if (line.length() < 1 || line.length() > len) {
                System.out.println("输入长度（不大于" + len + ")错误，请重新输入！");
                continue;
            }
            break;
        }
        return line;
    }



}
