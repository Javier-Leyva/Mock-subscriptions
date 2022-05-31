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
 * PatchUserBrandsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class PatchUserBrandsResponse   {
  @JsonProperty("userBrandBrandName")
  private String userBrandBrandName = null;

  @JsonProperty("userBrandBudgetAmount")
  private Float userBrandBudgetAmount = null;

  @JsonProperty("userBrandUserId")
  private String userBrandUserId = null;

  public PatchUserBrandsResponse userBrandBrandName(String userBrandBrandName) {
    this.userBrandBrandName = userBrandBrandName;
    return this;
  }

  /**
   * Name of the brand associated with the userBrand object.
   * @return userBrandBrandName
  **/
  @ApiModelProperty(example = "Apple", value = "Name of the brand associated with the userBrand object.")

@Size(max=255) 
  public String getUserBrandBrandName() {
    return userBrandBrandName;
  }

  public void setUserBrandBrandName(String userBrandBrandName) {
    this.userBrandBrandName = userBrandBrandName;
  }

  public PatchUserBrandsResponse userBrandBudgetAmount(Float userBrandBudgetAmount) {
    this.userBrandBudgetAmount = userBrandBudgetAmount;
    return this;
  }

  /**
   * Maximum amount of money the user want to spend on this brand.
   * @return userBrandBudgetAmount
  **/
  @ApiModelProperty(example = "-75.5", value = "Maximum amount of money the user want to spend on this brand.")


  public Float getUserBrandBudgetAmount() {
    return userBrandBudgetAmount;
  }

  public void setUserBrandBudgetAmount(Float userBrandBudgetAmount) {
    this.userBrandBudgetAmount = userBrandBudgetAmount;
  }

  public PatchUserBrandsResponse userBrandUserId(String userBrandUserId) {
    this.userBrandUserId = userBrandUserId;
    return this;
  }

  /**
   * Id of the user associated with the userBrand object.
   * @return userBrandUserId
  **/
  @ApiModelProperty(example = "F41844470", value = "Id of the user associated with the userBrand object.")

@Size(max=36) 
  public String getUserBrandUserId() {
    return userBrandUserId;
  }

  public void setUserBrandUserId(String userBrandUserId) {
    this.userBrandUserId = userBrandUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUserBrandsResponse patchUserBrandsResponse = (PatchUserBrandsResponse) o;
    return Objects.equals(this.userBrandBrandName, patchUserBrandsResponse.userBrandBrandName) &&
        Objects.equals(this.userBrandBudgetAmount, patchUserBrandsResponse.userBrandBudgetAmount) &&
        Objects.equals(this.userBrandUserId, patchUserBrandsResponse.userBrandUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userBrandBrandName, userBrandBudgetAmount, userBrandUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserBrandsResponse {\n");
    
    sb.append("    userBrandBrandName: ").append(toIndentedString(userBrandBrandName)).append("\n");
    sb.append("    userBrandBudgetAmount: ").append(toIndentedString(userBrandBudgetAmount)).append("\n");
    sb.append("    userBrandUserId: ").append(toIndentedString(userBrandUserId)).append("\n");
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

