package com.vue.packaging;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {

    public static void main(String[] args) {
        ScoreTest scoreTest = new ScoreTest();
        scoreTest.test1();
    }
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        Vector vector = new Vector();
        int maxScore = 0;
        for (; ; ) {
            System.out.println("请输入成绩（以负数结束）：");
            String scannerStr = scanner.next();
            int score = 0;
            try {
                score = (int) score;
            } catch (Exception e) {
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            if (score > 100) {
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            if (score < 0) {
                break;
            }
            Integer integer = new Integer(score);
            vector.addElement(integer);
            if (maxScore < score) {
                maxScore = score;
            }
        }
        char level;
        for (int i = 0; i < vector.size(); i++) {
            Object vectorEle = vector.elementAt(i);
            int score = (int) vectorEle;
            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score > 10 && maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score > 20 && maxScore - score <= 40) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("分数" + score + "\t成绩" + level);
        }
    }
}
