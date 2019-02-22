package ankitaS;

import java.util.Scanner;

public class Assignment4_Q3 {
static Scanner scanner=new Scanner(System.in);
	String inputFromUser(){ // method to take any string from user
		System.out.println("Enter a string");
		
		return scanner.nextLine();
	}
	
	int charCountinString(String str,char ch){ //method to check count of a given character in a string
		
		int count=0;
		
		for(int index=0;index <str.length();index++){
			
			if(str.charAt(index) == ch){
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q3 Assignment4_Q3=new Assignment4_Q3();
		String str=Assignment4_Q3.inputFromUser();
		System.out.println("enter a character for which you want to check");
		char ch= scanner.next().charAt(0);
		int count=Assignment4_Q3.charCountinString(str,ch);
		System.out.println("In string '"+str+"' count of character '"+ch+"' is "+count);
	}

}
