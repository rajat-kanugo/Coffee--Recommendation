package com.example.coffee.beans.entity;

import com.example.coffee.beans.FlavorTypeSerializer;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.json.bind.annotation.JsonbTypeSerializer;
import java.util.Objects;

/**
 * The Coffee flavors, following https://notbadcoffee.com/flavor-wheel-en.
 */
@NodeEntity
@JsonbTypeSerializer(FlavorTypeSerializer.class)
public class Flavor {

    @Id
    public String name;

    private Flavor() {
    }

    public Flavor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flavor flavor = (Flavor) o;
        return Objects.equals(name, flavor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
