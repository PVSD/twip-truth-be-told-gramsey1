package com.company;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner s1 = new Scanner (System.in);
        System.out.println("");
        String p = s1.nextLine();
        FileWriter file = new FileWriter("\\Users\\gr236\\IdeaProjects\\twip-truth-be-told-gramsey1\\src\\com\\company\\file");
        PrintWriter output = new PrintWriter(file);
        output.print("a");
        output.close();
        file.close();

        boolean a;
        boolean b;
        boolean c = false;
        System.out.println("a \t b \t" + c);
        System.out.println("T \t T \t" + c);
        System.out.println("T \t F \t" + c);
        System.out.println("F \t T \t" + c);
        System.out.println("F \t F \t" + c);
        l
    }
}
