package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Borrowing details
 */
@ApiModel(description = "Borrowing details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBReadProduct2DataOtherProductTypeOverdraft   {
  @JsonProperty("Notes")
  
  private List<String> notes = null;

  @JsonProperty("OverdraftTierBandSet")
  
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet = new ArrayList<>();

  public OBReadProduct2DataOtherProductTypeOverdraft notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  @ApiModelProperty(value = "")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft overdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft addOverdraftTierBandSetItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }

  /**
   * Get overdraftTierBandSet
   * @return overdraftTierBandSet
  */
  @ApiModelProperty(required = true, value = "")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeOverdraft obReadProduct2DataOtherProductTypeOverdraft = (OBReadProduct2DataOtherProductTypeOverdraft) o;
    return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraft.notes) &&
        Objects.equals(this.overdraftTierBandSet, obReadProduct2DataOtherProductTypeOverdraft.overdraftTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, overdraftTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraft {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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

