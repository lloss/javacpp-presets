// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class VersionDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VersionDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VersionDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VersionDef position(long position) {
        return (VersionDef)super.position(position);
    }

  public VersionDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public VersionDef(@Const @ByRef VersionDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef VersionDef from);

  public native @ByRef @Name("operator =") VersionDef put(@Const @ByRef VersionDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef VersionDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const VersionDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(VersionDef other);
  public native void Swap(VersionDef other);
  

  // implements Message ----------------------------------------------

  public native VersionDef New();

  public native VersionDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef VersionDef from);
  public native void MergeFrom(@Const @ByRef VersionDef from);
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

  // repeated int32 bad_consumers = 3;
  public native int bad_consumers_size();
  public native void clear_bad_consumers();
  @MemberGetter public static native int kBadConsumersFieldNumber();
  public static final int kBadConsumersFieldNumber = kBadConsumersFieldNumber();
  public native @Cast("google::protobuf::int32") int bad_consumers(int index);
  public native void set_bad_consumers(int index, @Cast("google::protobuf::int32") int value);
  public native void add_bad_consumers(@Cast("google::protobuf::int32") int value);

  // int32 producer = 1;
  public native void clear_producer();
  @MemberGetter public static native int kProducerFieldNumber();
  public static final int kProducerFieldNumber = kProducerFieldNumber();
  public native @Cast("google::protobuf::int32") int producer();
  public native void set_producer(@Cast("google::protobuf::int32") int value);

  // int32 min_consumer = 2;
  public native void clear_min_consumer();
  @MemberGetter public static native int kMinConsumerFieldNumber();
  public static final int kMinConsumerFieldNumber = kMinConsumerFieldNumber();
  public native @Cast("google::protobuf::int32") int min_consumer();
  public native void set_min_consumer(@Cast("google::protobuf::int32") int value);
}
