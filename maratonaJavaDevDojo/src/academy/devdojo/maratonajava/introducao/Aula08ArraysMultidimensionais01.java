package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {

	public static void main(String[] args) {
		
		int [][] dias = new int [3][3];
		
		dias[0][0] = 28;
		dias[0][1] = 29;
		dias[0][2] = 30;
		
		
		dias[1][0] = 31;
		dias[1][1] = 8;
		dias[1][2] = 9;
		
		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[0].length; j++) {
				
				System.out.println(dias[i][j]);
			}
			
		}
		System.out.println("USANDO FOREACH PRA PERCORRER ARRAYS");
		for (int[] arrBase : dias) {
			for(int num : arrBase) {
				System.out.println(num);
			}
		}
	}

}
