package HomeWork1;

public class Team {
    public String teamName;
    public int teamMemberId;
    public String nameTeamMember;
    public int ageTeamMember;
    public String bestSkill;

    public Team(String teamName) {
        this.teamName = teamName;
    }
    public Team( int teamMemberId, String nameTeamMember, int ageTeamMember, String bestSkill) {
        this.teamMemberId = teamMemberId;
        this.nameTeamMember = nameTeamMember;
        this.ageTeamMember = ageTeamMember;
        this.bestSkill = bestSkill;
}
    String getTeamName(String teamName) {
        return "Название команды:\n" + this.teamName;
    }
    String getFullInfo() {
        return "\nНомер участника: " + this.teamMemberId + ". " +
              "\nИмя Участника: " + this.nameTeamMember + ". " +
              "\nВозраст участника: " + this.ageTeamMember + " лет. " +
               "\nСильная черта: " + this.bestSkill + ".";

    }
}








