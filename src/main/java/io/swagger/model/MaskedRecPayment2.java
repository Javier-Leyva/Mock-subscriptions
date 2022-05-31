package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserBrandModel;
import io.swagger.model.UserPlanModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MaskedRecPayment2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class MaskedRecPayment2   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("annualAmount")
  private Float annualAmount = null;

  @JsonProperty("average")
  private Boolean average = null;

  @JsonProperty("contractRef")
  private String contractRef = null;

  @JsonProperty("cost")
  private Float cost = null;

  @JsonProperty("currency")
  private Object currency = null;

  @JsonProperty("durationAmount")
  private Integer durationAmount = null;

  @JsonProperty("durationType")
  private String durationType = null;

  @JsonProperty("feedbackPlan")
  private String feedbackPlan = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lastRenewTime")
  private Long lastRenewTime = null;

  @JsonProperty("monthlyAmount")
  private Float monthlyAmount = null;

  @JsonProperty("note")
  private String note = null;

  /**
   * The type of payment used by the user.
   */
  public enum PaymentMethodEnum {
    GLOBAL("GLOBAL"),
    
    THE_PAN_OF_THE_USER("The pan of the user"),
    
    THE_BANK_CODE_THE_CCC_OF_THE_USER("The bank code + the ccc of the user");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodEnum fromValue(String text) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("paymentMethod")
  private PaymentMethodEnum paymentMethod = null;

  @JsonProperty("startTime")
  private Long startTime = null;

  /**
   * Related with the duration-amount, on this case it is presented with a word.
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

  /**
   * The kind of payment.
   */
  public enum TypeEnum {
    SUBSCRIPTION("SUBSCRIPTION"),
    
    YEAR_AVERAGE("YEAR_AVERAGE"),
    
    RECURRENT_PAYMENT("RECURRENT_PAYMENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("userBrand")
  private UserBrandModel userBrand = null;

  @JsonProperty("userPlan")
  private UserPlanModel userPlan = null;

  @JsonProperty("userRp")
  private Boolean userRp = null;

  @JsonProperty("weeklyAmount")
  private Float weeklyAmount = null;

  public MaskedRecPayment2 active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * If the recurring payment is working, have to be done again or not.
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "If the recurring payment is working, have to be done again or not.")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MaskedRecPayment2 annualAmount(Float annualAmount) {
    this.annualAmount = annualAmount;
    return this;
  }

  /**
   * How much had been spend on this recurring payment per year.
   * @return annualAmount
  **/
  @ApiModelProperty(value = "How much had been spend on this recurring payment per year.")


  public Float getAnnualAmount() {
    return annualAmount;
  }

  public void setAnnualAmount(Float annualAmount) {
    this.annualAmount = annualAmount;
  }

  public MaskedRecPayment2 average(Boolean average) {
    this.average = average;
    return this;
  }

  /**
   * The average of the total spent in recurring payments for a brand. Important : Can only be true if is a RECURRING_PAYMENT.
   * @return average
  **/
  @ApiModelProperty(example = "false", value = "The average of the total spent in recurring payments for a brand. Important : Can only be true if is a RECURRING_PAYMENT.")


  public Boolean isAverage() {
    return average;
  }

  public void setAverage(Boolean average) {
    this.average = average;
  }

  public MaskedRecPayment2 contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * The code of the contract for know if two recurring payments are related.
   * @return contractRef
  **/
  @ApiModelProperty(value = "The code of the contract for know if two recurring payments are related.")

@Size(max=64) 
  public String getContractRef() {
    return contractRef;
  }

  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }

  public MaskedRecPayment2 cost(Float cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Cost of the recurring payment.
   * @return cost
  **/
  @ApiModelProperty(example = "-4.99", value = "Cost of the recurring payment.")


  public Float getCost() {
    return cost;
  }

  public void setCost(Float cost) {
    this.cost = cost;
  }

  public MaskedRecPayment2 currency(Object currency) {
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

  public MaskedRecPayment2 durationAmount(Integer durationAmount) {
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

  public MaskedRecPayment2 durationType(String durationType) {
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

  public MaskedRecPayment2 feedbackPlan(String feedbackPlan) {
    this.feedbackPlan = feedbackPlan;
    return this;
  }

  /**
   * The plan selected by the user for the recurring payment.
   * @return feedbackPlan
  **/
  @ApiModelProperty(example = "Id of the feedback plan", value = "The plan selected by the user for the recurring payment.")

@Size(max=255) 
  public String getFeedbackPlan() {
    return feedbackPlan;
  }

  public void setFeedbackPlan(String feedbackPlan) {
    this.feedbackPlan = feedbackPlan;
  }

  public MaskedRecPayment2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the recurring payment.
   * @return id
  **/
  @ApiModelProperty(example = "36bf9548-2cf1-4e7c-a757-69493c6ca112", value = "Id of the recurring payment.")

@Size(max=36) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MaskedRecPayment2 lastRenewTime(Long lastRenewTime) {
    this.lastRenewTime = lastRenewTime;
    return this;
  }

  /**
   * Last time that was done the recurring payment.
   * @return lastRenewTime
  **/
  @ApiModelProperty(value = "Last time that was done the recurring payment.")


  public Long getLastRenewTime() {
    return lastRenewTime;
  }

  public void setLastRenewTime(Long lastRenewTime) {
    this.lastRenewTime = lastRenewTime;
  }

  public MaskedRecPayment2 monthlyAmount(Float monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
    return this;
  }

  /**
   * How much had been spend on this recurring payment per month.
   * @return monthlyAmount
  **/
  @ApiModelProperty(value = "How much had been spend on this recurring payment per month.")


  public Float getMonthlyAmount() {
    return monthlyAmount;
  }

  public void setMonthlyAmount(Float monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
  }

  public MaskedRecPayment2 note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Note that you can leave on a Recurring Payment.
   * @return note
  **/
  @ApiModelProperty(example = "This is a try!", value = "Note that you can leave on a Recurring Payment.")

@Size(max=255) 
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public MaskedRecPayment2 paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The type of payment used by the user.
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "GLOBAL", value = "The type of payment used by the user.")


  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public MaskedRecPayment2 startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Day of start of the recurring payment.
   * @return startTime
  **/
  @ApiModelProperty(value = "Day of start of the recurring payment.")


  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public MaskedRecPayment2 timeGapWord(TimeGapWordEnum timeGapWord) {
    this.timeGapWord = timeGapWord;
    return this;
  }

  /**
   * Related with the duration-amount, on this case it is presented with a word.
   * @return timeGapWord
  **/
  @ApiModelProperty(example = "MONTHLY", value = "Related with the duration-amount, on this case it is presented with a word.")


  public TimeGapWordEnum getTimeGapWord() {
    return timeGapWord;
  }

  public void setTimeGapWord(TimeGapWordEnum timeGapWord) {
    this.timeGapWord = timeGapWord;
  }

  public MaskedRecPayment2 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The kind of payment.
   * @return type
  **/
  @ApiModelProperty(example = "SUBSCRIPTION", value = "The kind of payment.")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MaskedRecPayment2 userBrand(UserBrandModel userBrand) {
    this.userBrand = userBrand;
    return this;
  }

  /**
   * Get userBrand
   * @return userBrand
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserBrandModel getUserBrand() {
    return userBrand;
  }

  public void setUserBrand(UserBrandModel userBrand) {
    this.userBrand = userBrand;
  }

  public MaskedRecPayment2 userPlan(UserPlanModel userPlan) {
    this.userPlan = userPlan;
    return this;
  }

  /**
   * Get userPlan
   * @return userPlan
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserPlanModel getUserPlan() {
    return userPlan;
  }

  public void setUserPlan(UserPlanModel userPlan) {
    this.userPlan = userPlan;
  }

  public MaskedRecPayment2 userRp(Boolean userRp) {
    this.userRp = userRp;
    return this;
  }

  /**
   * If the payment method in the recurring payments is ignored for the aggregation process
   * @return userRp
  **/
  @ApiModelProperty(example = "false", value = "If the payment method in the recurring payments is ignored for the aggregation process")


  public Boolean isUserRp() {
    return userRp;
  }

  public void setUserRp(Boolean userRp) {
    this.userRp = userRp;
  }

  public MaskedRecPayment2 weeklyAmount(Float weeklyAmount) {
    this.weeklyAmount = weeklyAmount;
    return this;
  }

  /**
   * How much had been spend on this recurring payment per week.
   * @return weeklyAmount
  **/
  @ApiModelProperty(value = "How much had been spend on this recurring payment per week.")


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
    MaskedRecPayment2 maskedRecPayment2 = (MaskedRecPayment2) o;
    return Objects.equals(this.active, maskedRecPayment2.active) &&
        Objects.equals(this.annualAmount, maskedRecPayment2.annualAmount) &&
        Objects.equals(this.average, maskedRecPayment2.average) &&
        Objects.equals(this.contractRef, maskedRecPayment2.contractRef) &&
        Objects.equals(this.cost, maskedRecPayment2.cost) &&
        Objects.equals(this.currency, maskedRecPayment2.currency) &&
        Objects.equals(this.durationAmount, maskedRecPayment2.durationAmount) &&
        Objects.equals(this.durationType, maskedRecPayment2.durationType) &&
        Objects.equals(this.feedbackPlan, maskedRecPayment2.feedbackPlan) &&
        Objects.equals(this.id, maskedRecPayment2.id) &&
        Objects.equals(this.lastRenewTime, maskedRecPayment2.lastRenewTime) &&
        Objects.equals(this.monthlyAmount, maskedRecPayment2.monthlyAmount) &&
        Objects.equals(this.note, maskedRecPayment2.note) &&
        Objects.equals(this.paymentMethod, maskedRecPayment2.paymentMethod) &&
        Objects.equals(this.startTime, maskedRecPayment2.startTime) &&
        Objects.equals(this.timeGapWord, maskedRecPayment2.timeGapWord) &&
        Objects.equals(this.type, maskedRecPayment2.type) &&
        Objects.equals(this.userBrand, maskedRecPayment2.userBrand) &&
        Objects.equals(this.userPlan, maskedRecPayment2.userPlan) &&
        Objects.equals(this.userRp, maskedRecPayment2.userRp) &&
        Objects.equals(this.weeklyAmount, maskedRecPayment2.weeklyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, annualAmount, average, contractRef, cost, currency, durationAmount, durationType, feedbackPlan, id, lastRenewTime, monthlyAmount, note, paymentMethod, startTime, timeGapWord, type, userBrand, userPlan, userRp, weeklyAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskedRecPayment2 {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    annualAmount: ").append(toIndentedString(annualAmount)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    durationAmount: ").append(toIndentedString(durationAmount)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    feedbackPlan: ").append(toIndentedString(feedbackPlan)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastRenewTime: ").append(toIndentedString(lastRenewTime)).append("\n");
    sb.append("    monthlyAmount: ").append(toIndentedString(monthlyAmount)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    timeGapWord: ").append(toIndentedString(timeGapWord)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userBrand: ").append(toIndentedString(userBrand)).append("\n");
    sb.append("    userPlan: ").append(toIndentedString(userPlan)).append("\n");
    sb.append("    userRp: ").append(toIndentedString(userRp)).append("\n");
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

