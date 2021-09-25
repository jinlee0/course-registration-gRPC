// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: university.proto

package com.cluper.course_registration;

public final class University {
  private University() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_university_StudetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_university_StudetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_university_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_university_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_university_CourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_university_CourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_university_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_university_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_university_Course_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_university_Course_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_university_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_university_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020university.proto\022\nuniversity\"5\n\rStudet" +
      "Request\022$\n\007student\030\001 \001(\0132\023.university.St" +
      "udent\"8\n\017StudentResponse\022%\n\010students\030\001 \003" +
      "(\0132\023.university.Student\"4\n\016CourseRespons" +
      "e\022\"\n\006course\030\001 \003(\0132\022.university.Course\"i\n" +
      "\007Student\022\022\n\nstudent_id\030\001 \001(\t\022\021\n\tlast_nam" +
      "e\030\002 \001(\t\022\022\n\nfirst_name\030\003 \001(\t\022#\n\007courses\030\004" +
      " \003(\0132\022.university.Course\"C\n\006Course\022\021\n\tco" +
      "urse_id\030\001 \001(\t\022\021\n\tprof_name\030\002 \001(\t\022\023\n\013cour" +
      "se_name\030\003 \001(\t\"\007\n\005Empty2\221\001\n\rSearchService" +
      "\022@\n\016GetAllStudents\022\021.university.Empty\032\033." +
      "university.StudentResponse\022>\n\rGetAllCour" +
      "ses\022\021.university.Empty\032\032.university.Cour" +
      "seResponseB.\n\036com.cluper.course_registra" +
      "tionB\nUniversityP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_university_StudetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_university_StudetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_university_StudetRequest_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_university_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_university_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_university_StudentResponse_descriptor,
        new java.lang.String[] { "Students", });
    internal_static_university_CourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_university_CourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_university_CourseResponse_descriptor,
        new java.lang.String[] { "Course", });
    internal_static_university_Student_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_university_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_university_Student_descriptor,
        new java.lang.String[] { "StudentId", "LastName", "FirstName", "Courses", });
    internal_static_university_Course_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_university_Course_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_university_Course_descriptor,
        new java.lang.String[] { "CourseId", "ProfName", "CourseName", });
    internal_static_university_Empty_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_university_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_university_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
