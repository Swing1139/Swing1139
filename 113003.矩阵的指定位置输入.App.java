
import java.util.Scanner;

public class App implements R,S {
	public static void main(String[] args) {
    int array2d[][]=new int [10][10];
    try (Scanner scanner = new Scanner(System.in)) {
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int value=scanner.nextInt();
		
		array2d[row][column]=value;
	}
    
//输出
    for (int rowrow = 0; rowrow<array2d.length;rowrow++) {
    	 for (int columnnn = 0; columnnn<array2d.length;columnnn++) {
    		 System.out.print(array2d[rowrow][columnnn]+" ");
    	 }
    	 System.out.println();
    }
	}
}
