import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Line {
    List<Frame> lineList;

    Line(){
        lineList=new ArrayList<>(11);
    }
    Line(List<Frame> lineList){
        this.lineList=lineList;
    }
    public void add(Frame frame){
        lineList.add(frame);
    }

    public int calculate(){
        AtomicInteger result= new AtomicInteger();
        lineList.stream().forEach(frame -> result.set(frame.getFirst() + frame.getSecond()+result.get()));
        return result.get();
    }
}
