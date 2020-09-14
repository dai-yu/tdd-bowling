public class Frame {
    int first=0;
    int second=0;
    Frame(int first,int second){
        this.first=first;
        this.second=second;
    }
    Frame(int first){
        this.first=first;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
