public class MoodAnalyzerRefactor {

    private String message;

    //Default Constructor
    public MoodAnalyzerRefactor() {
    }

    //Parameterized Constructor
    public MoodAnalyzerRefactor(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
