package Kim;

import java.util.Arrays;

public class Kim {
	
	public static void main(String[] args) {
		
		String [] seoul = {"JEni","Kim"};
		
		System.out.println(solution(seoul));
	}
	
	
	public static String solution(String[] seoul) {
        
		// 김서방의 위치를 반환할 변수
		int n = 0;
		
		// 김서방 찾기
		for(int i=0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				n = i;
				break;
			}
		}
		
		String answer = "김서방은 "+n+"에 있다";
                
        return answer;
    }
	
	
	// 다른 풀이
	public class FindKim {
	    public String findKim(String[] seoul){
	        //x에 김서방의 위치를 저장하세요.
	        int x = Arrays.asList(seoul).indexOf("Kim");

	        return "김서방은 "+ x + "에 있다";
	    }

	    // 실행을 위한 테스트코드입니다.
	    /*
	    public static void main(String[] args) {
	        FindKim kim = new FindKim();
	        String[] names = {"Queen", "Tod","Kim"};
	        System.out.println(kim.findKim(names));
	    }
	    */
	}

}
