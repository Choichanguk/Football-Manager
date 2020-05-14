package main;

import java.util.ArrayList;
import java.util.Random;

import player.Attacker;
import player.Defender;
import player.Midfielder;
import player.Player;

public class GameProcess {
	
	public int[][] GameStart(ArrayList<Player> team1, ArrayList<Player> team2, String Teamname1, String teamname2) {
		Random random = new Random();
		int resultEvent1[][] = new int[2][11];
		int choice;
		double percent;
		Attacker tempat;
		Midfielder tempmd;
		Defender tempdf;
		System.out.println("=========================================================================================================================");
		System.out.println("                           [" + Teamname1 + "]                                              [" + teamname2 + "]                     ");
		
		System.out.println("주심의 휘슬소리와 함께 전반전 시작합니다~!!");
		for(int i =1; i<46; i++) {
			if(i == 45) {
				System.out.println("주심의 휘슬소리와 함께 전반전 종료합니다~!!");
			}
			else {
				percent = Math.random();
				if (percent <= 0.4) {
					percent = Math.random();
					// team1 event
					if (percent < 0.2) {
						percent = Math.random();
						System.out.print("전반" + i + "분: ");
						// VAR
						if (percent < 0.01) {
							choice = random.nextInt(10) + 1;
							team1.get(choice).event3(team1.get(choice).name);
							resultEvent1[0][0]++;
						}
						// 레드카드
						else if (percent >= 0.01 && percent < 0.02) {
							choice = random.nextInt(10) + 1;
							team1.get(choice).event2(team1.get(choice).name);
							resultEvent1[0][1]++;
						}
						// 옐로카드
						else if (percent >= 0.02 && percent < 0.04) {
							choice = random.nextInt(10) + 1;
							team1.get(choice).event1(team1.get(choice).name);
							resultEvent1[0][2]++;
						}
						// 패널티킥
						else if (percent >= 0.04 && percent < 0.1) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Midfielder) {
									tempmd = (Midfielder) team1.get(choice);
									tempmd.md_event1(tempmd.name);
									resultEvent1[0][3]++;
									loop++;
								}
							}
						}
						// 프리킥
						else if (percent >= 0.1 && percent < 0.2) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Midfielder) {
									tempmd = (Midfielder) team1.get(choice);
									resultEvent1[0][10] = resultEvent1[0][10] + tempmd.md_event2(tempmd.name, 1);
									resultEvent1[0][4]++;
									loop++;
								}
							}
						}
						// 오프사이드
						else if (percent >= 0.2 && percent < 0.3) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Midfielder) {
									tempmd = (Midfielder) team1.get(choice);
									tempmd.md_event3(tempmd.name);
									resultEvent1[0][5]++;
									loop++;
								}
							}
						}
						// 1:1 찬스
						else if (percent >= 0.3 && percent < 0.4) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Attacker) {
									tempat = (Attacker) team1.get(choice);
									resultEvent1[0][10] = resultEvent1[0][10] + tempat.at_event1(tempat.name, 1);
									resultEvent1[0][6]++;
									loop++;
								}
							}
						}
						// 슛팅
						else if (percent >= 0.4 && percent < 0.6) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Attacker) {
									tempat = (Attacker) team1.get(choice);
									resultEvent1[0][10] = resultEvent1[0][10] + tempat.at_event2(tempat.name, 1);
									resultEvent1[0][7]++;
									loop++;
								}
							}
						}
						// 돌파
						else if (percent >= 0.6 && percent < 0.8) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Attacker) {
									tempat = (Attacker) team1.get(choice);
									resultEvent1[0][10] = resultEvent1[0][10] + tempat.at_event3(tempat.name, 1);
									resultEvent1[0][8]++;
									loop++;
								}
							}
						}
						// 태클
						else if (percent >= 0.8 && percent < 1) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team1.get(choice) instanceof Defender) {
									tempdf = (Defender) team1.get(choice);
									tempdf.df_event1(tempdf.name);
									resultEvent1[0][9]++;
									loop++;
								}
							}
						}

					}

					// team2 event
					else {
						percent = Math.random();
						System.out.print("전반" + i + "분: ");
						// VAR
						if (percent < 0.01) {
							choice = random.nextInt(10) + 1;
							System.out.print("                                                        ");
							team2.get(choice).event3(team2.get(choice).name);
							resultEvent1[1][0]++;
						}
						// 레드카드
						else if (percent >= 0.01 && percent < 0.02) {
							choice = random.nextInt(10) + 1;
							System.out.print("                                                        ");
							team2.get(choice).event2(team2.get(choice).name);
							resultEvent1[1][1]++;
						}
						// 옐로카드
						else if (percent >= 0.02 && percent < 0.04) {
							choice = random.nextInt(10) + 1;
							System.out.print("                                                        ");
							team2.get(choice).event1(team2.get(choice).name);
							resultEvent1[1][2]++;
						}
						// 패널티킥
						else if (percent >= 0.04 && percent < 0.1) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Midfielder) {
									System.out.print("                                                        ");
									tempmd = (Midfielder) team2.get(choice);
									tempmd.md_event1(tempmd.name);
									resultEvent1[1][3]++;
									loop++;
								}
							}
						}
						// 프리킥
						else if (percent >= 0.1 && percent < 0.2) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Midfielder) {
									System.out.print("                                                        ");
									tempmd = (Midfielder) team2.get(choice);
									resultEvent1[1][10] = resultEvent1[1][10] + tempmd.md_event2(tempmd.name, 2);
									resultEvent1[1][4]++;
									loop++;
								}
							}
						}
						// 오프사이드
						else if (percent >= 0.2 && percent < 0.3) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Midfielder) {
									System.out.print("                                                        ");
									tempmd = (Midfielder) team2.get(choice);
									tempmd.md_event3(tempmd.name);
									resultEvent1[1][5]++;
									loop++;
								}
							}
						}
						// 1:1 찬스
						else if (percent >= 0.3 && percent < 0.4) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Attacker) {
									System.out.print("                                                        ");
									tempat = (Attacker) team2.get(choice);
									resultEvent1[1][10] = resultEvent1[1][10] + tempat.at_event1(tempat.name, 2);
									resultEvent1[1][6]++;
									loop++;
								}
							}
						}
						// 슛팅
						else if (percent >= 0.4 && percent < 0.6) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Attacker) {
									System.out.print("                                                        ");
									tempat = (Attacker) team2.get(choice);
									resultEvent1[1][10] = resultEvent1[1][10] + tempat.at_event2(tempat.name, 2);
									resultEvent1[1][7]++;
									loop++;
								}
							}
						}
						// 돌파
						else if (percent >= 0.6 && percent < 0.8) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Attacker) {
									System.out.print("                                                        ");
									tempat = (Attacker) team2.get(choice);
									resultEvent1[1][10] = resultEvent1[1][10] + tempat.at_event3(tempat.name, 2);
									resultEvent1[1][8]++;
									loop++;
								}
							}
						}
						// 태클
						else if (percent >= 0.8 && percent < 1) {
							int loop = 0;
							while (loop == 0) {
								choice = random.nextInt(10) + 1;
								if (team2.get(choice) instanceof Defender) {
									System.out.print("                                                        ");
									tempdf = (Defender) team2.get(choice);
									tempdf.df_event1(tempdf.name);
									resultEvent1[1][9]++;
									loop++;
								}
							}
						}
					}
				}
			}
			// team2 event

		}
		
		return resultEvent1;
	}
}
