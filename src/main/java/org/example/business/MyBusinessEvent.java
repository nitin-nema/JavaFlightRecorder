package org.example.business;

import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

@Name("com.example.business.org.example.business.MyBusinessEvent")
@Label("Business Event")
public class MyBusinessEvent extends Event {
    @Label("Event Duration")
    long duration;
}
