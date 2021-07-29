package hw1;

public class Cat implements Competitors {

    private int runLength;
    private int jumpHeight;

    public Cat(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }






    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я кот, я не перепрыгнул");
        } else {
            System.out.println("Я кот, я перепрыгнул");
        }}

        @Override
        public void run ( int length){
            if (length > runLength) {
                System.out.println("Я кот, я не пробежал");
            } else {
                System.out.println("Я кот, я пробежал");
            }
        }
    }