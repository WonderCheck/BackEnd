package de.fortis_it.wondercheck.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Data {

    /**
     * Create test array of items
     */

    @Autowired
    private ItemRepository repository;

    public List<Item> createTestList() {
        for (int i = 0; i < 10; i++)
            repository.save(new Item("Item0" + i));
        return repository.findAll();
    }
}
