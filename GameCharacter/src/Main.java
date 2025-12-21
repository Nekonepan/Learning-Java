public class Main {
    public static void main(String[] args) {
        // Langkah 1: Buat objek Raiden
        GameCharacter Raiden = new GameCharacter("Raiden", 10, 20);

        // Langkah 2: Buat objek Sub-Zero
        GameCharacter SubZero = new GameCharacter("Sub-Zero", 5, 25);

        // Langkah 3: Raiden menyerang Sub-Zero dengan pukulan (hit)
        Raiden.hit(SubZero);

        // Langkah 4: Sub-Zero membalas dengan tendangan (kick)
        SubZero.kick(Raiden);

        // Langkah 5: Sub-Zero menyerang Raiden lagi dengan pukulan sebanyak 3x
        for (int i = 0; i < 3; i++) {
            SubZero.hit(Raiden);
        }

        // Langkah 6: Raiden menyerang Sub-Zero dengan tendangan beruntun 4x
        for (int i = 0; i < 4; i++) {
            Raiden.kick(SubZero);
        }

        // Langkah 7: Tampilkan lifePoint kedua karakter
        System.out.println("LifePoint " + Raiden.getName() + ": " + Raiden.getLifePoint());
        System.out.println("LifePoint " + SubZero.getName() + ": " + SubZero.getLifePoint());

        // Langkah 8: Tampilkan status kemenangan
        if (Raiden.getLifePoint() > SubZero.getLifePoint()) {
            System.out.println("Pemenang: " + Raiden.getName());
        } else if (SubZero.getLifePoint() > Raiden.getLifePoint()) {
            System.out.println("Pemenang: " + SubZero.getName());
        } else {
            System.out.println("Pertarungan berakhir seri.");
        }
    }
}