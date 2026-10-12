package org.cuatrovientos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            characters.add(new Friend());
            characters.add(new Enemy());
        }

        Collections.shuffle(characters);

        for (int i = 0; i < characters.size(); i++) {
            Character character = characters.get(i);

            if (character instanceof Enemy enemy) {
                System.out.println("El personaje " + i + " es un enemigo! ¡Mátalo!");
                enemy.kill();
            } else if (character instanceof Friend) {
                System.out.println("El carácter " + i + " es un amigo!");
            }
        }
    }
}