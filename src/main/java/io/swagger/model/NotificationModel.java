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
 * NotificationModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class NotificationModel   {
  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("average")
  private Boolean average = null;

  @JsonProperty("bankCardId")
  private String bankCardId = null;

  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("cardExpirationDate")
  private OffsetDateTime cardExpirationDate = null;

  @JsonProperty("cardId")
  private String cardId = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("currency")
  private Object currency = null;

  @JsonProperty("currentIntervalAmount")
  private Float currentIntervalAmount = null;

  @JsonProperty("durationAmount")
  private Integer durationAmount = null;

  @JsonProperty("lastSentTime")
  private OffsetDateTime lastSentTime = null;

  @JsonProperty("maskedPan")
  private String maskedPan = null;

  @JsonProperty("readed")
  private Boolean readed = null;

  @JsonProperty("sentCount")
  private Integer sentCount = null;

  @JsonProperty("system-uuid")
  private String systemUuid = null;

  /**
   * It is the name of the brand that send notifications
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

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("userIdto")
  private String userIdto = null;

  public NotificationModel amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * It contains the amount of the notifications sent
   * @return amount
  **/
  @ApiModelProperty(example = "-127.08", value = "It contains the amount of the notifications sent")


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public NotificationModel average(Boolean average) {
    this.average = average;
    return this;
  }

  /**
   * If the recurring payment is an average or not.
   * @return average
  **/
  @ApiModelProperty(example = "false", value = "If the recurring payment is an average or not.")


  public Boolean isAverage() {
    return average;
  }

  public void setAverage(Boolean average) {
    this.average = average;
  }

  public NotificationModel bankCardId(String bankCardId) {
    this.bankCardId = bankCardId;
    return this;
  }

  /**
   * It is the identification of a card on the bank
   * @return bankCardId
  **/
  @ApiModelProperty(example = "10830835930792414", value = "It is the identification of a card on the bank")


  public String getBankCardId() {
    return bankCardId;
  }

  public void setBankCardId(String bankCardId) {
    this.bankCardId = bankCardId;
  }

  public NotificationModel brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * It is the name of the brand that send notifications
   * @return brandName
  **/
  @ApiModelProperty(example = "LIDL", value = "It is the name of the brand that send notifications")


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public NotificationModel cardExpirationDate(OffsetDateTime cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
    return this;
  }

  /**
   * It is the date when the card is going to be expired
   * @return cardExpirationDate
  **/
  @ApiModelProperty(value = "It is the date when the card is going to be expired")

  @Valid

  public OffsetDateTime getCardExpirationDate() {
    return cardExpirationDate;
  }

  public void setCardExpirationDate(OffsetDateTime cardExpirationDate) {
    this.cardExpirationDate = cardExpirationDate;
  }

  public NotificationModel cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * This variable contains the card identification
   * @return cardId
  **/
  @ApiModelProperty(example = "a82c614e-f150-40c3-b274-a04b0580e183", value = "This variable contains the card identification")

@Size(max=36) 
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public NotificationModel createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * It is the date of creation a notification
   * @return createTime
  **/
  @ApiModelProperty(value = "It is the date of creation a notification")

  @Valid

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public NotificationModel currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * It is the currency to pay the notification
   * @return currency
  **/
  @ApiModelProperty(example = "\"EUR\"", value = "It is the currency to pay the notification")


  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public NotificationModel currentIntervalAmount(Float currentIntervalAmount) {
    this.currentIntervalAmount = currentIntervalAmount;
    return this;
  }

  /**
   * It contains the interval amount of notifications sent on the present
   * @return currentIntervalAmount
  **/
  @ApiModelProperty(example = "3.5", value = "It contains the interval amount of notifications sent on the present")


  public Float getCurrentIntervalAmount() {
    return currentIntervalAmount;
  }

  public void setCurrentIntervalAmount(Float currentIntervalAmount) {
    this.currentIntervalAmount = currentIntervalAmount;
  }

  public NotificationModel durationAmount(Integer durationAmount) {
    this.durationAmount = durationAmount;
    return this;
  }

  /**
   * It is the duration of the amount to the brand
   * @return durationAmount
  **/
  @ApiModelProperty(example = "12", value = "It is the duration of the amount to the brand")


  public Integer getDurationAmount() {
    return durationAmount;
  }

  public void setDurationAmount(Integer durationAmount) {
    this.durationAmount = durationAmount;
  }

  public NotificationModel lastSentTime(OffsetDateTime lastSentTime) {
    this.lastSentTime = lastSentTime;
    return this;
  }

  /**
   * It has the last time that sent a notification
   * @return lastSentTime
  **/
  @ApiModelProperty(value = "It has the last time that sent a notification")

  @Valid

  public OffsetDateTime getLastSentTime() {
    return lastSentTime;
  }

  public void setLastSentTime(OffsetDateTime lastSentTime) {
    this.lastSentTime = lastSentTime;
  }

  public NotificationModel maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  /**
   * It is pan masked of the card where send the notifications
   * @return maskedPan
  **/
  @ApiModelProperty(example = "10978038468963008", value = "It is pan masked of the card where send the notifications")


  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  public NotificationModel readed(Boolean readed) {
    this.readed = readed;
    return this;
  }

  /**
   * It contains if a notification have been readed or not
   * @return readed
  **/
  @ApiModelProperty(example = "false", value = "It contains if a notification have been readed or not")


  public Boolean isReaded() {
    return readed;
  }

  public void setReaded(Boolean readed) {
    this.readed = readed;
  }

  public NotificationModel sentCount(Integer sentCount) {
    this.sentCount = sentCount;
    return this;
  }

  /**
   * It contains the number of sent notifications
   * @return sentCount
  **/
  @ApiModelProperty(example = "20", value = "It contains the number of sent notifications")


  public Integer getSentCount() {
    return sentCount;
  }

  public void setSentCount(Integer sentCount) {
    this.sentCount = sentCount;
  }

  public NotificationModel systemUuid(String systemUuid) {
    this.systemUuid = systemUuid;
    return this;
  }

  /**
   * It is the identificator of a notification
   * @return systemUuid
  **/
  @ApiModelProperty(example = "49838755-0486-4d5c-aa14-a948f7d5f0f6", value = "It is the identificator of a notification")

@Size(max=36) 
  public String getSystemUuid() {
    return systemUuid;
  }

  public void setSystemUuid(String systemUuid) {
    this.systemUuid = systemUuid;
  }

  public NotificationModel timeGapWord(TimeGapWordEnum timeGapWord) {
    this.timeGapWord = timeGapWord;
    return this;
  }

  /**
   * It is the name of the brand that send notifications
   * @return timeGapWord
  **/
  @ApiModelProperty(example = "MONTHLY", value = "It is the name of the brand that send notifications")

@Size(max=32) 
  public TimeGapWordEnum getTimeGapWord() {
    return timeGapWord;
  }

  public void setTimeGapWord(TimeGapWordEnum timeGapWord) {
    this.timeGapWord = timeGapWord;
  }

  public NotificationModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * It is the type of a notification
   * @return type
  **/
  @ApiModelProperty(example = "NEW_BRAND", value = "It is the type of a notification")

@Size(min=0,max=50) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NotificationModel userIdto(String userIdto) {
    this.userIdto = userIdto;
    return this;
  }

  /**
   * It is the identificator of a user
   * @return userIdto
  **/
  @ApiModelProperty(example = "F41844470", value = "It is the identificator of a user")

@Size(max=36) 
  public String getUserIdto() {
    return userIdto;
  }

  public void setUserIdto(String userIdto) {
    this.userIdto = userIdto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationModel notificationModel = (NotificationModel) o;
    return Objects.equals(this.amount, notificationModel.amount) &&
        Objects.equals(this.average, notificationModel.average) &&
        Objects.equals(this.bankCardId, notificationModel.bankCardId) &&
        Objects.equals(this.brandName, notificationModel.brandName) &&
        Objects.equals(this.cardExpirationDate, notificationModel.cardExpirationDate) &&
        Objects.equals(this.cardId, notificationModel.cardId) &&
        Objects.equals(this.createTime, notificationModel.createTime) &&
        Objects.equals(this.currency, notificationModel.currency) &&
        Objects.equals(this.currentIntervalAmount, notificationModel.currentIntervalAmount) &&
        Objects.equals(this.durationAmount, notificationModel.durationAmount) &&
        Objects.equals(this.lastSentTime, notificationModel.lastSentTime) &&
        Objects.equals(this.maskedPan, notificationModel.maskedPan) &&
        Objects.equals(this.readed, notificationModel.readed) &&
        Objects.equals(this.sentCount, notificationModel.sentCount) &&
        Objects.equals(this.systemUuid, notificationModel.systemUuid) &&
        Objects.equals(this.timeGapWord, notificationModel.timeGapWord) &&
        Objects.equals(this.type, notificationModel.type) &&
        Objects.equals(this.userIdto, notificationModel.userIdto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, average, bankCardId, brandName, cardExpirationDate, cardId, createTime, currency, currentIntervalAmount, durationAmount, lastSentTime, maskedPan, readed, sentCount, systemUuid, timeGapWord, type, userIdto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationModel {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    bankCardId: ").append(toIndentedString(bankCardId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    cardExpirationDate: ").append(toIndentedString(cardExpirationDate)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentIntervalAmount: ").append(toIndentedString(currentIntervalAmount)).append("\n");
    sb.append("    durationAmount: ").append(toIndentedString(durationAmount)).append("\n");
    sb.append("    lastSentTime: ").append(toIndentedString(lastSentTime)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    readed: ").append(toIndentedString(readed)).append("\n");
    sb.append("    sentCount: ").append(toIndentedString(sentCount)).append("\n");
    sb.append("    systemUuid: ").append(toIndentedString(systemUuid)).append("\n");
    sb.append("    timeGapWord: ").append(toIndentedString(timeGapWord)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userIdto: ").append(toIndentedString(userIdto)).append("\n");
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

