public class App  extends R {
	public static void main(String[] args) {
   		 R s=new R();
    System.out.println(s.boy_filePathString);
    System.out.println(s.girl_filePathString);
    
    for (int row=0;row<s.array2d.length;row++){
        for (int column=0;column<s.array2d[row].length;column++){
            System.out.print(s.array2d[row][column]+" ");
        }
        System.out.println();
    }
}
}
