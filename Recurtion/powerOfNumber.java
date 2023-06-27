package Recurtion;

import java.math.BigInteger;

public class powerOfNumber {

    public static BigInteger pow(BigInteger base , int exponent){
        if(exponent == 0) return BigInteger.valueOf(1);
        if(exponent == 1) return base;
        else{
            BigInteger result = pow(base , exponent/2);
            result = result.multiply(result);
            if(exponent % 2 == 0) return result;
            else return base.multiply(result);
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(BigInteger.valueOf(2),644));
    }
}
