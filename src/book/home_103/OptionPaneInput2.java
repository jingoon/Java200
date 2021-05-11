package book.home_103;

import javax.swing.JOptionPane;

public class OptionPaneInput2 {
	
	static int[] mDia={
		JOptionPane.ERROR_MESSAGE,
		JOptionPane.INFORMATION_MESSAGE,
		JOptionPane.WARNING_MESSAGE,
		JOptionPane.QUESTION_MESSAGE,
		JOptionPane.PLAIN_MESSAGE
	};
	static String[] sDia= {
			"ERROR_MESSAGE",
			"INFORMATION_MESSAGE",
			"WARNING_MESSAGE",
			"QUESTION_MESSAGE",
			"PLAIN_MESSAGE"
	};

	
	static int[] mDis= {
		JOptionPane.YES_OPTION,
		JOptionPane.NO_OPTION,
		JOptionPane.CANCEL_OPTION,
		JOptionPane.OK_OPTION,
		JOptionPane.CLOSED_OPTION
	};
	static String[] sDis={
		"YES_OPTION",
		"NO_OPTION",
		"CANCEL_OPTION",
		"OK_OPTION",
		"CLOSED_OPTION"
	};
	
	public static void main(String[] args) {
		// 프로그램 시작, 각 메서드를 호출
		showMessageDialog();
		showConfirmDialog();
		showOptionDialog();
		System.exit(1);	// 콘솔에서 GUI를 써서 프로그램을 끝냄
		
	}
	
	public static void showMessageDialog() {
		//showMessageDialog(Component parentComponent, Object messagem, String title, int messageType);
		for(int i =0; i<mDia.length;i++) {
			JOptionPane.showInternalMessageDialog(null, sDia[i], sDia[i] ,mDia[i]); 
		}
	}
	
	public static void showConfirmDialog() {
		int num=0;
		//JOptionPane.showConfirmDialog(Component parentComponent, Object messagem, String title, int messageType);
		for(int i=0; i<mDis.length; i++) {
			num=JOptionPane.showConfirmDialog(null, sDis[i], sDis[i], mDis[i]);		}
	}
	
	public static void showOptionDialog() {
		// showConfirmDialog, showMessageDialog, showInputDialog를 모두 통합
		int num=0;
		// String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue)
		for (int i = 0; i < mDia.length; i++) {	//5
			for (int j = 0; j < mDis.length; j++) {	//5
				num=JOptionPane.showOptionDialog(null, "원하는 것을 선택하시오.", "Warning", mDis[j], mDia[i], null, sDis, sDis[j]);
				System.out.println(); //25가지
				
			}
		}
	}
	
	

}
