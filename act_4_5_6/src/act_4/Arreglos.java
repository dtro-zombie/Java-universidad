package act_4;

public class Arreglos {

	static boolean esSinRepetidos(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;

	}

	static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array[" + i + "] = " + array[i]);
		}
	}

	static int[] pegar(int[] arr, int[] arr2) {

		int arrDestino[] = new int[arr.length + arr2.length];

		System.arraycopy(arr, 0, arrDestino, 0, arr.length);
		System.arraycopy(arr2, 0, arrDestino, arr.length, arr2.length);

		return arrDestino;
	}

	static int[] agregarAlFinal(int[] arr, int elem) {

		int[] arrDestino = new int[arr.length + 1];
		System.arraycopy(arr, 0, arrDestino, 0, arr.length);
		arrDestino[arr.length] = elem;
		return arrDestino;
	}

	
		
		

	static int[] Sinrepetidos(int[] arr) {
		
		int[] array = new int[arr.length];
			

		 for(int i=0;i<arr.length-1;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]!=arr[j]){
	                    System.out.println("Elemento repetido: " + array[i]);
	                }
	            }

		
	}
		return array;
	

}

}