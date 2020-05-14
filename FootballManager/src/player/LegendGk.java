package player;

public class LegendGk extends Gk{

	
	public LegendGk(String name, int at_stat, int md_stat, int df_stat, int money) {
		super(name, at_stat, md_stat, df_stat);
		this.money = money;
		this.position = "레전드골키퍼";
	}
}
