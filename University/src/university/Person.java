/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author user
 */
public class Person {
   
    protected String name;
    protected int age ;
    protected String cardid;
    
public Person(String name,int age ,String cardid ){
this.name=name;
this.age=age;
this.cardid=cardid;
}    
public void printDetails(){

    System.err.println(this.name);
    System.err.println(this.age);
}


}
