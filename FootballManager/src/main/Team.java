package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import player.Attacker;
import player.Defender;
import player.Gk;
import player.LegendAttacker;
import player.LegendDefender;
import player.LegendMidfielder;
import player.Midfielder;
import player.Player;

public class Team{
	String manager_name;
	int money = 20000;
	
	String team1;
	public String team2 = "õ��FC";
	public String team3 = "��õFC";
	public String team4 = "�ȵ�FC";
	public String team5 = "����FC";
	public String team6 = "���FC";
	public String team7 = "�λ�FC";
	public String team8 = "����FC";
	public String team9 = "����FC";
	public String team10 = "����FC";
	
	Gk �̼� = new Gk("�̼�", 10, 10, 10);
	Attacker ���� = new Attacker("����", 70, 10 , 10);
	Attacker ��Ʈ = new Attacker("��Ʈ", 70, 10 , 10);
	Attacker �ɷ� = new Attacker("�ɷ�", 70, 10 , 10);
	Midfielder �ȳ� = new Midfielder("�ȳ�", 12, 70, 11);
	Midfielder �׿� = new Midfielder("�׿�", 12, 70, 11);
	Midfielder ���� = new Midfielder("����", 12, 70, 11);
	Defender ���� = new Defender("����", 11, 11, 69);
	Defender ���� = new Defender("����", 11, 11, 69);
	Defender �ٹ� = new Defender("�ٹ�", 11, 11, 69);
	Defender �̿� = new Defender("�̿�", 11, 11, 69);
	LegendAttacker ��� = new LegendAttacker("���", 90, 90, 90, 1000);
	LegendMidfielder �ȷ� = new LegendMidfielder("�ȷ�", 90, 90, 90, 1000);
	LegendDefender ���� = new LegendDefender("����", 90, 90, 90, 1000);
	
	ArrayList<Player> team1_list = new ArrayList<Player>(Arrays.asList(�̼�, ����, ��Ʈ, �ɷ�, �ȳ�, �׿�, ����, ����, ����, �ٹ�, �̿�, ���, �ȷ�, ����));
	
	Gk �̹� = new Gk("�̹�", 20, 20, 20);
	Attacker ȣ�� = new Attacker("ȣ��", 72, 10 , 10);
	Attacker �ι� = new Attacker("�ι�", 72, 10 , 10);
	Attacker �ɶ� = new Attacker("�ɶ�", 72, 10 , 10);
	Midfielder ��� = new Midfielder("���", 12, 72, 11);
	Midfielder ���� = new Midfielder("����", 12, 73, 11);
	Midfielder ��Ƽ = new Midfielder("��Ƽ", 12, 73, 11);
	Defender ���� = new Defender("����", 11, 11, 72);
	Defender ���� = new Defender("����", 11, 11, 72);
	Defender �ٹ� = new Defender("�ٹ�", 11, 11, 73);
	Defender �̿� = new Defender("�̿�", 11, 11, 73);
	ArrayList<Player> team2_list = new ArrayList<Player>(Arrays.asList(�̹�, ȣ��, �ι�, �ɶ�, ���, ����, ��Ƽ, ����, ����, �ٹ�, �̿�));
	
	Gk �̴� = new Gk("�̴�", 25, 25, 25);
	Attacker ȣ�� = new Attacker("ȣ��", 74, 10 , 10);
	Attacker ���� = new Attacker("����", 74, 10 , 10);
	Attacker �ɷ� = new Attacker("�ɷ�", 74, 10 , 10);
	Midfielder �γ� = new Midfielder("�γ�", 12, 72, 11);
	Midfielder �׾� = new Midfielder("�׾�", 12, 73, 11);
	Midfielder ��Ƽ = new Midfielder("��Ƽ", 12, 73, 11);
	Defender ���� = new Defender("����", 13, 11, 75);
	Defender ���� = new Defender("����", 13, 11, 74);
	Defender ���� = new Defender("����", 13, 11, 74);
	Defender ��� = new Defender("���", 13, 11, 74);
	ArrayList<Player> team3_list = new ArrayList<Player>(Arrays.asList(�̴�, ȣ��, ����, �ɷ�, �γ�, �׾�, ��Ƽ, ����, ����, ����, ���));
	
