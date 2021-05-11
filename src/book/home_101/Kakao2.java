package book.home_101;

public class Kakao2 {
	public static void main(String[] args) {
		Kakao2 s = new Kakao2();
		String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
				{"PXOPX", "OXOXP", "OXPXX", "OXXXP", "POOXX"},
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		s.solution(places);
		
	}
	public int[] solution(String[][] places) {
        int[] answer = {};
              
        int i=0;
        for(int a=1;a<places.length-1;a++) {
        	for(int b=1; b<places[a].length-1;b++) {
        		if (places[a][b].equalsIgnoreCase("P")) {
                
                	// 좌우
                	if(one(places, a,b)){
                		answer[i]=0;
                	//상하
                	}else if(two(places, a, b)) {
                		answer[i]=0;
                	}else if(three(places, a, b)) {
                		//대각선 좌
                		answer[i]=0;
                	}else if(four(places, a, b)) {
                		//대각선 우
                		answer[i]=0;
                	}
                }
        		i++;
        	}
        }
        
        for(int k=0;k<answer.length;k++) {
        	System.out.print(answer[k]+",");
        }
        
        return answer;
    }
	
	public boolean one(String[][] places, int a, int b) {
		boolean temp= false;
		if(places[a][b+1].equalsIgnoreCase("P")||places[a][b-1].equalsIgnoreCase("P")) {
			temp= true;
    	}
		return temp;
	}
	public boolean two(String[][] places, int a, int b) {
		boolean temp= false;
		if(places[a-1][b].equalsIgnoreCase("P")&&places[a+1][b].equalsIgnoreCase("P")) {
			temp= true;
    	}
		return temp;
	}
	public boolean three(String[][] places, int a, int b) {
		boolean temp= false;
		if(places[a-1][b-1].equalsIgnoreCase("P")) {
			if(places[a-1][b].equalsIgnoreCase("X")&&places[a][b-1].equalsIgnoreCase("X")) {
				temp= true;
			}
			
    	}else if(places[a+1][b+1].equalsIgnoreCase("P")) {
    		if(places[a+1][b].equalsIgnoreCase("X")&&places[a][b+1].equalsIgnoreCase("X")) {
				temp= true;
			}
		}
		return temp;
	}
	public boolean four(String[][] places, int a, int b) {
		boolean temp= false;
		if(places[a+1][b-1].equalsIgnoreCase("P")){
			if(places[a+1][b].equalsIgnoreCase("X")&&places[a][b-1].equalsIgnoreCase("X")) {
				temp= true;
			}
    	}else if(places[a-1][b+1].equalsIgnoreCase("P")) {
    		if(places[a-1][b].equalsIgnoreCase("X")&&places[a][b+1].equalsIgnoreCase("X")) {
				temp= true;
			}
    	}
		return temp;
	}
}
