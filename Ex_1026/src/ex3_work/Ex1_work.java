package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//��� �˻� : song
		//[song]
		//����
		//�����
		//����
		
		//��� �˻� : aa
		//�ش� ����� ������ �����ϴ�
		
		String[][] actor = {{"[song]", "����", "�����", "����"}, 
					        {"[lee]", "��λ�", "����", "����"}, 
					        {"[ma]", "���˵���", "�̿������", "����Ȳ��"}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �˻� : ");
		String name = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < actor.length; i++ ) {
			
			if( actor[i][0].equals("["+name+"]") ) {
				//�̸��� ��ġ�ϴ� ��찡 �ִ� ���
				for( int j = 0; j < actor[i].length; j++ ) {
					System.out.println( actor[i][j] );
				}//inner
				
			}else {
				//�̸��� ��ġ�ϴ� ��찡 ���� ���
				cnt++;
				if( cnt == actor.length ) {
					System.out.println("����� ������ �����");
				}
			}
			
		}//outer
		
	}//main
}



















