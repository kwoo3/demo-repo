public class HelloNumbers {
    public static void main(String[] args) {
        int x[] = {0,1,2,3,4,5,6,7,8,9};
        int[] cumsum = new int[x.length];
        for (int i = 1; i < cumsum.length; i++) 
            cumsum[i] = cumsum[i-1] + x[i];
        for (int i = 0; i < cumsum.length; i++)
        	System.out.print(cumsum[i]+" ");
       
    }
}