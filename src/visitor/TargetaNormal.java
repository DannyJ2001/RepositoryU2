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
class TargetaNormal implements Visitable{
    
    private double precio;
    
    public double aceptar(Visitor visitor){
        return visitor.visit(this);
    }
    
    public double getPrecios(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio= precio;
    }
    
}
