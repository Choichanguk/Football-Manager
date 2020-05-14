package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import player.LegendAttacker;
import player.LegendDefender;
import player.LegendGk;
import player.LegendMidfielder;
import player.Player;

public class Trade {
	
	LegendAttacker �緹 = new LegendAttacker("�緹", 99, 99, 99, 14000);
	LegendAttacker ���� = new LegendAttacker("����", 95, 95, 95, 12000);
	LegendAttacker ���� = new LegendAttacker("����", 93, 93, 93, 10000);
	LegendMidfielder ���� = new LegendMidfielder("����", 93, 93, 93, 10000);
	LegendMidfielder ���� = new LegendMidfielder("����", 97, 97, 97, 13000);
	LegendMidfielder �Ǳ� = new LegendMidfielder("�Ǳ�", 95, 95, 95, 12000);
	LegendDefender ���� = new LegendDefender("����", 91, 91, 91, 9000);
	LegendDefender ī�� = new LegendDefender("ī��", 90, 90, 90, 8500);
	LegendDefender �ν� = new LegendDefender("�ν�", 88, 88, 88, 7000);
	LegendGk �߽� = new LegendGk("�߽�", 99, 99, 99, 14000);
	
	ArrayList<Player> legend_list = new ArrayList<Player>(Arrays.asList(�緹, ����, ����, ����, ����, �Ǳ�, ����, ī��, �ν�, �߽�));
	
	// Ʈ���̵� ���� ��� �����ִ� method 
	public void ViewList() {
		System.out.println("  �̸�         ����  �н�  ����        ���Աݾ�              ������");
		for(int i=0; i<legend_list.size(); i++) {
			System.out.println("["+legend_list.get(i).name+"]" + "    " + legend_list.get(i).at_stat + "  " + legend_list.get(i).md_stat + "   " + legend_list.get(i).df_stat + "    " + legend_list.get(i).money + "����     " + legend_list.get(i).position);
		}
		System.out.println("=============================================================================================================================================");
	}
	// trade�� �����ϴ� method 
	
	public int Trade(int money) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		ViewList();
		
		
		while(true) {
			System.out.println("������ �����Ͻðڽ��ϱ�?       [�����ڱ�: " + money + "����]");
			for(int i=0; i<legend_list.size(); i++) {
				System.out.print((i+1) + ")" + legend_list.get(i).name + "  ");
			}
			System.out.println((legend_list.size() + 1) + ")�������� �ʴ´�.");
			
		choice = sc.nextInt();
		
		if(choice <= legend_list.size()) {
			if(money >=legend_list.get((choice-1)).money) {
			System.out.println(legend_list.size());
			System.out.println(legend_list.get((choice-1)).name + "������ �����մϴ�.  [���ڱ� -" + legend_list.get((choice-1)).money + "����]");
			return choice;
			}
			else {
				System.out.println("�ڱ��� �����մϴ�.");
			}
		}
		else {
			System.out.println("�޴��� �̵��մϴ�.");
			return 0;
		}
		
		}
	}
}
