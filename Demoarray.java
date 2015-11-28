package progrmatv;

public class Demoarray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int [5];
	    int [] ar1=ar;
	    ar1[0]=10;
	    
	    System.out.println("val: "+ar[0]);
	    System.out.println("val1: "+ar1[0]);
	    
	    int val1=10;
	    int val2=val1;
	    val1=100;
	    System.out.println(val2);


	}

}



