public class IntergerToRomanConveter {

	public static String toRoman(int x){
		//Arrays of integer value and roman symbol;
		int[] baseInt = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String[] romanSym ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		
		//Store the result:
		StringBuilder sb = new StringBuilder();
		
		//Loop from the right side to find the largest smaller base value.
		int i = baseInt.length - 1;
		System.out.println(i);
		while(x>0){
			System.out.println("Base Int: "+baseInt[i]);
			int div = x/baseInt[i];
			System.out.println("base: "+div);
			while(div>0){
				sb.append(romanSym[i]);
				System.out.println("Roman symbol: "+sb.toString());
				div--;
			}
			//Repeat the process for remainder.
			x = x%baseInt[i];
			i--;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int x= 3498;
		System.out.println("Integer value:["+x+"] is Roman: "+toRoman(x));

	}

}
