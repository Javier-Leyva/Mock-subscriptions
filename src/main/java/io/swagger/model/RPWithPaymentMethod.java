package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RPWithPaymentMethod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class RPWithPaymentMethod   {
  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("lastPaymentDate")
  private LocalDate lastPaymentDate = null;

  @JsonProperty("paymentMethods")
  @Valid
  private List<Object> paymentMethods = null;

  public RPWithPaymentMethod brandName(String brandName) {
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

  public RPWithPaymentMethod lastPaymentDate(LocalDate lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

  /**
   * Date when the last transaction of this regular payment was done
   * @return lastPaymentDate
  **/
  @ApiModelProperty(value = "Date when the last transaction of this regular payment was done")

  @Valid

  public LocalDate getLastPaymentDate() {
    return lastPaymentDate;
  }

  public void setLastPaymentDate(LocalDate lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }

  public RPWithPaymentMethod paymentMethods(List<Object> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public RPWithPaymentMethod addPaymentMethodsItem(Object paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<Object>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * list of payment methods used for this regular payment
   * @return paymentMethods
  **/
  @ApiModelProperty(value = "list of payment methods used for this regular payment")


  public List<Object> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<Object> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RPWithPaymentMethod rPWithPaymentMethod = (RPWithPaymentMethod) o;
    return Objects.equals(this.brandName, rPWithPaymentMethod.brandName) &&
        Objects.equals(this.lastPaymentDate, rPWithPaymentMethod.lastPaymentDate) &&
        Objects.equals(this.paymentMethods, rPWithPaymentMethod.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, lastPaymentDate, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RPWithPaymentMethod {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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

