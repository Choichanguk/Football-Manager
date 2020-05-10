package player;

public class LegendDefender extends Defender{
	
	public int money;

	public LegendDefender(String name, int at_stat, int md_stat, int df_stat, int money) {
		super(name, at_stat, md_stat, df_stat);
		this.money = money;
		this.position = "레전드수비수";
	}
	
	// 태클
	public void event1() {}

}
