package 중간고사;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Pokemon {
    private String name;
    private int attack;
    private int defense;
    private int hp;
    private String attribute; // 속성 추가
    private int winCount;
    private double effect;
    public Pokemon(String name, int attack, int defense, int hp, String attribute) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.attribute = attribute;
        this.winCount = 0;
    }
    public void battleWithOtherPokemons(List<Pokemon> pokemons) {
        for (Pokemon opponent : pokemons) {
            System.out.println("포켓몬 대결: " + this.getName() + " vs " + opponent.getName());

            int battleCount = 1;

            while (this.getHP() > 0 && opponent.getHP() > 0) {
                int damage1 = calculateDamage(this, opponent);
                int damage2 = calculateDamage(opponent, this);

                this.hp -= damage2;
                opponent.hp -= damage1;

                System.out.println("라운드 " + battleCount);
                System.out.println(this.getName() + "이(가) " + opponent.getName() + "에게 " + damage1 + "의 데미지를 입혔습니다.");
                System.out.println(opponent.getName() + "이(가) " + this.getName() + "에게 " + damage2 + "의 데미지를 입었습니다.");

                battleCount++;
            }

            if (this.getHP() <= 0 && opponent.getHP() <= 0) {
                System.out.println("무승부");
            } else if (this.getHP() <= 0) {
                System.out.println(opponent.getName() + " 승리!");
                opponent.incrementWinCount();
            } else {
                System.out.println(this.getName() + " 승리!");
                this.incrementWinCount();
            }

            System.out.println();
        }
    }
    public void battleWithOtherPokemons2(List<Pokemon> pokemons) {
        for (Pokemon opponent : pokemons) {
            System.out.println("포켓몬 대결: " + this.getName() + " vs " + opponent.getName());

            int battleCount = 1;

            while (this.getHP() > 0 && opponent.getHP() > 0) {
                int damage1 = calculateDamage(this, opponent);
                int damage2 = calculateDamage(opponent, this);

              
                opponent.hp -= damage1;
                this.hp -= damage2;

                System.out.println("라운드 " + battleCount);
                
                System.out.println(opponent.getName() + "이(가) " + this.getName() + "에게 " + damage2 + "의 데미지를 입었습니다.");
                System.out.println(this.getName() + "이(가) " + opponent.getName() + "에게 " + damage1 + "의 데미지를 입혔습니다.");
                battleCount++;
            }

            if (this.getHP() <= 0 && opponent.getHP() <= 0) {
                System.out.println("무승부");
            } else if (this.getHP() <= 0) {
                System.out.println(opponent.getName() + " 승리!");
                opponent.incrementWinCount();
            } else {
                System.out.println(this.getName() + " 승리!");
                this.incrementWinCount();
            }

            System.out.println();
        }
    }
    public void incrementWinCount() {
        winCount++;
    }
    public int getWinCount() {
    	return winCount;
    }
    

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHP() {
        return hp;
    }

    public String getAttribute() {
        return attribute;
    }
    public double geteffect(Pokemon attacker, Pokemon defender) {
    	if (attacker.getAttribute().equals("노말")) {
    		if (defender.getAttribute().equals("바위") || defender.getAttribute().equals("강철") || defender.getAttribute().equals("고스트")) {
    			effect = 0.8;
    		}
    		else 
    			effect = 1.0;
    	}
    	else if (attacker.getAttribute().equals("격투")) {
    		if (defender.getAttribute().equals("비행")||defender.getAttribute().equals("독") || defender.getAttribute().equals("벌레") || defender.getAttribute().equals("고스트")|| defender.getAttribute().equals("에스퍼")|| defender.getAttribute().equals("페어리")) {
    			effect = 0.8;
    		}
    		else if(defender.getAttribute().equals("노말")||defender.getAttribute().equals("바위")||defender.getAttribute().equals("강철")||defender.getAttribute().equals("얼음")||defender.getAttribute().equals("악"))
    		   effect = 1.25;
    		else 
    		   effect = 1.0;}
    	else if (attacker.getAttribute().equals("고스트")) {
    		if (defender.getAttribute().equals("노말") || defender.getAttribute().equals("악") ) {
    			effect = 0.8;
    		}
    		else if(defender.getAttribute().equals("고스트")||defender.getAttribute().equals("에스퍼"))
    			effect = 1.25;
    		else 
    			effect = 1.0;
    	}
    	
		else if (attacker.getAttribute().equals("독")) {
    		if (defender.getAttribute().equals("독") || defender.getAttribute().equals("땅") || defender.getAttribute().equals("바위")||defender.getAttribute().equals("고스트")||defender.getAttribute().equals("강철")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("풀")||defender.getAttribute().equals("페어리"))
    			effect = 1.25;
    		else 
    			effect = 1.0;
    	}
    	
		else if (attacker.getAttribute().equals("드래곤")) {
    		if (defender.getAttribute().equals("페어리") || defender.getAttribute().equals("강철") ) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("드래곤"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("땅")) {
    		if (defender.getAttribute().equals("비행") || defender.getAttribute().equals("벌레") || defender.getAttribute().equals("풀")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("독")||defender.getAttribute().equals("바위")||defender.getAttribute().equals("강철")||defender.getAttribute().equals("불꽃")||defender.getAttribute().equals("전기"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("물")) {
    		if (defender.getAttribute().equals("물") || defender.getAttribute().equals("풀") || defender.getAttribute().equals("드래곤")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("땅")||defender.getAttribute().equals("바위")||defender.getAttribute().equals("불꽃"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("바위")) {
    		if (defender.getAttribute().equals("격투") || defender.getAttribute().equals("땅") || defender.getAttribute().equals("강철")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("비행")||defender.getAttribute().equals("벌레")||defender.getAttribute().equals("불꽃"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("벌레")) {
    		if (defender.getAttribute().equals("격투") || defender.getAttribute().equals("비행") || defender.getAttribute().equals("독")|| defender.getAttribute().equals("고스트") || defender.getAttribute().equals("강철")|| defender.getAttribute().equals("불꽃")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("풀")||defender.getAttribute().equals("에스퍼")||defender.getAttribute().equals("악"))
    			effect= 1.25;
    		
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("불꽃")) {
    		if (defender.getAttribute().equals("바위") || defender.getAttribute().equals("불꽃") || defender.getAttribute().equals("물")|| defender.getAttribute().equals("드래곤")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("벌레")||defender.getAttribute().equals("강철")||defender.getAttribute().equals("풀")||defender.getAttribute().equals("얼음"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("얼음")) {
    		if (defender.getAttribute().equals("불꽃") || defender.getAttribute().equals("강철") || defender.getAttribute().equals("물")|| defender.getAttribute().equals("얼음")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("비행")||defender.getAttribute().equals("땅")||defender.getAttribute().equals("풀")||defender.getAttribute().equals("드래곤"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("에스퍼")) {
    		if (defender.getAttribute().equals("에스퍼") || defender.getAttribute().equals("강철") || defender.getAttribute().equals("악")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("격투")||defender.getAttribute().equals("독"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("전기")) {
    		if (defender.getAttribute().equals("땅") || defender.getAttribute().equals("풀") || defender.getAttribute().equals("전기")|| defender.getAttribute().equals("드래곤")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("비행")||defender.getAttribute().equals("물"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("페어리")) {
    		if (defender.getAttribute().equals("독") || defender.getAttribute().equals("강철") || defender.getAttribute().equals("불꽃")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("격투")||defender.getAttribute().equals("드래곤")||defender.getAttribute().equals("악"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("풀")) {
    		if (defender.getAttribute().equals("비행") || defender.getAttribute().equals("독") || defender.getAttribute().equals("벌레") || defender.getAttribute().equals("강철") || defender.getAttribute().equals("불꽃") || defender.getAttribute().equals("플") || defender.getAttribute().equals("드래곤")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("땅")||defender.getAttribute().equals("바위")||defender.getAttribute().equals("물"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
    		
    		
    		
    		
    	return effect;
    }

    public int calculateDamage(Pokemon attacker, Pokemon defender) {
        // 데미지 계산 로직 변경 (속성 추가)
    	double k =10*(attacker.getAttack()/defender.getDefense())*geteffect(attacker, defender);
        int damage = (int)(Math.floor(k)+1);//this.attack - opponent.getDefense();
        if (damage <= 0) {
            damage = 1; // 최소 데미지 1로 설정
        }

        
        return damage;
    }

    public void takeDamage(int damage) {
        // 체력 감소
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0; // 체력이 음수가 되지 않도록 조정
        }
    }
}

public class PokemonBattleSimulator {
    public static void main(String[] args) {
        String csvFile = "C:\\4-1\\자바프로그래밍\\과제\\info.csv"; // 읽을 CSV 파일 경로
        String line;
        String csvSplitBy = ","; // CSV 파일의 구분자 (일반적으로 콤마)

        List<Pokemon> pokemons = new ArrayList<>(); // 포켓몬 리스트

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int row = 1;
            br.readLine();
            while ((line = br.readLine()) != null && row < 151) { // 151행까지만 읽어오기
                String[] rowData = line.split(csvSplitBy);

                String name = rowData[1];
                int attack = Integer.parseInt(rowData[2]);
                int defense = Integer.parseInt(rowData[3]);
                int hp = Integer.parseInt(rowData[4]);
                String attribute = rowData[5]; // 속성 추가

                Pokemon pokemon = new Pokemon(name, attack, defense, hp, attribute);
                pokemons.add(pokemon);

                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            System.out.println("현재 포켓몬: " + pokemon.getName());
         
            List<Pokemon> remainingPokemons = new ArrayList<>(pokemons.subList(i + 1, pokemons.size()));
            pokemon.battleWithOtherPokemons(remainingPokemons);
            pokemon.battleWithOtherPokemons2(remainingPokemons);
            System.out.println();

        }
        pokemons.sort(Comparator.comparingInt(Pokemon::getWinCount).reversed());

        System.out.println("가장 많은 승리를 기록한 포켓몬 TOP 5:");
        for (int i = 0; i < 5; i++) {
            Pokemon pokemon = pokemons.get(i);
            System.out.println((i + 1) + ". " + pokemon.getName() + " - 승리 수: " + pokemon.getWinCount());
        }
    }
}