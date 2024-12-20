package arrays;


      import java.io.*;
      class Bike 
      {
    	  void ride()
    	  {
    		  System.out.println("speed is 120");
    	  }
    	  }
      class Car extends Bike
      {
    	  void ride()
    	  {
    		  System.out.println("speed is 140");
    	  }
    	  }
      class MethodOverridingEx
      {
    	  public static void main(string args[])
      {
      Car c=new Car();
      Bike b=new Bike();
      c.ride();
       b.ride();
       Bike d=new Car();
       d.ride();
    	}
      }
