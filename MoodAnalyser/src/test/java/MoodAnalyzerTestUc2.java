import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTestUc2 {

    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzerUc2 moodAnalyzer = new MoodAnalyzerUc2("This is a sad message");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzerUc2 moodAnalyzer = new MoodAnalyzerUc2("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood1,"HAPPY");

    }

    @Test
    public void testMoodAnalysis_whenMoodIsNull() {
        MoodAnalyzerUc2 moodAnalyzer = new MoodAnalyzerUc2(null);
        String mood2 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood2,"HAPPY");

    }
}
