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
 * Request to update the notifications
 */
@ApiModel(description = "Request to update the notifications")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-31T06:34:04.724Z")


public class UpdateNotificationRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("read")
  private Boolean read = null;

  public UpdateNotificationRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the notification
   * @return id
  **/
  @ApiModelProperty(value = "The id of the notification")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateNotificationRequest read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Set notification read
   * @return read
  **/
  @ApiModelProperty(example = "true", required = true, value = "Set notification read")
  @NotNull


  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNotificationRequest updateNotificationRequest = (UpdateNotificationRequest) o;
    return Objects.equals(this.id, updateNotificationRequest.id) &&
        Objects.equals(this.read, updateNotificationRequest.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNotificationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

