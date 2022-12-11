public class sumofarray {

    public static int sum(int input[]) {
        int output;
		if(input.length==1)
		{
			return input[0];

		}
		int small[]=new int[input.length-1];
		for(int i=0;i<input.length-1;i++)
		{
			small[i]=input[i];

		}
		 output=input[input.length-1]+sum(small);
		return output;

        

		
		
	}
    public static void main(String[] arg)
    {
        
        int input[]={7,4,9,11,-3};
        System.out.println(sum(input));
        
    }
    
    
}
