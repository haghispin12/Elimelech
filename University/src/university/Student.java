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
public class Student extends Person{
    
  private int avg;

  public Student(int avg,String name,int age ,String cardid ){
      super(name,age ,cardid);
      this.avg=avg;
  }
  
public void printditails(){
    System.out.println(this.name);
    System.out.println(this.age);
    System.err.println(this.avg);
    System.err.println(this.cardid);
}


}
