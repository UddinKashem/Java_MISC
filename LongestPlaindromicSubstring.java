package algorithom.solutions;

/*
 * Given a string s, find longest substring which is a plaindrome. 
 * If there are multiple answers, then find the first appearing substring.
 */
public class LongestPlaindromicSubstring {

	/*
	 * function to check if a substring
	 * s[low..high] is a palindrome.
	 */
	public static boolean checkPal(String s, int low, int high){
		while(low < high){
			if(s.charAt(low) != s.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	
	//Function to find the longest palindrome substring.
	public static String getLongestPal(String s){
		int n = s.length();
		
		//all substring of length 1 are palindromes.
		int maxLen = 1, start = 0;
		
		//nested loop to mark start and end index.
		for(int i = 0; i<n; i++){
			for(int j=i; j<n; j++){
				//check if the current substring is a palindrome.
				if(checkPal(s,i,j) && (j-i+1) > maxLen){
					start = i;
					maxLen = j - i +1;
				}
			}
		}
		return s.substring(start, start + maxLen);
	}
	
	public static void main(String[] args) {
		String s = "forgeeksskeegfor";
		System.out.println(getLongestPal(s));

	}

}