	Gk ���� = new Gk("����", 30, 30, 30);
	Attacker ȫ�� = new Attacker("ȫ��", 74, 13 , 13);
	Attacker ���� = new Attacker("����", 74, 12 , 12);
	Attacker ��� = new Attacker("���", 74, 10 , 13);
	Midfielder ��� = new Midfielder("���", 14, 74, 11);
	Midfielder ��� = new Midfielder("���", 14, 74, 11);
	Midfielder ��Ƽ = new Midfielder("��Ƽ", 14, 74, 11);
	Defender Ǫ�� = new Defender("Ǫ��", 13, 13, 75);
	Defender ���� = new Defender("����", 13, 13, 74);
	Defender �ι� = new Defender("�ι�", 13, 13, 74);
	Defender ���� = new Defender("����", 13, 13, 74);
	ArrayList<Player> team4_list = new ArrayList<Player>(Arrays.asList(����, ȫ��, ����, ���, ���, ���, ��Ƽ, Ǫ��, ����, �ι�, ����));
	
	Gk ���� = new Gk("����", 35, 35, 35);
	Attacker ���� = new Attacker("����", 74, 23 , 13);
	Attacker ��� = new Attacker("���", 74, 22 , 12);
	Attacker �ŷ� = new Attacker("�ŷ�", 74, 20 , 13);
	Midfielder ���� = new Midfielder("����", 20, 74, 20);
	Midfielder ���� = new Midfielder("����", 20, 74, 21);
	Midfielder ��Ƽ = new Midfielder("��Ƽ", 20, 74, 21);
	Defender ���� = new Defender("����", 15, 13, 75);
	Defender ���� = new Defender("����", 15, 13, 74);
	Defender ���� = new Defender("����", 15, 13, 74);
	Defender �ο� = new Defender("�ο�", 15, 13, 74);
	ArrayList<Player> team5_list = new ArrayList<Player>(Arrays.asList(����, ����, ���, �ŷ�, ����, ����, ��Ƽ, ����, ����, ����, �ο�));
	
	Gk ���� = new Gk("����", 35, 35, 35);
	Attacker ��� = new Attacker("���", 74, 23 , 13);
	Attacker ��� = new Attacker("���", 74, 22 , 12);
	Attacker ���� = new Attacker("����", 74, 20 , 13);
	Midfielder ���� = new Midfielder("����", 20, 74, 20);
	Midfielder �ʾ� = new Midfielder("�ʾ�", 20, 74, 21);
	Midfielder ��Ƽ = new Midfielder("��Ƽ", 20, 74, 21);
	Defender ȣ�� = new Defender("ȣ��", 15, 13, 75);
	Defender ���� = new Defender("����", 15, 13, 74);
	Defender ���� = new Defender("����", 15, 13, 74);
	Defender ���� = new Defender("����", 15, 13, 74);
	ArrayList<Player> team6_list = new ArrayList<Player>(Arrays.asList(����, ���, ���, ����, ����, �ʾ�, ��Ƽ, ȣ��, ����, ����, ����));
	
	Gk �̰� = new Gk("�̰�", 35, 35, 35);
	Attacker ���� = new Attacker("����", 74, 23 , 13);
	Attacker ���� = new Attacker("����", 74, 22 , 12);
	Attacker �Ѱ� = new Attacker("�Ѱ�", 74, 20 , 13);
	Midfielder �׿� = new Midfielder("�׿�", 20, 74, 20);
	Midfielder ��� = new Midfielder("���", 20, 74, 21);
	Midfielder Ƽ�� = new Midfielder("Ƽ��", 20, 74, 21);
	Defender ���� = new Defender("����", 15, 13, 75);
	Defender ��ȣ = new Defender("��ȣ", 15, 13, 74);
	Defender �κ� = new Defender("�κ�", 15, 13, 74);
	Defender ��� = new Defender("���", 15, 13, 74);
	ArrayList<Player> team7_list = new ArrayList<Player>(Arrays.asList(�̰�, ����, ����, �Ѱ�, �׿�, ���, Ƽ��, ����, ��ȣ, �κ�, ���));
	
