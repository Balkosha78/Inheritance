public class Sportsman {
    private final String name;
    private final String team;
    private final int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", age=" + age +
                '}';
    }

    public void training() {

            System.out.println("Спортсмены тренируются");

        }

    }

