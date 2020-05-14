package main;

public class League {
	
	int statistic3[] = new int[12];
	int statistic2[] = new int[12];
	int statistic1[] = new int[12];
	
	// 리그 정보 보여주는 method
	public void LeagueInfo(Team team, int league) {
		if (league == 3) {
			System.out.println("-----------3부리그 현황----------");
			System.out.println(" 팀 이름    승   무   패  승점   능력치");
			System.out.println("["+team.team1 +"] "+ statistic3[0] +"  "+ statistic3[1] +"  "+ statistic3[2] + "   " + (statistic3[0]*3 +statistic3[1]) + "   " + 30);
			System.out.println("["+team.team2 +"] "+ statistic3[3] +"  "+ statistic3[4] +"  "+ statistic3[5] + "   " + (statistic3[3]*3 + statistic3[4])+ "   " + 33);
			System.out.println("["+team.team3 +"] "+ statistic3[6] +"  "+ statistic3[7] +"  "+ statistic3[8] + "   " + (statistic3[6]*3 + statistic3[7])+ "   " + 32);
			System.out.println("["+team.team4 +"] "+ statistic3[9] +"  "+ statistic3[10] +"  "+ statistic3[11] + "   " + (statistic3[9]*3 + statistic3[10])+ "   " + 36);
			System.out.println("------------------------------");
		}
		else if(league ==2 ) {
			System.out.println("-----------2부리그 현황----------");
			System.out.println(" 팀 이름    승   무   패  승점   능력치");
			System.out.println("["+team.team1 +"] "+ statistic2[0] +"  "+ statistic2[1] +"  "+ statistic2[2] + "   " + (statistic2[0]*3+ statistic2[1]) + "   " + 30);
			System.out.println("["+team.team5 +"] "+ statistic2[3] +"  "+ statistic2[4] +"  "+ statistic2[5] + "   " + (statistic2[3]*3 + statistic2[4])+ "   " + 40);
			System.out.println("["+team.team6 +"] "+ statistic2[6] +"  "+ statistic2[7] +"  "+ statistic2[8] + "   " + (statistic2[6]*3 + statistic2[7])+ "   " + 44);
			System.out.println("["+team.team7 +"] "+ statistic2[9] +"  "+ statistic2[10] +"  "+ statistic2[11] + "   " + (statistic2[9]*3 + statistic2[10])+ "   " + 50);
			System.out.println("------------------------------");
		}
		else if(league == 1) {
			System.out.println("-----------1부리그 현황----------");
			System.out.println(" 팀 이름    승   무   패  승점   능력치");
			System.out.println("["+team.team1 +"] "+ statistic1[0] +"  "+ statistic1[1] +"  "+ statistic1[2] + "   " + (statistic1[0]*3 + statistic1[1])+ "   " + 30);
			System.out.println("["+team.team8 +"] "+ statistic1[3] +"  "+ statistic1[4] +"  "+ statistic1[5] + "   " + (statistic1[3]*3 + statistic1[4])+ "   " + 60);
			System.out.println("["+team.team9 +"] "+ statistic1[6] +"  "+ statistic1[7] +"  "+ statistic1[8] + "   " + (statistic1[6]*3 + statistic1[7])+ "   " + 65);
			System.out.println("["+team.team10 +"] "+ statistic1[9] +"  "+ statistic1[10] +"  "+ statistic1[11] + "   " + (statistic1[9]*3 + statistic1[10])+ "   " + 72);
			System.out.println("------------------------------");
		}
	}
	
	// 리그 정보 갱신해주는 method
	public void RenewLeague(int league, int team1, int team2, int team3, int team4) {
		//3부리그
		if (league == 3) {
			// team1
			if (team1 == 2) {
				statistic3[0]++;
			} else if (team1 == 1) {
				statistic3[1]++;
			} else if (team1 == 0) {
				statistic3[2]++;
			}
			// team2
			if (team2 == 2) {
				statistic3[3]++;
			} else if (team2 == 1) {
				statistic3[4]++;
			} else if (team2 == 0) {
				statistic3[5]++;
			}
			// team3
			if (team3 == 2) {
				statistic3[6]++;
			} else if (team3 == 1) {
				statistic3[7]++;
			} else if (team3 == 0) {
				statistic3[8]++;
			}
			// team4
			if (team4 == 2) {
				statistic3[9]++;
			} else if (team4 == 1) {
				statistic3[10]++;
			} else if (team4 == 0) {
				statistic3[11]++;
			}
		}
		//2부리그
		else if (league == 2) {
			if (team1 == 2) {
				statistic2[0]++;
			} else if (team1 == 1) {
				statistic2[1]++;
			} else if (team1 == 0) {
				statistic2[2]++;
			}
			// team2
			if (team2 == 2) {
				statistic2[3]++;
			} else if (team2 == 1) {
				statistic2[4]++;
			} else if (team2 == 0) {
				statistic2[5]++;
			}
			// team3
			if (team3 == 2) {
				statistic2[6]++;
			} else if (team3 == 1) {
				statistic2[7]++;
			} else if (team3 == 0) {
				statistic2[8]++;
			}
			// team4
			if (team4 == 2) {
				statistic2[9]++;
			} else if (team4 == 1) {
				statistic2[10]++;
			} else if (team4 == 0) {
				statistic2[11]++;
			}
		}
		
		//1부리그
		else if(league==1) {
			//team1
			if (team1 == 2) {
				statistic1[0]++;
			} else if (team1 == 1) {
				statistic1[1]++;
			} else if (team1 == 0) {
				statistic1[2]++;
			}
			// team2
			if (team2 == 2) {
				statistic1[3]++;
			} else if (team2 == 1) {
				statistic1[4]++;
			} else if (team2 == 0) {
				statistic1[5]++;
			}
			// team3
			if (team3 == 2) {
				statistic1[6]++;
			} else if (team3 == 1) {
				statistic1[7]++;
			} else if (team3 == 0) {
				statistic1[8]++;
			}
			// team4
			if (team4 == 2) {
				statistic1[9]++;
			} else if (team4 == 1) {
				statistic1[10]++;
			} else if (team4 == 0) {
				statistic1[11]++;
			}
		}
	}
	
	public int Result(int league) {
		if(league == 3) {
			if((statistic3[0]*3 + statistic3[1]) > (statistic3[3]*3 + statistic3[4]) && (statistic3[0]*3 + statistic3[1]) > (statistic3[6]*3 + statistic3[7]) && (statistic3[0]*3 + statistic3[1]) > (statistic3[9]*3 + statistic3[10])) {
				return 1;
			}
			else {
				return 0;
			}	
		}
		
		if(league == 2) {
			if((statistic2[0]*3 + statistic2[1]) > (statistic2[3]*3 + statistic2[4]) && (statistic2[0]*3 + statistic2[1]) > (statistic2[6]*3 + statistic2[7]) && (statistic2[0]*3 + statistic2[1]) > (statistic2[9]*3 + statistic2[10])) {
				return 1;
			}
			else {
				return 0;
			}	
		}
		
		else {
			if((statistic1[0]*3 + statistic1[1]) > (statistic1[3]*3 + statistic1[4]) && (statistic1[0]*3 + statistic1[1]) > (statistic1[6]*3 + statistic1[7]) && (statistic1[0]*3 + statistic1[1]) > (statistic1[9]*3 + statistic1[10])) {
				return 1;
			}
			else {
				return 0;
			}	
		}
	}
	

}
