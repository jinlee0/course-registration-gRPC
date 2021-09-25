// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: university.proto

package com.cluper.course_registration;

/**
 * Protobuf type {@code university.StudetRequest}
 */
public  final class StudetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:university.StudetRequest)
    StudetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudetRequest.newBuilder() to construct.
  private StudetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudetRequest(
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
            com.cluper.course_registration.Student.Builder subBuilder = null;
            if (student_ != null) {
              subBuilder = student_.toBuilder();
            }
            student_ = input.readMessage(com.cluper.course_registration.Student.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(student_);
              student_ = subBuilder.buildPartial();
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
    return com.cluper.course_registration.University.internal_static_university_StudetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cluper.course_registration.University.internal_static_university_StudetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cluper.course_registration.StudetRequest.class, com.cluper.course_registration.StudetRequest.Builder.class);
  }

  public static final int STUDENT_FIELD_NUMBER = 1;
  private com.cluper.course_registration.Student student_;
  /**
   * <code>.university.Student student = 1;</code>
   * @return Whether the student field is set.
   */
  public boolean hasStudent() {
    return student_ != null;
  }
  /**
   * <code>.university.Student student = 1;</code>
   * @return The student.
   */
  public com.cluper.course_registration.Student getStudent() {
    return student_ == null ? com.cluper.course_registration.Student.getDefaultInstance() : student_;
  }
  /**
   * <code>.university.Student student = 1;</code>
   */
  public com.cluper.course_registration.StudentOrBuilder getStudentOrBuilder() {
    return getStudent();
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
    if (student_ != null) {
      output.writeMessage(1, getStudent());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (student_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStudent());
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
    if (!(obj instanceof com.cluper.course_registration.StudetRequest)) {
      return super.equals(obj);
    }
    com.cluper.course_registration.StudetRequest other = (com.cluper.course_registration.StudetRequest) obj;

    if (hasStudent() != other.hasStudent()) return false;
    if (hasStudent()) {
      if (!getStudent()
          .equals(other.getStudent())) return false;
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
    if (hasStudent()) {
      hash = (37 * hash) + STUDENT_FIELD_NUMBER;
      hash = (53 * hash) + getStudent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cluper.course_registration.StudetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cluper.course_registration.StudetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.StudetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.StudetRequest parseFrom(
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
  public static Builder newBuilder(com.cluper.course_registration.StudetRequest prototype) {
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
   * Protobuf type {@code university.StudetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:university.StudetRequest)
      com.cluper.course_registration.StudetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cluper.course_registration.University.internal_static_university_StudetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cluper.course_registration.University.internal_static_university_StudetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cluper.course_registration.StudetRequest.class, com.cluper.course_registration.StudetRequest.Builder.class);
    }

    // Construct using com.cluper.course_registration.StudetRequest.newBuilder()
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
      if (studentBuilder_ == null) {
        student_ = null;
      } else {
        student_ = null;
        studentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cluper.course_registration.University.internal_static_university_StudetRequest_descriptor;
    }

    @java.lang.Override
    public com.cluper.course_registration.StudetRequest getDefaultInstanceForType() {
      return com.cluper.course_registration.StudetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cluper.course_registration.StudetRequest build() {
      com.cluper.course_registration.StudetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cluper.course_registration.StudetRequest buildPartial() {
      com.cluper.course_registration.StudetRequest result = new com.cluper.course_registration.StudetRequest(this);
      if (studentBuilder_ == null) {
        result.student_ = student_;
      } else {
        result.student_ = studentBuilder_.build();
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
      if (other instanceof com.cluper.course_registration.StudetRequest) {
        return mergeFrom((com.cluper.course_registration.StudetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cluper.course_registration.StudetRequest other) {
      if (other == com.cluper.course_registration.StudetRequest.getDefaultInstance()) return this;
      if (other.hasStudent()) {
        mergeStudent(other.getStudent());
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
      com.cluper.course_registration.StudetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cluper.course_registration.StudetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.cluper.course_registration.Student student_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cluper.course_registration.Student, com.cluper.course_registration.Student.Builder, com.cluper.course_registration.StudentOrBuilder> studentBuilder_;
    /**
     * <code>.university.Student student = 1;</code>
     * @return Whether the student field is set.
     */
    public boolean hasStudent() {
      return studentBuilder_ != null || student_ != null;
    }
    /**
     * <code>.university.Student student = 1;</code>
     * @return The student.
     */
    public com.cluper.course_registration.Student getStudent() {
      if (studentBuilder_ == null) {
        return student_ == null ? com.cluper.course_registration.Student.getDefaultInstance() : student_;
      } else {
        return studentBuilder_.getMessage();
      }
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    public Builder setStudent(com.cluper.course_registration.Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        student_ = value;
        onChanged();
      } else {
        studentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    public Builder setStudent(
        com.cluper.course_registration.Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        student_ = builderForValue.build();
        onChanged();
      } else {
        studentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    public Builder mergeStudent(com.cluper.course_registration.Student value) {
      if (studentBuilder_ == null) {
        if (student_ != null) {
          student_ =
            com.cluper.course_registration.Student.newBuilder(student_).mergeFrom(value).buildPartial();
        } else {
          student_ = value;
        }
        onChanged();
      } else {
        studentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    public Builder clearStudent() {
      if (studentBuilder_ == null) {
        student_ = null;
        onChanged();
      } else {
        student_ = null;
        studentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    public com.cluper.course_registration.Student.Builder getStudentBuilder() {
      
      onChanged();
      return getStudentFieldBuilder().getBuilder();
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    public com.cluper.course_registration.StudentOrBuilder getStudentOrBuilder() {
      if (studentBuilder_ != null) {
        return studentBuilder_.getMessageOrBuilder();
      } else {
        return student_ == null ?
            com.cluper.course_registration.Student.getDefaultInstance() : student_;
      }
    }
    /**
     * <code>.university.Student student = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cluper.course_registration.Student, com.cluper.course_registration.Student.Builder, com.cluper.course_registration.StudentOrBuilder> 
        getStudentFieldBuilder() {
      if (studentBuilder_ == null) {
        studentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cluper.course_registration.Student, com.cluper.course_registration.Student.Builder, com.cluper.course_registration.StudentOrBuilder>(
                getStudent(),
                getParentForChildren(),
                isClean());
        student_ = null;
      }
      return studentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:university.StudetRequest)
  }

  // @@protoc_insertion_point(class_scope:university.StudetRequest)
  private static final com.cluper.course_registration.StudetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cluper.course_registration.StudetRequest();
  }

  public static com.cluper.course_registration.StudetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudetRequest>
      PARSER = new com.google.protobuf.AbstractParser<StudetRequest>() {
    @java.lang.Override
    public StudetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cluper.course_registration.StudetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

