package hw3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();


    public Box() {


    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public boolean compare(Box<T> boxToCompare) {
        return Math.abs(getWeight() - boxToCompare.getWeight()) < 0.001;

        }


        @Override
        public String toString () {
            return "Box{" +
                    "fruitList=" + fruitList +
                    '}';
        }
    }
