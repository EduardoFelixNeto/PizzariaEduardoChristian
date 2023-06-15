/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaria;

/**
 *
 * @author Eduardo
 */
public abstract class Forma {
    protected double area;
    
    public abstract double calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }    
}
