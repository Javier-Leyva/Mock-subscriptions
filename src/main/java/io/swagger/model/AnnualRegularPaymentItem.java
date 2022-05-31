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
 * AnnualRegularPaymentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class AnnualRegularPaymentItem   {
  @JsonProperty("annualAmount")
  private BigDecimal annualAmount = null;

  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("cancellationUrl")
  private String cancellationUrl = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nextPayment")
  private Integer nextPayment = null;

  @JsonProperty("periodicity")
  private String periodicity = null;

  @JsonProperty("type")
  private String type = null;

  public AnnualRegularPaymentItem annualAmount(BigDecimal annualAmount) {
    this.annualAmount = annualAmount;
    return this;
  }

  /**
   * Regular payment annual expense amount
   * @return annualAmount
  **/
  @ApiModelProperty(value = "Regular payment annual expense amount")

  @Valid

  public BigDecimal getAnnualAmount() {
    return annualAmount;
  }

  public void setAnnualAmount(BigDecimal annualAmount) {
    this.annualAmount = annualAmount;
  }

  public AnnualRegularPaymentItem brandName(String brandName) {
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

  public AnnualRegularPaymentItem cancellationUrl(String cancellationUrl) {
    this.cancellationUrl = cancellationUrl;
    return this;
  }

  /**
   * Cancellation URL for the subscription if it is less than 7 days left for the next payment (nextPayment not null)
   * @return cancellationUrl
  **/
  @ApiModelProperty(value = "Cancellation URL for the subscription if it is less than 7 days left for the next payment (nextPayment not null)")


  public String getCancellationUrl() {
    return cancellationUrl;
  }

  public void setCancellationUrl(String cancellationUrl) {
    this.cancellationUrl = cancellationUrl;
  }

  public AnnualRegularPaymentItem id(String id) {
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

  public AnnualRegularPaymentItem nextPayment(Integer nextPayment) {
    this.nextPayment = nextPayment;
    return this;
  }

  /**
   * Number of days left, in case of subscriptions, if it is less than 7 days left for the next payment
   * @return nextPayment
  **/
  @ApiModelProperty(value = "Number of days left, in case of subscriptions, if it is less than 7 days left for the next payment")


  public Integer getNextPayment() {
    return nextPayment;
  }

  public void setNextPayment(Integer nextPayment) {
    this.nextPayment = nextPayment;
  }

  public AnnualRegularPaymentItem periodicity(String periodicity) {
    this.periodicity = periodicity;
    return this;
  }

  /**
   * Regular payment periodicity
   * @return periodicity
  **/
  @ApiModelProperty(value = "Regular payment periodicity")


  public String getPeriodicity() {
    return periodicity;
  }

  public void setPeriodicity(String periodicity) {
    this.periodicity = periodicity;
  }

  public AnnualRegularPaymentItem type(String type) {
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
    AnnualRegularPaymentItem annualRegularPaymentItem = (AnnualRegularPaymentItem) o;
    return Objects.equals(this.annualAmount, annualRegularPaymentItem.annualAmount) &&
        Objects.equals(this.brandName, annualRegularPaymentItem.brandName) &&
        Objects.equals(this.cancellationUrl, annualRegularPaymentItem.cancellationUrl) &&
        Objects.equals(this.id, annualRegularPaymentItem.id) &&
        Objects.equals(this.nextPayment, annualRegularPaymentItem.nextPayment) &&
        Objects.equals(this.periodicity, annualRegularPaymentItem.periodicity) &&
        Objects.equals(this.type, annualRegularPaymentItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualAmount, brandName, cancellationUrl, id, nextPayment, periodicity, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnualRegularPaymentItem {\n");
    
    sb.append("    annualAmount: ").append(toIndentedString(annualAmount)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    cancellationUrl: ").append(toIndentedString(cancellationUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextPayment: ").append(toIndentedString(nextPayment)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
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

