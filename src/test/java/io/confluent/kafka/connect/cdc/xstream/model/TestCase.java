package io.confluent.kafka.connect.cdc.xstream.model;

import com.fasterxml.jackson.databind.module.SimpleModule;
import io.confluent.kafka.connect.cdc.ObjectMapperFactory;
import oracle.sql.Datum;

public class TestCase {
  static {
    SimpleModule module = new SimpleModule();
    module.addSerializer(Datum.class, new JsonDatum.Serializer());
    module.addDeserializer(Datum.class, new JsonDatum.Deserializer());
    ObjectMapperFactory.instance.registerModule(module);
  }
  public static void init() {

  }
}
