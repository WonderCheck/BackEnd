package de.fortis_it.wondercheck.api;

import java.util.List;
import de.fortis_it.wondercheck.data.Data;
import de.fortis_it.wondercheck.data.Item;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")

public class ListController {

    /**
     * ListController for our REST API
     * mapping 'list', returning some json test data
     * @return List of Item
     */

    @GetMapping
    public List<Item> returnItemsList() {
        return Data.createTestList();
    }
}
