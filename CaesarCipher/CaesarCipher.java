
import java.util.Scanner;
public class CaesarCipher {

	public static void main(String[] args){
		String cip = CaesarCipher.encrypt();
	    //CaesarCipher.decrypt(cip);
	}

	// Caesar Encryption Function
		private static String encrypt() {
		char chars[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','(',')','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','+','-','*','/','[',']','{','}','=','<','>','?','_'};
	    String empty = "empty";
		    Scanner input = new Scanner(System.in);
			System.out.println("Enter the plaintext");
		    String plainText = input.nextLine();
		    String cipher = null;
		    char[] plain = plainText.toCharArray();

		    for(int i = 0;i<plain.length;i++){
		        for(int j = 0 ; j<85;j++){
		            if(j<=80){
		                if(plain[i]==chars[j]){
		                    plain[i] = chars[j+5];
		                    break;
		                }
		            }//End nested If
		            else if(plain[i] == chars[j]){
		                plain[i] = chars [j-81];
		            }  //End else
		         } //End nested for loop
		      } //End of For loop
		     cipher = String.valueOf(plain);
			 System.out.println(" cipher text is "+cipher);
			 Scanner in = new Scanner(System.in);
			 System.out.println("To Decrypt plaintext enter 1");
			 int choice = in.nextInt();
			 if(choice == 1){
				 return cipher;
			 }
			 else{
				 System.out.println("Thank you");}

			 return empty;
		   }
    }
