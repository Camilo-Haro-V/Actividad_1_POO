package com.mycompany.ejercicio_4;

public class Ejercicio_4 {

    public static void main(String[] args) {
        double edalber, edmama, edana;
        double edjuan = 9;
        edalber = Edades.calcular_edalber(edjuan);
        edana = Edades.calcular_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edana, edalber);
                
        System.out.println("Las edades son: Alberto = " + edalber + " juan = " + edjuan + " Ana = " + edana + " Mama = " + edmama);

    }
}
