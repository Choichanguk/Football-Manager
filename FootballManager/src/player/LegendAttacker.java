package player;

public class LegendAttacker extends Attacker{
	public int money;
	
	public LegendAttacker(String name, int at_stat, int md_stat, int df_stat, int money) {
		super(name, at_stat, md_stat, df_stat);
		this.money = money;
		this.position = "��������ݼ�";
	}

	// 1:1 ����
		public void event1() {}
		
		// ����
		public void event2() {}
		
		// ����
		public void event3() {}

}
