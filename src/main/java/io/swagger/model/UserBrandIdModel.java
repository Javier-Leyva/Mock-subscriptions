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
 * Object with the information of the user and the brand.
 */
@ApiModel(description = "Object with the information of the user and the brand.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class UserBrandIdModel   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("userId")
  private String userId = null;

  public UserBrandIdModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the brand associated with the recurring payment.
   * @return name
  **/
  @ApiModelProperty(example = "Apple", value = "Name of the brand associated with the recurring payment.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserBrandIdModel userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Id of the user associated with the recurring payment.
   * @return userId
  **/
  @ApiModelProperty(example = "F62098302", value = "Id of the user associated with the recurring payment.")

@Size(max=36) 
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBrandIdModel userBrandIdModel = (UserBrandIdModel) o;
    return Objects.equals(this.name, userBrandIdModel.name) &&
        Objects.equals(this.userId, userBrandIdModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBrandIdModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

