package ch1;
public class Ch1_Q1 {

	public static void main(String[] args) {
		String str="UTTAM";
		System.out.println(isUniq(str));
	}
	
	public static boolean isUniq(String str){
		if(str.length()>128) {
			return false;
		}
		
		boolean [] arr = new boolean [128];
		for(int i=0; i<str.length();i++) {
			
			int value = str.charAt(i);
			if(arr[value]) {
				return false;
			}
			arr[value]=true;
		}
		return true;
	}
}
