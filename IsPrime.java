package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int i,m=0,p=0;
		int n=13;
		m=n/2;
		if(n==0||n==1)
		{
		System.out.println(n+" is not a prime number.");
		}
		else{
		for(i=2;i<=m;i++){
		if(n%i==0){
		System.out.println(n+" is not a prime number.");
		p=1;
		break;
		}
		}
		if(p==0)
		{ System.out.println(n+" is a prime number."); 
		}
		}
	}
}

