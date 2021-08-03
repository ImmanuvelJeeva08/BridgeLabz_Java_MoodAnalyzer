import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTestRefactor {

    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzerRefactor moodAnalyzer = new MoodAnalyzerRefactor("This is a sad message");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzerRefactor moodAnalyzer = new MoodAnalyzerRefactor("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood1,"HAPPY");

    }
}
