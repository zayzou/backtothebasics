package com.zayzou.extra.divers;

public class Exercice {
    public static void main(String[] args) {
        {
            int i = 10, j = 5;
            if (i < 5 && j++ < 10) System.out.println("&&1 vrai");
            else System.out.println("&&1 faux");
            System.out.println("i = " + i + " j = " + j);
            if (i < 5 & j++ < 10) System.out.println("& vrai");
            else System.out.println("& faux");
            System.out.println("i = " + i + " j = " + j);
            if (i < 15 && j++ < 10) System.out.println("&&2 vrai");
            else System.out.println("&&2 faux");
            System.out.println("i = " + i + " j = " + j);
            if (i < 15 || j++ < 10) System.out.println("|| vrai");
            else System.out.println("|| faux");
            System.out.println("i = " + i + " j = " + j);


        }
    }
    /*
    (a + b) - 2*c // expression 1 V
    2 * x / y * z // expression 2 X
    (x + 3) * n%p // expression 3 X
    -a / -(b + c) // expression 4 V
    (x/y)%-z // expression 5 X
    x/y%(-z) // expression 6 X


    Soit ces déclarations :
        byte b1 = 10, b2 = 20 ;
        short p = 200 ;
        int n = 500 ;
        long q = 100 ;
        float x = 2.5f ;
        double y = 5.25 ;
    Donner le type et la valeur des expressions arithmétiques suivantes :

        b1+b2 // 1 int
        p+b1 // 2 int
        b1*b2 // 3 int
        q+p*(b1+b2); // 4 long
        x+q*n // 5 float
        b1*q/x // 6 float
        b1*q*2./x // 7 float
        b1*q*2.f/x // 8 float
     */


/*
Quels résultats fournit ce programme ?
    public class Excep {
        public static void main(String args[]) {
            double x1 = 1e200, x2 = 1e210;
            double y, z;
            y = x1 * x2;
            System.out.println("valeur de y " + y); INFINITY
            x2 = x1;
            z = y / (x2 - x1);
            System.out.println(y + " divise par " + (x2 - x1) + " = " + z);INFINITY 0 NAN
            y = 15;
            z = y / (x2 - x1);
            System.out.println(y + " divise par " + (x2 - x1) + " = " + z); 15 0 NAN
            z = (x2 - x1) / (x2 - x1);
            System.out.println((x2 - x1) + " divise par " + (x2 - x1) + " = " + z); NAN
            System.out.println(z + "+1 = " + (z + 1));NAN
            x1 = Float.POSITIVE_INFINITY;
            x2 = Double.NEGATIVE_INFINITY;
            z = x1 / x2;
            System.out.println(x1 + "/" + x2 + " = " + z);?
        }
    }*/


    /*
    Soit ces déclarations :
        char c = 60, ce = 'e', cg = 'g' ;
        byte b = 10 ;
        Donner le type et la valeur des expressions suivantes :
        c + 1
        2 * c
        cg - ce
        b * c
     */



    /*
            a = x+5 // 1
            a = (x=y)+ 2 // 2
            a = x = (y+2) // 3
            a<b && c<d // 4
            (i++) * (n+p) // 5
            x += n%p // 6
            n = p+=5 // 7
     */

}
