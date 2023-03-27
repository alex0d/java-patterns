package practice7.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Enemy enemy = new SpecialEnemyAdapter(new SpecialEnemy());
        System.out.println(enemy.attack());
    }
}
