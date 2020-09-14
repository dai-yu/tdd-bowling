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
        line.add(new Frame(2,6));
        line.add(new Frame(2));
        assertEquals(82, line.calculate());
    }
}
