package example.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import example.model.Content;
import example.model.OpeningKey;
import example.model.Title;
import example.model.WriterId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Opening
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-13T15:23:38.972179+09:00[Asia/Seoul]")


public class Opening   {
  @JsonProperty("openingKey")
  private OpeningKey openingKey = null;

  @JsonProperty("writerId")
  private WriterId writerId = null;

  @JsonProperty("title")
  private Title title = null;

  @JsonProperty("content")
  private Content content = null;

  public Opening openingKey(OpeningKey openingKey) {
    this.openingKey = openingKey;
    return this;
  }

  /**
   * Get openingKey
   * @return openingKey
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OpeningKey getOpeningKey() {
    return openingKey;
  }

  public void setOpeningKey(OpeningKey openingKey) {
    this.openingKey = openingKey;
  }

  public Opening writerId(WriterId writerId) {
    this.writerId = writerId;
    return this;
  }

  /**
   * Get writerId
   * @return writerId
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WriterId getWriterId() {
    return writerId;
  }

  public void setWriterId(WriterId writerId) {
    this.writerId = writerId;
  }

  public Opening title(Title title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public Opening content(Content content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opening opening = (Opening) o;
    return Objects.equals(this.openingKey, opening.openingKey) &&
        Objects.equals(this.writerId, opening.writerId) &&
        Objects.equals(this.title, opening.title) &&
        Objects.equals(this.content, opening.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openingKey, writerId, title, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opening {\n");
    
    sb.append("    openingKey: ").append(toIndentedString(openingKey)).append("\n");
    sb.append("    writerId: ").append(toIndentedString(writerId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
