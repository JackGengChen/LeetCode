package com.cg.ita.chapter2.sortVisualizer;

import javax.swing.*;
import java.awt.*;

/**
 * 界面和数组的可视化
 * to make sort visually
 * */
public class VisibleSort extends Visual{
    JFrame jFrame;
    ArrayNeedToSort array;
    // 定义要移动方块的index
    int movingIndex;
    int windowWidth = 1500;
    int windowHeight = 800;
    int margin = 100;

    VisibleSort() {
        array = new ArrayNeedToSort();
        array.initalArray();
//        array.messArray();
        array.setArray(new int[] {15, 2, 10, 8, 12, 9, 7, 5, 14, 1, 3, 6, 13, 11, 4}, 15);
        windowFrom();
    }

    //排序可视化
    @Override
    public void paint(Graphics g) {
        paint(g,movingIndex);
    }


    public void paint(Graphics g, int k) {
        //每次画之前都要先清空画板
        g.clearRect(0, 0, windowWidth,windowHeight);
        int recWidth = (windowWidth-margin*2)/array.len;
        int recHeightRatio = (windowHeight - margin*2)/array.max;
        for (int i = 0; i < array.len; i++) {
            if (i == k) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLACK);
            }
            g.fillRect(i*recWidth+margin,(windowHeight-margin-(array.get(i)*recHeightRatio)),recWidth, array.get(i)*recHeightRatio);
        }
    }

    //排序可视化
    public void repaint(int k) {
        movingIndex = k;
        super.repaint();
    }



    //窗口设置
    @Override
    public void windowFrom() {
        jFrame = new JFrame();

        jFrame.setSize(windowWidth,windowHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);


        jFrame.add(this);
        jFrame.setVisible(true);
    }


    public void startSort() {
        // TODO Auto-generated method stub
    }

    public void run() {
        // TODO Auto-generated method stub

    }
}


