

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    
    int num1 = Integer.parseInt(input[0]);
    int num2 = Integer.parseInt(input[1]);
    
    num2= num2-45;
    if(num1<24){
        if(num2<0) {
        	num2 +=60;
            num1--;
        }
         if(num1<0) {
        	num1=23;
        }
    }
    System.out.println(num1);
    System.out.println(num2);
	
    
	}
}
