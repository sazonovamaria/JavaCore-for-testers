package hw1;

public class RaceTrack implements Overcomable{
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

public void overcome(Competitors competitors) {
        competitors.run(distance);
}


    }

