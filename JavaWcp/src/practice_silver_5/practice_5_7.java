package practice_silver_5;

public class practice_5_7 {
	/*
	 * コンパイルエラーとなる。何故なら初期化子がでた時は、要素数が勝手に計算されるためである。にもかかわらず、new int[2]と要素数を指定しているため
	 * int [] a = new int[2] {2, 3 };
	*/
	
	// これはjava sileverの問題ではコンパイルエラーにならない
	int[] d;
	d = new int[]{};
	
	int[][] a = new int[][]{};
	/*
	 * 初期化子のみを使用する際は、初期化式の形にしておくことが必要。
	 * int e[];
	 * e = {2, 3};
	 */

	// newがあれば、初期化式の形ではなくても、初期化子は使用できる。
	
	
	
}