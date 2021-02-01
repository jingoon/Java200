package book.home_071;

public class MathOper {
	//소수점 셋째 자리에서 반올림하는 메서드 만들기
	// y = log10(a) = log(a)/log(10)

	
	public double banOlimAtNums(double d, int nums) {
		System.out.println("banOlimAtNums("+d+","+nums+")");
		System.out.print((int)(d*Math.pow(10, nums)+5)/10.0);
		System.out.print(" / "+Math.pow(10, nums-1));
		System.out.println();
		
		return ((int)((d*Math.pow(10, nums)+5) /10.0))/Math.pow(10, nums-1);
	}
	public double burimAtNums(double d, int nums) {
		return ((int)((d*Math.pow(10, nums))/10.0))/Math.pow(10, nums-1);	
	}
	public double OlimAtNums(double d, int nums) {
		return ((int)((d*Math.pow(10, nums)+10)/10.0))/Math.pow(10, nums-1);
	}
	public double abs(double n) {
		if(n>=0) {
			return n;
		}else {
			return -n;
		}
	}

}
