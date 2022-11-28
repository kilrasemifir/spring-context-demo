package fr.kira.formation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Voiture {

    private Moteur moteur;
    private String marque;

    @Autowired
    public Voiture(String marque, Moteur moteurElectrique) {
        System.out.println("Création d'une voiture de marque " + marque);
        this.marque = marque;
        this.moteur = moteur;
    }

    public Voiture(Moteur moteurThermique) {
        System.out.println("Nouvelle voiture");
        this.moteur = moteurThermique;
    }

    @Autowired
    public void foo(){
        System.out.println("foo");
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "moteur=" + moteur +
                '}';
    }
}
