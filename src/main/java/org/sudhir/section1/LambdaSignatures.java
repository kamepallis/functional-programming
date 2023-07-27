package org.sudhir.section1;

public class LambdaSignatures {

    public static void main(String ar[]) {

    /**
     * No Argument no return Lambda
     */
    MyFunctionalInterface fun1 = () -> System.out.println("NO Arg No Return");

    /**
     * NO Arg two parameter Lambda
     */
    MyFuncInter2 fun2 = (a, b) -> System.out.println("NO arg 2 Parameter Constructor"+ a + b);

    /**
     * Two arg and return type lambda
     */
    MyFuncIntr3 func3 = (a,b) -> {
        return a * b;
    };

    /**
     * Two arg and return type lambda
     */
    MyFuncIntr3 func4 = (a,b) -> {
        return a + b;
    };

    fun1.myMethod();
    fun2.method(2,3);
        func3.operation(3,4);
        func4.operation(5,6);
    }
}
