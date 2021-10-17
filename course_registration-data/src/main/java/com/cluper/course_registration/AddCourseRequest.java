// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: university.proto

package com.cluper.course_registration;

/**
 * Protobuf type {@code university.AddCourseRequest}
 */
public  final class AddCourseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:university.AddCourseRequest)
    AddCourseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddCourseRequest.newBuilder() to construct.
  private AddCourseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddCourseRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddCourseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddCourseRequest(
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
            com.cluper.course_registration.Course.Builder subBuilder = null;
            if (course_ != null) {
              subBuilder = course_.toBuilder();
            }
            course_ = input.readMessage(com.cluper.course_registration.Course.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(course_);
              course_ = subBuilder.buildPartial();
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
    return com.cluper.course_registration.University.internal_static_university_AddCourseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cluper.course_registration.University.internal_static_university_AddCourseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cluper.course_registration.AddCourseRequest.class, com.cluper.course_registration.AddCourseRequest.Builder.class);
  }

  public static final int COURSE_FIELD_NUMBER = 1;
  private com.cluper.course_registration.Course course_;
  /**
   * <code>.university.Course course = 1;</code>
   * @return Whether the course field is set.
   */
  public boolean hasCourse() {
    return course_ != null;
  }
  /**
   * <code>.university.Course course = 1;</code>
   * @return The course.
   */
  public com.cluper.course_registration.Course getCourse() {
    return course_ == null ? com.cluper.course_registration.Course.getDefaultInstance() : course_;
  }
  /**
   * <code>.university.Course course = 1;</code>
   */
  public com.cluper.course_registration.CourseOrBuilder getCourseOrBuilder() {
    return getCourse();
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
    if (course_ != null) {
      output.writeMessage(1, getCourse());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (course_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCourse());
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
    if (!(obj instanceof com.cluper.course_registration.AddCourseRequest)) {
      return super.equals(obj);
    }
    com.cluper.course_registration.AddCourseRequest other = (com.cluper.course_registration.AddCourseRequest) obj;

    if (hasCourse() != other.hasCourse()) return false;
    if (hasCourse()) {
      if (!getCourse()
          .equals(other.getCourse())) return false;
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
    if (hasCourse()) {
      hash = (37 * hash) + COURSE_FIELD_NUMBER;
      hash = (53 * hash) + getCourse().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cluper.course_registration.AddCourseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.AddCourseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cluper.course_registration.AddCourseRequest parseFrom(
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
  public static Builder newBuilder(com.cluper.course_registration.AddCourseRequest prototype) {
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
   * Protobuf type {@code university.AddCourseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:university.AddCourseRequest)
      com.cluper.course_registration.AddCourseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cluper.course_registration.University.internal_static_university_AddCourseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cluper.course_registration.University.internal_static_university_AddCourseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cluper.course_registration.AddCourseRequest.class, com.cluper.course_registration.AddCourseRequest.Builder.class);
    }

    // Construct using com.cluper.course_registration.AddCourseRequest.newBuilder()
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
      if (courseBuilder_ == null) {
        course_ = null;
      } else {
        course_ = null;
        courseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cluper.course_registration.University.internal_static_university_AddCourseRequest_descriptor;
    }

    @java.lang.Override
    public com.cluper.course_registration.AddCourseRequest getDefaultInstanceForType() {
      return com.cluper.course_registration.AddCourseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cluper.course_registration.AddCourseRequest build() {
      com.cluper.course_registration.AddCourseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cluper.course_registration.AddCourseRequest buildPartial() {
      com.cluper.course_registration.AddCourseRequest result = new com.cluper.course_registration.AddCourseRequest(this);
      if (courseBuilder_ == null) {
        result.course_ = course_;
      } else {
        result.course_ = courseBuilder_.build();
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
      if (other instanceof com.cluper.course_registration.AddCourseRequest) {
        return mergeFrom((com.cluper.course_registration.AddCourseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cluper.course_registration.AddCourseRequest other) {
      if (other == com.cluper.course_registration.AddCourseRequest.getDefaultInstance()) return this;
      if (other.hasCourse()) {
        mergeCourse(other.getCourse());
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
      com.cluper.course_registration.AddCourseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cluper.course_registration.AddCourseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.cluper.course_registration.Course course_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cluper.course_registration.Course, com.cluper.course_registration.Course.Builder, com.cluper.course_registration.CourseOrBuilder> courseBuilder_;
    /**
     * <code>.university.Course course = 1;</code>
     * @return Whether the course field is set.
     */
    public boolean hasCourse() {
      return courseBuilder_ != null || course_ != null;
    }
    /**
     * <code>.university.Course course = 1;</code>
     * @return The course.
     */
    public com.cluper.course_registration.Course getCourse() {
      if (courseBuilder_ == null) {
        return course_ == null ? com.cluper.course_registration.Course.getDefaultInstance() : course_;
      } else {
        return courseBuilder_.getMessage();
      }
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    public Builder setCourse(com.cluper.course_registration.Course value) {
      if (courseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        course_ = value;
        onChanged();
      } else {
        courseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    public Builder setCourse(
        com.cluper.course_registration.Course.Builder builderForValue) {
      if (courseBuilder_ == null) {
        course_ = builderForValue.build();
        onChanged();
      } else {
        courseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    public Builder mergeCourse(com.cluper.course_registration.Course value) {
      if (courseBuilder_ == null) {
        if (course_ != null) {
          course_ =
            com.cluper.course_registration.Course.newBuilder(course_).mergeFrom(value).buildPartial();
        } else {
          course_ = value;
        }
        onChanged();
      } else {
        courseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    public Builder clearCourse() {
      if (courseBuilder_ == null) {
        course_ = null;
        onChanged();
      } else {
        course_ = null;
        courseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    public com.cluper.course_registration.Course.Builder getCourseBuilder() {
      
      onChanged();
      return getCourseFieldBuilder().getBuilder();
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    public com.cluper.course_registration.CourseOrBuilder getCourseOrBuilder() {
      if (courseBuilder_ != null) {
        return courseBuilder_.getMessageOrBuilder();
      } else {
        return course_ == null ?
            com.cluper.course_registration.Course.getDefaultInstance() : course_;
      }
    }
    /**
     * <code>.university.Course course = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cluper.course_registration.Course, com.cluper.course_registration.Course.Builder, com.cluper.course_registration.CourseOrBuilder> 
        getCourseFieldBuilder() {
      if (courseBuilder_ == null) {
        courseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cluper.course_registration.Course, com.cluper.course_registration.Course.Builder, com.cluper.course_registration.CourseOrBuilder>(
                getCourse(),
                getParentForChildren(),
                isClean());
        course_ = null;
      }
      return courseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:university.AddCourseRequest)
  }

  // @@protoc_insertion_point(class_scope:university.AddCourseRequest)
  private static final com.cluper.course_registration.AddCourseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cluper.course_registration.AddCourseRequest();
  }

  public static com.cluper.course_registration.AddCourseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddCourseRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddCourseRequest>() {
    @java.lang.Override
    public AddCourseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddCourseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddCourseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddCourseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cluper.course_registration.AddCourseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

