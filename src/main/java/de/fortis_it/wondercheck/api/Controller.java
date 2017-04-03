package de.fortis_it.wondercheck.api;

/**
 * Created by Robert on 03.04.2017.
 */

import de.fortis_it.wondercheck.data.Data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for our REST API
 * mapping the keyword 'list', returning some json test data
 */
@RestController
public class Controller {

    @RequestMapping("/list")
    public String returnItemList() {
        return Data.jsonFromDataList(Data.testDataList());
    }
}
