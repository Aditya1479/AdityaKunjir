package CollectionsPackage.List;

public class Assignment74 {

	void verifyNumberIsPrime(int num){ // 17
		if(num<1){
			System.out.println("Invalid number");
		}else{
			boolean flag = true;
			for(int index=2;index<=num/2;index++){
				if(num%index==0){
					flag = false;
					System.out.println(num + " is not prime");
					break;
				}
			}
		
			if(flag){
				System.out.println(num + " is prime");
			}
		}
	}
	
	boolean verifyNumberIsPrime1(int num){ // 17
		boolean flag = true;
		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment74().verifyNumberIsPrime(17);
		boolean flagValue=new Assignment74().verifyNumberIsPrime1(17);
		if(flagValue=true) {
		System.out.println("It is prime Number");
		}else {
			System.out.println("its not prime number");
		}
		
	}

}
