package io.javabrains;

public class MathUtils {
    private final double PI=Math.PI;
    public int add(int a,int b){
        return a+b;
    }
    public double computeCircleArea(double radius){
       return PI*(radius*radius);

    }
}
