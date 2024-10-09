package org.example.business;

import jdk.jfr.Recording;

public class JFRTest {
    public static void main(String[] args) throws Exception {
        Recording recording = new Recording();
        recording.start();

        // Run your test cases
        runTestCases();

        recording.stop();
        recording.dump(new java.io.File("test-recording.jfr").toPath());
    }

    private static void runTestCases() {
        // Simulate test case execution
        for (int i = 0; i < 100; i++) {
            Math.sin(i);
        }
    }
}
