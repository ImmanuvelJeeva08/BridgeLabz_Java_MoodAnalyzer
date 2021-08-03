public class MoodAnalyzerUc2 {

        private String message;

        //Default Constructor
        public MoodAnalyzerUc2() {

        }

        //Parameterized Constructor
        public MoodAnalyzerUc2(String message) {
            this.message = message;
        }

        //Handle NULLPOINTER Exception using try-catch block
        public String analyseMood() {
            try {
                if (message.contains("sad"))
                    return "SAD";
                else
                    return "HAPPY";
            } catch(Exception e) {
                return "HAPPY";
            }
        }
}
