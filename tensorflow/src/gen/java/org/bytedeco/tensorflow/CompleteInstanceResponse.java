// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CompleteInstanceResponse extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompleteInstanceResponse(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CompleteInstanceResponse(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CompleteInstanceResponse position(long position) {
        return (CompleteInstanceResponse)super.position(position);
    }

  public CompleteInstanceResponse() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CompleteInstanceResponse(@Const @ByRef CompleteInstanceResponse from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CompleteInstanceResponse from);

  public native @ByRef @Name("operator =") CompleteInstanceResponse put(@Const @ByRef CompleteInstanceResponse from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef CompleteInstanceResponse default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CompleteInstanceResponse internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CompleteInstanceResponse other);
  public native void Swap(CompleteInstanceResponse other);
  

  // implements Message ----------------------------------------------

  public native CompleteInstanceResponse New();

  public native CompleteInstanceResponse New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CompleteInstanceResponse from);
  public native void MergeFrom(@Const @ByRef CompleteInstanceResponse from);
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

  // int32 instance_key = 1;
  public native void clear_instance_key();
  @MemberGetter public static native int kInstanceKeyFieldNumber();
  public static final int kInstanceKeyFieldNumber = kInstanceKeyFieldNumber();
  public native @Cast("google::protobuf::int32") int instance_key();
  public native void set_instance_key(@Cast("google::protobuf::int32") int value);

  // int32 source_rank = 2;
  public native void clear_source_rank();
  @MemberGetter public static native int kSourceRankFieldNumber();
  public static final int kSourceRankFieldNumber = kSourceRankFieldNumber();
  public native @Cast("google::protobuf::int32") int source_rank();
  public native void set_source_rank(@Cast("google::protobuf::int32") int value);
}
