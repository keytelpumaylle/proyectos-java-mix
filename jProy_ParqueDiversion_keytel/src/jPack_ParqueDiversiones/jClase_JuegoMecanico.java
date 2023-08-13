/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jPack_ParqueDiversiones;

/**
 *
 * @author pc
 */
public class jClase_JuegoMecanico {
    //Creando las Instancias
    //propiedades tributos
    int Capacidad;
    int Ocupadas;
    String Tipo;
    double Entrada;
    
    //constructor
    public jClase_JuegoMecanico(){
        Capacidad = 15;
        Ocupadas = 0;
        Tipo = "";
        Entrada = 5.0;
    }
    
    //Implementando los metodos SET y GET
    //capacidad
    public int getCapacidad(){
        return Capacidad;
    }
    public void setCapacidad(int Capacidad){
        this.Capacidad = Capacidad;
    }
    
    //Ocupadas
    public int getOcupadas(){
        return Ocupadas;
    }
    public void setOcupadas(int Ocupadas){
        this.Ocupadas = Ocupadas;
    }
    
    //Tipo
    public String getTipo(){
        return Tipo;
    }
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    //Entrada
    public double getEntrada(){
        return Entrada;
    }
    public void setEntrada(double Entrada){
        this.Entrada = Entrada;
    }
    
    //Metodos Adicionales o Metodos de Orden
    //sillad libres o desocupadas
    public int getLibres(){
        int Libres;
        Libres = Capacidad - Ocupadas;
        return Libres;
    }
    public void setLibres(int Libres){
        int Ocu;
        Ocu = Capacidad - Libres;
        Ocupadas = Ocu;
    }
    
    //Porcentaje
    public double getPorcentaje(){
        double por;
        por=(double)Ocupadas/(double)Capacidad*100.00;
        return por;
    }
    
    //Ingresos
    public double getIngresos(){
        double Ingresos;
        Ingresos = Ocupadas * Entrada;
        return Ingresos;
    }
    
    //Metodos de Orden 
    //Vaciar
    public void Vaciar(){
        Ocupadas = 0;
        Tipo ="";
        
    }
    
    //Entrar al Juego - EntrarUno
    public void EntraUno(){
        Ocupadas ++;
    }
}
