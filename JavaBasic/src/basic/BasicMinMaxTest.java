package basic;

public class BasicMinMaxTest {

	public static void main(String[] args) {
		{
			int a=3, b=5;
			int max=0;
			if(a > b) max = a;
			else max=b;
		}
		{
			int a=3, b=5;
			int max = a > b? a : b; 
		}
		{
			int a=3, b=5;
			int max= Math.max(a, b);
		}
		{
			int[] intArr = {9,1,3,5,7};
			int min = intArr[0];
			for (int i = 0; i < intArr.length; i++) {
				min = Math.min(min, intArr[i]);
			}
		}

	}

}
