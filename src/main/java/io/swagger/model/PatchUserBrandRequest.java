package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PatchUserBrandItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PatchUserBrandRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class PatchUserBrandRequest   {
  @JsonProperty("userBrands")
  @Valid
  private List<PatchUserBrandItem> userBrands = new ArrayList<PatchUserBrandItem>();

  public PatchUserBrandRequest userBrands(List<PatchUserBrandItem> userBrands) {
    this.userBrands = userBrands;
    return this;
  }

  public PatchUserBrandRequest addUserBrandsItem(PatchUserBrandItem userBrandsItem) {
    this.userBrands.add(userBrandsItem);
    return this;
  }

  /**
   * List of userBrands items
   * @return userBrands
  **/
  @ApiModelProperty(required = true, value = "List of userBrands items")
  @NotNull

  @Valid

  public List<PatchUserBrandItem> getUserBrands() {
    return userBrands;
  }

  public void setUserBrands(List<PatchUserBrandItem> userBrands) {
    this.userBrands = userBrands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUserBrandRequest patchUserBrandRequest = (PatchUserBrandRequest) o;
    return Objects.equals(this.userBrands, patchUserBrandRequest.userBrands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userBrands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUserBrandRequest {\n");
    
    sb.append("    userBrands: ").append(toIndentedString(userBrands)).append("\n");
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

