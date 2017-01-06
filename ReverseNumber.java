class ReverseNumber{
	public static void main(String str[]){
		int ans=0;
		int number = 123456;
	System.out.println("\n Original number :"+number);
		while(number!=0){
			int units = number % 10;
			ans = ans * 10 + units;
			number = number/10;
								
		}
	System.out.println("\n Reverse number :"+ans);
		
	}
}
