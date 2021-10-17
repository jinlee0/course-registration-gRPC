// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: university.proto

package com.cluper.course_registration;

/**
 * Protobuf type {@code university.DeleteStudentResponse}
 */
public  final class DeleteStudentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:university.DeleteStudentResponse)
    DeleteStudentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteStudentResponse.newBuilder() to construct.
  private DeleteStudentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteStudentResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteStudentResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteStudentResponse(
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
          case 10: {
            com.cluper.course_registration.ResponseMessage.Builder subBuilder = null;
            if (responseMessage_ != null) {
              subBuilder = responseMessage_.toBuilder();
            }
            responseMessage_ = input.readMessage(com.cluper.course_registration.ResponseMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseMessage_);
              responseMessage_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cluper.course_registration.University.internal_static_university_DeleteStudentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cluper.course_registration.University.internal_static_university_DeleteStudentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cluper.course_registration.DeleteStudentResponse.class, com.cluper.course_registration.DeleteStudentResponse.Builder.class);
  }

  public static final int RESPONSE_MESSAGE_FIELD_NUMBER = 1;
  private com.cluper.course_registration.ResponseMessage responseMessage_;
  /**
   * <code>.university.ResponseMessage response_message = 1;</code>
   * @return Whether the responseMessage field is set.
   */
  public boolean hasResponseMessage() {
    return responseMessage_ != null;
  }
  /**
   * <code>.university.ResponseMessage response_message = 1;</code>
   * @return The responseMessage.
   */
  public com.cluper.course_registration.ResponseMessage getResponseMessage() {
    return responseMessage_ == null ? com.cluper.course_registration.ResponseMessage.getDefaultInstance() : responseMessage_;
  }
  /**
   * <code>.university.ResponseMessage response_message = 1;</code>
   */
  public com.cluper.course_registration.ResponseMessageOrBuilder getResponseMessageOrBuilder() {
    return getResponseMessage();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (responseMessage_ != null) {
      output.writeMessage(1, getResponseMessage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponseMessage());
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
    if (!(obj instanceof com.cluper.course_registration.DeleteStudentResponse)) {
      return super.equals(obj);
    }
    com.cluper.course_registration.DeleteStudentResponse other = (com.cluper.course_registration.DeleteStudentResponse) obj;

    if (hasResponseMessage() != other.hasResponseMessage()) return false;
    if (hasResponseMessage()) {
      if (!getResponseMessage()
          .equals(other.getResponseMessage())) return false;
    }
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
    if (hasResponseMessage()) {
      hash = (37 * hash) + RESPONSE_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getResponseMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.DeleteStudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cluper.course_registration.DeleteStudentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code university.DeleteStudentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:university.DeleteStudentResponse)
      com.cluper.course_registration.DeleteStudentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cluper.course_registration.University.internal_static_university_DeleteStudentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cluper.course_registration.University.internal_static_university_DeleteStudentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cluper.course_registration.DeleteStudentResponse.class, com.cluper.course_registration.DeleteStudentResponse.Builder.class);
    }

    // Construct using com.cluper.course_registration.DeleteStudentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (responseMessageBuilder_ == null) {
        responseMessage_ = null;
      } else {
        responseMessage_ = null;
        responseMessageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cluper.course_registration.University.internal_static_university_DeleteStudentResponse_descriptor;
    }

    @java.lang.Override
    public com.cluper.course_registration.DeleteStudentResponse getDefaultInstanceForType() {
      return com.cluper.course_registration.DeleteStudentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cluper.course_registration.DeleteStudentResponse build() {
      com.cluper.course_registration.DeleteStudentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cluper.course_registration.DeleteStudentResponse buildPartial() {
      com.cluper.course_registration.DeleteStudentResponse result = new com.cluper.course_registration.DeleteStudentResponse(this);
      if (responseMessageBuilder_ == null) {
        result.responseMessage_ = responseMessage_;
      } else {
        result.responseMessage_ = responseMessageBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cluper.course_registration.DeleteStudentResponse) {
        return mergeFrom((com.cluper.course_registration.DeleteStudentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cluper.course_registration.DeleteStudentResponse other) {
      if (other == com.cluper.course_registration.DeleteStudentResponse.getDefaultInstance()) return this;
      if (other.hasResponseMessage()) {
        mergeResponseMessage(other.getResponseMessage());
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
      com.cluper.course_registration.DeleteStudentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cluper.course_registration.DeleteStudentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.cluper.course_registration.ResponseMessage responseMessage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cluper.course_registration.ResponseMessage, com.cluper.course_registration.ResponseMessage.Builder, com.cluper.course_registration.ResponseMessageOrBuilder> responseMessageBuilder_;
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     * @return Whether the responseMessage field is set.
     */
    public boolean hasResponseMessage() {
      return responseMessageBuilder_ != null || responseMessage_ != null;
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     * @return The responseMessage.
     */
    public com.cluper.course_registration.ResponseMessage getResponseMessage() {
      if (responseMessageBuilder_ == null) {
        return responseMessage_ == null ? com.cluper.course_registration.ResponseMessage.getDefaultInstance() : responseMessage_;
      } else {
        return responseMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    public Builder setResponseMessage(com.cluper.course_registration.ResponseMessage value) {
      if (responseMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseMessage_ = value;
        onChanged();
      } else {
        responseMessageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    public Builder setResponseMessage(
        com.cluper.course_registration.ResponseMessage.Builder builderForValue) {
      if (responseMessageBuilder_ == null) {
        responseMessage_ = builderForValue.build();
        onChanged();
      } else {
        responseMessageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    public Builder mergeResponseMessage(com.cluper.course_registration.ResponseMessage value) {
      if (responseMessageBuilder_ == null) {
        if (responseMessage_ != null) {
          responseMessage_ =
            com.cluper.course_registration.ResponseMessage.newBuilder(responseMessage_).mergeFrom(value).buildPartial();
        } else {
          responseMessage_ = value;
        }
        onChanged();
      } else {
        responseMessageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    public Builder clearResponseMessage() {
      if (responseMessageBuilder_ == null) {
        responseMessage_ = null;
        onChanged();
      } else {
        responseMessage_ = null;
        responseMessageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    public com.cluper.course_registration.ResponseMessage.Builder getResponseMessageBuilder() {
      
      onChanged();
      return getResponseMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    public com.cluper.course_registration.ResponseMessageOrBuilder getResponseMessageOrBuilder() {
      if (responseMessageBuilder_ != null) {
        return responseMessageBuilder_.getMessageOrBuilder();
      } else {
        return responseMessage_ == null ?
            com.cluper.course_registration.ResponseMessage.getDefaultInstance() : responseMessage_;
      }
    }
    /**
     * <code>.university.ResponseMessage response_message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cluper.course_registration.ResponseMessage, com.cluper.course_registration.ResponseMessage.Builder, com.cluper.course_registration.ResponseMessageOrBuilder> 
        getResponseMessageFieldBuilder() {
      if (responseMessageBuilder_ == null) {
        responseMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cluper.course_registration.ResponseMessage, com.cluper.course_registration.ResponseMessage.Builder, com.cluper.course_registration.ResponseMessageOrBuilder>(
                getResponseMessage(),
                getParentForChildren(),
                isClean());
        responseMessage_ = null;
      }
      return responseMessageBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:university.DeleteStudentResponse)
  }

  // @@protoc_insertion_point(class_scope:university.DeleteStudentResponse)
  private static final com.cluper.course_registration.DeleteStudentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cluper.course_registration.DeleteStudentResponse();
  }

  public static com.cluper.course_registration.DeleteStudentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteStudentResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteStudentResponse>() {
    @java.lang.Override
    public DeleteStudentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteStudentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteStudentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteStudentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cluper.course_registration.DeleteStudentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

