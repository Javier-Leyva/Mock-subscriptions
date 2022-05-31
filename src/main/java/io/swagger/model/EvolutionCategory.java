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
 * List of categories associated to this element.
 */
@ApiModel(description = "List of categories associated to this element.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class EvolutionCategory   {
  @JsonProperty("categoryName")
  private String categoryName = null;

  @JsonProperty("currency")
  private Object currency = null;

  @JsonProperty("expected")
  private Float expected = null;

  @JsonProperty("paid")
  private Float paid = null;

  public EvolutionCategory categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Category of the brands.
   * @return categoryName
  **/
  @ApiModelProperty(example = "Comercios y tiendas", value = "Category of the brands.")


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public EvolutionCategory currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The kind of currency used by the user.
   * @return currency
  **/
  @ApiModelProperty(example = "\"EUR\"", value = "The kind of currency used by the user.")


  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public EvolutionCategory expected(Float expected) {
    this.expected = expected;
    return this;
  }

  /**
   * How much is expected to be spend on this category during the filter month.
   * @return expected
  **/
  @ApiModelProperty(example = "-20.5", value = "How much is expected to be spend on this category during the filter month.")


  public Float getExpected() {
    return expected;
  }

  public void setExpected(Float expected) {
    this.expected = expected;
  }

  public EvolutionCategory paid(Float paid) {
    this.paid = paid;
    return this;
  }

  /**
   * How much have been spend on this category during the filter month.
   * @return paid
  **/
  @ApiModelProperty(example = "-15.2", value = "How much have been spend on this category during the filter month.")


  public Float getPaid() {
    return paid;
  }

  public void setPaid(Float paid) {
    this.paid = paid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionCategory evolutionCategory = (EvolutionCategory) o;
    return Objects.equals(this.categoryName, evolutionCategory.categoryName) &&
        Objects.equals(this.currency, evolutionCategory.currency) &&
        Objects.equals(this.expected, evolutionCategory.expected) &&
        Objects.equals(this.paid, evolutionCategory.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, currency, expected, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionCategory {\n");
    
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

