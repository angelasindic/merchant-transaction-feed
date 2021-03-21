package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.Links;
import com.acme.banking.model.Meta;
import com.acme.banking.model.OBReadDataStatement2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBReadStatement2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBReadStatement2   {
  @JsonProperty("Data")
  private OBReadDataStatement2 data;

  @JsonProperty("Links")
  private Links links;

  @JsonProperty("Meta")
  private Meta meta;

  public OBReadStatement2 data(OBReadDataStatement2 data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(required = true, value = "")
  public OBReadDataStatement2 getData() {
    return data;
  }

  public void setData(OBReadDataStatement2 data) {
    this.data = data;
  }

  public OBReadStatement2 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadStatement2 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(value = "")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStatement2 obReadStatement2 = (OBReadStatement2) o;
    return Objects.equals(this.data, obReadStatement2.data) &&
        Objects.equals(this.links, obReadStatement2.links) &&
        Objects.equals(this.meta, obReadStatement2.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStatement2 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

