/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Dziekanat;

import java.util.HashMap;

/**
 *
 * @author Pavel
 */
public class SchRegister {

    private String subject; //przednioty
    private HashMap<Integer, Integer[]> grades; //id studenta, tablica ocen

    public SchRegister(String subject) {
        this.subject = subject;
        this.grades = new HashMap<Integer, Integer[]>();
    }

}
