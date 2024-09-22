public class Main {
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("Олег", "Динамо", 27, 10);
        Footballer footballer2 = new Footballer("Михаил", "Локомотив", 26, 16);

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Кирилл", "Звезда", 28, 5);
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Тимофей", "Рассвет", 30, 10);

        Skier skier1 = new Skier("Алексей", "ЦСК", 25, 32);
        Skier skier2 = new Skier("Игорь", "Вымпел", 28, 20);

        footballer1.training();
        System.out.println(footballer1.getName() +  "  " + footballer1.getTeam() +  "  " + footballer1.getAge() +  "  " +  footballer1.getGoal());
        footballer1.scoringGoals();
        footballer2.training();
        System.out.println(footballer2.getName() +  "  " +  footballer2.getTeam() +  "  " +  footballer2.getAge() +  "  " +  footballer2.getGoal());
        footballer2.scoringGoals();
        System.out.println("_________________________________");
        hockeyPlayer1.training();
        hockeyPlayer1.scoringPuck();
        System.out.println(hockeyPlayer1.getName() +  "  " +  hockeyPlayer1.getTeam() +  "  " +  hockeyPlayer1.getAge() +  "  " +  hockeyPlayer1.getPuck());
        hockeyPlayer2.training();
        hockeyPlayer2.scoringPuck();
        System.out.println(hockeyPlayer2.getName() +  "  " +  hockeyPlayer2.getTeam() +  "  " +  hockeyPlayer2.getAge() +  "  " +  hockeyPlayer2.getPuck());
        System.out.println("_________________________________");
        skier1.training();
        System.out.println(skier1.getName() +  "  " +  skier1.getTeam() +  "  " +  skier1.getAge() +  "  " +  skier1.getRaceTime());
        skier1.bestTime();
        skier2.training();
        System.out.println(skier2.getName() +  "  " +  skier2.getTeam() +  "  " +  skier2.getAge() +  "  " +  skier2.getRaceTime());
        skier2.bestTime();
        System.out.println("_________________________________");
        }
}
