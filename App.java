public class App {
    public static void main(String[] args) {
        Hero pahlawan = new Hero();
        Enemy musuh = new Enemy();
        Witch penyihir = new Witch();
        Fighter petarung = new Fighter();

        // Static polymorphism pada class Hero dan Enemy
        pahlawan.move("ke UI");
        pahlawan.move("ke UNPAD", 15);
        musuh.move("ke Menteng");
        musuh.move("ke Tebet", 5);

        // Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character[] characters = new Character[] { pahlawan, musuh, penyihir, petarung };

        for (Character character : characters) {
            character.move("ke UMM");
        }

        // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Witch penyihir2 = new Witch();
        Character karakter = (Character) penyihir2;
        Fighter petarung2 = (Fighter) karakter;
        petarung2.move("ke Halfway", 15);
    }
}