	Gk �հ� = new Gk("�հ�", 35, 35, 35);
	Attacker ���� = new Attacker("����", 74, 53 , 53);
	Attacker �ʷ� = new Attacker("�ʷ�", 74, 52 , 52);
	Attacker �ΰ� = new Attacker("�ΰ�", 74, 50 , 53);
	Midfielder �ʿ� = new Midfielder("�ʿ�", 50, 74, 50);
	Midfielder ���� = new Midfielder("����", 50, 74, 51);
	Midfielder ���� = new Midfielder("����", 50, 74, 51);
	Defender ���� = new Defender("����", 55, 53, 75);
	Defender ��ȣ = new Defender("��ȣ", 55, 53, 74);
	Defender ���� = new Defender("����", 55, 53, 74);
	Defender ���� = new Defender("����", 55, 53, 74);
	ArrayList<Player> team8_list = new ArrayList<Player>(Arrays.asList(�հ�, ����, �ʷ�, �ΰ�, �ʿ�, ����, ����, ����, ��ȣ, ����, ����));
	
	Gk ���� = new Gk("����", 55, 55, 55);
	Attacker ��� = new Attacker("���", 74, 63 , 63);
	Attacker ���� = new Attacker("����", 74, 62 , 62);
	Attacker ���� = new Attacker("����", 74, 60 , 63);
	Midfielder ���� = new Midfielder("����", 60, 74, 60);
	Midfielder �ʿ� = new Midfielder("�ʿ�", 60, 74, 61);
	Midfielder ���� = new Midfielder("����", 60, 74, 61);
	Defender ���� = new Defender("����", 65, 63, 75);
	Defender ȣ�� = new Defender("ȣ��", 65, 63, 74);
	Defender �κ� = new Defender("�κ�", 65, 63, 74);
	Defender ���� = new Defender("����", 65, 63, 74);
	ArrayList<Player> team9_list = new ArrayList<Player>(Arrays.asList(����, ���, ����, ����, ����, �ʿ�, ����, ����, ȣ��, �κ�, ����));
	
	Gk ���� = new Gk("����", 65, 65, 65);
	Attacker �峪 = new Attacker("�峪", 74, 73 , 73);
	Attacker ���� = new Attacker("����", 74, 72 , 72);
	Attacker �ŷ� = new Attacker("�ŷ�", 74, 70 , 73);
	Midfielder ��� = new Midfielder("���", 70, 74, 70);
	Midfielder �Ϳ� = new Midfielder("�Ϳ�", 70, 74, 71);
	Midfielder ���� = new Midfielder("����", 70, 74, 71);
	Defender ���� = new Defender("����", 75, 73, 75);
	Defender ȥ�� = new Defender("ȥ��", 75, 73, 74);
	Defender �к� = new Defender("�к�", 75, 73, 74);
	Defender ���� = new Defender("����", 75, 73, 74);
	ArrayList<Player> team10_list = new ArrayList<Player>(Arrays.asList(����, �峪, ����, �ŷ�, ���, �Ϳ�, ����, ����, ȥ��, �к�, ����));
	
	
	public Team(String manager_name, String team1) {
		this.manager_name = manager_name;
		this.team1 = team1;
		
		
	}
	
	// ������
	public void TeamInfo() {
		System.out.println("===================================================================================================================================================");
		System.out.println("�� �̸�: " + this.team1);
		System.out.println("���� �̸�: " + this.manager_name);
		System.out.println("�� �ڱ�: " + this.money + "����");
		System.out.println("----------------���� ���----------------");
		System.out.println("  �̸�         ����  �н�  ����      ������");
		for(int i=0; i<team1_list.size(); i++) {
			System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
			
		}
		System.out.println("===================================================================================================================================================");
	}
	
