//Convertidor de temperatura

package ejercicio4.clase1;

import javax.swing.JOptionPane;

public class Ejercicio4Clase1
{
    public static void main(String[] args)
    {
        double celsius, kelvin, fahrenheit;
        
        celsius=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la temperatura en grados Celsius (°C): "));
        
        kelvin=celsius+273.15;
        fahrenheit=(celsius*(9/5))+32;
        
        JOptionPane.showMessageDialog(null, "El valor de la temperatura en grados Kelvin es: "+kelvin+"°K" +
                                            "\nEl valor de la temperatura en grados Fahrenheit es: "+fahrenheit+"°F");
    }    
}