/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetchoixmult;

import java.util.Scanner;

/**
 *
 * @author pjlbo
 */
public class ProjetChoixmult {

public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    Jouet barbie = new Jouet ("Poupée Barbie", "plastique", 15, 2);
    Jouet echec = new Jouet ("Echec lumineux", "verre", 45, 4);
    int choix = 0;
    while(choix!=4){
        System.out.println("Choisissez une otion (écrire le numéro correspondant) :");
        System.out.println("1/ Afficher chacun des jouets ");
        System.out.println("2/ Changer le prix (augmenter ou diminuer) en pourcentage ");
        System.out.println("3/ Afficher chacun des jouets ");
        System.out.println("4/ Quitter ");
        choix = scanner.nextInt();
        
    if (choix==1){
        barbie.affiche();
        echec.affiche();
    }
    if (choix==2){
        System.out.println("Veuillez indiquer en pourcent, la variation de prix à appliquer :");
        Scanner scan = new Scanner (System.in);
        float pourc = scan.nextInt();
        double nouvPrix1, nouvPrix2;
        if (pourc>=0){
            pourc = pourc/100+1;
        }
        else{
            pourc = pourc/100+1;
        }
        nouvPrix1 = barbie.getPrix() * pourc;
        nouvPrix2 = echec.getPrix() * pourc;
        barbie.setPrix(nouvPrix1);
        echec.setPrix(nouvPrix2);
        System.out.println("Le nouveaux prix de la poupée barbie est : \n" + barbie.getPrix());
        System.out.println("Le nouveaux prix de l'échec lumineux est : \n" + echec.getPrix());
    }
    if (choix==3){
        int Cat1 = (int)barbie.getCategorie();
        int Cat2 = (int)echec.getCategorie();
        barbie.setCategorie(Cat2);
        echec.setCategorie(Cat1);
        System.out.println("Vous avez interverti les catégories des deux jouets :\n");
        barbie.affiche();
        echec.affiche();
    }
}
    if (choix==4){
        System.out.println("Vous avez quitté le programme !");
    }
}
}
    
/*int nouvPrix = barbie.getPrix() * pourc;
        barbie.setPrix(nouvPrix);
        System.out.println("Le nouveaux prix de la poupée barbie est : \n" + barbie.getPrix());
        */