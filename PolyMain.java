package com.practice;
class Animal{
    String name;
    String sound;
    Animal(){
        this("cat1","");

    }
    void getInfo() {
		
	}
	Animal(String name,String sound){
        this.name=name;
        this.sound=sound;
    }
    void gatInfo(){
        System.out.println("Name="+name);
        System.out.println("sound="+sound);
    }
    void getInfo(String name,String sound,int legs){
        System.out.println("Name="+name);
        System.out.println("Sound ="+sound);
        System.out.println("Legs="+legs);
    }



}
class Cat extends Animal{
    Cat(String name,String sound){
        super(name,sound);

    }
    @Override
    void getInfo(){}



}

public class PolyMain {
    private static Cat c1;

	public static void main(String[] args) {
        Animal an1=new Animal("Horse","hingg");
        an1.getInfo("cat","meow",4);
        c1 = new Cat("Cat2","meow");


    }
}