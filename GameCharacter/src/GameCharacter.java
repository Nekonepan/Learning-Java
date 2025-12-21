public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    // Konstruktor dengan parameter
    public GameCharacter(String in_name, int in_attackHitPoint, int in_attackKickPoint) {
        this.name = in_name;
        this.attackHitPoint = in_attackHitPoint;
        this.attackKickPoint = in_attackKickPoint;
        this.lifePoint = 100; // Nilai default
    }

    // Method hit: menendang lawan (mengurangi lifePoint lawan)
    public void hit(GameCharacter karB) {
        karB.lifePoint -= this.attackHitPoint;
    }

    // Method kick: menendang lawan (mengurangi lifePoint lawan)
    public void kick(GameCharacter karB) {
        karB.lifePoint -= this.attackKickPoint;
    }

    // Method untuk mendapatkan nilai lifePoint
    public int getLifePoint() {
        return this.lifePoint;
    }

    // Method untuk mendapatkan nama karakter
    public String getName() {
        return this.name;
    }
}