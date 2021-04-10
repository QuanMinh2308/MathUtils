/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import util.MathUtil;

/**
 *
 * @author Admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tinh 5 giai thua = 120
        
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = "+result);
    }
    
}
