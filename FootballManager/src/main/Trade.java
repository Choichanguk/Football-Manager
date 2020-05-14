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
	
	LegendAttacker 펠레 = new LegendAttacker("펠레", 99, 99, 99, 14000);
	LegendAttacker 마라 = new LegendAttacker("마라", 95, 95, 95, 12000);
	LegendAttacker 도나 = new LegendAttacker("도나", 93, 93, 93, 10000);
	LegendMidfielder 지성 = new LegendMidfielder("지성", 93, 93, 93, 10000);
	LegendMidfielder 지단 = new LegendMidfielder("지단", 97, 97, 97, 13000);
	LegendMidfielder 피구 = new LegendMidfielder("피구", 95, 95, 95, 12000);
	LegendDefender 페페 = new LegendDefender("페페", 91, 91, 91, 9000);
	LegendDefender 카를 = new LegendDefender("카를", 90, 90, 90, 8500);
	LegendDefender 로스 = new LegendDefender("로스", 88, 88, 88, 7000);
	LegendGk 야신 = new LegendGk("야신", 99, 99, 99, 14000);
	
	ArrayList<Player> legend_list = new ArrayList<Player>(Arrays.asList(펠레, 마라, 도나, 지성, 지단, 피구, 페페, 카를, 로스, 야신));
	
	// 트레이드 선수 명단 보여주는 method 
	public void ViewList() {
		System.out.println("  이름         공격  패스  수비        영입금액              포지션");
		for(int i=0; i<legend_list.size(); i++) {
			System.out.println("["+legend_list.get(i).name+"]" + "    " + legend_list.get(i).at_stat + "  " + legend_list.get(i).md_stat + "   " + legend_list.get(i).df_stat + "    " + legend_list.get(i).money + "만원     " + legend_list.get(i).position);
		}
		System.out.println("=============================================================================================================================================");
	}
	// trade를 진행하는 method 
	
	public int Trade(int money) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		ViewList();
		
		
		while(true) {
			System.out.println("누구를 영입하시겠습니까?       [보유자금: " + money + "만원]");
			for(int i=0; i<legend_list.size(); i++) {
				System.out.print((i+1) + ")" + legend_list.get(i).name + "  ");
			}
			System.out.println((legend_list.size() + 1) + ")영입하지 않는다.");
			
		choice = sc.nextInt();
		
		if(choice <= legend_list.size()) {
			if(money >=legend_list.get((choice-1)).money) {
			System.out.println(legend_list.size());
			System.out.println(legend_list.get((choice-1)).name + "선수를 영입합니다.  [팀자금 -" + legend_list.get((choice-1)).money + "만원]");
			return choice;
			}
			else {
				System.out.println("자금이 부족합니다.");
			}
		}
		else {
			System.out.println("메뉴로 이동합니다.");
			return 0;
		}
		
		}
	}
}
