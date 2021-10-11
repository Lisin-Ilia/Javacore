package HW1;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {


        Team team = new Team("Team");
        Team[]gamers = new Team[4];

        gamers[0] = new Team("Oleg",10,10,2);
        gamers[1] = new Team("Roman",12,11,3);
        gamers[2] = new Team("Igor",12,12,4);
        gamers[3] = new Team("Den",13,13,5);


        for (int i = 0; i < gamers.length; i++) {
            System.out.println(gamers[i].name);
        }



        gamers[0].course(10,5,1);
        gamers[1].course(10,10,1);
        gamers[2].course(10,10,1);
        gamers[3].course(10,10,1);


    }


}
