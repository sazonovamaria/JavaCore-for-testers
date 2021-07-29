package hw1;

import java.sql.SQLOutput;

public class Mainmain {

    public static void main(String[] args) {

        Competitors[] competitors = {new Human(10, 6), new Cat(5, 3),
                new Robot(15, 10)};
        Overcomable[] overcomables = {new Wall(10), new RaceTrack(14)};


        for (Competitors competitors1: competitors){
            for (Overcomable overcomable : overcomables){
                overcomable.overcome(competitors1);

            }
        }
    }
}
