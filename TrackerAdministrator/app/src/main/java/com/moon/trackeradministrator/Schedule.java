package com.moon.trackeradministrator;

public class Schedule {
    private String time, id, from;

    public Schedule() {

    }

    public Schedule(String time, String id, String from) {
        this.time = time;
        this.id = id;
        this.from = from;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
