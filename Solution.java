
public class Solution {
    public static int[] solution(String s) {
        int count = 0;
		int zeroToEmpty = 0;
		while(!s.equals("1")) {
			zeroToEmpty += s.length()-s.replaceAll("0", "").length();
			s.replaceAll("0", "");
			s = Integer.toBinaryString(s.length());
			count++;
		}
		int[] answer = new int[]{count,zeroToEmpty};
        return answer;
    }

	public static void main(String[] args){
		System.out.println(123);
	}
}