package Methods;
class Bank{
	int getRateOfInterest()
	{
		return 0;
	}
}	
class SBI extends Bank{
	int getRateOfInterest()
	{
		return 4;
	}
}
	class AXIS extends Bank{
		int getRateOfInterest()
		{
			return 8;
		}
	}
	class HDFS extends Bank{
		int getRateOfInterest()
		{
			return 7;
		}
	}
	class methodoverloading{
		public static void main(String[]args)
		{
			SBI b1=new SBI();
			AXIS b2=new AXIS();
			HDFS b3=new HDFS();
			System.out.println("the rate of interest of SBI is:"+b1.getRateOfInterest());
			System.out.println("the rate of interest of AXIS is:"+b2.getRateOfInterest());
			System.out.println("the rate of interest of HDFS is:"+b3.getRateOfInterest());
		
		}
	}





	
