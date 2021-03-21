package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBAccount6;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBReadAccount6Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBReadAccount6Data   {
  @JsonProperty("Account")
  
  private List<OBAccount6> account = null;

  public OBReadAccount6Data account(List<OBAccount6> account) {
    this.account = account;
    return this;
  }

  public OBReadAccount6Data addAccountItem(OBAccount6 accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")
  public List<OBAccount6> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount6> account) {
    this.account = account;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadAccount6Data obReadAccount6Data = (OBReadAccount6Data) o;
    return Objects.equals(this.account, obReadAccount6Data.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadAccount6Data {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

