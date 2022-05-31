package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleRegularPayment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegularPaymentsSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class RegularPaymentsSummary   {
  @JsonProperty("annualAmmount")
  private BigDecimal annualAmmount = null;

  @JsonProperty("monthlyAmount")
  private BigDecimal monthlyAmount = null;

  @JsonProperty("regularPayments")
  @Valid
  private List<Map<String, SimpleRegularPayment>> regularPayments = null;

  public RegularPaymentsSummary annualAmmount(BigDecimal annualAmmount) {
    this.annualAmmount = annualAmmount;
    return this;
  }

  /**
   * Total sum of current year transactions expenses
   * @return annualAmmount
  **/
  @ApiModelProperty(example = "-242.21", value = "Total sum of current year transactions expenses")

  @Valid

  public BigDecimal getAnnualAmmount() {
    return annualAmmount;
  }

  public void setAnnualAmmount(BigDecimal annualAmmount) {
    this.annualAmmount = annualAmmount;
  }

  public RegularPaymentsSummary monthlyAmount(BigDecimal monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
    return this;
  }

  /**
   * Total sum of current month transactions expenses
   * @return monthlyAmount
  **/
  @ApiModelProperty(example = "20.34", value = "Total sum of current month transactions expenses")

  @Valid

  public BigDecimal getMonthlyAmount() {
    return monthlyAmount;
  }

  public void setMonthlyAmount(BigDecimal monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
  }

  public RegularPaymentsSummary regularPayments(List<Map<String, SimpleRegularPayment>> regularPayments) {
    this.regularPayments = regularPayments;
    return this;
  }

  public RegularPaymentsSummary addRegularPaymentsItem(Map<String, SimpleRegularPayment> regularPaymentsItem) {
    if (this.regularPayments == null) {
      this.regularPayments = new ArrayList<Map<String, SimpleRegularPayment>>();
    }
    this.regularPayments.add(regularPaymentsItem);
    return this;
  }

  /**
   * The list of products identifier to offer to the client
   * @return regularPayments
  **/
  @ApiModelProperty(example = "[{\"amount\":23.56,\"brandName\":\"AMAZON\"},{\"amount\":56.78,\"brandName\":\"NETFLIX\"}]", value = "The list of products identifier to offer to the client")

  @Valid

  public List<Map<String, SimpleRegularPayment>> getRegularPayments() {
    return regularPayments;
  }

  public void setRegularPayments(List<Map<String, SimpleRegularPayment>> regularPayments) {
    this.regularPayments = regularPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegularPaymentsSummary regularPaymentsSummary = (RegularPaymentsSummary) o;
    return Objects.equals(this.annualAmmount, regularPaymentsSummary.annualAmmount) &&
        Objects.equals(this.monthlyAmount, regularPaymentsSummary.monthlyAmount) &&
        Objects.equals(this.regularPayments, regularPaymentsSummary.regularPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualAmmount, monthlyAmount, regularPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegularPaymentsSummary {\n");
    
    sb.append("    annualAmmount: ").append(toIndentedString(annualAmmount)).append("\n");
    sb.append("    monthlyAmount: ").append(toIndentedString(monthlyAmount)).append("\n");
    sb.append("    regularPayments: ").append(toIndentedString(regularPayments)).append("\n");
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

