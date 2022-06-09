package sparta.com.SortManager;

import sparta.com.logging.CustomFilter;
import sparta.com.logging.CustomFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    private static Logger logger = Logger.getLogger("my logger");

    public static void main(String[] args) {
        try {
            Handler fileHandler = new FileHandler("src/main/java/sparta/com/logging",true);
            logger.addHandler(fileHandler);
            logger.setFilter(new CustomFilter());
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.setLevel(Level.FINE);
        System.out.println(logger.getLevel());
        logger.log(Level.INFO,"This is an Information message");
        logger.log(Level.FINE,"This is an FINE message");
        logger.log(Level.WARNING,"This is an WARNING message");
    }

}
