package main;

import java.util.Scanner;

public class Process {
	// ���� ������ ���� method
	public void Explain() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("ǲ���Ŵ����� ���Ű� ȯ���մϴ�. ���� ������ ���ðڽ��ϱ�?");
		System.out.println("1)����  2)�ǳʶڴ�");
		int loop = 0;
		while (loop == 0) {
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println(
						"=======================================================================================================");
				System.out.println("ǲ���Ŵ����� ������ ������ �Ǿ� ���� �̲��� �����Դϴ�. �� 3�θ��װ� �ְ� ó�� ������ 3�θ��׿��� �ϰ� �˴ϴ�.");
				System.out.println("3�θ��׿��� ����ϸ� 2�θ��׷� �°��ϰ� �ǰ� 1�θ��׸� ����ϰ� �Ǹ� ������ ����˴ϴ�.");
				System.out.println("3���ȿ� ���� ���׷� �°����� ���� �� ������ ������ �ǰ� ������ ����˴ϴ�.");
				System.out.println(
						"=======================================================================================================");
				System.out.println("����: ���� �� �������� �����ִ� �ɷ�ġ�Դϴ�.");
				System.out.println("�н�: ���� ����ű, ���Ƽű�� �������� �����ִ� �ɷ�ġ�Դϴ�.");
				System.out.println("����: ������� �� �������� �����ִ� �ɷ�ġ�Դϴ�.");
				System.out.println(
						"=======================================================================================================");
				loop++;
			} else if (choice == 2) {
				System.out.println("������� �ٷ� ������ �����մϴ�.");
				loop++;
			} else {
				System.out.println("1���� 2���߿� �������ּ���.");
			}
		}
	}
	
	// ������ �޴� ���ð��� �޴� method
	public int Menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �������ּ���.");
		System.out.println("1)�������  2)�� ����  3)��������  4)�����Ʒ�  5)��������");
		choice = sc.nextInt();
		return choice;
	}
	
	// ����� ����� �����ִ� method
	public int ViewResult(int result[][], String team1, String team2) {
		System.out.println("--------------��� ���--------------");
		System.out.println("          [" + team1 + "]  vs  [" + team2 + "]");
		System.out.println("��                   " + result[0][10] + "         " + result[1][10]);
		System.out.println("����                " + result[0][8] + "         " + result[1][8]);
		System.out.println("����                " + result[0][7] + "         " + result[1][7]);
		System.out.println("��Ŭ                " + result[0][9] + "         " + result[1][9]);
		System.out.println("1:1����           " + result[0][6] + "         " + result[1][6]);
		System.out.println("����ű              " + result[0][4] + "         " + result[1][4]);
		System.out.println("�������̵�        " + result[0][5] + "         " + result[1][5]);
		System.out.println("���Ƽű           " + result[0][3] + "         " + result[1][3]);
		System.out.println("����ī��           " + result[0][2] + "         " + result[1][2]);
		System.out.println("����ī��           " + result[0][1] + "         " + result[1][1]);
		System.out.println("VAR         " + result[0][0] + "         " + result[1][0]);
		System.out.println("------------------------------------");
		if(result[0][10]>result[1][10]) {
			System.out.println("����� ���� �¸��� �߽��ϴ�!!");
			System.out.println("���ڱ�  +1500����, ���� �ɷ�ġ [����+1] [�н�+1] [����+1]");
			return 2;
		}
		else if(result[0][10]==result[1][10]) {
			System.out.println("�̹� ��� ���ºη� ���� ���ϴ�.");
			System.out.println("���ڱ� +500����");
			return 1;
		}
		else {
			System.out.println("����� ���� �й踦 �߽��ϴ�.. ���� ������ �й����ּ���.");
			System.out.println("=================================================================================================================");
			return 0;
		}
	}
	
	
	public void StartText() {
		System.out.println("______                _    _             _  _  ___  ___                                        \r\n" + 
				"|  ___|              | |  | |           | || | |  \\/  |                                        \r\n" + 
				"| |_     ___    ___  | |_ | |__    __ _ | || | | .  . |  __ _  _ __    __ _   __ _   ___  _ __ \r\n" + 
				"|  _|   / _ \\  / _ \\ | __|| '_ \\  / _` || || | | |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '__|\r\n" + 
				"| |    | (_) || (_) || |_ | |_) || (_| || || | | |  | || (_| || | | || (_| || (_| ||  __/| |   \r\n" + 
				"\\_|     \\___/  \\___/  \\__||_.__/  \\__,_||_||_| \\_|  |_/ \\__,_||_| |_| \\__,_| \\__, | \\___||_|   \r\n" + 
				"                                                                              __/ |            \r\n" + 
				"                                                                             |___/             ");
	}
	
	public void Ending() {
		System.out.println("    _        _        _   _  _        _                              _        _     \r\n" + 
				" /\\| |/\\  /\\| |/\\    | | | |(_)      | |                          /\\| |/\\  /\\| |/\\  \r\n" + 
				" \\ ` ' /  \\ ` ' /    | | | | _   ___ | |_   ___   _ __  _   _     \\ ` ' /  \\ ` ' /  \r\n" + 
				"|_     _||_     _|   | | | || | / __|| __| / _ \\ | '__|| | | |   |_     _||_     _| \r\n" + 
				" / , . \\  / , . \\    \\ \\_/ /| || (__ | |_ | (_) || |   | |_| |    / , . \\  / , . \\  \r\n" + 
				" \\/|_|\\/  \\/|_|\\/     \\___/ |_| \\___| \\__| \\___/ |_|    \\__, |    \\/|_|\\/  \\/|_|\\/  \r\n" + 
				"                                                         __/ |                      \r\n" + 
				"                                                        |___/                       ");
	}
	
	public void GameOver() {
		System.out.println(" _____                           _____                              \r\n" + 
				"|  __ \\                         |  _  |                             \r\n" + 
				"| |  \\/  __ _  _ __ ___    ___  | | | |__   __  ___  _ __           \r\n" + 
				"| | __  / _` || '_ ` _ \\  / _ \\ | | | |\\ \\ / / / _ \\| '__|          \r\n" + 
				"| |_\\ \\| (_| || | | | | ||  __/ \\ \\_/ / \\ V / |  __/| |     _  _  _ \r\n" + 
				" \\____/ \\__,_||_| |_| |_| \\___|  \\___/   \\_/   \\___||_|    (_)(_)(_)\r\n" + 
				"                                                                    ");
	}
}
