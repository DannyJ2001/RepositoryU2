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
public interface Visitor {

    public double visit(TargetaNormal normal);

    public double visit(TargetaDescuento descuento);

    
}
