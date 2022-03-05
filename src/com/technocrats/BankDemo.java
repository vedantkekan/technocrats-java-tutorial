package com.technocrats;

import java.io.*;

public class BankDemo {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        AccountHolder firstUser = new AccountHolder("Dolly","1234","500");

        System.out.println(firstUser.toString());

        FileOutputStream fos = new FileOutputStream("fileName");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(firstUser);
        out.close();

        FileInputStream fis = new FileInputStream("fileName");
        ObjectInputStream in = new ObjectInputStream(fis);
        AccountHolder firstUserRead = (AccountHolder) in.readObject();
        System.out.println("Deserialized from file = " +firstUserRead.toString());
        in.close();
    }
}
