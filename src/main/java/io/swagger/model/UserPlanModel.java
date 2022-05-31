package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserPlanIdModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object with the information of the plan of the brand selected by the user.
 */
@ApiModel(description = "Object with the information of the plan of the brand selected by the user.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class UserPlanModel   {
  @JsonProperty("currency")
  private Object currency = null;

  @JsonProperty("durationAmount")
  private Integer durationAmount = null;

  @JsonProperty("durationType")
  private String durationType = null;

  @JsonProperty("obsolete")
  private Boolean obsolete = null;

  @JsonProperty("timeObsolete")
  private Long timeObsolete = null;

  @JsonProperty("userPlanId")
  private UserPlanIdModel userPlanId = null;

  public UserPlanModel currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The kind of currency used by the user.
   * @return currency
  **/
  @ApiModelProperty(example = "\"EUR\"", value = "The kind of currency used by the user.")


  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public UserPlanModel durationAmount(Integer durationAmount) {
    this.durationAmount = durationAmount;
    return this;
  }

  /**
   * Duration of months that took or is taking the recurring payment.
   * @return durationAmount
  **/
  @ApiModelProperty(example = "2", value = "Duration of months that took or is taking the recurring payment.")


  public Integer getDurationAmount() {
    return durationAmount;
  }

  public void setDurationAmount(Integer durationAmount) {
    this.durationAmount = durationAmount;
  }

  public UserPlanModel durationType(String durationType) {
    this.durationType = durationType;
    return this;
  }

  /**
   * Is the measure unit. Error of correlation with the periodicityAmount.
   * @return durationType
  **/
  @ApiModelProperty(example = "DAYS", value = "Is the measure unit. Error of correlation with the periodicityAmount.")


  public String getDurationType() {
    return durationType;
  }

  public void setDurationType(String durationType) {
    this.durationType = durationType;
  }

  public UserPlanModel obsolete(Boolean obsolete) {
    this.obsolete = obsolete;
    return this;
  }

  /**
   * Get obsolete
   * @return obsolete
  **/
  @ApiModelProperty(value = "")


  public Boolean isObsolete() {
    return obsolete;
  }

  public void setObsolete(Boolean obsolete) {
    this.obsolete = obsolete;
  }

  public UserPlanModel timeObsolete(Long timeObsolete) {
    this.timeObsolete = timeObsolete;
    return this;
  }

  /**
   * Date since the plan selected by the user is finish (obsolete).
   * @return timeObsolete
  **/
  @ApiModelProperty(value = "Date since the plan selected by the user is finish (obsolete).")


  public Long getTimeObsolete() {
    return timeObsolete;
  }

  public void setTimeObsolete(Long timeObsolete) {
    this.timeObsolete = timeObsolete;
  }

  public UserPlanModel userPlanId(UserPlanIdModel userPlanId) {
    this.userPlanId = userPlanId;
    return this;
  }

  /**
   * Get userPlanId
   * @return userPlanId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserPlanIdModel getUserPlanId() {
    return userPlanId;
  }

  public void setUserPlanId(UserPlanIdModel userPlanId) {
    this.userPlanId = userPlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPlanModel userPlanModel = (UserPlanModel) o;
    return Objects.equals(this.currency, userPlanModel.currency) &&
        Objects.equals(this.durationAmount, userPlanModel.durationAmount) &&
        Objects.equals(this.durationType, userPlanModel.durationType) &&
        Objects.equals(this.obsolete, userPlanModel.obsolete) &&
        Objects.equals(this.timeObsolete, userPlanModel.timeObsolete) &&
        Objects.equals(this.userPlanId, userPlanModel.userPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, durationAmount, durationType, obsolete, timeObsolete, userPlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPlanModel {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    durationAmount: ").append(toIndentedString(durationAmount)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    obsolete: ").append(toIndentedString(obsolete)).append("\n");
    sb.append("    timeObsolete: ").append(toIndentedString(timeObsolete)).append("\n");
    sb.append("    userPlanId: ").append(toIndentedString(userPlanId)).append("\n");
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

