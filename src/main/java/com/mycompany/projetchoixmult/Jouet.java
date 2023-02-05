/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetchoixmult;

import java.util.Scanner;

/**
 *
 * @author pjlbo
 */
public class Jouet {
    private String nom;
    private String matiere;
    private double prix;
    private int categorie;
    
public Jouet(String unNom, String uneMat, int unPrix, int uneCat) {
    // constructeur
    this.nom = unNom;
    this.matiere = uneMat;
    this.prix = unPrix;
    this.categorie = uneCat;
    }

public void affiche(){
     System.out.println("Le jouet s'appelle '" + this.nom + "', il est fait en '" + this.matiere + ", il coute " + this.prix + " euros, " +"', catégorie : " + this.categorie);
}

public void setPrix (double unPrix){
    this.prix = unPrix;
}

public double getPrix(){
    return this.prix;
}

public void setCategorie (int uneCat){
    this.categorie = uneCat;
}

public double getCategorie(){
    return this.categorie;
}
}

