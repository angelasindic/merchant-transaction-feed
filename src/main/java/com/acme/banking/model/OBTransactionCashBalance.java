package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBBalanceType1Code;
import com.acme.banking.model.OBCreditDebitCode2;
import com.acme.banking.model.OBTransactionCashBalanceAmount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 */
@ApiModel(description = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBTransactionCashBalance   {
  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode2 creditDebitIndicator;

  @JsonProperty("Type")
  private OBBalanceType1Code type;

  @JsonProperty("Amount")
  private OBTransactionCashBalanceAmount amount;

  public OBTransactionCashBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  */
  @ApiModelProperty(required = true, value = "")
  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransactionCashBalance type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBTransactionCashBalance amount(OBTransactionCashBalanceAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  public OBTransactionCashBalanceAmount getAmount() {
    return amount;
  }

  public void setAmount(OBTransactionCashBalanceAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransactionCashBalance obTransactionCashBalance = (OBTransactionCashBalance) o;
    return Objects.equals(this.creditDebitIndicator, obTransactionCashBalance.creditDebitIndicator) &&
        Objects.equals(this.type, obTransactionCashBalance.type) &&
        Objects.equals(this.amount, obTransactionCashBalance.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCashBalance {\n");
    
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

