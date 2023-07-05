package org.example;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Object[] options = { "Convertir divisas", "Conversor de Temperatura", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "Seleccione la opcion deseada", "Convertir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Peso mexicano a Euros", "Peso mexicano a Dolares", "Peso mexicano a Libras Esterlinas", "Peso mexicano a Yen",
                        "Peso mexicano a Won" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opcion:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos mexicanos: ");
                double mxn;
                try {
                    mxn = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido.");
                    return;
                }

                if (cambio.equals("Peso mexicano a Dolares")) {
                    double dollars = mxn / 17.06;
                    JOptionPane.showMessageDialog(null,
                            mxn + " pesos mexicanos son " + FormatearDecimal.format(dollars) + " dolares.");
                } else if (cambio.equals("Peso mexicano a Euros")) {
                    double euros = mxn / 18.62;
                    JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos son " + euros + " euros.");
                } else if (cambio.equals("Pesos mexicano a Libras Esterlinas")) {
                    double pounds = mxn /21.65;
                    JOptionPane.showMessageDialog(null,
                            mxn + " pesos mexicanos son " + pounds + " libras esterlinas.");
                } else if (cambio.equals("Peso mexicano a Yen")) {
                    double yen = mxn / 0.12;
                    JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos son " + yen + " yenes japoneses.");
                } else if (cambio.equals("Peso mexicano a Won")) {
                    double won = mxn / 0.013;
                    JOptionPane.showMessageDialog(null, mxn + " pesos mexicanos son " + won + " wones surcoreanos.");
                }

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }

        }
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion de conversion:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + resultado + " grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿ Deseas continuar usando el programa  ?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
