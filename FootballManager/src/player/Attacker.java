package player;

public class Attacker extends Player{
//	String name;
//	String position;
//	int at_stat;
//	int md_stat;
//	int df_stat;
// 	public Attacker() {}
	
	public Attacker(String name, int at_stat, int md_stat, int df_stat) {
		this.name = name;
		this.at_stat = at_stat;
		this.md_stat = md_stat;
		this.df_stat = df_stat;
		this.position = "공격수";
	}
	
	
	// 1:1 찬스
	public int at_event1(String player, int team) {
		int goal = 0;
		if (team == 1) {
			System.out.println(player + "선수 1:1 찬스입니다!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("골~~! " + player + "선수가 멋진 골을 만들어냅니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("아.." + player + "선수, 1:1 찬스를 아쉽게 놓치네요.");
				return goal;
			}
		} else {
			System.out.println(player + "선수 1:1 찬스입니다!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                                                                                                                          ");
				System.out.println("골~~! " + player + "선수가 멋진 골을 만들어냅니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                                                                                                                          ");
				System.out.println("아.." + player + "선수, 1:1 찬스를 아쉽게 놓치네요.");
				return goal;
			}
		}
	}
	
	// 슈팅
	public int at_event2(String player, int team) {
		int goal = 0;
		if (team == 1) {
			System.out.println(player + "선수 날카로운 슛!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("골~~! " + player + "선수가 멋진 골을 만들어냅니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("아.." + player + "선수의 슛팅이 골대를 아슬아슬하게 빗나갑니다.");
				return goal;
			}
		} else {
			System.out.println(player + "선수 날카로운 슛!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                                                                                                                          ");
				System.out.println("골~~! " + player + "선수가 멋진 골을 만들어냅니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                                                                                                                          ");
				System.out.println("아.." + player + "선수의 슛팅이 골대를 아슬아슬하게 빗나갑니다.");
				return goal;
			}
		}
	}
	
	
	// 돌파
	public int at_event3(String player, int team) {
		int goal = 0;
		if (team == 1) {
			
			System.out.println(player + "선수 과감한 돌파입니다!!");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("골~~! " + player + "선수가 수비수를 제치고 골을 기록합니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("아.." + player + "선수의 돌파가 상대 수비의 태클에 막히네요..");
				return goal;
			}
		}
		else {
			System.out.println(player + "선수 과감한 돌파입니다!!");
			double percent = Math.random();
			if (percent < 0.2) {
				System.out.print("                                                                                                                          ");
				System.out.println("골~~! " + player + "선수가 수비수를 제치고 골을 기록합니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                                                                                                                          ");
				System.out.println("아.." + player + "선수의 돌파가 상대 수비의 태클에 막히네요..");
				return goal;
			}
		}
	}
}