	// ���߼������ ��ü���ִ� method
	public void ChangePlayer() {
		
		while(true) {
		Player temp1;
		Player temp2;
		System.out.println("----------------���� ���----------------");
		System.out.println("  �̸�         ����  �н�  ����      ������");
		for(int i=0; i<11; i++) {
			System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
		}
		System.out.println("----------------�ĺ� ���----------------");
		System.out.println("  �̸�         ����  �н�  ����      ������");
		for(int i=11; i<team1_list.size(); i++) {
			System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
		}
		
		System.out.println("������ ���߸�ܿ��� ���ܽ�Ű�ڽ��ϱ�?");
		for(int i=0; i<11; i++) {
			System.out.print((i+1) + ")" + team1_list.get(i).name + "  ");
		}
		System.out.println("12)��ü���� ��� ����");
		Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		if(choice<12) {
		System.out.println(team1_list.get(choice-1).name + "������ ���߸�ܿ��� ���ܽ�ŵ�ϴ�.");
		}
		else if(choice==12) {
			System.out.println("���� ��ü ���� �ٷ� ��� �����մϴ�.");
			return;
		}
		
		System.out.println("������ ���߸�ܿ� ���Խ�Ű�ڽ��ϱ�?");
		for(int i=11; i < team1_list.size(); i++) {
			System.out.print((i+1) + ")" + team1_list.get(i).name + "  ");
		}
		System.out.println((team1_list.size()+1) + ")��ü���� �������");
		int choice2;
		choice2 = sc.nextInt();
		if(choice2>11 && choice2 < (team1_list.size() + 1)) {
			System.out.println(team1_list.get(choice2-1).name + "������ ���߸�ܿ� ���Խ�ŵ�ϴ�.");
			temp1 = team1_list.get(choice-1);
			temp2 = team1_list.get(choice2-1);
			team1_list.remove(choice2-1);
			team1_list.remove(choice-1);
			team1_list.add(choice-1, temp2);
			team1_list.add(temp1);
		}
		
		else if(choice2 == (team1_list.size() + 1)) {
			System.out.println("���� ��ü ���� �ٷ� ��� �����մϴ�.");
			return;
		}
		
		}
		
	}
	
	// ���� �Ʒ�
	public void Training() {
		
		int choice;
		ArrayList<Player> player = new ArrayList<Player>(Arrays.asList());
		
		
		while (true) {
			System.out.println("----------------�Ʒ� ���� ���----------------");
			System.out.println("  �̸�         ����  �н�  ����      ������");
			for(int i=11; i<team1_list.size(); i++) {
				System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------------------------------");
			System.out.println("������ �Ʒý�Ű�ڽ��ϱ�?");
			
			for(int i=11; i<team1_list.size(); i++) {
				System.out.print((i+1) + ")" + team1_list.get(i).name + "  ");
			}
			System.out.print((team1_list.size()+1) + ")�޴��� ���ư���");
			System.out.println();
			
			choice = sc.nextInt();
			if (choice == team1_list.size() + 1) {
				System.out.println("�޴��� ���ư��ϴ�.");
				break;
			}
			else if(11<choice && choice<team1_list.size()) {
				System.out.println(team1_list.get(choice-1).name + "������ �Ʒý�ŵ�ϴ�.");
				player.add(team1_list.get(choice-1));
				team1_list.remove(choice-1);
			}
			
		}
	}
	
	// ���� �ɷ�ġ, �� �ڱ� �÷��ִ� method
	public void Plus(int result) {
		if(result == 2) {
			this.money = this.money + 1500;
			for(int i=0; i<11; i++) {
				team1_list.get(i).at_stat++;
				team1_list.get(i).md_stat++;
				team1_list.get(i).df_stat++;
			}
		}
		if(result == 1) {
			this.money = this.money + 500;
		}
	}
	
	
	

}
