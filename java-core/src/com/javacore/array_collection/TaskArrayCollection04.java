package com.javacore.array_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskArrayCollection04 {
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("badru", 22);
        data.put("kamal", 33);
        data.put("udin", 44);

        System.out.println(data.get("badru"));
    }
}
