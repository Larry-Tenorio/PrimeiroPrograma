/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprograma;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        
        Date relogio = new Date ();
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println(loc.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A reolução do seu sistema é:" + d.width + "x" + d.height);
    }
    }
