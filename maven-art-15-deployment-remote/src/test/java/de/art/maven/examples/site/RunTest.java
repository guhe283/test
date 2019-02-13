package de.art.maven.examples.site;

import org.junit.Assert;
import org.junit.Test;

public class RunTest {
    @Test
    public void runTest() {
        System.out.println("Run");
        Assert.assertTrue(true);
    }

    @Test
    public void runOtherTest() {
        System.out.println("Run Other");
        Assert.assertTrue(true);
    }
}
