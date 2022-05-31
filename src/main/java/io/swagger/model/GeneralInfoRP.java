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
 * GeneralInfoRP
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class GeneralInfoRP   {
  @JsonProperty("totalAmount")
  private BigDecimal totalAmount = null;

  @JsonProperty("totalTransactions")
  private BigDecimal totalTransactions = null;

  @JsonProperty("type")
  private String type = null;

  public GeneralInfoRP totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Total sum of transactions expenses
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Total sum of transactions expenses")

  @Valid

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public GeneralInfoRP totalTransactions(BigDecimal totalTransactions) {
    this.totalTransactions = totalTransactions;
    return this;
  }

  /**
   * Total number of transactions
   * @return totalTransactions
  **/
  @ApiModelProperty(value = "Total number of transactions")

  @Valid

  public BigDecimal getTotalTransactions() {
    return totalTransactions;
  }

  public void setTotalTransactions(BigDecimal totalTransactions) {
    this.totalTransactions = totalTransactions;
  }

  public GeneralInfoRP type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Regular payment type
   * @return type
  **/
  @ApiModelProperty(value = "Regular payment type")


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
    GeneralInfoRP generalInfoRP = (GeneralInfoRP) o;
    return Objects.equals(this.totalAmount, generalInfoRP.totalAmount) &&
        Objects.equals(this.totalTransactions, generalInfoRP.totalTransactions) &&
        Objects.equals(this.type, generalInfoRP.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, totalTransactions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralInfoRP {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalTransactions: ").append(toIndentedString(totalTransactions)).append("\n");
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

