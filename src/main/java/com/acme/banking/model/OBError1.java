package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBError1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-20T09:04:29.760021+01:00[Europe/Amsterdam]")
public class OBError1   {
  @JsonProperty("ErrorCode")
  private String errorCode;

  @JsonProperty("Message")
  private String message;

  @JsonProperty("Path")
  private String path;

  @JsonProperty("Url")
  private String url;

  public OBError1 errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Low level textual error code, e.g., UK.OBIE.Field.Missing
   * @return errorCode
  */
  @ApiModelProperty(required = true, value = "Low level textual error code, e.g., UK.OBIE.Field.Missing")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public OBError1 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBIE doesn't standardise this field
   * @return message
  */
  @ApiModelProperty(required = true, value = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBIE doesn't standardise this field")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OBError1 path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
   * @return path
  */
  @ApiModelProperty(value = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public OBError1 url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to help remediate the problem, or provide more information, or to API Reference, or help etc
   * @return url
  */
  @ApiModelProperty(value = "URL to help remediate the problem, or provide more information, or to API Reference, or help etc")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBError1 obError1 = (OBError1) o;
    return Objects.equals(this.errorCode, obError1.errorCode) &&
        Objects.equals(this.message, obError1.message) &&
        Objects.equals(this.path, obError1.path) &&
        Objects.equals(this.url, obError1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, path, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBError1 {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

