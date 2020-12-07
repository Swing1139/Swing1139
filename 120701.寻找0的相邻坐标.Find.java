
package pac;

public class Find {
	void R_zero(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_zero("+j+","+i+")");
					break;
				}
			}
		}
	}
	
	void R_left(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_left("+(j-1)+","+i+")");
					break;
				}
			}
		}
	}
	
	void R_right(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_right("+(j+1)+","+i+")");
					break;
				}
			}
		}
	}
	
	void R_up(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_up("+j+","+(i-1)+")");
					break;
				}
			}
		}
	}
	
	void R_down(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_down("+j+","+(i+1)+")");
					break;
				}
			}
		}
	}
}
