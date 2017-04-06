package de.fortis_it.wondercheck.api;

/**
 * Created by Robert on 03.04.2017.
 */

import java.util.List;
import de.fortis_it.wondercheck.data.Data;
import de.fortis_it.wondercheck.data.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ListController for our REST API
 * mapping the keyword 'list', returning some json test data
 */

@RestController
@RequestMapping("/api/items")

public class ListController {

    @GetMapping()
    public List<Item> returnItemsList() {
        return Data.createTestList();
    }
}
