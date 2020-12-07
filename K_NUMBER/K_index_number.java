package K_NUMBER;

import java.util.Arrays;

public class K_index_number {
	
	public static void main(String[] args) {
	
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		// 배열 값 출력, 메서드 호출 밑 테스트값 넣기
		System.out.println(Arrays.toString(solution(array,commands))+" 결과값 ::::: ");
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        
		// 선언
		int[] answer = {};
		int[] answer2 = new int[commands.length];
		
		// commands 내부 숫자로 잘라서 복사
		//System.out.println(Arrays.deepToString(commands));
		
		for(int i=0; i < commands.length; i++) {
			
			for(int j=0; j < commands[i].length; j++) {
				
				if(j == 0) {
					// index는 0부터 시작이기 때문에 시작 인덱스는 -1 해준다 1부터 카운트 했기 때문
					answer = Arrays.copyOfRange(array, commands[i][j]-1, commands[i][j+1]);						
					Arrays.sort(answer);
					// System.out.println(Arrays.toString(answer));		
					answer2[i] = answer[commands[i][j+2]-1];
				} 
				
			}
			
		}    
        
        return answer2;
    }
	
	/*
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
	*/
}
