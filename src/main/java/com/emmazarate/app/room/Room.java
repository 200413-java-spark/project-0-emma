package com.emmazarate.app.room;

public class Room {

    String name;
    String description;
    int id = 0;
    int x = 0;
    int y = 0;

    public Room(String name, String description, int id, int x, int y ) {
        System.out.print("Hello from Room");
        this.description = description;
        this.name = name;
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public Room() {}
}