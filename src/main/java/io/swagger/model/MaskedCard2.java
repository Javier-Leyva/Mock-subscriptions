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
 * MaskedCard2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class MaskedCard2   {
  @JsonProperty("account")
  private String account = null;

  /**
   * The kind of card, if it is debit or credit.
   */
  public enum CardTypeEnum {
    CR("CR"),
    
    DE("DE");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardTypeEnum fromValue(String text) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardType")
  private CardTypeEnum cardType = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("holder")
  private String holder = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("imgCode")
  private String imgCode = null;

  @JsonProperty("maskedPan")
  private String maskedPan = null;

  @JsonProperty("uniquePaymentAsset")
  private Boolean uniquePaymentAsset = null;

  public MaskedCard2 account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Id of the bank account.
   * @return account
  **/
  @ApiModelProperty(example = "9898926020014830", value = "Id of the bank account.")

@Size(max=255) 
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public MaskedCard2 cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * The kind of card, if it is debit or credit.
   * @return cardType
  **/
  @ApiModelProperty(example = "CR", value = "The kind of card, if it is debit or credit.")


  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public MaskedCard2 expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Date of expiration of the credit card of the user.
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Date of expiration of the credit card of the user.")

  @Valid

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public MaskedCard2 holder(String holder) {
    this.holder = holder;
    return this;
  }

  /**
   * The owner of the credit card.
   * @return holder
  **/
  @ApiModelProperty(example = "HOLDER", value = "The owner of the credit card.")


  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public MaskedCard2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the card.
   * @return id
  **/
  @ApiModelProperty(example = "a82c614e-f150-40c3-b274-a04b0580e183", value = "Id of the card.")

@Size(max=36) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MaskedCard2 imgCode(String imgCode) {
    this.imgCode = imgCode;
    return this;
  }

  /**
   * It is the code used for generate the image. It is the same as the CARD_ALIAS.
   * @return imgCode
  **/
  @ApiModelProperty(example = "49432", value = "It is the code used for generate the image. It is the same as the CARD_ALIAS.")

@Size(max=255) 
  public String getImgCode() {
    return imgCode;
  }

  public void setImgCode(String imgCode) {
    this.imgCode = imgCode;
  }

  public MaskedCard2 maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  /**
   * The pan of the card that later is going to be masked.
   * @return maskedPan
  **/
  @ApiModelProperty(example = "10830835930792414", value = "The pan of the card that later is going to be masked.")


  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  public MaskedCard2 uniquePaymentAsset(Boolean uniquePaymentAsset) {
    this.uniquePaymentAsset = uniquePaymentAsset;
    return this;
  }

  /**
   * If is related with a payment_asset object that contain the relation of the bank, card and user id.
   * @return uniquePaymentAsset
  **/
  @ApiModelProperty(example = "false", value = "If is related with a payment_asset object that contain the relation of the bank, card and user id.")


  public Boolean isUniquePaymentAsset() {
    return uniquePaymentAsset;
  }

  public void setUniquePaymentAsset(Boolean uniquePaymentAsset) {
    this.uniquePaymentAsset = uniquePaymentAsset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskedCard2 maskedCard2 = (MaskedCard2) o;
    return Objects.equals(this.account, maskedCard2.account) &&
        Objects.equals(this.cardType, maskedCard2.cardType) &&
        Objects.equals(this.expirationDate, maskedCard2.expirationDate) &&
        Objects.equals(this.holder, maskedCard2.holder) &&
        Objects.equals(this.id, maskedCard2.id) &&
        Objects.equals(this.imgCode, maskedCard2.imgCode) &&
        Objects.equals(this.maskedPan, maskedCard2.maskedPan) &&
        Objects.equals(this.uniquePaymentAsset, maskedCard2.uniquePaymentAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, cardType, expirationDate, holder, id, imgCode, maskedPan, uniquePaymentAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskedCard2 {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imgCode: ").append(toIndentedString(imgCode)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    uniquePaymentAsset: ").append(toIndentedString(uniquePaymentAsset)).append("\n");
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

