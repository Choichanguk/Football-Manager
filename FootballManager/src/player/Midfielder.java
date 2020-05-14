package player;

public class Midfielder extends Player{
	
	public Midfielder(String name, int at_stat, int md_stat, int df_stat) {
		this.name = name;
		this.at_stat = at_stat;
		this.md_stat = md_stat;
		this.df_stat = df_stat;
		this.position = "미드필더";
	}
	
	// 패널티킥
	public void md_event1(String player) {
		System.out.println("주심이 페널티킥을 선언합니다");
	}
	
	// 프리킥
	public int md_event2(String player, int team) {
		int goal=0;
		if (team == 1) {
			System.out.println("주심이 프리킥을 선언합니다. " + player + "선수가 찰 준비를 하고있어요.");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print("                ");
				System.out.println("골~~! " + player + "선수가 멋진 프리킥 골을 만들어냅니다!!");
				goal++;
				return goal;
			} else {
				System.out.print("                ");
				System.out.println("아... 프리킥이 골대를 살짝 빗나가네요..");
				return goal;
			}
		} else {
			System.out.println("주심이 프리킥을 선언합니다. " + player + "선수가 찰 준비를 하고있어요.");
			double percent = Math.random();
			if (percent < 0.5) {
				System.out.print(
						"                                                                                                                          ");
				System.out.println("골~~! " + player + "선수가 멋진 프리킥 골을 만들어냅니다!!");
				goal++;
				return goal;
			} else {
				System.out.print(
						"                                                                                                                          ");
				System.out.println("아... 프리킥이 골대를 살짝 빗나가네요..");
				return goal;
			}
		}
	}
	
	// 오프사이드
	public void md_event3(String player) {
		System.out.println(player + "선수의 패스가 오프사이드에 걸리고 마네요.");
	}
}
