package player;

public class LegendMidfielder extends Midfielder{
	public int money;

	public LegendMidfielder(String name, int at_stat, int md_stat, int df_stat, int money) {
		super(name, at_stat, md_stat, df_stat);
		this.money = money;
		this.position = "������̵��ʴ�";
	}
	
	// �г�Ƽű
		public void event1() {}
		
		// ����ű
		public void event2() {}
		
		// �������̵�
		public void event3() {}

}
