package com.zayzou.jcp.streams;

import java.util.Comparator;
import java.util.stream.Stream;

class Personne {
    private String nom, prenom;
    private int annee_naissance;

    public Personne(String prenom, String nom, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        annee_naissance = annee;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnnee() {
        return annee_naissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", annee_naissance=" + annee_naissance +
                '}';
    }
}


public class Exercice174 {

    public static void main(String[] args) {
        Personne[] tab = {new Personne("thibault", "Rougier", 2001),
                new Personne("thomas", "Niesseron", 1987),
                new Personne("thifaine", "Mitenne", 1959),
                new Personne("maxime", "Forest", 1995),
                new Personne("jules", "Forest", 1995)};
        System.out.println("--- Nes apres 1985 : ");
        Stream.of(tab)
                .filter(person -> person.getAnnee() > 1985)
                .forEach(personne -> System.out.println(personne.getNom()));

        //afficher le nom des personnes nées avant 2000, triés par ordre alphabétique sur leur nom,
        //et afficher leur nombre ;

        System.out.println("--- Count Nes  avant 2000 : ");
        long count = Stream.of(tab)
                .filter(personne -> personne.getAnnee() < 2000)
                .sorted(Comparator.comparing(Personne::getNom))
                .peek(personne -> System.out.print(personne.getNom() + " "))
                .count();

        System.out.println("\n" + count);

        //afficher tous les noms et prénoms, triés par ordre alphabétique sur leur nom et leur
        //prénom.

        System.out.println("--- Affiche tout ordonnée : ");
        Stream.of(tab)
                .sorted(Comparator.comparing(personne -> personne.getNom() + personne.getPrenom()))
                .forEach(personne -> System.out.println("(" + personne.getNom() + "," + personne.getPrenom() + ")"));
    }
}
