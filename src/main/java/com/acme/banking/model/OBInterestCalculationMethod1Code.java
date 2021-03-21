package com.acme.banking.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Methods of calculating interest
 */
public enum OBInterestCalculationMethod1Code {
  
  ITCO("ITCO"),
  
  ITOT("ITOT"),
  
  ITSI("ITSI");

  private String value;

  OBInterestCalculationMethod1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBInterestCalculationMethod1Code fromValue(String value) {
    for (OBInterestCalculationMethod1Code b : OBInterestCalculationMethod1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

