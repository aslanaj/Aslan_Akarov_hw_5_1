import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss b1 = new Boss();
        System.out.println(b1);
        b1.setBossHealth(900);
        b1.setBossDamage(90);
        b1.setBossDefence("Physical");

        System.out.println("Boss health: " + b1.getBossHealth()
                + " boss damage: " + b1.getBossDamage()
                + " boss defence: " + b1.getBossDefence() );


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println();

        }
    }
    // Трудности с вызовом метода и циклом в процессе выполнения

    public static String[] createHeroes() {
        Hero warrior = new Hero(300,25,"Physical");
        Hero thor = new Hero(350,30,"Thunder");
        Hero simba = new Hero(400,40);

        String[] heroes = new String[3];
        heroes[0] = String.valueOf(warrior);
        heroes[1] = String.valueOf(thor);
        heroes[2] = String.valueOf(simba);


        return createHeroes();

    }
}