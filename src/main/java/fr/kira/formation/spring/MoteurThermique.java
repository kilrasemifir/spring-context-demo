package fr.kira.formation.spring;

import org.springframework.stereotype.Component;

@Component
public class MoteurThermique  implements Moteur{

    @Override
    public String toString() {
        return "Moteur thermique";
    }
}
