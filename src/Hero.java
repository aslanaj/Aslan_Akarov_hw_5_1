public class Hero {

    private int heroesHealth;
    private int heroesDamage;
    private String superPower;

    public Hero(int heroesHealth, int heroesDamage, String superPower) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.superPower = superPower;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
