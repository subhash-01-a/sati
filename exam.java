//to efer current class instance  variable
class student{
int age;
String name;

student(String name,int age)
{
this.name=name;
this.age=age;

}

 void display(){
 System.out.println("name"+this.name+"age"+this.age);
 }
 }
 
 }
 public class exam
 {
 public static void main(String[]args)
 {
 student s=new student("Reshma",18);
 
 s.display();
 }
 }
