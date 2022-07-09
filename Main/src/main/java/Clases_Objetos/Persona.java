package Clases_Objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Calderón Bermudo
 */
public class Persona {
//Atributos

    int DNI;
    String Nombre;
//Metodo

    public void LeerDatos() {
        Persona persona1 = new Persona();
        DNI = Integer.parseInt(JOptionPane.showInputDialog("Digite el DNI: "));
        Nombre = JOptionPane.showInputDialog("Digite el nombre: ");
    }
}
