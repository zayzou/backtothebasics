package com.zayzou.extra.divers.interview;

interface MakeMouvement {

    static void inner() {
        System.out.println("inner method");
    }

    default void hi() {
        System.out.println("this is the default implementation");
    }

    void move();
}

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public final void display() {
        System.out.println("This is my name:  " + this.name);
    }
}

final class A extends Animal {

    public A(String name) {
        super(name);
    }

    @Override
    public void sound() {

    }
}
/*cannot extend a final class
class B extends A{

    public B(String name) {
        super(name);
    }
}*/

class Cat extends Animal implements MakeMouvement {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public void hi() {
        System.out.println("this is overridden implementation");
    }


  /*   cannot override final methods
      @Override
        public void display() {
            System.out.println("override the parent ");
    }*/

    @Override
    public void move() {
        System.out.println("The cat jump and run");
        MakeMouvement.inner();
    }
}

public class OOP {
    public static void main(String[] args) {
        final int x = 3030;
//        x= 23; this is not good
        final Cat c = new Cat("Climentine");
        c.sound();
        c.display();
        c.move();
        c.hi();
        //c=new Cat("john"); this is not good
    }
}
  
