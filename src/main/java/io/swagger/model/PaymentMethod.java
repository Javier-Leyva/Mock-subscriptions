package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleRegularPayment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentMethod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class PaymentMethod   {
  @JsonProperty("maskedId")
  private String maskedId = null;

  @JsonProperty("regularPayments")
  @Valid
  private List<Map<String, SimpleRegularPayment>> regularPayments = null;

  @JsonProperty("type")
  private String type = null;

  public PaymentMethod maskedId(String maskedId) {
    this.maskedId = maskedId;
    return this;
  }

  /**
   * Account IBAN or card pan masked.
   * @return maskedId
  **/
  @ApiModelProperty(value = "Account IBAN or card pan masked.")


  public String getMaskedId() {
    return maskedId;
  }

  public void setMaskedId(String maskedId) {
    this.maskedId = maskedId;
  }

  public PaymentMethod regularPayments(List<Map<String, SimpleRegularPayment>> regularPayments) {
    this.regularPayments = regularPayments;
    return this;
  }

  public PaymentMethod addRegularPaymentsItem(Map<String, SimpleRegularPayment> regularPaymentsItem) {
    if (this.regularPayments == null) {
      this.regularPayments = new ArrayList<Map<String, SimpleRegularPayment>>();
    }
    this.regularPayments.add(regularPaymentsItem);
    return this;
  }

  /**
   * The list of products identifier to offer to the client.
   * @return regularPayments
  **/
  @ApiModelProperty(value = "The list of products identifier to offer to the client.")

  @Valid

  public List<Map<String, SimpleRegularPayment>> getRegularPayments() {
    return regularPayments;
  }

  public void setRegularPayments(List<Map<String, SimpleRegularPayment>> regularPayments) {
    this.regularPayments = regularPayments;
  }

  public PaymentMethod type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of payment method (Account, Card...)
   * @return type
  **/
  @ApiModelProperty(value = "Type of payment method (Account, Card...)")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.maskedId, paymentMethod.maskedId) &&
        Objects.equals(this.regularPayments, paymentMethod.regularPayments) &&
        Objects.equals(this.type, paymentMethod.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskedId, regularPayments, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    maskedId: ").append(toIndentedString(maskedId)).append("\n");
    sb.append("    regularPayments: ").append(toIndentedString(regularPayments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

