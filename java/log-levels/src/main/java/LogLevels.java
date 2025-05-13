public class LogLevels {
    
    public static String message(String logLine) {
    	String[] vector = logLine.split(":",2);
        return vector[1].trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf("]");
        return logLine.substring(1,index).toLowerCase();
    }

    public static String reformat(String logLine) {
       return message(logLine) + " (" + logLevel(logLine) + ")";
    }
    
}
