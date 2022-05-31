package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EvolutionCategory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of evolution elements associated to this response.
 */
@ApiModel(description = "List of evolution elements associated to this response.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class EvolutionElement   {
  @JsonProperty("categories")
  @Valid
  private List<EvolutionCategory> categories = null;

  @JsonProperty("date")
  private Long date = null;

  public EvolutionElement categories(List<EvolutionCategory> categories) {
    this.categories = categories;
    return this;
  }

  public EvolutionElement addCategoriesItem(EvolutionCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<EvolutionCategory>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * List of categories associated to this element.
   * @return categories
  **/
  @ApiModelProperty(value = "List of categories associated to this element.")

  @Valid

  public List<EvolutionCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<EvolutionCategory> categories) {
    this.categories = categories;
  }

  public EvolutionElement date(Long date) {
    this.date = date;
    return this;
  }

  /**
   * Month of the year that we want to filter.
   * @return date
  **/
  @ApiModelProperty(value = "Month of the year that we want to filter.")


  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionElement evolutionElement = (EvolutionElement) o;
    return Objects.equals(this.categories, evolutionElement.categories) &&
        Objects.equals(this.date, evolutionElement.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionElement {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

