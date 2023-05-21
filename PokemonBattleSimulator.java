package �߰����;
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
    private String attribute; // �Ӽ� �߰�
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
            System.out.println("���ϸ� ���: " + this.getName() + " vs " + opponent.getName());

            int battleCount = 1;

            while (this.getHP() > 0 && opponent.getHP() > 0) {
                int damage1 = calculateDamage(this, opponent);
                int damage2 = calculateDamage(opponent, this);

                this.hp -= damage2;
                opponent.hp -= damage1;

                System.out.println("���� " + battleCount);
                System.out.println(this.getName() + "��(��) " + opponent.getName() + "���� " + damage1 + "�� �������� �������ϴ�.");
                System.out.println(opponent.getName() + "��(��) " + this.getName() + "���� " + damage2 + "�� �������� �Ծ����ϴ�.");

                battleCount++;
            }

            if (this.getHP() <= 0 && opponent.getHP() <= 0) {
                System.out.println("���º�");
            } else if (this.getHP() <= 0) {
                System.out.println(opponent.getName() + " �¸�!");
                opponent.incrementWinCount();
            } else {
                System.out.println(this.getName() + " �¸�!");
                this.incrementWinCount();
            }

            System.out.println();
        }
    }
    public void battleWithOtherPokemons2(List<Pokemon> pokemons) {
        for (Pokemon opponent : pokemons) {
            System.out.println("���ϸ� ���: " + this.getName() + " vs " + opponent.getName());

            int battleCount = 1;

            while (this.getHP() > 0 && opponent.getHP() > 0) {
                int damage1 = calculateDamage(this, opponent);
                int damage2 = calculateDamage(opponent, this);

              
                opponent.hp -= damage1;
                this.hp -= damage2;

                System.out.println("���� " + battleCount);
                
                System.out.println(opponent.getName() + "��(��) " + this.getName() + "���� " + damage2 + "�� �������� �Ծ����ϴ�.");
                System.out.println(this.getName() + "��(��) " + opponent.getName() + "���� " + damage1 + "�� �������� �������ϴ�.");
                battleCount++;
            }

            if (this.getHP() <= 0 && opponent.getHP() <= 0) {
                System.out.println("���º�");
            } else if (this.getHP() <= 0) {
                System.out.println(opponent.getName() + " �¸�!");
                opponent.incrementWinCount();
            } else {
                System.out.println(this.getName() + " �¸�!");
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
    	if (attacker.getAttribute().equals("�븻")) {
    		if (defender.getAttribute().equals("����") || defender.getAttribute().equals("��ö") || defender.getAttribute().equals("��Ʈ")) {
    			effect = 0.8;
    		}
    		else 
    			effect = 1.0;
    	}
    	else if (attacker.getAttribute().equals("����")) {
    		if (defender.getAttribute().equals("����")||defender.getAttribute().equals("��") || defender.getAttribute().equals("����") || defender.getAttribute().equals("��Ʈ")|| defender.getAttribute().equals("������")|| defender.getAttribute().equals("��")) {
    			effect = 0.8;
    		}
    		else if(defender.getAttribute().equals("�븻")||defender.getAttribute().equals("����")||defender.getAttribute().equals("��ö")||defender.getAttribute().equals("����")||defender.getAttribute().equals("��"))
    		   effect = 1.25;
    		else 
    		   effect = 1.0;}
    	else if (attacker.getAttribute().equals("��Ʈ")) {
    		if (defender.getAttribute().equals("�븻") || defender.getAttribute().equals("��") ) {
    			effect = 0.8;
    		}
    		else if(defender.getAttribute().equals("��Ʈ")||defender.getAttribute().equals("������"))
    			effect = 1.25;
    		else 
    			effect = 1.0;
    	}
    	
		else if (attacker.getAttribute().equals("��")) {
    		if (defender.getAttribute().equals("��") || defender.getAttribute().equals("��") || defender.getAttribute().equals("����")||defender.getAttribute().equals("��Ʈ")||defender.getAttribute().equals("��ö")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("Ǯ")||defender.getAttribute().equals("��"))
    			effect = 1.25;
    		else 
    			effect = 1.0;
    	}
    	
		else if (attacker.getAttribute().equals("�巡��")) {
    		if (defender.getAttribute().equals("��") || defender.getAttribute().equals("��ö") ) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("�巡��"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("��")) {
    		if (defender.getAttribute().equals("����") || defender.getAttribute().equals("����") || defender.getAttribute().equals("Ǯ")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("��")||defender.getAttribute().equals("����")||defender.getAttribute().equals("��ö")||defender.getAttribute().equals("�Ҳ�")||defender.getAttribute().equals("����"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("��")) {
    		if (defender.getAttribute().equals("��") || defender.getAttribute().equals("Ǯ") || defender.getAttribute().equals("�巡��")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("��")||defender.getAttribute().equals("����")||defender.getAttribute().equals("�Ҳ�"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("����")) {
    		if (defender.getAttribute().equals("����") || defender.getAttribute().equals("��") || defender.getAttribute().equals("��ö")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("����")||defender.getAttribute().equals("����")||defender.getAttribute().equals("�Ҳ�"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("����")) {
    		if (defender.getAttribute().equals("����") || defender.getAttribute().equals("����") || defender.getAttribute().equals("��")|| defender.getAttribute().equals("��Ʈ") || defender.getAttribute().equals("��ö")|| defender.getAttribute().equals("�Ҳ�")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("Ǯ")||defender.getAttribute().equals("������")||defender.getAttribute().equals("��"))
    			effect= 1.25;
    		
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("�Ҳ�")) {
    		if (defender.getAttribute().equals("����") || defender.getAttribute().equals("�Ҳ�") || defender.getAttribute().equals("��")|| defender.getAttribute().equals("�巡��")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("����")||defender.getAttribute().equals("��ö")||defender.getAttribute().equals("Ǯ")||defender.getAttribute().equals("����"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("����")) {
    		if (defender.getAttribute().equals("�Ҳ�") || defender.getAttribute().equals("��ö") || defender.getAttribute().equals("��")|| defender.getAttribute().equals("����")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("����")||defender.getAttribute().equals("��")||defender.getAttribute().equals("Ǯ")||defender.getAttribute().equals("�巡��"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("������")) {
    		if (defender.getAttribute().equals("������") || defender.getAttribute().equals("��ö") || defender.getAttribute().equals("��")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("����")||defender.getAttribute().equals("��"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("����")) {
    		if (defender.getAttribute().equals("��") || defender.getAttribute().equals("Ǯ") || defender.getAttribute().equals("����")|| defender.getAttribute().equals("�巡��")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("����")||defender.getAttribute().equals("��"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("��")) {
    		if (defender.getAttribute().equals("��") || defender.getAttribute().equals("��ö") || defender.getAttribute().equals("�Ҳ�")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("����")||defender.getAttribute().equals("�巡��")||defender.getAttribute().equals("��"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
		else if (attacker.getAttribute().equals("Ǯ")) {
    		if (defender.getAttribute().equals("����") || defender.getAttribute().equals("��") || defender.getAttribute().equals("����") || defender.getAttribute().equals("��ö") || defender.getAttribute().equals("�Ҳ�") || defender.getAttribute().equals("��") || defender.getAttribute().equals("�巡��")) {
    			effect = 0.8;
    		}
    		else if (defender.getAttribute().equals("��")||defender.getAttribute().equals("����")||defender.getAttribute().equals("��"))
    			effect= 1.25;
    		else 
    			effect = 1.0;
    	}
    		
    		
    		
    		
    	return effect;
    }

    public int calculateDamage(Pokemon attacker, Pokemon defender) {
        // ������ ��� ���� ���� (�Ӽ� �߰�)
    	double k =10*(attacker.getAttack()/defender.getDefense())*geteffect(attacker, defender);
        int damage = (int)(Math.floor(k)+1);//this.attack - opponent.getDefense();
        if (damage <= 0) {
            damage = 1; // �ּ� ������ 1�� ����
        }

        
        return damage;
    }

    public void takeDamage(int damage) {
        // ü�� ����
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0; // ü���� ������ ���� �ʵ��� ����
        }
    }
}

public class PokemonBattleSimulator {
    public static void main(String[] args) {
        String csvFile = "C:\\4-1\\�ڹ����α׷���\\����\\info.csv"; // ���� CSV ���� ���
        String line;
        String csvSplitBy = ","; // CSV ������ ������ (�Ϲ������� �޸�)

        List<Pokemon> pokemons = new ArrayList<>(); // ���ϸ� ����Ʈ

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int row = 1;
            br.readLine();
            while ((line = br.readLine()) != null && row < 151) { // 151������� �о����
                String[] rowData = line.split(csvSplitBy);

                String name = rowData[1];
                int attack = Integer.parseInt(rowData[2]);
                int defense = Integer.parseInt(rowData[3]);
                int hp = Integer.parseInt(rowData[4]);
                String attribute = rowData[5]; // �Ӽ� �߰�

                Pokemon pokemon = new Pokemon(name, attack, defense, hp, attribute);
                pokemons.add(pokemon);

                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            System.out.println("���� ���ϸ�: " + pokemon.getName());
         
            List<Pokemon> remainingPokemons = new ArrayList<>(pokemons.subList(i + 1, pokemons.size()));
            pokemon.battleWithOtherPokemons(remainingPokemons);
            pokemon.battleWithOtherPokemons2(remainingPokemons);
            System.out.println();

        }
        pokemons.sort(Comparator.comparingInt(Pokemon::getWinCount).reversed());

        System.out.println("���� ���� �¸��� ����� ���ϸ� TOP 5:");
        for (int i = 0; i < 5; i++) {
            Pokemon pokemon = pokemons.get(i);
            System.out.println((i + 1) + ". " + pokemon.getName() + " - �¸� ��: " + pokemon.getWinCount());
        }
    }
}