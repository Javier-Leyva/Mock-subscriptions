package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object with the information of the user, brand and cost.
 */
@ApiModel(description = "Object with the information of the user, brand and cost.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class UserPlanIdModel   {
  @JsonProperty("cost")
  private Float cost = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Express with a word the time of the plan.
   */
  public enum TimeGapWordEnum {
    MONTHLY("MONTHLY"),
    
    ANNUAL("ANNUAL"),
    
    BIMONTHLY("BIMONTHLY"),
    
    BIANNUAL("BIANNUAL"),
    
    TRIANNUAL("TRIANNUAL");

    private String value;

    TimeGapWordEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TimeGapWordEnum fromValue(String text) {
      for (TimeGapWordEnum b : TimeGapWordEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("timeGapWord")
  private TimeGapWordEnum timeGapWord = null;

  @JsonProperty("userId")
  private String userId = null;

  public UserPlanIdModel cost(Float cost) {
    this.cost = cost;
    return this;
  }

  /**
   * The price of the plan.
   * @return cost
  **/
  @ApiModelProperty(example = "-132.82", value = "The price of the plan.")


  public Float getCost() {
    return cost;
  }

  public void setCost(Float cost) {
    this.cost = cost;
  }

  public UserPlanIdModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The plan of the brand selected by the user.
   * @return name
  **/
  @ApiModelProperty(example = "Apple Music Student", value = "The plan of the brand selected by the user.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserPlanIdModel timeGapWord(TimeGapWordEnum timeGapWord) {
    this.timeGapWord = timeGapWord;
    return this;
  }

  /**
   * Express with a word the time of the plan.
   * @return timeGapWord
  **/
  @ApiModelProperty(example = "MONTHLY", value = "Express with a word the time of the plan.")


  public TimeGapWordEnum getTimeGapWord() {
    return timeGapWord;
  }

  public void setTimeGapWord(TimeGapWordEnum timeGapWord) {
    this.timeGapWord = timeGapWord;
  }

  public UserPlanIdModel userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user associated with the plan.
   * @return userId
  **/
  @ApiModelProperty(example = "F62098302", value = "The id of the user associated with the plan.")

@Size(max=36) 
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPlanIdModel userPlanIdModel = (UserPlanIdModel) o;
    return Objects.equals(this.cost, userPlanIdModel.cost) &&
        Objects.equals(this.name, userPlanIdModel.name) &&
        Objects.equals(this.timeGapWord, userPlanIdModel.timeGapWord) &&
        Objects.equals(this.userId, userPlanIdModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, name, timeGapWord, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPlanIdModel {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeGapWord: ").append(toIndentedString(timeGapWord)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

