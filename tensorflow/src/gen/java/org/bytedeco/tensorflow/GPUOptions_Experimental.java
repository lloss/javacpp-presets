// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GPUOptions_Experimental extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GPUOptions_Experimental(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GPUOptions_Experimental(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GPUOptions_Experimental position(long position) {
        return (GPUOptions_Experimental)super.position(position);
    }

  public GPUOptions_Experimental() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GPUOptions_Experimental(@Const @ByRef GPUOptions_Experimental from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef GPUOptions_Experimental from);

  public native @ByRef @Name("operator =") GPUOptions_Experimental put(@Const @ByRef GPUOptions_Experimental from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef GPUOptions_Experimental default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const GPUOptions_Experimental internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(GPUOptions_Experimental other);
  public native void Swap(GPUOptions_Experimental other);
  

  // implements Message ----------------------------------------------

  public native GPUOptions_Experimental New();

  public native GPUOptions_Experimental New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef GPUOptions_Experimental from);
  public native void MergeFrom(@Const @ByRef GPUOptions_Experimental from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .tensorflow.GPUOptions.Experimental.VirtualDevices virtual_devices = 1;
  public native int virtual_devices_size();
  public native void clear_virtual_devices();
  @MemberGetter public static native int kVirtualDevicesFieldNumber();
  public static final int kVirtualDevicesFieldNumber = kVirtualDevicesFieldNumber();
  public native GPUOptions_Experimental_VirtualDevices mutable_virtual_devices(int index);
  public native @Const @ByRef GPUOptions_Experimental_VirtualDevices virtual_devices(int index);
  public native GPUOptions_Experimental_VirtualDevices add_virtual_devices();

  // string collective_ring_order = 4;
  public native void clear_collective_ring_order();
  @MemberGetter public static native int kCollectiveRingOrderFieldNumber();
  public static final int kCollectiveRingOrderFieldNumber = kCollectiveRingOrderFieldNumber();
  public native @StdString BytePointer collective_ring_order();
  public native void set_collective_ring_order(@StdString BytePointer value);
  public native void set_collective_ring_order(@StdString String value);
  public native void set_collective_ring_order(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_collective_ring_order(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_collective_ring_order();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_collective_ring_order();
  public native void set_allocated_collective_ring_order(@StdString @Cast({"char*", "std::string*"}) BytePointer collective_ring_order);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_collective_ring_order();
  public native void unsafe_arena_set_allocated_collective_ring_order(
        @StdString @Cast({"char*", "std::string*"}) BytePointer collective_ring_order);

  // int32 num_dev_to_dev_copy_streams = 3;
  public native void clear_num_dev_to_dev_copy_streams();
  @MemberGetter public static native int kNumDevToDevCopyStreamsFieldNumber();
  public static final int kNumDevToDevCopyStreamsFieldNumber = kNumDevToDevCopyStreamsFieldNumber();
  public native @Cast("google::protobuf::int32") int num_dev_to_dev_copy_streams();
  public native void set_num_dev_to_dev_copy_streams(@Cast("google::protobuf::int32") int value);

  // bool use_unified_memory = 2;
  public native void clear_use_unified_memory();
  @MemberGetter public static native int kUseUnifiedMemoryFieldNumber();
  public static final int kUseUnifiedMemoryFieldNumber = kUseUnifiedMemoryFieldNumber();
  public native @Cast("bool") boolean use_unified_memory();
  public native void set_use_unified_memory(@Cast("bool") boolean value);

  // bool timestamped_allocator = 5;
  public native void clear_timestamped_allocator();
  @MemberGetter public static native int kTimestampedAllocatorFieldNumber();
  public static final int kTimestampedAllocatorFieldNumber = kTimestampedAllocatorFieldNumber();
  public native @Cast("bool") boolean timestamped_allocator();
  public native void set_timestamped_allocator(@Cast("bool") boolean value);

  // int32 kernel_tracker_max_interval = 7;
  public native void clear_kernel_tracker_max_interval();
  @MemberGetter public static native int kKernelTrackerMaxIntervalFieldNumber();
  public static final int kKernelTrackerMaxIntervalFieldNumber = kKernelTrackerMaxIntervalFieldNumber();
  public native @Cast("google::protobuf::int32") int kernel_tracker_max_interval();
  public native void set_kernel_tracker_max_interval(@Cast("google::protobuf::int32") int value);

  // int32 kernel_tracker_max_bytes = 8;
  public native void clear_kernel_tracker_max_bytes();
  @MemberGetter public static native int kKernelTrackerMaxBytesFieldNumber();
  public static final int kKernelTrackerMaxBytesFieldNumber = kKernelTrackerMaxBytesFieldNumber();
  public native @Cast("google::protobuf::int32") int kernel_tracker_max_bytes();
  public native void set_kernel_tracker_max_bytes(@Cast("google::protobuf::int32") int value);

  // int32 kernel_tracker_max_pending = 9;
  public native void clear_kernel_tracker_max_pending();
  @MemberGetter public static native int kKernelTrackerMaxPendingFieldNumber();
  public static final int kKernelTrackerMaxPendingFieldNumber = kKernelTrackerMaxPendingFieldNumber();
  public native @Cast("google::protobuf::int32") int kernel_tracker_max_pending();
  public native void set_kernel_tracker_max_pending(@Cast("google::protobuf::int32") int value);
}
