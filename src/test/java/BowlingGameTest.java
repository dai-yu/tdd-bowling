import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void should_return_score_when_calculate_given_a_line_without_any_strike_or_spare(){
        Line line=new Line();
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2,6));
        line.add(new Frame(2));
        line.add(new Frame(6));
        assertEquals(80, line.calculate());
    }

    @Test
    public void should_return_score_when_calculate_given_a_line_with_Tenth_ball_no_strike_or_spare(){
        Line line=new Line();
        line.add(new Frame(10));
        line.add(new Frame(5,3));
        line.add(new Frame(7,1));
        line.add(new Frame(10));
        line.add(new Frame(1,3));
        line.add(new Frame(10));
        line.add(new Frame(5,2));
        line.add(new Frame(2,4));
        line.add(new Frame(1,1));
        line.add(new Frame(5));
        line.add(new Frame(1));
        assertEquals(90,line.calculate());
    }
}
