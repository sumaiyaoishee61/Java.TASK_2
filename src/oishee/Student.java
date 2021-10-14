package oishee;

public class Student {

    String name;
    int id ;
    static String universityName="Leading University";

    Student()
    {
        System.out.println("Details");
    }

   Student( int id)
  {

      this.id = id;
     System.out.println( "ID is:" +id);
    }

    Student(String name, int id)
    {
        this.name = name;
        this.id = id;

        System.out.println("Name is: "+name+", ID is: "+id);
    }



    void display()
    {
        System.out.println("University: "+universityName);
    }

}
/*
    Name : Sumaiya Tasnim Oishee
    ID :2012020161
    Sec: 53(D)
    Email :  cse_2012020161@lus.ac.bd
    Date : 07.08.2021
 */