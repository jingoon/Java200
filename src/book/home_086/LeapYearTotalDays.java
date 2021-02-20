package book.home_086;

public class LeapYearTotalDays {
	
	private int[] month= {31,28,31,30,31,30,31,31,30,31,30,31};		//����� �� �� ���� �ϼ�
	private int[] leapMonth= {31,29,31,30,31,30,31,31,30,31,30,31}; //������ �� �� ���� �ϼ�
	
	public int getTotalDays(int year) {
		int total=0;
		IfLeapYear2 leap = new IfLeapYear2();	// �ٸ�Ŭ���� ȣ��, ��ü����
		leap.setLeapYear(year);		// �ʵ� ����
		if(leap.isLeapYear()) {		// ���� �˻�
			for (int i : leapMonth) {	// �����̸� �����϶� �� ���� �ϼ��� ��� ���Ѵ�
				total+=i;
			}
		}else {
			for(int i : month){			// ������ �ƴϸ� ����϶� �� ���� �ϼ��� ��� ���Ѵ�
				total +=i;
			}
		}
		return total;
	}

}
