package hw1;

public class Robot implements Competitors{
    private int runLength;
    private int jumpHeight;



    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public void jump(int height) {
        if (height > jumpHeight){
            System.out.println("Я робот, я не перепрыгнул");
        } else{
            System.out.println("Я робот, я перепрыгнул");
    }}

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Я робот, я не пробежал");
        } else{
            System.out.println("Я робот, я пробежал");
    }
}}
