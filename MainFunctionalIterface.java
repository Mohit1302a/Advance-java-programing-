package java8;

import java.util.*;
interface Calc{

void calculator(int n1, int n2); //0)->{}
}
 public class MainFunctionalIterface {
 public static void main(String[]args){

Calc a1=(int n1, int n2)->{

// int num1=10, num2=30;


System.out.println("calc "+(n1+n2));

};

a1.calculator(23,56);

  }
}