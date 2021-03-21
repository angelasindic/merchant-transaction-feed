package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.CreditInterest1TierBandSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details about the interest that may be payable to the PCA account holders
 */
@ApiModel(description = "Details about the interest that may be payable to the PCA account holders")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class CreditInterest1   {
  @JsonProperty("TierBandSet")
  
  private List<CreditInterest1TierBandSet> tierBandSet = new ArrayList<>();

  public CreditInterest1 tierBandSet(List<CreditInterest1TierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest1 addTierBandSetItem(CreditInterest1TierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
  */
  @ApiModelProperty(required = true, value = "The group of tiers or bands for which credit interest can be applied.")
  public List<CreditInterest1TierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<CreditInterest1TierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest1 creditInterest1 = (CreditInterest1) o;
    return Objects.equals(this.tierBandSet, creditInterest1.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1 {\n");
    
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

