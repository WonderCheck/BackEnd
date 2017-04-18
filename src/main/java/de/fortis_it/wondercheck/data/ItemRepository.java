package de.fortis_it.wondercheck.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
    List<Item> findAll();
    Item save( Item persisted );
    void delete( Item deleted );
}
