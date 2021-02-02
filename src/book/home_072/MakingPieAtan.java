package book.home_072;

public class MakingPieAtan {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(new MakingPieAtan().nakayamaPie());
		System.out.println(new MakingPieAtan().gaussPie());
		System.out.println(new MakingPieAtan().dassePie());
	}
	public double nakayamaPie() {
		return 32*Math.atan(1./10)
				-4*Math.atan(1./239)
				-16*Math.atan(1./515);
	}
	public double gaussPie() {
		return 12*Math.atan(1./4)
				+4*Math.atan(1./20)
				+4*Math.atan(1./1985);
	}

	public double dassePie() {
		return 4*Math.atan(1./2)
				+4*Math.atan(1./5)
				+4*Math.atan(1./8);
	}
}
