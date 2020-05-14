package main;

import java.util.Scanner;

public class Process {
	// 게임 설명을 위한 method
	public void Explain() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("풋볼매니저에 오신걸 환영합니다. 게임 설명을 보시겠습니까?");
		System.out.println("1)본다  2)건너뛴다");
		int loop = 0;
		while (loop == 0) {
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println(
						"=======================================================================================================");
				System.out.println("풋볼매니저는 유저가 감독이 되어 팀을 이끄는 게임입니다. 총 3부리그가 있고 처음 시작은 3부리그에서 하게 됩니다.");
				System.out.println("3부리그에서 우승하면 2부리그로 승격하게 되고 1부리그를 우승하게 되면 게임이 종료됩니다.");
				System.out.println("3번안에 다음 리그로 승격하지 못할 시 감독은 경질이 되고 게임이 종료됩니다.");
				System.out.println(
						"=======================================================================================================");
				System.out.println("공격: 팀의 골 결정력을 높여주는 능력치입니다.");
				System.out.println("패스: 팀의 프리킥, 페널티킥의 결정력을 높여주는 능력치입니다.");
				System.out.println("수비: 상대팀의 골 결정력을 낮춰주는 능력치입니다.");
				System.out.println(
						"=======================================================================================================");
				loop++;
			} else if (choice == 2) {
				System.out.println("설명없이 바로 게임을 시작합니다.");
				loop++;
			} else {
				System.out.println("1번과 2번중에 선택해주세요.");
			}
		}
	}
	
	// 유저의 메뉴 선택값을 받는 method
	public int Menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1)경기진행  2)팀 정보  3)리그정보  4)선수훈련  5)이적시장");
		choice = sc.nextInt();
		return choice;
	}
	
	// 경기의 결과를 보여주는 method
	public int ViewResult(int result[][], String team1, String team2) {
		System.out.println("--------------경기 결과--------------");
		System.out.println("          [" + team1 + "]  vs  [" + team2 + "]");
		System.out.println("골                   " + result[0][10] + "         " + result[1][10]);
		System.out.println("돌파                " + result[0][8] + "         " + result[1][8]);
		System.out.println("슈팅                " + result[0][7] + "         " + result[1][7]);
		System.out.println("태클                " + result[0][9] + "         " + result[1][9]);
		System.out.println("1:1찬스           " + result[0][6] + "         " + result[1][6]);
		System.out.println("프리킥              " + result[0][4] + "         " + result[1][4]);
		System.out.println("오프사이드        " + result[0][5] + "         " + result[1][5]);
		System.out.println("페널티킥           " + result[0][3] + "         " + result[1][3]);
		System.out.println("옐로카드           " + result[0][2] + "         " + result[1][2]);
		System.out.println("레드카드           " + result[0][1] + "         " + result[1][1]);
		System.out.println("VAR         " + result[0][0] + "         " + result[1][0]);
		System.out.println("------------------------------------");
		if(result[0][10]>result[1][10]) {
			System.out.println("당신의 팀이 승리를 했습니다!!");
			System.out.println("팀자금  +1500만원, 선수 능력치 [공격+1] [패스+1] [수비+1]");
			return 2;
		}
		else if(result[0][10]==result[1][10]) {
			System.out.println("이번 경기 무승부로 끝이 납니다.");
			System.out.println("팀자금 +500만원");
			return 1;
		}
		else {
			System.out.println("당신의 팀이 패배를 했습니다.. 다음 경기부터 분발해주세요.");
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
