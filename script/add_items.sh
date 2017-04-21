#!/usr/bin/env bash
for id in {1..5}
do
    curl -i -X POST -H "Content-Type:application/json" -d "{ \"name\" : \"Item_$id\", \"state\" : \"false\" }" http://localhost:8080/items
done