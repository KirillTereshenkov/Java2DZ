package HomeWork1;

public class Main {
    public static void main(String[] args) {
        //Команда
        Team myTeam = new Team("Top Team");

        System.out.println(myTeam.getTeamName("Top Team\n"));

        Team[] teams = {
                myTeam,
                new Team(1, "Кирилл", 30, "Внимательность"),
                new Team( 2, "Иван", 29, "Сила"),
                new Team(3, "Алексей", 31, "Ловкость"),
                new Team(4, "Ярослав", 28, "Хитрость")
        };
        for (int i = 1; i < teams.length; i++) {
            System.out.println("\nПолная информация об участниках:\n" + teams[i].getFullInfo());
        }
        System.out.println("");

        // Полоса препядствий
        Course myCourse = new Course("Race of Heroes");
        System.out.println(myCourse.getCourseName("Race of Heroes\n"));
        System.out.println("Этапы: ");
        Course.printCourse(myCourse.course);
    }
}



