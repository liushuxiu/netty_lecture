// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.shengsiyuan.proto;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_MyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rStudent.proto\022\025com.shengsiyuan.proto\"\035" +
      "\n\tMyRequest\022\020\n\010username\030\001 \001(\t\"\036\n\nMyRespo" +
      "nse\022\020\n\010realname\030\002 \001(\t2p\n\016StudentService\022" +
      "^\n\025GetRealNameByUserName\022 .com.shengsiyu" +
      "an.proto.MyRequest\032!.com.shengsiyuan.pro" +
      "to.MyResponse\"\000B\'\n\025com.shengsiyuan.proto" +
      "B\014StudentProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_shengsiyuan_proto_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_shengsiyuan_proto_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_MyRequest_descriptor,
        new String[] { "Username", });
    internal_static_com_shengsiyuan_proto_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_shengsiyuan_proto_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_MyResponse_descriptor,
        new String[] { "Realname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
