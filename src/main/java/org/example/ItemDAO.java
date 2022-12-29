package org.example;

import java.util.List;

public interface ItemDAO {

    public List<Item> load();

    public void write();

}
