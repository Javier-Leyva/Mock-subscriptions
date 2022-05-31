package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class ErrorDetails   {
  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("detailedMessage")
  private String detailedMessage = null;

  /**
   * Gets or Sets errorName
   */
  public enum ErrorNameEnum {
    BAD_REQUEST("BAD_REQUEST"),
    
    UNAUTHORIZED("UNAUTHORIZED"),
    
    UNAUTHORIZED_NO_MVP("UNAUTHORIZED_NO_MVP"),
    
    UNAUTHORIZED_REGKEY_INVALID("UNAUTHORIZED_REGKEY_INVALID"),
    
    UNAUTHORIZED_BAD_CREDENTIALS("UNAUTHORIZED_BAD_CREDENTIALS"),
    
    UNAUTHORIZED_TOKEN_EXPIRED("UNAUTHORIZED_TOKEN_EXPIRED"),
    
    FORBIDDEN("FORBIDDEN"),
    
    NOT_FOUND("NOT_FOUND"),
    
    NOT_FOUND_USER("NOT_FOUND_USER"),
    
    NOT_FOUND_TC("NOT_FOUND_TC"),
    
    NOT_FOUND_FAQ("NOT_FOUND_FAQ"),
    
    NOT_FOUND_PHONE("NOT_FOUND_PHONE"),
    
    NOT_FOUND_RECURRING_PAYMENT("NOT_FOUND_RECURRING_PAYMENT"),
    
    NOT_FOUND_CARD("NOT_FOUND_CARD"),
    
    NOT_FOUND_ACCOUNT("NOT_FOUND_ACCOUNT"),
    
    NOT_FOUND_CATEGORY("NOT_FOUND_CATEGORY"),
    
    NOT_FOUND_USER_BRAND("NOT_FOUND_USER_BRAND"),
    
    NOT_FOUND_DATASOURCE("NOT_FOUND_DATASOURCE"),
    
    NOT_FOUND_LOYALTYSOURCE("NOT_FOUND_LOYALTYSOURCE"),
    
    NOT_FOUND_USER_DATASOURCE("NOT_FOUND_USER_DATASOURCE"),
    
    NOT_FOUND_BRAND_IN_YUDONPAY("NOT_FOUND_BRAND_IN_YUDONPAY"),
    
    NOT_FOUND_PLAN("NOT_FOUND_PLAN"),
    
    NOT_FOUND_NOTIFICATION("NOT_FOUND_NOTIFICATION"),
    
    NOT_FOUND_BRAND("NOT_FOUND_BRAND"),
    
    NOT_ACCEPTABLE("NOT_ACCEPTABLE"),
    
    CONFLICT("CONFLICT"),
    
    CONFLICT_YDP_POINT_ALREADY_EXISTS("CONFLICT_YDP_POINT_ALREADY_EXISTS"),
    
    CONFLICT_USER_ALREADY_EXISTS("CONFLICT_USER_ALREADY_EXISTS"),
    
    CONFLICT_PHONE_ALREADY_EXISTS("CONFLICT_PHONE_ALREADY_EXISTS"),
    
    CONFLICT_OTP_WAIT_TIME("CONFLICT_OTP_WAIT_TIME"),
    
    CONFLICT_OTP_ATTEMPTS_EXCEEDED("CONFLICT_OTP_ATTEMPTS_EXCEEDED"),
    
    CONFLICT_OTP_EXPIRED("CONFLICT_OTP_EXPIRED"),
    
    CONFLICT_OTP_INVALID("CONFLICT_OTP_INVALID"),
    
    INTERNAL("INTERNAL"),
    
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE");

    private String value;

    ErrorNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ErrorNameEnum fromValue(String text) {
      for (ErrorNameEnum b : ErrorNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("errorName")
  private ErrorNameEnum errorName = null;

  @JsonProperty("internalCode")
  private Integer internalCode = null;

  @JsonProperty("shortMessage")
  private String shortMessage = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("timeStamp")
  private OffsetDateTime timeStamp = null;

  public ErrorDetails appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
  **/
  @ApiModelProperty(value = "")


  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ErrorDetails detailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
    return this;
  }

  /**
   * Get detailedMessage
   * @return detailedMessage
  **/
  @ApiModelProperty(value = "")


  public String getDetailedMessage() {
    return detailedMessage;
  }

  public void setDetailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
  }

  public ErrorDetails errorName(ErrorNameEnum errorName) {
    this.errorName = errorName;
    return this;
  }

  /**
   * Get errorName
   * @return errorName
  **/
  @ApiModelProperty(value = "")


  public ErrorNameEnum getErrorName() {
    return errorName;
  }

  public void setErrorName(ErrorNameEnum errorName) {
    this.errorName = errorName;
  }

  public ErrorDetails internalCode(Integer internalCode) {
    this.internalCode = internalCode;
    return this;
  }

  /**
   * Get internalCode
   * @return internalCode
  **/
  @ApiModelProperty(value = "")


  public Integer getInternalCode() {
    return internalCode;
  }

  public void setInternalCode(Integer internalCode) {
    this.internalCode = internalCode;
  }

  public ErrorDetails shortMessage(String shortMessage) {
    this.shortMessage = shortMessage;
    return this;
  }

  /**
   * Get shortMessage
   * @return shortMessage
  **/
  @ApiModelProperty(value = "")


  public String getShortMessage() {
    return shortMessage;
  }

  public void setShortMessage(String shortMessage) {
    this.shortMessage = shortMessage;
  }

  public ErrorDetails status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorDetails timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.appName, errorDetails.appName) &&
        Objects.equals(this.detailedMessage, errorDetails.detailedMessage) &&
        Objects.equals(this.errorName, errorDetails.errorName) &&
        Objects.equals(this.internalCode, errorDetails.internalCode) &&
        Objects.equals(this.shortMessage, errorDetails.shortMessage) &&
        Objects.equals(this.status, errorDetails.status) &&
        Objects.equals(this.timeStamp, errorDetails.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, detailedMessage, errorName, internalCode, shortMessage, status, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    detailedMessage: ").append(toIndentedString(detailedMessage)).append("\n");
    sb.append("    errorName: ").append(toIndentedString(errorName)).append("\n");
    sb.append("    internalCode: ").append(toIndentedString(internalCode)).append("\n");
    sb.append("    shortMessage: ").append(toIndentedString(shortMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

