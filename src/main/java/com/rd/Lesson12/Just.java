package com.rd.Lesson12;

import java.io.*;
import java.util.Scanner;

public class Just {
    public static void main(String[] args) throws Exception {
        //Reading data from user
        String data = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        while(!sc.hasNext(";")) {
            data = sc.next();
        }
        sc.close();
        byte[] buf = data.getBytes();
        //Writing it to a file using the DataOutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/java/com/rd/Lesson12/Errors/data.txt"));
        for (byte b:buf) {
            dos.writeChar(b);
        }
        dos.flush();
        //Reading from the above created file using readChar() method
        DataInputStream dis = new DataInputStream(new FileInputStream("src/main/java/com/rd/Lesson12/Errors/data.txt"));
        while(true) {
            char ch;
            try {
                ch = dis.readChar();
                System.out.print(ch);
            } catch (EOFException e) {
                System.out.println("");
                System.out.println("End of file reached");
                break;
            } catch (IOException e) {}
        }
    }
}