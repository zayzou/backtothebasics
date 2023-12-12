package com.zayzou.extra.divers;

public class Exercices {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int nombre = 0;
//        System.out.println("donnez un nombre positif :");
//        nombre = sc.nextInt();
//        serieHarmonique(nombre);
        traingle();

//        System.out.println("========");
//        serieHarmonique2(nombre);
//
//        System.out.println("========");
//        serieHarmonique3(nombre);
    /*    do {
            System.out.println("donnez un nombre positif :");
            nombre = sc.nextInt();
            if (nombre < 0) {
                System.out.println("svp positif");
            } else if (nombre > 0) {
                double carre = racineCarre(nombre);
                System.out.println(carre);
            }
        } while (nombre != 0);*/
    }

    public static double racineCarre(int n) {
        return Math.sqrt(n);
    }


    //1/1 + 1/2 + 1/3 + 1/4 + ..... + 1/n
    public static void serieHarmonique(int n) {
        float result = 0;
        for (var i = 1; i <= n; i++) {
            result += 1f / i;
        }
        System.out.println("For version : " + result);

        result = 0;
        var count = 1;
        while (count <= n) {
            result += 1f / count;
            count++;
        }
        System.out.println("While version : " + result);

        result = 0;
        count = 1;
        do {
            result += 1f / count;
            count++;
        } while (count <= n);
        System.out.println("Do...While version : " + result);
    }

    public static void traingle() {
        int nLigne = 8;
        int numEspace = 0;
        char c = '*';
        for (int numLigne = 0; numLigne < nLigne; numLigne++) {
            numEspace = nLigne - numLigne - 1;
            for (int i = 0; i < numEspace; i++) {
                System.out.print(" ");
            }
            var numEtoile = numLigne * 2 + 1;
            for (int i = 0; i < numEtoile; i++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


}
