package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PatchRecurringPaymentConfigItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class PatchRecurringPaymentConfigItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("note")
  private String note = null;

  public PatchRecurringPaymentConfigItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the recurring payment.
   * @return id
  **/
  @ApiModelProperty(example = "36bf9548-2cf1-4e7c-a757-69493c6ca112", value = "Id of the recurring payment.")

@Size(max=36) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatchRecurringPaymentConfigItem note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Note that you can leave on a Recurring Payment.
   * @return note
  **/
  @ApiModelProperty(example = "This is a try!", value = "Note that you can leave on a Recurring Payment.")

@Size(max=255) 
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchRecurringPaymentConfigItem patchRecurringPaymentConfigItem = (PatchRecurringPaymentConfigItem) o;
    return Objects.equals(this.id, patchRecurringPaymentConfigItem.id) &&
        Objects.equals(this.note, patchRecurringPaymentConfigItem.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchRecurringPaymentConfigItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

