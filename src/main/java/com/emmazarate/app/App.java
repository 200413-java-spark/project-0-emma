package com.emmazarate.app;

import java.util.HashMap;

import com.emmazarate.app.room.Room;

public class App 
{
    public static void main( String[] args )
    {
        String entry = "445: [(20, 29), {'s': 480, 'e': 446, 'w': 380}],";        
        int room_id = Integer.parseInt(entry.substring(0, 3));
        int start_directions = entry.indexOf("{");
        int end_directions = entry.indexOf("}");
        int start_coords = entry.indexOf("(");
        int end_coords = entry.indexOf(")");
        
        // HashMap<Integer, Object> rooms = new HashMap<Integer, Object>();
        // TODO: create HashMap from txt file
        //for(int i = 0; i < entry_arr.length; i++) {
            String directions = entry.substring(start_directions, end_directions + 1);
            String coords = entry.substring(start_coords, end_coords + 1);
            System.out.println(coords);
            System.out.println(room_id);
            System.out.println(directions);
        // }
        // rooms.put(key, value)
    }

}
