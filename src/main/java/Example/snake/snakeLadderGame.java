package Example.snake;

class Snake{
    private int head;
    private int tail;

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }
}

class Ladder{
    private int start;
    private int end;
    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }

}


public class snakeLadderGame {
}
