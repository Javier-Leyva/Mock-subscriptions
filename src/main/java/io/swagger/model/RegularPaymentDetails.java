package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegularPaymentDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class RegularPaymentDetails   {
  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("cancellationUrl")
  private String cancellationUrl = null;

  @JsonProperty("currentMonthAmount")
  private BigDecimal currentMonthAmount = null;

  @JsonProperty("currentYearAmount")
  private BigDecimal currentYearAmount = null;

  @JsonProperty("firstPayment")
  private LocalDate firstPayment = null;

  @JsonProperty("nextExpectedPayment")
  private LocalDate nextExpectedPayment = null;

  @JsonProperty("paymentMethods")
  @Valid
  private List<String> paymentMethods = null;

  @JsonProperty("periodicity")
  private String periodicity = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("type")
  private String type = null;

  public RegularPaymentDetails brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Regular payment brand name
   * @return brandName
  **/
  @ApiModelProperty(example = "AMAZON", value = "Regular payment brand name")


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public RegularPaymentDetails cancellationUrl(String cancellationUrl) {
    this.cancellationUrl = cancellationUrl;
    return this;
  }

  /**
   * Cancellation URL for the plan
   * @return cancellationUrl
  **/
  @ApiModelProperty(example = "www.amazon.com", value = "Cancellation URL for the plan")


  public String getCancellationUrl() {
    return cancellationUrl;
  }

  public void setCancellationUrl(String cancellationUrl) {
    this.cancellationUrl = cancellationUrl;
  }

  public RegularPaymentDetails currentMonthAmount(BigDecimal currentMonthAmount) {
    this.currentMonthAmount = currentMonthAmount;
    return this;
  }

  /**
   * Total current month expenses amount.
   * @return currentMonthAmount
  **/
  @ApiModelProperty(example = "132.43", value = "Total current month expenses amount.")

  @Valid

  public BigDecimal getCurrentMonthAmount() {
    return currentMonthAmount;
  }

  public void setCurrentMonthAmount(BigDecimal currentMonthAmount) {
    this.currentMonthAmount = currentMonthAmount;
  }

  public RegularPaymentDetails currentYearAmount(BigDecimal currentYearAmount) {
    this.currentYearAmount = currentYearAmount;
    return this;
  }

  /**
   * Total current year expenses amount.
   * @return currentYearAmount
  **/
  @ApiModelProperty(example = "4678.95", value = "Total current year expenses amount.")

  @Valid

  public BigDecimal getCurrentYearAmount() {
    return currentYearAmount;
  }

  public void setCurrentYearAmount(BigDecimal currentYearAmount) {
    this.currentYearAmount = currentYearAmount;
  }

  public RegularPaymentDetails firstPayment(LocalDate firstPayment) {
    this.firstPayment = firstPayment;
    return this;
  }

  /**
   * Date when the regular payment began
   * @return firstPayment
  **/
  @ApiModelProperty(example = "2020-05-01 00:00:00", value = "Date when the regular payment began")

  @Valid

  public LocalDate getFirstPayment() {
    return firstPayment;
  }

  public void setFirstPayment(LocalDate firstPayment) {
    this.firstPayment = firstPayment;
  }

  public RegularPaymentDetails nextExpectedPayment(LocalDate nextExpectedPayment) {
    this.nextExpectedPayment = nextExpectedPayment;
    return this;
  }

  /**
   * Expected date for the next charge
   * @return nextExpectedPayment
  **/
  @ApiModelProperty(example = "2022-05-01 00:00:00", value = "Expected date for the next charge")

  @Valid

  public LocalDate getNextExpectedPayment() {
    return nextExpectedPayment;
  }

  public void setNextExpectedPayment(LocalDate nextExpectedPayment) {
    this.nextExpectedPayment = nextExpectedPayment;
  }

  public RegularPaymentDetails paymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public RegularPaymentDetails addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<String>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * The list of payment methods used for the regular payment.
   * @return paymentMethods
  **/
  @ApiModelProperty(example = "[\"****8889\",\"****6789\"]", value = "The list of payment methods used for the regular payment.")


  public List<String> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public RegularPaymentDetails periodicity(String periodicity) {
    this.periodicity = periodicity;
    return this;
  }

  /**
   * Regular payment periodicity period
   * @return periodicity
  **/
  @ApiModelProperty(example = "MONTHLY", value = "Regular payment periodicity period")


  public String getPeriodicity() {
    return periodicity;
  }

  public void setPeriodicity(String periodicity) {
    this.periodicity = periodicity;
  }

  public RegularPaymentDetails planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Regular payment plan name
   * @return planName
  **/
  @ApiModelProperty(example = "Amazon Premium", value = "Regular payment plan name")


  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public RegularPaymentDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Regular payment type
   * @return type
  **/
  @ApiModelProperty(example = "SUBSCRIPTION", value = "Regular payment type")


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
    RegularPaymentDetails regularPaymentDetails = (RegularPaymentDetails) o;
    return Objects.equals(this.brandName, regularPaymentDetails.brandName) &&
        Objects.equals(this.cancellationUrl, regularPaymentDetails.cancellationUrl) &&
        Objects.equals(this.currentMonthAmount, regularPaymentDetails.currentMonthAmount) &&
        Objects.equals(this.currentYearAmount, regularPaymentDetails.currentYearAmount) &&
        Objects.equals(this.firstPayment, regularPaymentDetails.firstPayment) &&
        Objects.equals(this.nextExpectedPayment, regularPaymentDetails.nextExpectedPayment) &&
        Objects.equals(this.paymentMethods, regularPaymentDetails.paymentMethods) &&
        Objects.equals(this.periodicity, regularPaymentDetails.periodicity) &&
        Objects.equals(this.planName, regularPaymentDetails.planName) &&
        Objects.equals(this.type, regularPaymentDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, cancellationUrl, currentMonthAmount, currentYearAmount, firstPayment, nextExpectedPayment, paymentMethods, periodicity, planName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegularPaymentDetails {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    cancellationUrl: ").append(toIndentedString(cancellationUrl)).append("\n");
    sb.append("    currentMonthAmount: ").append(toIndentedString(currentMonthAmount)).append("\n");
    sb.append("    currentYearAmount: ").append(toIndentedString(currentYearAmount)).append("\n");
    sb.append("    firstPayment: ").append(toIndentedString(firstPayment)).append("\n");
    sb.append("    nextExpectedPayment: ").append(toIndentedString(nextExpectedPayment)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
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

