package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PatchRecurringPaymentConfigItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PatchRecurringPaymentsConfigRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class PatchRecurringPaymentsConfigRequest   {
  @JsonProperty("recurringPayments")
  @Valid
  private List<PatchRecurringPaymentConfigItem> recurringPayments = new ArrayList<PatchRecurringPaymentConfigItem>();

  public PatchRecurringPaymentsConfigRequest recurringPayments(List<PatchRecurringPaymentConfigItem> recurringPayments) {
    this.recurringPayments = recurringPayments;
    return this;
  }

  public PatchRecurringPaymentsConfigRequest addRecurringPaymentsItem(PatchRecurringPaymentConfigItem recurringPaymentsItem) {
    this.recurringPayments.add(recurringPaymentsItem);
    return this;
  }

  /**
   * List of recurringPaymentConfig items.
   * @return recurringPayments
  **/
  @ApiModelProperty(required = true, value = "List of recurringPaymentConfig items.")
  @NotNull

  @Valid

  public List<PatchRecurringPaymentConfigItem> getRecurringPayments() {
    return recurringPayments;
  }

  public void setRecurringPayments(List<PatchRecurringPaymentConfigItem> recurringPayments) {
    this.recurringPayments = recurringPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchRecurringPaymentsConfigRequest patchRecurringPaymentsConfigRequest = (PatchRecurringPaymentsConfigRequest) o;
    return Objects.equals(this.recurringPayments, patchRecurringPaymentsConfigRequest.recurringPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchRecurringPaymentsConfigRequest {\n");
    
    sb.append("    recurringPayments: ").append(toIndentedString(recurringPayments)).append("\n");
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

