package com.technocrats;

/*
* Demonstrate Java pass by value with example code
*
* */
public class ReferenceDemo {

    public static void main(String args[]){
        Cat first = new Cat("Dolly");
        System.out.println(first.name); // print name before passing object to catMakeover method
        catMakeover(first);
        System.out.println(first.name); // print name after passing object to catMakeover method
    }

    private static void catMakeover(Cat first) {
        first.name = "Luna"; // modify cat name to "luna"
     //   first = new Cat("toto");
    }
}
