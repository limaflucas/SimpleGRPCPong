// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PingService.proto

package br.com.limaflucas.grpc;

public interface PingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.limaflucas.grpc.PingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string requestMessage = 1;</code>
   * @return The requestMessage.
   */
  java.lang.String getRequestMessage();
  /**
   * <code>string requestMessage = 1;</code>
   * @return The bytes for requestMessage.
   */
  com.google.protobuf.ByteString
      getRequestMessageBytes();

  /**
   * <code>string requestTime = 2;</code>
   * @return The requestTime.
   */
  java.lang.String getRequestTime();
  /**
   * <code>string requestTime = 2;</code>
   * @return The bytes for requestTime.
   */
  com.google.protobuf.ByteString
      getRequestTimeBytes();
}
