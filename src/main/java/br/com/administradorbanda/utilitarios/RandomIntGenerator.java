/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.utilitarios;

import java.util.Random;

/**
 *
 * @author renato
 */
public class RandomIntGenerator {
    public static int generate(){
        Random random = new Random();
        return random.nextInt(999999) + 1;
    }
}
