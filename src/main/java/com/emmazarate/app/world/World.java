package com.emmazarate.app.world;

import java.util.HashMap;

class World {
    int starting_room = 0;
    HashMap<Integer, Object> rooms = new HashMap<Integer, Object>();
    int[] room_grid;
    int grid_size = 0;

    public World( int starting_room, HashMap<Integer, Object> rooms, int[] room_grid, int grid_size) {
        this.starting_room = starting_room;
        this.rooms = rooms;
        this.room_grid = room_grid;
        this.grid_size = grid_size;
    }


}