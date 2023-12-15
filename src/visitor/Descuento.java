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
public class Descuento implements Visitor{
    private final double sinDescuento = 0.83;
    private final double conDescuento= 0.33;
    
    public double visit(TargetaNormal normal){
        return normal.getPrecios() * sinDescuento;
    }
    
    public double visit(TargetaDescuento descuento){
        return descuento.getPrecios() * conDescuento;
    }
    
}
