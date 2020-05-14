package player;

public class Player {
	public String name;
	public String position;
	public int at_stat;
	public int md_stat;
	public int df_stat;
	public int stamina = 100;
	public int money;
	Player() {}
//	Player(String name, int at_stat, int md_stat, int df_stat) {
//		this.name = name;
//		this.at_stat = at_stat;
//		this.md_stat = md_stat;
//		this.df_stat = df_stat;
//	}
	
	// 옐로카드
	public void event1(String player) {
		System.out.println(player + "선수, 거친 태클이에요. 옐로카드가 선언됩니다.");
	}
	
	// 레드카드
	public void event2(String player) {
		System.out.println(player + "선수, 너무 심한 태클이에요..심판이 레드카드를 선언합니다.");
	}
	
	// VAR
	public void event3(String player) {
		System.out.println("감독이 VAR을 신청합니다. 결과에 따라 골이 결정나겠는데요.");
		
	}
	

}	
