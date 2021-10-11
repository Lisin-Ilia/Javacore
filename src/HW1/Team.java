package HW1;

public class Team {

    public String teamName;
    public String name;
    public int power;
    public int run;
    public int jump;

    public Team(String name, int power, int run, int jump) {
        this.name = name;
        this.power = power;
        this.run = run;
        this.jump = jump;
    }
    public Team(String teamName) {
        this.teamName = teamName;

    }

    public void infoGamers() {
        System.out.println("name " + name + " ,power = " + power + " ,run = " + run + " ,jump = " + jump);
    }
    public void course(int powerLim, int runLim, int jumpLim) {
        if (powerLim < power && runLim < run && jumpLim < jump) {
            System.out.println(name + " finish " );
        } else {
            System.out.println(name + " not finish ");
        }
    }

}
