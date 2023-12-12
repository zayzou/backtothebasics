package com.zayzou.extra.divers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clavier {

    //lecture d'une chaine
    public static String lireString() {
        String ligne_lue = null;
        try {
            InputStreamReader lecteur = new InputStreamReader(System.in);
            BufferedReader entree = new BufferedReader(lecteur);
            ligne_lue = entree.readLine();
        } catch (IOException err) {
            System.exit(0);
        }
        return ligne_lue;
    }

}
