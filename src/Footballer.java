public class Footballer extends Sportsman{
    int goal;
    public Footballer(String name, String team, int age, int goal) {
        super(name, team, age);
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    @Override
    public void training() {
        System.out.println("Футболист тренируется");
    }
    public void scoringGoals() {
        if (goal <= 15) {
            System.out.println("Результативность забития голов Низкая");
        } else {
            System.out.println("Результативность забития голов Высокая");
        }
    }
}
