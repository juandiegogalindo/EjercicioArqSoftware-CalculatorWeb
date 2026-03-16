/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author jdgal
 */
@Stateless
public class calcbean implements caculatorLocal {
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }

    @Override
    public Integer resta(int a, int b) {
        return (a-b);
    }

    @Override
    public Integer multiplicar(int a, int b) {
        return (a*b);
    }

    @Override
    public Integer dividir(int a, int b) {
        if (b == 0){
            return 0;
        }
        return (a/b);
    }

    @Override
    public Integer modulo(int a, int b) {
        return (a%b);
    }

    @Override
    public Integer elevado(int a) {
        return (a*a);
    }
}
