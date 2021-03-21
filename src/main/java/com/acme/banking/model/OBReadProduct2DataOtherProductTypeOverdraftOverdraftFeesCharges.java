package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Overdraft fees and charges
 */
@ApiModel(description = "Overdraft fees and charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges   {
  @JsonProperty("OverdraftFeeChargeCap")
  
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<>();

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges overdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges addOverdraftFeeChargeCapItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
  */
  @ApiModelProperty(value = "")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges overdraftFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges addOverdraftFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeDetail
   * @return overdraftFeeChargeDetail
  */
  @ApiModelProperty(required = true, value = "")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges) o;
    return Objects.equals(this.overdraftFeeChargeCap, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges {\n");
    
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

