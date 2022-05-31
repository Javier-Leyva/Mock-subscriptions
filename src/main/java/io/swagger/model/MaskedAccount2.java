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
 * MaskedAccount2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class MaskedAccount2   {
  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("ccc")
  private String ccc = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uniquePaymentAsset")
  private Boolean uniquePaymentAsset = null;

  public MaskedAccount2 bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Code of the bank entity or branch office.
   * @return bankCode
  **/
  @ApiModelProperty(example = "BBVAESMMXXX", value = "Code of the bank entity or branch office.")

@Size(max=255) 
  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public MaskedAccount2 ccc(String ccc) {
    this.ccc = ccc;
    return this;
  }

  /**
   * Code use for identify the account of the user by the bank. Sometimes can be that it come masked.
   * @return ccc
  **/
  @ApiModelProperty(example = "9898926020014830", value = "Code use for identify the account of the user by the bank. Sometimes can be that it come masked.")

@Size(max=255) 
  public String getCcc() {
    return ccc;
  }

  public void setCcc(String ccc) {
    this.ccc = ccc;
  }

  public MaskedAccount2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the bank account.
   * @return id
  **/
  @ApiModelProperty(example = "3ddf3443-2d7b-4b90-9a1d-f2114522bc90", value = "Id of the bank account.")

@Size(max=36) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MaskedAccount2 uniquePaymentAsset(Boolean uniquePaymentAsset) {
    this.uniquePaymentAsset = uniquePaymentAsset;
    return this;
  }

  /**
   * If the recurring payments is taken using more than one credit card.
   * @return uniquePaymentAsset
  **/
  @ApiModelProperty(example = "false", value = "If the recurring payments is taken using more than one credit card.")


  public Boolean isUniquePaymentAsset() {
    return uniquePaymentAsset;
  }

  public void setUniquePaymentAsset(Boolean uniquePaymentAsset) {
    this.uniquePaymentAsset = uniquePaymentAsset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskedAccount2 maskedAccount2 = (MaskedAccount2) o;
    return Objects.equals(this.bankCode, maskedAccount2.bankCode) &&
        Objects.equals(this.ccc, maskedAccount2.ccc) &&
        Objects.equals(this.id, maskedAccount2.id) &&
        Objects.equals(this.uniquePaymentAsset, maskedAccount2.uniquePaymentAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, ccc, id, uniquePaymentAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskedAccount2 {\n");
    
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    ccc: ").append(toIndentedString(ccc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uniquePaymentAsset: ").append(toIndentedString(uniquePaymentAsset)).append("\n");
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

