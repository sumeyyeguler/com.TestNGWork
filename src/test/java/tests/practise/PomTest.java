package tests.practise;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PomTest {
    @Test
    public void test() {
        //Verify that we have pom.xml file in our project => please try in 4 min
        //dosya yolunu almak için copy>absolute path diyebiliriz,daha garantidir.
        String pomDosyaYolu="C:\\Users\\90552\\IdeaProjects\\com.TestNGWork\\pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(pomDosyaYolu)));

    }
}
