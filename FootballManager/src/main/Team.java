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
	
	String team1;
	String team2 = "천안FC";
	String team3 = "춘천FC";
	String team4 = "안동FC";
	String team5 = "용인FC";
	String team6 = "경기FC";
	String team7 = "부산FC";
	String team8 = "서울FC";
	String team9 = "수원FC";
	String team10 = "성남FC";
	
	Gk 미손 = new Gk("미손", 10, 10, 10);
	Attacker 날도 = new Attacker("날도", 70, 10 , 10);
	Attacker 버트 = new Attacker("버트", 70, 10 , 10);
	Attacker 케로 = new Attacker("케로", 70, 10 , 10);
	Midfielder 안네 = new Midfielder("안네", 12, 70, 11);
	Midfielder 네오 = new Midfielder("네오", 12, 70, 11);
	Midfielder 퍼팅 = new Midfielder("퍼팅", 12, 70, 11);
	Defender 페페 = new Defender("페페", 11, 11, 69);
	Defender 우이 = new Defender("우이", 11, 11, 69);
	Defender 바바 = new Defender("바바", 11, 11, 69);
	Defender 이용 = new Defender("이용", 11, 11, 69);
	LegendAttacker 펠로 = new LegendAttacker("펠로", 90, 90, 90, 1000);
	LegendMidfielder 팔로 = new LegendMidfielder("팔로", 90, 90, 90, 1000);
	LegendDefender 폴로 = new LegendDefender("폴로", 90, 90, 90, 1000);
	
	ArrayList<Player> team1_list = new ArrayList<Player>(Arrays.asList(미손, 날도, 버트, 케로, 안네, 네오, 퍼팅, 페페, 우이, 바바, 이용, 펠로, 팔로, 폴로));
	
	Gk 미발 = new Gk("미발", 20, 20, 20);
	Attacker 호날 = new Attacker("호날", 72, 10 , 10);
	Attacker 로버 = new Attacker("로버", 72, 10 , 10);
	Attacker 케라 = new Attacker("케라", 72, 10 , 10);
	Midfielder 언네 = new Midfielder("언네", 12, 72, 11);
	Midfielder 네이 = new Midfielder("네이", 12, 73, 11);
	Midfielder 퍼티 = new Midfielder("퍼티", 12, 73, 11);
	Defender 페퍼 = new Defender("페퍼", 11, 11, 72);
	Defender 우의 = new Defender("우의", 11, 11, 72);
	Defender 바버 = new Defender("바버", 11, 11, 73);
	Defender 이우 = new Defender("이우", 11, 11, 73);
	ArrayList<Player> team2_list = new ArrayList<Player>(Arrays.asList(미발, 호날, 로버, 케라, 언네, 네이, 퍼티, 페퍼, 우의, 바버, 이우));
	
	Gk 미다 = new Gk("미다", 25, 25, 25);
	Attacker 호나 = new Attacker("호나", 74, 10 , 10);
	Attacker 번투 = new Attacker("번투", 74, 10 , 10);
	Attacker 케롤 = new Attacker("케롤", 74, 10 , 10);
	Midfielder 인네 = new Midfielder("인네", 12, 72, 11);
	Midfielder 네어 = new Midfielder("네어", 12, 73, 11);
	Midfielder 펑티 = new Midfielder("펑티", 12, 73, 11);
	Defender 퍼퍼 = new Defender("퍼퍼", 13, 11, 75);
	Defender 이의 = new Defender("이의", 13, 11, 74);
	Defender 보버 = new Defender("보버", 13, 11, 74);
	Defender 우우 = new Defender("우우", 13, 11, 74);
	ArrayList<Player> team3_list = new ArrayList<Player>(Arrays.asList(미다, 호나, 번투, 케롤, 인네, 네어, 펑티, 퍼퍼, 이의, 보버, 우우));
	
	Gk 미포 = new Gk("미포", 30, 30, 30);
	Attacker 홍나 = new Attacker("홍나", 74, 13 , 13);
	Attacker 러번 = new Attacker("러번", 74, 12 , 12);
	Attacker 쿠롤 = new Attacker("쿠롤", 74, 10 , 13);
	Midfielder 우네 = new Midfielder("우네", 14, 74, 11);
	Midfielder 노어 = new Midfielder("노어", 14, 74, 11);
	Midfielder 판티 = new Midfielder("판티", 14, 74, 11);
	Defender 푸퍼 = new Defender("푸퍼", 13, 13, 75);
	Defender 아의 = new Defender("아의", 13, 13, 74);
	Defender 부버 = new Defender("부버", 13, 13, 74);
	Defender 보우 = new Defender("보우", 13, 13, 74);
	ArrayList<Player> team4_list = new ArrayList<Player>(Arrays.asList(미포, 홍나, 러번, 쿠롤, 우네, 노어, 판티, 푸퍼, 아의, 부버, 보우));
	
	Gk 미팔 = new Gk("미팔", 35, 35, 35);
	Attacker 나두 = new Attacker("나두", 74, 23 , 13);
	Attacker 루번 = new Attacker("루번", 74, 22 , 12);
	Attacker 거롤 = new Attacker("거롤", 74, 20 , 13);
	Midfielder 워네 = new Midfielder("워네", 20, 74, 20);
	Midfielder 누어 = new Midfielder("누어", 20, 74, 21);
	Midfielder 포티 = new Midfielder("포티", 20, 74, 21);
	Defender 우퍼 = new Defender("우퍼", 15, 13, 75);
	Defender 손의 = new Defender("손의", 15, 13, 74);
	Defender 번버 = new Defender("번버", 15, 13, 74);
	Defender 부우 = new Defender("부우", 15, 13, 74);
	ArrayList<Player> team5_list = new ArrayList<Player>(Arrays.asList(미팔, 나두, 루번, 거롤, 워네, 누어, 포티, 우퍼, 손의, 번버, 부우));
	
	Gk 개미 = new Gk("개미", 35, 35, 35);
	Attacker 헌너 = new Attacker("헌너", 74, 23 , 13);
	Attacker 뤄번 = new Attacker("뤄번", 74, 22 , 12);
	Attacker 간롤 = new Attacker("간롤", 74, 20 , 13);
	Midfielder 원네 = new Midfielder("원네", 20, 74, 20);
	Midfielder 너어 = new Midfielder("너어", 20, 74, 21);
	Midfielder 후티 = new Midfielder("후티", 20, 74, 21);
	Defender 호퍼 = new Defender("호퍼", 15, 13, 75);
	Defender 소의 = new Defender("소의", 15, 13, 74);
	Defender 버버 = new Defender("버버", 15, 13, 74);
	Defender 버우 = new Defender("버우", 15, 13, 74);
	ArrayList<Player> team6_list = new ArrayList<Player>(Arrays.asList(개미, 헌너, 뤄번, 간롤, 원네, 너어, 후티, 호퍼, 소의, 버버, 버우));
	
	Gk 미개 = new Gk("미개", 35, 35, 35);
	Attacker 너헌 = new Attacker("너헌", 74, 23 , 13);
	Attacker 번뤄 = new Attacker("번뤄", 74, 22 , 12);
	Attacker 롤가 = new Attacker("롤가", 74, 20 , 13);
	Midfielder 네원 = new Midfielder("네원", 20, 74, 20);
	Midfielder 어너 = new Midfielder("어너", 20, 74, 21);
	Midfielder 티후 = new Midfielder("티후", 20, 74, 21);
	Defender 퍼후 = new Defender("퍼후", 15, 13, 75);
	Defender 으호 = new Defender("으호", 15, 13, 74);
	Defender 부부 = new Defender("부부", 15, 13, 74);
	Defender 우버 = new Defender("우버", 15, 13, 74);
	ArrayList<Player> team7_list = new ArrayList<Player>(Arrays.asList(미개, 너헌, 번뤄, 롤가, 네원, 어너, 티후, 퍼후, 으호, 부부, 우버));
	
	Gk 손개 = new Gk("손개", 35, 35, 35);
	Attacker 어헌 = new Attacker("어헌", 74, 53 , 53);
	Attacker 너뤄 = new Attacker("너뤄", 74, 52 , 52);
	Attacker 로가 = new Attacker("로가", 74, 50 , 53);
	Midfielder 너원 = new Midfielder("너원", 50, 74, 50);
	Midfielder 오너 = new Midfielder("오너", 50, 74, 51);
	Midfielder 터후 = new Midfielder("터후", 50, 74, 51);
	Defender 파후 = new Defender("파후", 55, 53, 75);
	Defender 우호 = new Defender("우호", 55, 53, 74);
	Defender 보부 = new Defender("보부", 55, 53, 74);
	Defender 오버 = new Defender("오버", 55, 53, 74);
	ArrayList<Player> team8_list = new ArrayList<Player>(Arrays.asList(손개, 어헌, 너뤄, 로가, 너원, 오너, 터후, 파후, 우호, 보부, 오버));
	
	Gk 개손 = new Gk("개손", 55, 55, 55);
	Attacker 허너 = new Attacker("허너", 74, 63 , 63);
	Attacker 뤄터 = new Attacker("뤄터", 74, 62 , 62);
	Attacker 가로 = new Attacker("가로", 74, 60 , 63);
	Midfielder 원너 = new Midfielder("원너", 60, 74, 60);
	Midfielder 너오 = new Midfielder("너오", 60, 74, 61);
	Midfielder 후터 = new Midfielder("후터", 60, 74, 61);
	Defender 후파 = new Defender("후파", 65, 63, 75);
	Defender 호우 = new Defender("호우", 65, 63, 74);
	Defender 부붕 = new Defender("부붕", 65, 63, 74);
	Defender 버오 = new Defender("버오", 65, 63, 74);
	ArrayList<Player> team9_list = new ArrayList<Player>(Arrays.asList(개손, 허너, 뤄터, 가로, 원너, 너오, 후터, 후파, 호우, 부붕, 버오));
	
	Gk 개소 = new Gk("개소", 65, 65, 65);
	Attacker 헌나 = new Attacker("헌나", 74, 73 , 73);
	Attacker 러터 = new Attacker("러터", 74, 72 , 72);
	Attacker 거로 = new Attacker("거로", 74, 70 , 73);
	Midfielder 언너 = new Midfielder("언너", 70, 74, 70);
	Midfielder 넌오 = new Midfielder("넌오", 70, 74, 71);
	Midfielder 훈터 = new Midfielder("훈터", 70, 74, 71);
	Defender 훈파 = new Defender("훈파", 75, 73, 75);
	Defender 혼우 = new Defender("혼우", 75, 73, 74);
	Defender 분붕 = new Defender("분붕", 75, 73, 74);
	Defender 번오 = new Defender("번오", 75, 73, 74);
	ArrayList<Player> team10_list = new ArrayList<Player>(Arrays.asList(개소, 헌나, 러터, 거로, 언너, 넌오, 훈터, 훈파, 혼우, 분붕, 번오));
	
	
	public Team(String manager_name, String team1) {
		this.manager_name = manager_name;
		this.team1 = team1;
		
		
	}
	
	// 팀정보
	public void TeamInfo() {
		System.out.println("팀 이름: " + this.team1);
		System.out.println("감독 이름: " + this.manager_name);
		System.out.println("----------------선수 목록----------------");
		System.out.println("  이름         공격  패스  수비      포지션");
		for(int i=0; i<team1_list.size(); i++) {
			System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
		}
		
	}
	
	// 게임 리스트
	public void GameList() {
		System.out.println("----------------선발 명단----------------");
		System.out.println("  이름         공격  패스  수비      포지션");
		for(int i=0; i<11; i++) {
			System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
		}
		System.out.println("----------------후보 명단----------------");
		System.out.println("  이름         공격  패스  수비      포지션");
		for(int i=11; i<team1_list.size(); i++) {
			System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
		}
	}
	
	// 선수 훈련
	public void Training() {
		int exception = 0;
		int choice;
		ArrayList<Player> player = new ArrayList<Player>(Arrays.asList());
		
		
		while (exception==0) {
			System.out.println("----------------훈련 가능 명단----------------");
			System.out.println("  이름         공격  패스  수비      포지션");
			for(int i=11; i<team1_list.size(); i++) {
				System.out.println("["+team1_list.get(i).name+"]" + "    " + team1_list.get(i).at_stat + "  " + team1_list.get(i).md_stat + "   " + team1_list.get(i).df_stat + "   " + team1_list.get(i).position);
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------------------------------");
			System.out.println("누구를 훈련시키겠습니까?");
			
			for(int i=11; i<team1_list.size(); i++) {
				System.out.print((i+1) + ")" + team1_list.get(i).name + "  ");
			}
			System.out.print((team1_list.size()+1) + ")메뉴로 돌아간다");
			System.out.println();
			
			choice = sc.nextInt();
			if (choice == team1_list.size()) {
				System.out.println("메뉴로 돌아갑니다.");
				exception++;
			}
			else if(11<choice && choice<team1_list.size()) {
				System.out.println(team1_list.get(choice-1).name + "선수를 훈련시킵니다.");
				player.add(team1_list.get(choice-1));
				team1_list.remove(choice-1);
			}
			
		}
	}

}
