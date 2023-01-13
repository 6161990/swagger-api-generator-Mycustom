package example.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import example.model.NovelBoardId;
import example.model.Novels;
import example.model.Opening;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NovelBoard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-13T15:23:38.972179+09:00[Asia/Seoul]")


public class NovelBoard   {
  @JsonProperty("novelBoardId")
  private NovelBoardId novelBoardId = null;

  @JsonProperty("opening")
  private Opening opening = null;

  @JsonProperty("novels")
  private Novels novels = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("deleteAt")
  private OffsetDateTime deleteAt = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("novelSize")
  private Integer novelSize = null;

  @JsonProperty("closed")
  private Boolean closed = null;

  public NovelBoard novelBoardId(NovelBoardId novelBoardId) {
    this.novelBoardId = novelBoardId;
    return this;
  }

  /**
   * Get novelBoardId
   * @return novelBoardId
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NovelBoardId getNovelBoardId() {
    return novelBoardId;
  }

  public void setNovelBoardId(NovelBoardId novelBoardId) {
    this.novelBoardId = novelBoardId;
  }

  public NovelBoard opening(Opening opening) {
    this.opening = opening;
    return this;
  }

  /**
   * Get opening
   * @return opening
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Opening getOpening() {
    return opening;
  }

  public void setOpening(Opening opening) {
    this.opening = opening;
  }

  public NovelBoard novels(Novels novels) {
    this.novels = novels;
    return this;
  }

  /**
   * Get novels
   * @return novels
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Novels getNovels() {
    return novels;
  }

  public void setNovels(Novels novels) {
    this.novels = novels;
  }

  public NovelBoard createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public NovelBoard deleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * Get deleteAt
   * @return deleteAt
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
  }

  public NovelBoard version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(value = "")
  
    public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public NovelBoard novelSize(Integer novelSize) {
    this.novelSize = novelSize;
    return this;
  }

  /**
   * Get novelSize
   * @return novelSize
   **/
  @ApiModelProperty(value = "")
  
    public Integer getNovelSize() {
    return novelSize;
  }

  public void setNovelSize(Integer novelSize) {
    this.novelSize = novelSize;
  }

  public NovelBoard closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

  /**
   * Get closed
   * @return closed
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovelBoard novelBoard = (NovelBoard) o;
    return Objects.equals(this.novelBoardId, novelBoard.novelBoardId) &&
        Objects.equals(this.opening, novelBoard.opening) &&
        Objects.equals(this.novels, novelBoard.novels) &&
        Objects.equals(this.createdAt, novelBoard.createdAt) &&
        Objects.equals(this.deleteAt, novelBoard.deleteAt) &&
        Objects.equals(this.version, novelBoard.version) &&
        Objects.equals(this.novelSize, novelBoard.novelSize) &&
        Objects.equals(this.closed, novelBoard.closed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(novelBoardId, opening, novels, createdAt, deleteAt, version, novelSize, closed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovelBoard {\n");
    
    sb.append("    novelBoardId: ").append(toIndentedString(novelBoardId)).append("\n");
    sb.append("    opening: ").append(toIndentedString(opening)).append("\n");
    sb.append("    novels: ").append(toIndentedString(novels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    novelSize: ").append(toIndentedString(novelSize)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
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
