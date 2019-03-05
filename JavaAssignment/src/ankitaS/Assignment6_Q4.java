package ankitaS;

public class Assignment6_Q4 {

	void m2(){  //method that throws  Exception
		try{
		int num=10/0;
		System.out.println(num);
	}
		catch(ArithmeticException e ){
			System.out.println("Can`t divide by Zero.");
		}
		finally{
			System.out.println("Undefined");
		}
			try{
			Thread.sleep(100);
		}
			catch(Exception e){
				System.out.println("catched checked Exception in m2");
			}
			}
	
	
	void m1(){
		Assignment6_Q4 Assignment6_Q4= new Assignment6_Q4();
		Assignment6_Q4.m2();
		
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Assignment6_Q4 Assignment6_Q4= new Assignment6_Q4();
		Assignment6_Q4.m1();
		
	}

}
