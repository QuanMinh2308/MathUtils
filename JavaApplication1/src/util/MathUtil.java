/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //ham tinh n giai thua
    //0! bang 1! = 1;                                                           
    //21! se vuot kieu long, hon 18 con so 0 
    //nen t se khong che dau vao n tu 0 - 20
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid Argument. It must be between 0 - 20");
        if(n==0 || n==1) 
            return 1;
        //cho nay co 2 cach viet
        //cach 1 dung for
        //cach 2 dung de quy
        return n * getFactorial(n-1);
    }
    
}
