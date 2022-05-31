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
 * List of userBrands items
 */
@ApiModel(description = "List of userBrands items")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class PatchUserBrandItem   {
  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("budgetPercentage")
  private Integer budgetPercentage = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  public PatchUserBrandItem brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Name of the brand that we are going to associated with the user.
   * @return brandName
  **/
  @ApiModelProperty(example = "Apple", value = "Name of the brand that we are going to associated with the user.")

@Size(max=255) 
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public PatchUserBrandItem budgetPercentage(Integer budgetPercentage) {
    this.budgetPercentage = budgetPercentage;
    return this;
  }

  /**
   * Limit spend set by the user for this brand on percentage mode.
   * @return budgetPercentage
  **/
  @ApiModelProperty(example = "30", value = "Limit spend set by the user for this brand on percentage mode.")


  public Integer getBudgetPercentage() {
    return budgetPercentage;
  }

  public void setBudgetPercentage(Integer budgetPercentage) {
    this.budgetPercentage = budgetPercentage;
  }

  public PatchUserBrandItem enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * If the user have enabled a special configuration for the brand.
   * @return enabled
  **/
  @ApiModelProperty(example = "false", value = "If the user have enabled a special configuration for the brand.")


  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUserBrandItem patchUserBrandItem = (PatchUserBrandItem) o;
    return Objects.equals(this.brandName, patchUserBrandItem.brandName) &&
        Objects.equals(this.budgetPercentage, patchUserBrandItem.budgetPercentage) &&
        Objects.equals(this.enabled, patchUserBrandItem.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, budgetPercentage, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserBrandItem {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    budgetPercentage: ").append(toIndentedString(budgetPercentage)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

