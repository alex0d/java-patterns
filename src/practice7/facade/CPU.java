package practice7.facade;

public class CPU {
    public void jump(long position) {
        System.out.println("jump position = " + position);
    }

    public void execute() {
        System.out.println("execute");
    }
}
