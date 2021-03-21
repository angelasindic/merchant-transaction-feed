package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount10;
import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.acme.banking.model.OBBankTransactionCodeStructure1;
import com.acme.banking.model.OBCreditDebitCode1;
import com.acme.banking.model.OBCurrencyExchange5;
import com.acme.banking.model.OBEntryStatus1Code;
import com.acme.banking.model.OBTransactionCardInstrument1;
import com.acme.banking.model.OBTransactionMutability1Code;
import com.acme.banking.model.ProprietaryBankTransactionCodeStructure1;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Provides further details on an entry in the report.
 */
@ApiModel(description = "Provides further details on an entry in the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBTransaction6Basic   {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("TransactionId")
  private String transactionId;

  @JsonProperty("TransactionReference")
  private String transactionReference;

  @JsonProperty("StatementReference")
  
  private List<String> statementReference = null;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode1 creditDebitIndicator;

  @JsonProperty("Status")
  private OBEntryStatus1Code status;

  @JsonProperty("TransactionMutability")
  private OBTransactionMutability1Code transactionMutability;

  @JsonProperty("BookingDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingDateTime;

  @JsonProperty("ValueDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime valueDateTime;

  @JsonProperty("AddressLine")
  private String addressLine;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount9 amount;

  @JsonProperty("ChargeAmount")
  private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount;

  @JsonProperty("CurrencyExchange")
  private OBCurrencyExchange5 currencyExchange;

  @JsonProperty("BankTransactionCode")
  private OBBankTransactionCodeStructure1 bankTransactionCode;

  @JsonProperty("ProprietaryBankTransactionCode")
  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode;

  @JsonProperty("CardInstrument")
  private OBTransactionCardInstrument1 cardInstrument;

  @JsonProperty("SupplementaryData")
  
  private Map<String, Object> supplementaryData = null;

  public OBTransaction6Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBTransaction6Basic transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return transactionId
  */
  @ApiModelProperty(value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OBTransaction6Basic transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
   * @return transactionReference
  */
  @ApiModelProperty(value = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")
  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  public OBTransaction6Basic statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction6Basic addStatementReferenceItem(String statementReferenceItem) {
    if (this.statementReference == null) {
      this.statementReference = new ArrayList<>();
    }
    this.statementReference.add(statementReferenceItem);
    return this;
  }

  /**
   * Get statementReference
   * @return statementReference
  */
  @ApiModelProperty(value = "")
  public List<String> getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(List<String> statementReference) {
    this.statementReference = statementReference;
  }

  public OBTransaction6Basic creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  */
  @ApiModelProperty(required = true, value = "")
  public OBCreditDebitCode1 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction6Basic status(OBEntryStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  public OBEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction6Basic transactionMutability(OBTransactionMutability1Code transactionMutability) {
    this.transactionMutability = transactionMutability;
    return this;
  }

  /**
   * Get transactionMutability
   * @return transactionMutability
  */
  @ApiModelProperty(value = "")
  public OBTransactionMutability1Code getTransactionMutability() {
    return transactionMutability;
  }

  public void setTransactionMutability(OBTransactionMutability1Code transactionMutability) {
    this.transactionMutability = transactionMutability;
  }

  public OBTransaction6Basic bookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

  /**
   * Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return bookingDateTime
  */
  @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public OffsetDateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction6Basic valueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return valueDateTime
  */
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public OBTransaction6Basic addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
   * @return addressLine
  */
  @ApiModelProperty(value = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.")
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction6Basic amount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  public OBActiveOrHistoricCurrencyAndAmount9 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.amount = amount;
  }

  public OBTransaction6Basic chargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
  */
  @ApiModelProperty(value = "")
  public OBActiveOrHistoricCurrencyAndAmount10 getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public OBTransaction6Basic currencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

  /**
   * Get currencyExchange
   * @return currencyExchange
  */
  @ApiModelProperty(value = "")
  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public OBTransaction6Basic bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  /**
   * Get bankTransactionCode
   * @return bankTransactionCode
  */
  @ApiModelProperty(value = "")
  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public OBTransaction6Basic proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  */
  @ApiModelProperty(value = "")
  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction6Basic cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
    return this;
  }

  /**
   * Get cardInstrument
   * @return cardInstrument
  */
  @ApiModelProperty(value = "")
  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }

  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
  }

  public OBTransaction6Basic supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBTransaction6Basic putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
  */
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction6Basic obTransaction6Basic = (OBTransaction6Basic) o;
    return Objects.equals(this.accountId, obTransaction6Basic.accountId) &&
        Objects.equals(this.transactionId, obTransaction6Basic.transactionId) &&
        Objects.equals(this.transactionReference, obTransaction6Basic.transactionReference) &&
        Objects.equals(this.statementReference, obTransaction6Basic.statementReference) &&
        Objects.equals(this.creditDebitIndicator, obTransaction6Basic.creditDebitIndicator) &&
        Objects.equals(this.status, obTransaction6Basic.status) &&
        Objects.equals(this.transactionMutability, obTransaction6Basic.transactionMutability) &&
        Objects.equals(this.bookingDateTime, obTransaction6Basic.bookingDateTime) &&
        Objects.equals(this.valueDateTime, obTransaction6Basic.valueDateTime) &&
        Objects.equals(this.addressLine, obTransaction6Basic.addressLine) &&
        Objects.equals(this.amount, obTransaction6Basic.amount) &&
        Objects.equals(this.chargeAmount, obTransaction6Basic.chargeAmount) &&
        Objects.equals(this.currencyExchange, obTransaction6Basic.currencyExchange) &&
        Objects.equals(this.bankTransactionCode, obTransaction6Basic.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction6Basic.proprietaryBankTransactionCode) &&
        Objects.equals(this.cardInstrument, obTransaction6Basic.cardInstrument) &&
        Objects.equals(this.supplementaryData, obTransaction6Basic.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, transactionMutability, bookingDateTime, valueDateTime, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, cardInstrument, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction6Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

