import java.util.Scanner;

public class MyFrame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//���������� �������
		
		System.out.println("������� ���������� �����");
		int ColStrok = sc.nextInt();//��������� ���-�� �����
		System.out.println("������� ����� �����");
		int ColDliny = sc.nextInt();//��������� ����� �����
		String[] StrokaTexta = new String[ColStrok];//���������� ����������� ������� ���� String
		int i;
		
		for (i = 0; i < ColStrok; i++) {
		StrokaTexta[i] = sc.next();//�������� ������ ������������ � ��� ����������
		}
	}
}
