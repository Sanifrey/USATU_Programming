package laba4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//объявление сканера
		System.out.println("Введите количество строк");
		int ColStrok = sc.nextInt();//сканируем кол-во строк
		System.out.println("Введите длину слова");
		int ColDliny = sc.nextInt();//сканируем длину слова
		String[] StrokaTexta = new String[ColStrok];//объявление одномерного массива типа String
		int[][] TextInt = new int[ColStrok + 1][ColDliny];//объявление двумерного массива типа int
		int[] CountInt = new int[ColStrok];//объявление одномерного массива типа int для счетчика различий
		int i, j, y = -100;

		char[] CharStroka;
		for (i = 0; i < ColStrok; i++) {
			System.out.println("Введите слово");
			StrokaTexta[i] = sc.next();//вводимая строка записывается в эту переменную
			if (StrokaTexta[i].length() > ColDliny || StrokaTexta[i].length() < ColDliny) {//проверка совпадает ли длина слова
				System.out.println("ошибка,неправильная длина слова");
				int wait = sc.nextInt();
			}
			CharStroka = StrokaTexta[i].toCharArray();//String->Char
			for (j = 0; j < ColDliny; j++) {
				TextInt[i][j] = Character.getNumericValue(CharStroka[j]);//Char->Int
			}
		}
		for (i = 0; i < ColStrok; i++) {
			for (j = 0; j < ColDliny; j++) {
				if (i + 1 == ColStrok) {//Проверка чтобы массив не сравнимался с "пустым массивом"(последним)
					break;
				}

				if (TextInt[i][j] != TextInt[i + 1][j]) {//Счетчик различий
					CountInt[i] += 1;
					System.out.println("Различие в" + (i + 1) + "строке" + (j + 1) + "символе");//Чисто для отладки и наглядного процесса, можно убрать
				} else {
					System.out.println("Различий нет");//Когда идёт проверка и различий не найдено
				}
			}
			if (CountInt[i] > y) {//ведётся счётчик различий
				y = CountInt[i];
			}

		}
		System.out.println("Максимально различий было:" + y);
	}
}
