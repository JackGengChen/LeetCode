package com.cg.ita.chapter2.sortVisualizer;

import java.util.Arrays;

/**
 * 插入排序----直接插入排序(insert sort---InsertSort)
 */
public class InsertSort extends VisibleSort {

    Thread thread;

    InsertSort() {
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        System.out.println(Arrays.toString(array.array));
        startSort();
        System.out.println(Arrays.toString(array.array));

    }

    //直接插入排序可视化
    @Override
    public void startSort() {
        for (int i = 1; i < array.len; i++) {
            //把要插入排序的数先暂存到临时变量中
            int temp = super.array.get(i);
            int j = i - 1; //用于标记插入位置
            repaint(j + 1);
            //寻找插入位置
            while (j >= 0 && temp < array.get(j)) {
                array.set(array.get(j), j + 1);
                // 为了动画，实际排序用不到
                movingIndex = j;
                j--;
                try {
                    //每次重画都要有一定的延迟，为了看清！
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                repaint(j + 1);
            }
            array.set(temp, j + 1);
            repaint(j + 1);
        }

        //排序完成停2s退出
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//
//        }
//        super.jFrame.setVisible(false);
    }
}
