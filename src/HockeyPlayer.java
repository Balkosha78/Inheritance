public class HockeyPlayer extends Sportsman{
    int puck;

    public HockeyPlayer(String name, String team, int age, int puck) {
        super(name, team, age);
        this.puck = puck;
    }

    public int getPuck() {
        return puck;
    }

    public void setPuck(int puck) {
        this.puck = puck;
    }

    @Override
    public void training() {
        System.out.println("Хоккеист тренируется");
    }
    public void scoringPuck() {
        if (puck <= 8) {
            System.out.println("Результативность забития шайб Низкая");
        } else {
            System.out.println("Результативность забития шайб Высокая");
        }
    }
}
