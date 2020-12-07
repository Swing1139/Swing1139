package pac;

public class Find {
             void findzero(int array2d[][]){
	for (int row=0;row< array2d.length;row++){
	for (int column=0;column<array2d[0].length;column++){
	if (array2d[row][column]==0){
                System.out.println("R_zero("+column+","+row+")");
	    }
    }
  }
 }
}
