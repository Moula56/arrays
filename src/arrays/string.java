package arrays;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int count=0;
	String words="hello goog morning";
	for(int i=0;i<words.length();i++)
	{
		if(words.charAt(i)==' ')
		{
			count++;
		}
	}
	System.out.println(count+1);
	}
}
