package com.technocrats;

import java.io.*;

public class BankDemo {
    public static void main(String args[])  {
        AccountHolder firstUser = new AccountHolder("Dolly","1234","500");

        System.out.println(firstUser.toString());

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream("fileName");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            out = new ObjectOutputStream(fos);
            out.writeObject(firstUser);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream("fileName");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            in = new ObjectInputStream(fis);
            AccountHolder firstUserRead = (AccountHolder) in.readObject();
            System.out.println("Deserialized from file = " +firstUserRead.toString());
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}