/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Face detection annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.FaceDetectionAnnotation}
 */
public final class FaceDetectionAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.FaceDetectionAnnotation)
    FaceDetectionAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FaceDetectionAnnotation.newBuilder() to construct.
  private FaceDetectionAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FaceDetectionAnnotation() {
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FaceDetectionAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FaceDetectionAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_FaceDetectionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_FaceDetectionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.class,
            com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 5;
  private volatile java.lang.Object version_;
  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, version_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, version_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.videointelligence.v1.FaceDetectionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.FaceDetectionAnnotation other =
        (com.google.cloud.videointelligence.v1.FaceDetectionAnnotation) obj;

    if (!getVersion().equals(other.getVersion())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.videointelligence.v1.FaceDetectionAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Face detection annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.FaceDetectionAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.FaceDetectionAnnotation)
      com.google.cloud.videointelligence.v1.FaceDetectionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_FaceDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_FaceDetectionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.class,
              com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_FaceDetectionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.FaceDetectionAnnotation
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.FaceDetectionAnnotation build() {
      com.google.cloud.videointelligence.v1.FaceDetectionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.FaceDetectionAnnotation buildPartial() {
      com.google.cloud.videointelligence.v1.FaceDetectionAnnotation result =
          new com.google.cloud.videointelligence.v1.FaceDetectionAnnotation(this);
      result.version_ = version_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1.FaceDetectionAnnotation) {
        return mergeFrom((com.google.cloud.videointelligence.v1.FaceDetectionAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.FaceDetectionAnnotation other) {
      if (other
          == com.google.cloud.videointelligence.v1.FaceDetectionAnnotation.getDefaultInstance())
        return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.videointelligence.v1.FaceDetectionAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1.FaceDetectionAnnotation)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Feature version.
     * </pre>
     *
     * <code>string version = 5;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Feature version.
     * </pre>
     *
     * <code>string version = 5;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Feature version.
     * </pre>
     *
     * <code>string version = 5;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Feature version.
     * </pre>
     *
     * <code>string version = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Feature version.
     * </pre>
     *
     * <code>string version = 5;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      version_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.FaceDetectionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.FaceDetectionAnnotation)
  private static final com.google.cloud.videointelligence.v1.FaceDetectionAnnotation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.FaceDetectionAnnotation();
  }

  public static com.google.cloud.videointelligence.v1.FaceDetectionAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceDetectionAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<FaceDetectionAnnotation>() {
        @java.lang.Override
        public FaceDetectionAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FaceDetectionAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FaceDetectionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceDetectionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.FaceDetectionAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}