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
		int[] CountInt = new int[ColStrok];//���������� ����������� ������� ���� int ��� �������� ��������
		int i, j, y = -100;

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
				TextInt[i][j] = Character.getNumericValue(CharStroka[j]);//Char->Int
			}
		}
		for (i = 0; i < ColStrok; i++) {
			for (j = 0; j < ColDliny; j++) {
				if (i + 1 == ColStrok) {//�������� ����� ������ �� ����������� � "������ ��������"(���������)
					break;
				}

				if (TextInt[i][j] != TextInt[i + 1][j]) {//������� ��������
					CountInt[i] += 1;
					System.out.println("�������� �" + (i + 1) + "������" + (j + 1) + "�������");//����� ��� ������� � ���������� ��������, ����� ������
				} else {
					System.out.println("�������� ���");//����� ��� �������� � �������� �� �������
				}
			}
			if (CountInt[i] > y) {//������ ������� ��������
				y = CountInt[i];
			}

		}
		System.out.println("����������� �������� ����:" + y);
	}
}
