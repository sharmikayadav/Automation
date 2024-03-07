package Oops;
    class Animal{
    	void eat() {
    		System.out.println("Animal is eating");
    		
    	}
    }
       class dog extends Animal{ 
    	   void bark( ) {
    		   System.out.println("dog is barking");
    	   }
       }
public class Inheritance {

	public static void main(String[] args) {
	dog obj=new dog();
	obj.eat();
	obj.bark();
	}
	

}
