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
	public void event1() {}
	
	// 프리킥
	public void event2() {}
	
	// 오프사이드
	public void event3() {}
}
