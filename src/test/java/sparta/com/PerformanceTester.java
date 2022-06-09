package sparta.com;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTester {

    private static int[] arraySort;
    private int[] arrayUnsort;

    @BeforeAll
    public static void classSetup(){
        Random random= new Random();
        arraySort= new int[];
        for (int i=0; i<100;i++){
            arraySort[i] =random.nextInt(1000)+1;
        }
    }
    @BeforeEach
    public void setup(){arrayUnsort=arraySort.clone();}

    @Test

    public void
}
