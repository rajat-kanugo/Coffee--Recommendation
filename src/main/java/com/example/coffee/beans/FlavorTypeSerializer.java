package com.example.coffee.beans;

import com.example.coffee.beans.entity.Flavor;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

public class FlavorTypeSerializer implements JsonbSerializer<Flavor> {

    @Override
    public void serialize(Flavor flavor, JsonGenerator generator, SerializationContext ctx) {
        generator.write(flavor.name);
    }

}
