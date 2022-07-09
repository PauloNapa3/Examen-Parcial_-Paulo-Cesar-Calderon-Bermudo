/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Objetos;

/**
 *
 * @author Usuario
 */
public class Asientos {

    private int num;
    private boolean estado;
    private float precio;

    public Asientos(int num, float precio) {
    }


    public Asientos(int num, boolean estado, float precio) {
        this.num = num;
        this.estado = estado;
        this.precio = precio;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
