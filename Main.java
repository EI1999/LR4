package com.company;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class  StudentAVG {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));

        String[] stu;

        while (sc.hasNextLine()) {
            stu = sc.nextLine().split("\\n+");
            double s = 0;
            for (int i = 1; i < stu.length; i ++) {
                s += Integer.parseInt(stu[i]);
            }
            if (s / (stu.length - 1) > 7) {
                pw.println(stu[0].toUpperCase());
            }
        }

        sc.close();
        pw.close();

    }

}


