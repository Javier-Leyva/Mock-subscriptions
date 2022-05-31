package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserBrandIdModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object with information of the brand.
 */
@ApiModel(description = "Object with information of the brand.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class UserBrandModel   {
  @JsonProperty("categoryName")
  private String categoryName = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("timeCreated")
  private Long timeCreated = null;

  @JsonProperty("userBrandId")
  private UserBrandIdModel userBrandId = null;

  public UserBrandModel categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * The kind of work done by the brand.
   * @return categoryName
  **/
  @ApiModelProperty(example = "Comercios y tiendas", value = "The kind of work done by the brand.")

@Size(max=255) 
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public UserBrandModel countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Code of the country.
   * @return countryCode
  **/
  @ApiModelProperty(example = "ES", value = "Code of the country.")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public UserBrandModel domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Domain of the website for the brand.
   * @return domain
  **/
  @ApiModelProperty(example = "https://www.amazon.es/", value = "Domain of the website for the brand.")


  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public UserBrandModel imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Path of the image associated to the brand.
   * @return imageUrl
  **/
  @ApiModelProperty(example = "assets/images/brands/APPLE.PNG", value = "Path of the image associated to the brand.")

@Size(max=255) 
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public UserBrandModel timeCreated(Long timeCreated) {
    this.timeCreated = timeCreated;
    return this;
  }

  /**
   * Day and hour that was created the recurring payment.
   * @return timeCreated
  **/
  @ApiModelProperty(value = "Day and hour that was created the recurring payment.")


  public Long getTimeCreated() {
    return timeCreated;
  }

  public void setTimeCreated(Long timeCreated) {
    this.timeCreated = timeCreated;
  }

  public UserBrandModel userBrandId(UserBrandIdModel userBrandId) {
    this.userBrandId = userBrandId;
    return this;
  }

  /**
   * Get userBrandId
   * @return userBrandId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserBrandIdModel getUserBrandId() {
    return userBrandId;
  }

  public void setUserBrandId(UserBrandIdModel userBrandId) {
    this.userBrandId = userBrandId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBrandModel userBrandModel = (UserBrandModel) o;
    return Objects.equals(this.categoryName, userBrandModel.categoryName) &&
        Objects.equals(this.countryCode, userBrandModel.countryCode) &&
        Objects.equals(this.domain, userBrandModel.domain) &&
        Objects.equals(this.imageUrl, userBrandModel.imageUrl) &&
        Objects.equals(this.timeCreated, userBrandModel.timeCreated) &&
        Objects.equals(this.userBrandId, userBrandModel.userBrandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, countryCode, domain, imageUrl, timeCreated, userBrandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBrandModel {\n");
    
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    userBrandId: ").append(toIndentedString(userBrandId)).append("\n");
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

