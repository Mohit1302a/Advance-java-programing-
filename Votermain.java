package java9;

import java.util.*;
interface voter{
void CheckVoter(int age);
}                    
public class Votermain{
public static void main(String[]args){
voter v = (age)-> {
if (age>18){
System.out.println("vote");
}
else{
System.out.println("no");
}
} ;
v.CheckVoter(20);
}
}