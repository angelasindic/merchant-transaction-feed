package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OtherFeesChargesFeeChargeCap;
import com.acme.banking.model.OtherFeesChargesFeeChargeDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OtherFeesCharges   {
  @JsonProperty("FeeChargeDetail")
  
  private List<OtherFeesChargesFeeChargeDetail> feeChargeDetail = new ArrayList<>();

  @JsonProperty("FeeChargeCap")
  
  private List<OtherFeesChargesFeeChargeCap> feeChargeCap = null;

  public OtherFeesCharges feeChargeDetail(List<OtherFeesChargesFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesCharges addFeeChargeDetailItem(OtherFeesChargesFeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return feeChargeDetail
  */
  @ApiModelProperty(required = true, value = "Other fees/charges details")
  public List<OtherFeesChargesFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OtherFeesChargesFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesCharges feeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesCharges addFeeChargeCapItem(OtherFeesChargesFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
  */
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
  public List<OtherFeesChargesFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesCharges otherFeesCharges = (OtherFeesCharges) o;
    return Objects.equals(this.feeChargeDetail, otherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, otherFeesCharges.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges {\n");
    
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

