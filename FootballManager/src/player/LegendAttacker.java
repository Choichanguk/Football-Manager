package player;

public class LegendAttacker extends Attacker{
	public int money;
	
	public LegendAttacker(String name, int at_stat, int md_stat, int df_stat, int money) {
		super(name, at_stat, md_stat, df_stat);
		this.money = money;
		this.position = "레전드공격수";
	}

	// 1:1 찬스
		public void event1() {}
		
		// 슈팅
		public void event2() {}
		
		// 돌파
		public void event3() {}

}
