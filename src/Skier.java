public class Skier extends Sportsman{
    int raceTime;

    public Skier(String name, String team, int age, int raceTime) {
        super(name, team, age);
        this.raceTime = raceTime;
    }

    public int getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(int raceTime) {
        this.raceTime = raceTime;
    }

    @Override
    public void training() {
        System.out.println("Лыжник тренируется");
    }
    public void bestTime() {
        if (raceTime <= 30) {
            System.out.println("хороший результат забега");
        } else {
            System.out.println("Плохой результат забега");
        }
    }
}
