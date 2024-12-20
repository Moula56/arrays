	package polymorohisms;
class Calculator{
	int add(int a,int b)
	{
		return  a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	float add(float a,int b)
	{
		return a+b;
		
	}
	double add(int a,double b,float c)
	{
		return a+b+c;
	}
	double add(float a,int b,double c)
	{
		return a+b+c;
		
	}
	double add(float a, double b, int c)
	{
		return a+b+c;
		
	}
}
public class methodoveride{
	 public static void main(String[]args) {
		 int a=10,b=20,c=30;
		 float a1=10.11f,b1=200.22f,c1=300.33f;
		 double a2=10.11,b2=200.22,c2=300.33;
		 Calculator s= new Calculator();
		 System.out.println(s.add(a,b));
		 System.out.println(s.add(a1,b));
		 System.out.println(s.add(a,b2,c1));


	}

}
