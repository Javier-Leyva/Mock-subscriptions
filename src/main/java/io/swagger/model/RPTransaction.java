package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RPTransaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class RPTransaction   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("transactionDate")
  private LocalDate transactionDate = null;

  public RPTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Transaction cost
   * @return amount
  **/
  @ApiModelProperty(value = "Transaction cost")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RPTransaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Brief description for the transaction
   * @return description
  **/
  @ApiModelProperty(value = "Brief description for the transaction")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RPTransaction transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Date when the transaction was done
   * @return transactionDate
  **/
  @ApiModelProperty(value = "Date when the transaction was done")

  @Valid

  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RPTransaction rPTransaction = (RPTransaction) o;
    return Objects.equals(this.amount, rPTransaction.amount) &&
        Objects.equals(this.description, rPTransaction.description) &&
        Objects.equals(this.transactionDate, rPTransaction.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, transactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RPTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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

