
public class Trainer {
    private String Name;
    private int Level;
    private int EXP;
    private int Badge;

    public Trainer(String Name, int Level, int EXP, int Badge) {
        this.Name = Name;
        this.Level = Level;
        this.EXP = EXP;
        this.Badge = Badge;
    }

    public void Levelup(String Name, int Level) {
        if (this.Name.equals(Name)) {  
            this.Level += Level;
        }
    }

    public void Get_EXP(String Name, int EXP) {
        if (this.Name.equals(Name)) {
            this.EXP += EXP;
        }
    }
  /*뱃지 string으로 받아서 배열로 처리하는거 어떨까요 */
   /* 현재코드는 정수형으로
   뱃지필드에서 뱃지를 더하면서 수를 늘리게 해놨습니다*/
    public void Get_Badge(String Name, int Badge) {
        if (this.Name.equals(Name)) {
            this.Badge += Badge;  
        }
    }

    public void Trainer_Info(String Name) {
        if (this.Name.equals(Name)) {
            System.out.println("Name: " + this.Name);
            System.out.println("Level: " + this.Level);
            System.out.println("EXP: " + this.EXP);
            System.out.println("Badge: " + this.Badge);
        }	
    }
}

