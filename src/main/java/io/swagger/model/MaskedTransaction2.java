package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MaskedAccount2;
import io.swagger.model.MaskedCard2;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MaskedTransaction2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class MaskedTransaction2   {
  @JsonProperty("account")
  private MaskedAccount2 account = null;

  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("card")
  private MaskedCard2 card = null;

  @JsonProperty("currency")
  private Object currency = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("postDate")
  private Long postDate = null;

  @JsonProperty("predicted")
  private Boolean predicted = null;

  public MaskedTransaction2 account(MaskedAccount2 account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MaskedAccount2 getAccount() {
    return account;
  }

  public void setAccount(MaskedAccount2 account) {
    this.account = account;
  }

  public MaskedTransaction2 amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of money move on the transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "-9.99", value = "Amount of money move on the transaction.")


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public MaskedTransaction2 card(MaskedCard2 card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MaskedCard2 getCard() {
    return card;
  }

  public void setCard(MaskedCard2 card) {
    this.card = card;
  }

  public MaskedTransaction2 currency(Object currency) {
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

  public MaskedTransaction2 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Information about the transaction.
   * @return description
  **/
  @ApiModelProperty(example = "COMPRA INTERNACIONAL EUROGOOGLE Google StorageLondon", value = "Information about the transaction.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MaskedTransaction2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the transaction.
   * @return id
  **/
  @ApiModelProperty(example = "f6fbbec4-6147-4227-a617-3df82db886cc", value = "Id of the transaction.")

@Size(max=36) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MaskedTransaction2 postDate(Long postDate) {
    this.postDate = postDate;
    return this;
  }

  /**
   * Date that was done the transaction.
   * @return postDate
  **/
  @ApiModelProperty(value = "Date that was done the transaction.")


  public Long getPostDate() {
    return postDate;
  }

  public void setPostDate(Long postDate) {
    this.postDate = postDate;
  }

  public MaskedTransaction2 predicted(Boolean predicted) {
    this.predicted = predicted;
    return this;
  }

  /**
   * If it is an intuition of the system of future payments.
   * @return predicted
  **/
  @ApiModelProperty(example = "false", value = "If it is an intuition of the system of future payments.")


  public Boolean isPredicted() {
    return predicted;
  }

  public void setPredicted(Boolean predicted) {
    this.predicted = predicted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskedTransaction2 maskedTransaction2 = (MaskedTransaction2) o;
    return Objects.equals(this.account, maskedTransaction2.account) &&
        Objects.equals(this.amount, maskedTransaction2.amount) &&
        Objects.equals(this.card, maskedTransaction2.card) &&
        Objects.equals(this.currency, maskedTransaction2.currency) &&
        Objects.equals(this.description, maskedTransaction2.description) &&
        Objects.equals(this.id, maskedTransaction2.id) &&
        Objects.equals(this.postDate, maskedTransaction2.postDate) &&
        Objects.equals(this.predicted, maskedTransaction2.predicted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, card, currency, description, id, postDate, predicted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskedTransaction2 {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    postDate: ").append(toIndentedString(postDate)).append("\n");
    sb.append("    predicted: ").append(toIndentedString(predicted)).append("\n");
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

