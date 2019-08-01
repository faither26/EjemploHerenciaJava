package main;

import static constantes.TemperaturaStrings.*;
import convercion.TemperaturaLogica;


import javax.swing.*;

public class Main {
    public static void main (String[] arg){
        TemperaturaLogica temperaturaLogica = new TemperaturaLogica();

        String valorTemperatura = JOptionPane.showInputDialog(null,
                C4.getRecivir());




        temperaturaLogica.setCentigrados(Double.parseDouble(valorTemperatura));

        JOptionPane.showMessageDialog(null, C1.getRecivir() +temperaturaLogica.getCentigrados()+C2.getRecivir()+temperaturaLogica.calcularTemperaturaFarenheit()+C3.getRecivir());
    }

}
