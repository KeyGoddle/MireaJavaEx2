package com.company;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	    Author a1 = new Author("Jack", "jack223@mail.ru", 'M');
        Author a2 = new Author("Anna", "anna144@yandex.ru", 'F');
        a2.setEmail("annabang21@gmail.com");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println();

        Ball b1 = new Ball(25.0, 47.0);
        Ball b2 = new Ball();
        b1.setX(38.0);
        b1.setY(76.0);
        b2.setXY(12.0, 142.0);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
