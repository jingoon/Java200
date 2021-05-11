package book.home_101;

public class Kakao {
	public static void main(String[] args) {
		Kakao s = new Kakao();
		int ii= s.solution("12one3");
		System.out.println(ii);
	}
	public int solution(String s) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer();
        sb.append(s);
       
        boolean stop =true;
        int k =0;
        while(stop){
            
            if(eng(sb,k)){
                k++;   
            }else{
                if(sb.substring(k,k+2).equals("ze")){
                    sb.replace(k,k+4,"0");
                }else if(sb.substring(k,k+2).equals("on")){
                    sb.replace(k,k+3,"1");
                }else if(sb.substring(k,k+2).equals("tw")){
                    sb.replace(k,k+3,"2");
                }else if(sb.substring(k,k+2).equals("th")){
                    sb.replace(k,k+5,"3");
                }else if(sb.substring(k,k+2).equals("fo")){
                    sb.replace(k,k+4,"4");
                }else if(sb.substring(k,k+2).equals("fi")){
                    sb.replace(k,k+4,"5");
                }else if(sb.substring(k,k+2).equals("si")){
                    sb.replace(k,k+3,"6");
                }else if(sb.substring(k,k+2).equals("se")){
                    sb.replace(k,k+5,"7");
                }else if(sb.substring(k,k+2).equals("ei")){
                    sb.replace(k,k+5,"8");
                }else if(sb.substring(k,k+2).equals("ni")){
                    sb.replace(k,k+4,"9");
                }
                
                k++;
            }
            
            if(k>=sb.length()){
                stop= false;
            }
        }
        
       
        
        String s2= new String(sb);
        answer = Integer.valueOf(s2);
        
        
        
        return answer;
    }
	
	        
    private boolean eng(StringBuffer sb, int k){
       boolean eng= false;
        
        if(Character.isDigit(sb.charAt(k))){
            eng=true;
        }
        
        System.out.println(eng);
        return eng;
    }


}
