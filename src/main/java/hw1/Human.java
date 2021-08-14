package hw1;

public class Human implements Competitors{
    private int runLength;
    private int jumpHeight;

    public Human(int runLength, int jumpHeight) {
        this.runLength= runLength;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void jump(int height) {
if (height > jumpHeight){
    System.out.println("Я человек, я не перепрыгнул");
} else{
    System.out.println("Я человек, я перепрыгнул");
}
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Я человек, я не пробежал");
        } else{
            System.out.println("Я человек, я пробежал");
        }
    }
}
