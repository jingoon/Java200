package book.home_075;

public class ArryMouse {
	
	public static void main(String[] args) {
		
		int[][] m= mouse(1,1,1);
		printArr(m, " ", "¡Ü");

	}
	
	public static int[][] mouse(int arrSizeX, int arrSizeY, int startPint) {
		int arr[][] = new int[arrSizeY][arrSizeX];
		int x = startPint;
		if(arrSizeX<25 || arrSizeY<30 ) {
			arr = new int[30][25];
		}
		if(x<0) {
			x = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			
				if(
						(i==x+0 && (j>6&&j<10)) ||
						(i==x+1 && ((j>0&&j<8) || j==9))||	
						(i==x+2 && (j==1 || j==9 ||j ==10))	||
						(i==x+3 && (j==2 || j==6 ||j ==10))	||
						(i==x+4 && (j==2 || j==10))	||
						(i==x+5 && (j==3 || j==10 ||j ==11))	||
						(i==x+6 && ((j>11&&j<16) || j==4))	||
						(i==x+7 && (j==5 || j==16))	||
						(i==x+8 && (j==5 || j==17))	||
						(i==x+9 && (j==6 || j==18))	||
						(i==x+10 && (j==7 || j==19))	||
						(i==x+11 && (j==8 || j==20))	||
						(i==x+12 && (j==7 || j==20))	||
						(i==x+13 && (j==7 || j==9 || j==10 || j==20))	||
						(i==x+14 && (j==6 || j==9 || j==10 || j==21))	||
						(i==x+15 && (j==5 || j==8 || j==10 || j==21))	||
						(i==x+16 && (j==10 || j==21 || ( j>3 && j<8 )))	|| 	
						(i==x+17 && (j==11 || j==21))	||
						(i==x+18 && (j==11 || j==21))	||
						(i==x+19 && (j==10 || j==21))	||
						(i==x+20 && (j==9 || j==21))	||
						(i==x+21 && (j==20	|| ( j>7 && j<15 )))	||
						(i==x+22 && (j==21 || j==22	|| ( j>14 && j<19 )))||
						(i==x+23 && (j==23))	||
						(i==x+24 && (j==23))	||
						(i==x+25 && (j==23))	||
						(i==x+26 && (j==23	|| ( j>15 && j<19 )))	||
						(i==x+27 && ( j>18 && j<23 ))	
						) {
					arr[i][j]=1;
				}
			}
		}
		return arr;
	}
	
	public static void printArr(int [][]arr, String space, String point) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] ==0) {
					System.out.print(space+" ");
				}else if(arr[i][j] ==1) {
					System.out.print(point+" ");
				}
			}
			System.out.println();
		}
	}

}
