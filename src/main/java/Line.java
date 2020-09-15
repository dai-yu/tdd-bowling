import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;

public class Line {
    List<Frame> lineList;

    Line() {
        lineList = new ArrayList<>(11);
    }

    Line(List<Frame> lineList) {
        this.lineList = lineList;
    }

    public void add(Frame frame) {
        lineList.add(frame);
    }

    public int calculate() {
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            int currentFirst=getFirst(i);
            int currentSecond=getSecond(i);
            int nextFirst=getFirst(i+1);
            int nextSecond=getSecond(i+1);
            int nextTwiceFirst=getFirst(i+2);
            if (i == 9) {
                if (currentFirst == 10) {
                    result[i] = 10 + nextFirst + nextTwiceFirst;
                } else if (currentFirst + nextFirst == 10 && currentFirst != 10) {
                    result[i] = 10 + nextTwiceFirst;
                } else if (currentFirst + nextFirst < 10) {
                    result[i] = currentFirst + nextFirst;
                }
                break;
            }
            if (currentFirst == 10) {
                result[i] = 10 + nextFirst + (nextSecond == 0 ? nextTwiceFirst : nextSecond);
            } else if (currentFirst + currentSecond == 10 && currentFirst != 10) {
                result[i] = 10 + nextFirst;
            } else if (currentFirst + currentSecond < 10) {
                result[i] = currentFirst+ currentSecond;
            }
        }
        OptionalInt reduce = Arrays.stream(result).reduce((acc, item) -> acc + item);
        return reduce.getAsInt();
    }

    public int getFirst(int index){
        return lineList.get(index).getFirst();
    }
    public int getSecond(int index){
        return lineList.get(index).getSecond();
    }
}
