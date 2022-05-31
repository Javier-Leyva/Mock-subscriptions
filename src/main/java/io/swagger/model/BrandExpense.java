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
 * BrandExpense
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class BrandExpense   {
  @JsonProperty("accumulated")
  private Boolean accumulated = null;

  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("annualAmount")
  private Float annualAmount = null;

  @JsonProperty("average")
  private Boolean average = null;

  @JsonProperty("currency")
  private Object currency = null;

  @JsonProperty("monthlyAmount")
  private Float monthlyAmount = null;

  @JsonProperty("periodicityAmount")
  private Integer periodicityAmount = null;

  @JsonProperty("periodicityUnitEnum")
  private String periodicityUnitEnum = null;

  @JsonProperty("priority")
  private Integer priority = null;

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

  @JsonProperty("userBrandBrandName")
  private String userBrandBrandName = null;

  @JsonProperty("userBrandBudgetAmount")
  private Float userBrandBudgetAmount = null;

  @JsonProperty("userBrandBudgetPercentage")
  private Integer userBrandBudgetPercentage = null;

  @JsonProperty("userBrandCategory")
  private String userBrandCategory = null;

  @JsonProperty("userBrandEnabled")
  private Boolean userBrandEnabled = null;

  @JsonProperty("userBrandImageUrl")
  private String userBrandImageUrl = null;

  @JsonProperty("userBrandUserId")
  private String userBrandUserId = null;

  @JsonProperty("weeklyAmount")
  private Float weeklyAmount = null;

  public BrandExpense accumulated(Boolean accumulated) {
    this.accumulated = accumulated;
    return this;
  }

  /**
   * Get accumulated
   * @return accumulated
  **/
  @ApiModelProperty(value = "")


  public Boolean isAccumulated() {
    return accumulated;
  }

  public void setAccumulated(Boolean accumulated) {
    this.accumulated = accumulated;
  }

  public BrandExpense amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of cash that had been spend on this brand.
   * @return amount
  **/
  @ApiModelProperty(example = "-130.6", value = "Amount of cash that had been spend on this brand.")


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public BrandExpense annualAmount(Float annualAmount) {
    this.annualAmount = annualAmount;
    return this;
  }

  /**
   * How much had been spend on this brand per year.
   * @return annualAmount
  **/
  @ApiModelProperty(example = "-110.4", value = "How much had been spend on this brand per year.")


  public Float getAnnualAmount() {
    return annualAmount;
  }

  public void setAnnualAmount(Float annualAmount) {
    this.annualAmount = annualAmount;
  }

  public BrandExpense average(Boolean average) {
    this.average = average;
    return this;
  }

  /**
   * If the recurring payment is an average or not. Is only used in recurring payments.
   * @return average
  **/
  @ApiModelProperty(example = "false", value = "If the recurring payment is an average or not. Is only used in recurring payments.")


  public Boolean isAverage() {
    return average;
  }

  public void setAverage(Boolean average) {
    this.average = average;
  }

  public BrandExpense currency(Object currency) {
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

  public BrandExpense monthlyAmount(Float monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
    return this;
  }

  /**
   * How much had been spend on this brand per month.
   * @return monthlyAmount
  **/
  @ApiModelProperty(example = "-35.6", value = "How much had been spend on this brand per month.")


  public Float getMonthlyAmount() {
    return monthlyAmount;
  }

  public void setMonthlyAmount(Float monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
  }

  public BrandExpense periodicityAmount(Integer periodicityAmount) {
    this.periodicityAmount = periodicityAmount;
    return this;
  }

  /**
   * Duration of months that took or is taking the recurring payment.
   * @return periodicityAmount
  **/
  @ApiModelProperty(example = "2", value = "Duration of months that took or is taking the recurring payment.")


  public Integer getPeriodicityAmount() {
    return periodicityAmount;
  }

  public void setPeriodicityAmount(Integer periodicityAmount) {
    this.periodicityAmount = periodicityAmount;
  }

  public BrandExpense periodicityUnitEnum(String periodicityUnitEnum) {
    this.periodicityUnitEnum = periodicityUnitEnum;
    return this;
  }

  /**
   * Is the measure unit. Error of correlation with the periodicityAmount.
   * @return periodicityUnitEnum
  **/
  @ApiModelProperty(example = "DAYS", value = "Is the measure unit. Error of correlation with the periodicityAmount.")


  public String getPeriodicityUnitEnum() {
    return periodicityUnitEnum;
  }

  public void setPeriodicityUnitEnum(String periodicityUnitEnum) {
    this.periodicityUnitEnum = periodicityUnitEnum;
  }

  public BrandExpense priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * It is the importance of the brand over other brands.
   * @return priority
  **/
  @ApiModelProperty(example = "3", value = "It is the importance of the brand over other brands.")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public BrandExpense timeGapWord(TimeGapWordEnum timeGapWord) {
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

  public BrandExpense userBrandBrandName(String userBrandBrandName) {
    this.userBrandBrandName = userBrandBrandName;
    return this;
  }

  /**
   * Name of the brand.
   * @return userBrandBrandName
  **/
  @ApiModelProperty(example = "Apple", value = "Name of the brand.")


  public String getUserBrandBrandName() {
    return userBrandBrandName;
  }

  public void setUserBrandBrandName(String userBrandBrandName) {
    this.userBrandBrandName = userBrandBrandName;
  }

  public BrandExpense userBrandBudgetAmount(Float userBrandBudgetAmount) {
    this.userBrandBudgetAmount = userBrandBudgetAmount;
    return this;
  }

  /**
   * Limit spend set by the user for this brand.
   * @return userBrandBudgetAmount
  **/
  @ApiModelProperty(example = "-50.5", value = "Limit spend set by the user for this brand.")


  public Float getUserBrandBudgetAmount() {
    return userBrandBudgetAmount;
  }

  public void setUserBrandBudgetAmount(Float userBrandBudgetAmount) {
    this.userBrandBudgetAmount = userBrandBudgetAmount;
  }

  public BrandExpense userBrandBudgetPercentage(Integer userBrandBudgetPercentage) {
    this.userBrandBudgetPercentage = userBrandBudgetPercentage;
    return this;
  }

  /**
   * Limit spend set by the user for this brand on percentage mode.
   * @return userBrandBudgetPercentage
  **/
  @ApiModelProperty(example = "30", value = "Limit spend set by the user for this brand on percentage mode.")


  public Integer getUserBrandBudgetPercentage() {
    return userBrandBudgetPercentage;
  }

  public void setUserBrandBudgetPercentage(Integer userBrandBudgetPercentage) {
    this.userBrandBudgetPercentage = userBrandBudgetPercentage;
  }

  public BrandExpense userBrandCategory(String userBrandCategory) {
    this.userBrandCategory = userBrandCategory;
    return this;
  }

  /**
   * The kind of work done by the brand.
   * @return userBrandCategory
  **/
  @ApiModelProperty(example = "Comercios y tiendas", value = "The kind of work done by the brand.")

@Size(max=255) 
  public String getUserBrandCategory() {
    return userBrandCategory;
  }

  public void setUserBrandCategory(String userBrandCategory) {
    this.userBrandCategory = userBrandCategory;
  }

  public BrandExpense userBrandEnabled(Boolean userBrandEnabled) {
    this.userBrandEnabled = userBrandEnabled;
    return this;
  }

  /**
   * If a special configuration between the brand and the user is establish.
   * @return userBrandEnabled
  **/
  @ApiModelProperty(example = "false", value = "If a special configuration between the brand and the user is establish.")


  public Boolean isUserBrandEnabled() {
    return userBrandEnabled;
  }

  public void setUserBrandEnabled(Boolean userBrandEnabled) {
    this.userBrandEnabled = userBrandEnabled;
  }

  public BrandExpense userBrandImageUrl(String userBrandImageUrl) {
    this.userBrandImageUrl = userBrandImageUrl;
    return this;
  }

  /**
   * Path of the image associated to the brand.
   * @return userBrandImageUrl
  **/
  @ApiModelProperty(example = "assets/images/brands/APPLE.PNG", value = "Path of the image associated to the brand.")

@Size(max=255) 
  public String getUserBrandImageUrl() {
    return userBrandImageUrl;
  }

  public void setUserBrandImageUrl(String userBrandImageUrl) {
    this.userBrandImageUrl = userBrandImageUrl;
  }

  public BrandExpense userBrandUserId(String userBrandUserId) {
    this.userBrandUserId = userBrandUserId;
    return this;
  }

  /**
   * Id of the user.
   * @return userBrandUserId
  **/
  @ApiModelProperty(example = "F62098302", value = "Id of the user.")

@Size(max=36) 
  public String getUserBrandUserId() {
    return userBrandUserId;
  }

  public void setUserBrandUserId(String userBrandUserId) {
    this.userBrandUserId = userBrandUserId;
  }

  public BrandExpense weeklyAmount(Float weeklyAmount) {
    this.weeklyAmount = weeklyAmount;
    return this;
  }

  /**
   * How much had been spend on this brand per week.
   * @return weeklyAmount
  **/
  @ApiModelProperty(example = "-15.5", value = "How much had been spend on this brand per week.")


  public Float getWeeklyAmount() {
    return weeklyAmount;
  }

  public void setWeeklyAmount(Float weeklyAmount) {
    this.weeklyAmount = weeklyAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandExpense brandExpense = (BrandExpense) o;
    return Objects.equals(this.accumulated, brandExpense.accumulated) &&
        Objects.equals(this.amount, brandExpense.amount) &&
        Objects.equals(this.annualAmount, brandExpense.annualAmount) &&
        Objects.equals(this.average, brandExpense.average) &&
        Objects.equals(this.currency, brandExpense.currency) &&
        Objects.equals(this.monthlyAmount, brandExpense.monthlyAmount) &&
        Objects.equals(this.periodicityAmount, brandExpense.periodicityAmount) &&
        Objects.equals(this.periodicityUnitEnum, brandExpense.periodicityUnitEnum) &&
        Objects.equals(this.priority, brandExpense.priority) &&
        Objects.equals(this.timeGapWord, brandExpense.timeGapWord) &&
        Objects.equals(this.userBrandBrandName, brandExpense.userBrandBrandName) &&
        Objects.equals(this.userBrandBudgetAmount, brandExpense.userBrandBudgetAmount) &&
        Objects.equals(this.userBrandBudgetPercentage, brandExpense.userBrandBudgetPercentage) &&
        Objects.equals(this.userBrandCategory, brandExpense.userBrandCategory) &&
        Objects.equals(this.userBrandEnabled, brandExpense.userBrandEnabled) &&
        Objects.equals(this.userBrandImageUrl, brandExpense.userBrandImageUrl) &&
        Objects.equals(this.userBrandUserId, brandExpense.userBrandUserId) &&
        Objects.equals(this.weeklyAmount, brandExpense.weeklyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumulated, amount, annualAmount, average, currency, monthlyAmount, periodicityAmount, periodicityUnitEnum, priority, timeGapWord, userBrandBrandName, userBrandBudgetAmount, userBrandBudgetPercentage, userBrandCategory, userBrandEnabled, userBrandImageUrl, userBrandUserId, weeklyAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandExpense {\n");
    
    sb.append("    accumulated: ").append(toIndentedString(accumulated)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    annualAmount: ").append(toIndentedString(annualAmount)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    monthlyAmount: ").append(toIndentedString(monthlyAmount)).append("\n");
    sb.append("    periodicityAmount: ").append(toIndentedString(periodicityAmount)).append("\n");
    sb.append("    periodicityUnitEnum: ").append(toIndentedString(periodicityUnitEnum)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeGapWord: ").append(toIndentedString(timeGapWord)).append("\n");
    sb.append("    userBrandBrandName: ").append(toIndentedString(userBrandBrandName)).append("\n");
    sb.append("    userBrandBudgetAmount: ").append(toIndentedString(userBrandBudgetAmount)).append("\n");
    sb.append("    userBrandBudgetPercentage: ").append(toIndentedString(userBrandBudgetPercentage)).append("\n");
    sb.append("    userBrandCategory: ").append(toIndentedString(userBrandCategory)).append("\n");
    sb.append("    userBrandEnabled: ").append(toIndentedString(userBrandEnabled)).append("\n");
    sb.append("    userBrandImageUrl: ").append(toIndentedString(userBrandImageUrl)).append("\n");
    sb.append("    userBrandUserId: ").append(toIndentedString(userBrandUserId)).append("\n");
    sb.append("    weeklyAmount: ").append(toIndentedString(weeklyAmount)).append("\n");
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

