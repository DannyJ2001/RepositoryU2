/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author danny
 */
public class Visitante {

    
    public static void main(String[] args) {
        TargetaDescuento tarj1 = new TargetaDescuento();
        tarj1.setPrecio(1800);
        
        TargetaNormal tarj2 = new TargetaNormal();
        tarj2.setPrecio(1800);
        
        
        Descuento descuento = new Descuento();
        double resultado1 = tarj1.aceptar(descuento);
        double resultado2 = tarj2.aceptar(descuento);
        
        System.out.println("Valor a pagar con Descuento : " +resultado1);
        System.out.println("Valor a pagar sin Descuento : " +resultado2);
    }
    
}
