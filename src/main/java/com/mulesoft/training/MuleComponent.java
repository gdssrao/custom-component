package com.mulesoft.training;

import java.util.Map;

public class MuleComponent {

  public Map<String,String> processMap(Map<String,String> input) {
    // processMap implementation
	  input.put("processdBy","processedMap");
    return input;
  }

  public Map<String,String> processArray() {
    // processArray implementation
    return null;
  }

  public Map<String,String> processString() {
    // processString implementation
    return null;
  }

} 
