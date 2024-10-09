package org.example.business;

public class BusinessService {
    public void performOperation() {
        MyBusinessEvent event = new MyBusinessEvent();
        long start = System.nanoTime();
        // Perform critical operation
        event.duration = System.nanoTime() - start;
        event.commit();  // Commit the event to JFR
    }
}
