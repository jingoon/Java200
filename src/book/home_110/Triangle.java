package book.home_110;

public class Triangle {
	// ���ﰢ��
	public double area(double x) {
		return Math.sqrt(3)/4.0*x*x;
	}
	
	// �̵ �ﰢ�� 1/2 * �غ� * ����
	public double area(double x, double y) {
		return 1.0/2.0*x*y;
	}
	
	// �� ���� �� �� ���̿� �� ��
	public double area(double x, double y, Radian radian) {
		double rad = radian.getRadian();
		return 1.0/2.0*x*y*Math.sin(rad);
	}
	
	// �� ���� �� �簢
	public double area(double x, Radian radian1, Radian radian2) {
		double rad1 = radian1.getRadian();
		double rad2 = radian2.getRadian();
		return 1.0/2.0*x*x*Math.sin(rad1)*Math.sin(rad2)/Math.sin(rad1+rad2);
	}
	
	// ����� ���� -- �� ���� ���̸� �� ��
	public double area(double x, double y, double z) {
		double s = (x+y+z)/2.0;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
}
