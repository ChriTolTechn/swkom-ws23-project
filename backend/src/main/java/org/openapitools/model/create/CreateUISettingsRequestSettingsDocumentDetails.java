package org.openapitools.model.create;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CreateUISettingsRequestSettingsDocumentDetails
 */

@JsonTypeName("CreateUISettings_request_settings_document_details")
@Generated(value = "com.paperless.codegen.languages.SpringCodegen", date = "2023-10-22T12:32:07.613318Z[Etc/UTC]")
public class CreateUISettingsRequestSettingsDocumentDetails {

  private Boolean nativePdfViewer;

  public CreateUISettingsRequestSettingsDocumentDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequestSettingsDocumentDetails(Boolean nativePdfViewer) {
    this.nativePdfViewer = nativePdfViewer;
  }

  public CreateUISettingsRequestSettingsDocumentDetails nativePdfViewer(Boolean nativePdfViewer) {
    this.nativePdfViewer = nativePdfViewer;
    return this;
  }

  /**
   * Get nativePdfViewer
   * @return nativePdfViewer
  */
  @NotNull 
  @Schema(name = "native_pdf_viewer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("native_pdf_viewer")
  public Boolean getNativePdfViewer() {
    return nativePdfViewer;
  }

  public void setNativePdfViewer(Boolean nativePdfViewer) {
    this.nativePdfViewer = nativePdfViewer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequestSettingsDocumentDetails createUISettingsRequestSettingsDocumentDetails = (CreateUISettingsRequestSettingsDocumentDetails) o;
    return Objects.equals(this.nativePdfViewer, createUISettingsRequestSettingsDocumentDetails.nativePdfViewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativePdfViewer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequestSettingsDocumentDetails {\n");
    sb.append("    nativePdfViewer: ").append(toIndentedString(nativePdfViewer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

