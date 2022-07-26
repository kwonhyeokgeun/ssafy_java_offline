package basic;

public class Basic_Array_ZigZag {
	
	public static void main(String[] args) {
		int [][] intArray = 
	        { { 1, 2, 3, 4, 5 },
	          { 6, 7, 8, 9,10 },
	          {11,12,13,14,15 },
	          {16,17,18,19,20 },
	          } ;
		{//대각선 올라감
			int col = intArray[0].length;
			int row = intArray.length;
			int line = row+col-1;
			
			int r=0;
			int c=0;
			
			for(int i=0; i<line; i++) {
				r=i;
				c=0;
				if(i>=row) {
					r=row-1;
					c=i-row+1;
				}
				while(true) {
					if(r<0 || c>col-1) {
						System.out.println();
						break;
					}
					System.out.printf("%3d",intArray[r][c]);
					r--;
					c++;
				}
			}
		}
		{ //대각선 지그재그 왼쪽아래에서 오른쪽위로 다시 오른쪽위에서 왼쪽아래로 반복
			int col = intArray[0].length;
			int row = intArray.length;
			int line = row+col-1;
			
			int r=0;
			int c=0;
			
			for(int i=0; i<line; i++) {
				if(i%2==0) {
					r=i;
					c=0;
					if(i>=row) {
						r=row-1;
						c=i-row+1;
					}
					while(true) {
						if(r<0 || c>col-1) {
							System.out.println();
							break;
						}
						System.out.printf("%3d",intArray[r--][c++]);
					}
				}else {
					r=0;
					c=i;
					if(i>=col) {
						r=i-col+1;
						c=col-1;
					}
					while(true) {
						if(c<0 || r>row-1) {
							System.out.println();
							break;
						}
						System.out.printf("%3d",intArray[r++][c--]);
					
					}
				}
			}
		}
	
	}

}
