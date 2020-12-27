public class App {
public static void main(String[] args) {
	long result = 0;

    for(int i=1; i<2147483647; i=i+2) {

           result = result + i;

    }

System.out.println("result=" + result);
}

}
