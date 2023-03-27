package practice7.adapter;

public class SpecialEnemyAdapter implements Enemy {
    private final SpecialEnemy specialEnemy;

    public SpecialEnemyAdapter(SpecialEnemy specialEnemy) {
        this.specialEnemy = specialEnemy;
    }

    @Override
    public String attack() {
        return specialEnemy.castSpell();
    }
}
