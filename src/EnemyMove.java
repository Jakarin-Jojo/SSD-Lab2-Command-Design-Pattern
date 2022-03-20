public class EnemyMove extends Enemy{
    public EnemyMove(int x, int y) {
        super(x, y);
    }

    public void patternMoving() {
        turnEast();
        move();
    }
}
