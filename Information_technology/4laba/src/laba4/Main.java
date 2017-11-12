package laba4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//���������� �������
		System.out.println("������� ���������� �����");
		int ColStrok = sc.nextInt();//��������� ���-�� �����
		System.out.println("������� ����� �����");
		int ColDliny = sc.nextInt();//��������� ����� �����
		String[] StrokaTexta = new String[ColStrok];//���������� ����������� ������� ���� String
		int[][] TextInt = new int[ColStrok + 1][ColDliny];//���������� ���������� ������� ���� int
		int[][] CountInt = new int[ColStrok][ColStrok];//���������� ����������� ������� ���� int ��� �������� ��������
		int[][] CountInt2 = new int[ColStrok][ColStrok];//���������� ����������� ������� ���� int ��� �������� �������
		int i, j,h,g=-100, y = -100;

		char[] CharStroka;
		for (i = 0; i < ColStrok; i++) {
			System.out.println("������� �����");
			StrokaTexta[i] = sc.next();//�������� ������ ������������ � ��� ����������
			if (StrokaTexta[i].length() > ColDliny || StrokaTexta[i].length() < ColDliny) {//�������� ��������� �� ����� �����
				System.out.println("������,������������ ����� �����");
				int wait = sc.nextInt();
			}
			CharStroka = StrokaTexta[i].toCharArray();//String->Char
			for (j = 0; j < ColDliny; j++) {
				TextInt[i][j] = Character.getNumericValue(CharStroka[j]);//Char->Int �����������
			}
		}
		for (h = 0; h < ColStrok; h++) {
		for (i = 0; i < ColStrok; i++) {
			for (j = 0; j < ColDliny; j++) {
				if (i==h) {//�������� ����� ������ �� ����������� � "������ ��������"(���������)
					//System.out.println("ERROR: ========��������� ������ �� ��������� ���������� �����========");
					break;
				}

				if (TextInt[h][j] != TextInt[i][j]) {//�������� �� ��������
					CountInt[h][i] += 1;
					System.out.println("LOG:        �������� �     " + (h+1) + " ������ " + " �� ������� "+(i+1)+ " � ������� "+ (j + 1) );//����������� � ���������� ��������
				} else {
					CountInt2[h][i] += 1;
					System.out.println("LOG:        �������� ��� � " + (h+1) + " ������ " + " �� ������� "+(i+1)+ " � ������� "+ (j + 1) );//����������� � ���������� ��������
				}
			}


		
		if (CountInt[h][i] > y) {//������ ������� ��������
			y = CountInt[h][i];
		}
		if (CountInt2[h][i] > g){//������ ������� �������
			g = CountInt2[h][i];
		}
		}
		}
		System.out.println("����������� �������� ����:" + y);
		System.out.println("������������ ������� ����:" + g);
	}
}
