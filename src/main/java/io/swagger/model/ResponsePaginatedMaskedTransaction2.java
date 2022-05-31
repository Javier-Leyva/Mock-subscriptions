package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MaskedTransaction2;
import io.swagger.model.Pageable;
import io.swagger.model.Sort;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponsePaginatedMaskedTransaction2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class ResponsePaginatedMaskedTransaction2   {
  @JsonProperty("first")
  private Boolean first = null;

  @JsonProperty("last")
  private Boolean last = null;

  @JsonProperty("list")
  @Valid
  private List<MaskedTransaction2> _list = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("numberOfElements")
  private Integer numberOfElements = null;

  @JsonProperty("pageable")
  private Pageable pageable = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private Sort sort = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public ResponsePaginatedMaskedTransaction2 first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")


  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public ResponsePaginatedMaskedTransaction2 last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")


  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public ResponsePaginatedMaskedTransaction2 _list(List<MaskedTransaction2> _list) {
    this._list = _list;
    return this;
  }

  public ResponsePaginatedMaskedTransaction2 addListItem(MaskedTransaction2 _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<MaskedTransaction2>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Get _list
   * @return _list
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MaskedTransaction2> getList() {
    return _list;
  }

  public void setList(List<MaskedTransaction2> _list) {
    this._list = _list;
  }

  public ResponsePaginatedMaskedTransaction2 number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public ResponsePaginatedMaskedTransaction2 numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public ResponsePaginatedMaskedTransaction2 pageable(Pageable pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pageable getPageable() {
    return pageable;
  }

  public void setPageable(Pageable pageable) {
    this.pageable = pageable;
  }

  public ResponsePaginatedMaskedTransaction2 size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ResponsePaginatedMaskedTransaction2 sort(Sort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public ResponsePaginatedMaskedTransaction2 totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(value = "")


  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public ResponsePaginatedMaskedTransaction2 totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePaginatedMaskedTransaction2 responsePaginatedMaskedTransaction2 = (ResponsePaginatedMaskedTransaction2) o;
    return Objects.equals(this.first, responsePaginatedMaskedTransaction2.first) &&
        Objects.equals(this.last, responsePaginatedMaskedTransaction2.last) &&
        Objects.equals(this._list, responsePaginatedMaskedTransaction2._list) &&
        Objects.equals(this.number, responsePaginatedMaskedTransaction2.number) &&
        Objects.equals(this.numberOfElements, responsePaginatedMaskedTransaction2.numberOfElements) &&
        Objects.equals(this.pageable, responsePaginatedMaskedTransaction2.pageable) &&
        Objects.equals(this.size, responsePaginatedMaskedTransaction2.size) &&
        Objects.equals(this.sort, responsePaginatedMaskedTransaction2.sort) &&
        Objects.equals(this.totalElements, responsePaginatedMaskedTransaction2.totalElements) &&
        Objects.equals(this.totalPages, responsePaginatedMaskedTransaction2.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, _list, number, numberOfElements, pageable, size, sort, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePaginatedMaskedTransaction2 {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

