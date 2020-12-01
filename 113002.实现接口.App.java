public class App implements R {
	public static void main(String[] args) {
		System.out.println(R.boy_filePath);
		System.out.println(R.girl_filePath);
		
		for (int cow = 0; cow < R.array2d.length; cow++) {
			for (int colunm = 0; colunm < R.array2d[0].length; colunm++) {
				System.out.print(R.array2d[cow][colunm]+" ");
	}
	System.out.println();
}}}
