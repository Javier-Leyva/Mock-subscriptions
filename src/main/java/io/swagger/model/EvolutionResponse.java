package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EvolutionElement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvolutionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class EvolutionResponse   {
  @JsonProperty("evolution")
  @Valid
  private List<EvolutionElement> evolution = null;

  public EvolutionResponse evolution(List<EvolutionElement> evolution) {
    this.evolution = evolution;
    return this;
  }

  public EvolutionResponse addEvolutionItem(EvolutionElement evolutionItem) {
    if (this.evolution == null) {
      this.evolution = new ArrayList<EvolutionElement>();
    }
    this.evolution.add(evolutionItem);
    return this;
  }

  /**
   * List of evolution elements associated to this response.
   * @return evolution
  **/
  @ApiModelProperty(value = "List of evolution elements associated to this response.")

  @Valid

  public List<EvolutionElement> getEvolution() {
    return evolution;
  }

  public void setEvolution(List<EvolutionElement> evolution) {
    this.evolution = evolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionResponse evolutionResponse = (EvolutionResponse) o;
    return Objects.equals(this.evolution, evolutionResponse.evolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionResponse {\n");
    
    sb.append("    evolution: ").append(toIndentedString(evolution)).append("\n");
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

