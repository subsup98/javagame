import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exploration<HealingPotion, Candy, MonsterBall> {
    private int trainerLevel;
    private Random random;
    private Scanner scanner;
    private double encounterProbability;
    private double pokeballProbability;
    private double candyProbability;
    private double potionProbability;
	private double catchRate;
	private static List<Pokemon> pokemonList = new ArrayList<>();
    private Item.HealingPotion healingPotion;
    private Item.Candy candy;
    private Item.MonsterBall monsterBall;
    
    public Exploration(int trainerLevel, List<Pokemon> pokemonList) {
        this.trainerLevel = trainerLevel;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.encounterProbability = 0.8;
        this.pokeballProbability = 0.6;
        this.candyProbability = 0.4;
        this.potionProbability = 0.4;
        this.catchRate =  0.4 + (trainerLevel * 0.01);
        this.healingPotion = new Item.HealingPotion("회복 물약", 50);
        this.candy = new Item.Candy("사탕", 10);
        this.monsterBall = new Item.MonsterBall("몬스터볼", trainerLevel, catchRate);
    }

    public static void main(String[] args) {
        loadAdditionalInfo();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("==== 포켓몬 탐험 ====");
            System.out.println("1. 탐험을 시작합니다 ");
            System.out.println("2. 메뉴로 돌아가기 ");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int trainerLevel = Trainer.getTrainerLevel();
                    Exploration exploration = new Exploration(trainerLevel, pokemonList);
                    exploration.explore();
                    break;
                case 2:
                    System.out.println("돌아갑니다");
                    running = false;
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    break;
            }

            if (!running) {
                mainmenu mainMenu = new mainmenu();
                mainMenu.startMenu();
            }
        }

        scanner.close();
    }



	public void explore() {
		 boolean continueExploring = true;

	        while (continueExploring) {
	            System.out.println("탐험중");

	            if (random.nextDouble() <= encounterProbability && !pokemonList.isEmpty()) {
	                int event = random.nextInt(2); 

	                if (event == 0) {
	                	int maxPokemonLevel;
	                	int minPokemonLevel;

	                	if (trainerLevel <= 10) {
	                	    minPokemonLevel = 1;
	                	    maxPokemonLevel = 10;
	                	} else {
	                	    minPokemonLevel = 1;
	                	    maxPokemonLevel = 20;
	                	}

	                	int pokemonLevel = minPokemonLevel + random.nextInt(maxPokemonLevel - minPokemonLevel + 1);

	                    int pokemonIndex = random.nextInt(pokemonList.size());
	                    Pokemon encounteredPokemon = pokemonList.get(pokemonIndex);

	                    System.out.println("포켓몬을 마주쳤다: " + encounteredPokemon.getName() + " (레벨 " + pokemonLevel + ")");


	                    System.out.println("1. 포켓몬을 잡는다 ");
	                    System.out.println("2. 도망친다 ");
	                    System.out.print("선택: ");
	                    int choice = scanner.nextInt();
	                    scanner.nextLine();

	                    if (choice == 1) {
	                    	double pokeballProbability = 0.3;
	                        double candyProbability = 0.3;
	                        double potionProbability = 0.4;
	                        if (monsterBall.getNumber() > 0) { 
	                        	if (random.nextDouble() <= catchRate) {
	                                System.out.println("포켓몬을 잡았다!");
	                                monsterBall.setNumber(monsterBall.getNumber() - 1);
	                            } else {
	                                System.out.println("잡는데 실패했다.!");
	                            }
	                        } else {
	                            System.out.println("포켓몬을 잡을 수 있는 몬스터볼이 없습니다!");
	                            System.out.println("포켓몬으로부터 달아났습니다.");
	                        }
	                    } else if (choice == 2) {
	                        System.out.println("포켓몬으로부터 달아났습니다.");
	                    } else {
	                        System.out.println("유효하지 않은선택입니다.");
	                    }
	                } else if (event == 1) {
	                	
	                	
	                	if (event == 1) {
	                        double pokeballProbability = 0.3;
	                        double candyProbability = 0.3;
	                        double potionProbability = 0.4;

	                        if (random.nextDouble() <= pokeballProbability) {
	                            System.out.println("몬스터볼을 발견했다!");
	                           monsterBall.get(1);
	                        } else if (random.nextDouble() <= candyProbability) {
	                            System.out.println("사탕을 발견했다!");
	                            
	                            candy.get(1);
	                        } else if (random.nextDouble() <= potionProbability) {
	                            System.out.println("회복약을 발견했다!");
	                            healingPotion.get(1);
	                        }
	                    }

	            } else {
	                System.out.println("아무것도 발견하지 못했습니다.");
	            }

	            System.out.println();
	            System.out.println("탐험을 계속할까요? (1 - Yes / 2 - No)");
	            int choice = scanner.nextInt();
	            continueExploring = (choice == 1);
	        }
	        }
	    }
       

    private static void loadAdditionalInfo() {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            // 첫 줄 무시
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 7) {
                    String name = parts[0].trim();
                    int level = Integer.parseInt(parts[1].trim());
                    int maxHp = Integer.parseInt(parts[2].trim());
                    int attack = Integer.parseInt(parts[3].trim());
                    int defense = Integer.parseInt(parts[4].trim());
                    String attribute = parts[5].trim();
                    int speed = Integer.parseInt(parts[6].trim());

                    Pokemon pokemon = new Pokemon(name, level, maxHp, attack, defense, attribute, speed);
                    pokemonList.add(pokemon);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading Pokémon data from file: " + e.getMessage());
        }
    }

}
