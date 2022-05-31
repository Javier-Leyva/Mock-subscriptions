package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RPMonthlyTransaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class RPMonthlyTransaction   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("month")
  private String month = null;

  public RPMonthlyTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Total expenses amount for the month associated
   * @return amount
  **/
  @ApiModelProperty(value = "Total expenses amount for the month associated")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RPMonthlyTransaction month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Month for the corresponding amount
   * @return month
  **/
  @ApiModelProperty(value = "Month for the corresponding amount")


  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RPMonthlyTransaction rPMonthlyTransaction = (RPMonthlyTransaction) o;
    return Objects.equals(this.amount, rPMonthlyTransaction.amount) &&
        Objects.equals(this.month, rPMonthlyTransaction.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RPMonthlyTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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

