// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package org.apache.dubbo.remoting.transport.grpc.proto;

public final class GrpcProto {
  private GrpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GrpcRequest_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GrpcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GrpcReply_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GrpcReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020helloworld.proto\022\005proto\"\033\n\013GrpcRequest" +
      "\022\014\n\004data\030\001 \001(\014\"\031\n\tGrpcReply\022\014\n\004data\030\001 \001(" +
      "\0142>\n\007Greeter\0223\n\005getRp\022\022.proto.GrpcReques" +
      "t\032\020.proto.GrpcReply\"\000(\0010\001BC\n.org.apache." +
      "dubbo.remoting.transport.grpc.protoB\tGrp" +
      "cProtoP\001\242\002\003HLWb\006proto3"
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
    internal_static_proto_GrpcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_GrpcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GrpcRequest_descriptor,
        new String[] { "Data", });
    internal_static_proto_GrpcReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_GrpcReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GrpcReply_descriptor,
        new String[] { "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
