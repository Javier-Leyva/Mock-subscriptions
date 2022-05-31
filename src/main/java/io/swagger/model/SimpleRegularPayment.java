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
 * SimpleRegularPayment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class SimpleRegularPayment   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("periodicity")
  private String periodicity = null;

  public SimpleRegularPayment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Total monthly expenses amount for the corresponding brand.
   * @return amount
  **/
  @ApiModelProperty(value = "Total monthly expenses amount for the corresponding brand.")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SimpleRegularPayment brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Regular payment brand name
   * @return brandName
  **/
  @ApiModelProperty(value = "Regular payment brand name")


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public SimpleRegularPayment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Regular payment id
   * @return id
  **/
  @ApiModelProperty(value = "Regular payment id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SimpleRegularPayment periodicity(String periodicity) {
    this.periodicity = periodicity;
    return this;
  }

  /**
   * Regular payment periodicity when it is a subscription
   * @return periodicity
  **/
  @ApiModelProperty(value = "Regular payment periodicity when it is a subscription")


  public String getPeriodicity() {
    return periodicity;
  }

  public void setPeriodicity(String periodicity) {
    this.periodicity = periodicity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleRegularPayment simpleRegularPayment = (SimpleRegularPayment) o;
    return Objects.equals(this.amount, simpleRegularPayment.amount) &&
        Objects.equals(this.brandName, simpleRegularPayment.brandName) &&
        Objects.equals(this.id, simpleRegularPayment.id) &&
        Objects.equals(this.periodicity, simpleRegularPayment.periodicity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, brandName, id, periodicity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleRegularPayment {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
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

