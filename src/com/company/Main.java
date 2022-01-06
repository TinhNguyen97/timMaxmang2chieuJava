package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng arr:");
        for (int z = 0; z < arr.length; z++) {
            for (int y = 0; y < arr[0].length; y++) {
                System.out.print(arr[z][y] + "\t");
            }
            System.out.println();
        }
        int max = arr[0][0];
        int index1 = -1;
        int index2 = -1;
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[0].length; n++) {
                if (max < arr[m][n]) {
                    max = arr[m][n];
                    index1 = m;
                    index2 = n;
                }
            }
        }
        if (index1 != -1 && index2 != -1) {
            System.out.println("có giá trị lớn nhất là " + max + " tại vị trí [" + index1 + "][" + index2 + "]");
        }
    }
}