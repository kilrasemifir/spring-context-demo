package fr.kira.formation.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan("fr.kira.formation.spring")
public class Main {

    public Main() {
        System.out.println("Hello je suis une instance de la classe Main!!!");
    }

    public static void demo1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println("Avant le getBean");
        Main main = context.getBean(Main.class);
        System.out.println(main);
        Main main1 = context.getBean(Main.class);
        System.out.println(main1);
    }

//    @Bean
//    public static Voiture maTuture(){
//        return new Voiture();
//    }

    @Bean
    public String marque(){
        return "Peugeot";
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Voiture voiture = context.getBean( Voiture.class);
        System.out.println(voiture);
    }
}