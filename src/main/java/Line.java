import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
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
        int[] result=new int[10];
        for(int i=0;i<10;i++){
            Frame frame=lineList.get(i);
            if (i==9){
                if (frame.getFirst()==10){
                    result[i]=10+lineList.get(i+1).getFirst()+lineList.get(i+2).getFirst();
                }else if(frame.getFirst()+lineList.get(i+1).getFirst()==10){
                    result[i]=10+lineList.get(i+2).getFirst();
                }else if (frame.getFirst()+lineList.get(i+1).getFirst()<10){
                    result[i]=frame.getFirst()+lineList.get(i+1).getFirst();
                }
                break;
            }
            if(frame.getFirst()==10){
                result[i]=10+lineList.get(i+1).getFirst()+lineList.get(i+1).getSecond();
            }else if (frame.getFirst()+frame.getSecond()==10){
                result[i]=10+lineList.get(i+1).getFirst();
            }else if(frame.getFirst()+frame.getSecond()<10){
                result[i]=frame.getFirst()+frame.getSecond();
            }
        }
        OptionalInt reduce = Arrays.stream(result).reduce((acc, item) -> acc + item);
        return reduce.getAsInt();
    }
}
