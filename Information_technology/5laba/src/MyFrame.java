import java.util.Scanner;

public class MyFrame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//объ€вление сканера
		
		System.out.println("¬ведите количество строк");
		int ColStrok = sc.nextInt();//сканируем кол-во строк
		System.out.println("¬ведите длину слова");
		int ColDliny = sc.nextInt();//сканируем длину слова
		String[] StrokaTexta = new String[ColStrok];//объ€вление одномерного массива типа String
		int i;
		
		for (i = 0; i < ColStrok; i++) {
		StrokaTexta[i] = sc.next();//вводима€ строка записываетс€ в эту переменную
		}
	}
}
