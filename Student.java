public  class Student {

    
   
   // attributes 

  public  String name;
  public  int id;
  public  int age;
  public  int nos;


// default ctor or construtor  // att.->garbage  // default me bahut code likhna padta h isliye hm parameterized construtor ka used karenge like this 
public Student () {
  System.out.println("student construtor used ");
}

// parameterized construtor 
public Student(int id, int age,int nos,String name){
  System.out.println("this is parameterized construtor");

  this.id = id;  // why used this ?  // because of same name of parameter and attribute we use this keyword to differentiate between them 
this.age = age;
this.nos = nos; // this keyword aapko current object ke reference ko point karta h  // this keyword se aap current object ke reference ko access kar sakte h
this.name = name;

}

// copy construtor or copy ctor dusre ka copy kar leta h


public Student(Student srcjor){
  System.out.println("Student copy ctor called ");

  this.id = srcjor.id;  // why used this ?  // because of same name of parameter and attribute we use this keyword to differentiate between them 
this.age = srcjor.age;
this.nos = srcjor.nos; // this keyword aapko current object ke reference ko point karta h  // this keyword se aap current object ke reference ko access kar sakte h
this.name = srcjor.name;

}



// method / behaviour 

  public void  study (){
    System.out.println(name + " studying ");
 
  }

  public void bunk () {
    System.out.println(name +" Bunking ");
  }

  public void sleep () {
    System.out.println(name +" sleeping");
  }
   
   
   
   
   
   
   
   
   
   
   
      
}
