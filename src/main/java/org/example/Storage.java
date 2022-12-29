package org.example;

import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, Item> list;

    public Storage(Map<String, Item> list) {
        this.list = list;
    }

    public Map<String, Item> getList() {
        return list;
    }
}
