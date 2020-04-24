// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

public interface GetWorkerIdPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.GetWorkerIdPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the worker network address 
   * </pre>
   *
   * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
   * @return Whether the workerNetAddress field is set.
   */
  boolean hasWorkerNetAddress();
  /**
   * <pre>
   ** the worker network address 
   * </pre>
   *
   * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
   * @return The workerNetAddress.
   */
  alluxio.grpc.WorkerNetAddress getWorkerNetAddress();
  /**
   * <pre>
   ** the worker network address 
   * </pre>
   *
   * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
   */
  alluxio.grpc.WorkerNetAddressOrBuilder getWorkerNetAddressOrBuilder();

  /**
   * <code>optional .alluxio.grpc.block.GetWorkerIdPOptions options = 2;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.block.GetWorkerIdPOptions options = 2;</code>
   * @return The options.
   */
  alluxio.grpc.GetWorkerIdPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.block.GetWorkerIdPOptions options = 2;</code>
   */
  alluxio.grpc.GetWorkerIdPOptionsOrBuilder getOptionsOrBuilder();
}