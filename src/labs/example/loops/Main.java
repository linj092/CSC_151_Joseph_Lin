package labs.example.loops;

public class Main {
    public static void main(String[] args){
    WhileLoop whileLooping = new WhileLoop();
    whileLooping.executeWhileLoop();
    ForLoops forLooping = new ForLoops();
    forLooping.executeForLoop();
    forLooping.sumTwoCounter(2, 5);
    forLooping.sumLoopCounter(5);
    forLooping.printMultiplicationTable(3);
    }
}
