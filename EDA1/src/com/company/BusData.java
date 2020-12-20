package com.company;

public class BusData {
private final int hora;
private final int minuto;
private int groap;

BusData(int horas, int minutos, int grupo) {
    this.hora = horas;
    this.minuto = minutos;
    this.groap = grupo;
}

public int getHora(){
        return this.hora;
}

public int getMinuto(){
        return this.minuto;
}

public int getGroap(){
        return this.groap;
}

public void setGroap(int newgrupo){
    this.groap = newgrupo;
}

@Override
public String toString(){

    return getHora() + ":" + getMinuto() + " Grupo " + getGroap() + " pessoas";
}

}