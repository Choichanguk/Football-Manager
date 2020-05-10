package player;

public class LegendMidfielder extends Midfielder{
	public int money;

	public LegendMidfielder(String name, int at_stat, int md_stat, int df_stat, int money) {
		super(name, at_stat, md_stat, df_stat);
		this.money = money;
		this.position = "레전드미드필더";
	}
	
	// 패널티킥
		public void event1() {}
		
		// 프리킥
		public void event2() {}
		
		// 오프사이드
		public void event3() {}

}
