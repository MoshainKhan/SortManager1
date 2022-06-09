package sparta.com.logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        if (record.getMessage().contains("Hello")) {
            return false;
        }else {
            return false;
        }
    }
}
