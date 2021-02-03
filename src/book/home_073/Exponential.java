package book.home_073;


public class Exponential {

	public static void main(String[] args) {
		Exponential e = new Exponential();
		System.out.println(e.exp(1));
		System.out.println(e.cos(60*Math.PI/180.0) ); //¶óµð¾È
	}
	
	public double exp(double x) {
		double temp = 1;
		double sum=1;
		int count =20;
		for (int i = 0; i < count; i++) {
			temp*=(x)/i+1;
			sum+=temp;
		}
		return sum;
	}
	public double cos(double x) {
		double temp = 1;
		double sum=1;
		int count =20;
		int del = 1;
		for (int i = 0; i < count; i++) {
			int a =(i+1)%4;
			if(a==1 || a==3) {
				del=0;
			}else if(a==0) {
				del=1;
			}else if(a==2) {
				del=-1;
			}
			temp*=x/(i+1);
			sum+=temp*del;
			
		}
		return sum;
	}
	
}
