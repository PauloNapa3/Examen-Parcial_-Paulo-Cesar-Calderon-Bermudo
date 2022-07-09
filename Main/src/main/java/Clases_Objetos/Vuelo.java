/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Objetos;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Vuelo {
    private int num;
private int h_salida;
private int h_llegada;
private Date fecha_Salida;
private String destino;

    public Vuelo(int num, int h_salida, int h_llegada, Date fecha_Salida, String destino) {
        this.num = num;
        this.h_salida = h_salida;
        this.h_llegada = h_llegada;
        this.fecha_Salida = fecha_Salida;
        this.destino = destino;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setH_salida(int h_salida) {
        this.h_salida = h_salida;
    }

    public void setH_llegada(int h_llegada) {
        this.h_llegada = h_llegada;
    }

    public void setFecha_Salida(Date fecha_Salida) {
        this.fecha_Salida = fecha_Salida;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
