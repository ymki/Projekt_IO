/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Dziekanat;

/**
 *
 * @author Pavel
 */
public class Short_ID {

    public String ID_K(String value) {
        int n = 6;
        char[] val = value.toCharArray();
        char[] ID = new char[n];
        for (int i = 0; i < n; i++) {
            ID[i] = val[i];
        }
        return String.valueOf(ID);
    }
    
    // ***************************************************************************
    //                      DODATKOWE FUNKCJE OD MICHAŁA K
    // ***************************************************************************
    
}
