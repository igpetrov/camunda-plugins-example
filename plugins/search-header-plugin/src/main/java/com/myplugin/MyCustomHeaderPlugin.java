package com.myplugin;

import io.camunda.plugin.search.header.CustomHeader;
import io.camunda.plugin.search.header.DatabaseCustomHeaderSupplier;
import java.util.UUID;

public class MyCustomHeaderPlugin implements DatabaseCustomHeaderSupplier {

  @Override
  public CustomHeader getElasticsearchCustomHeader() {
    var x = new CustomHeader("X-Custom-Header", UUID.randomUUID().toString());
    System.out.println(x);
    return x;
  }
}
