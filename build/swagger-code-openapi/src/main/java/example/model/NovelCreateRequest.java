package example.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NovelCreateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-13T15:23:38.972179+09:00[Asia/Seoul]")


public class NovelCreateRequest   {
  @JsonProperty("writerId")
  private String writerId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("content")
  private String content = null;

  public NovelCreateRequest writerId(String writerId) {
    this.writerId = writerId;
    return this;
  }

  /**
   * Get writerId
   * @return writerId
   **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getWriterId() {
    return writerId;
  }

  public void setWriterId(String writerId) {
    this.writerId = writerId;
  }

  public NovelCreateRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NovelCreateRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getContent() {
    return content;
  }

  public void setContent(String content) {
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
    NovelCreateRequest novelCreateRequest = (NovelCreateRequest) o;
    return Objects.equals(this.writerId, novelCreateRequest.writerId) &&
        Objects.equals(this.title, novelCreateRequest.title) &&
        Objects.equals(this.content, novelCreateRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writerId, title, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovelCreateRequest {\n");
    
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
