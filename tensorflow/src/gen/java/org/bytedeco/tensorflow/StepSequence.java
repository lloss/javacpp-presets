// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StepSequence extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StepSequence(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StepSequence(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StepSequence position(long position) {
        return (StepSequence)super.position(position);
    }

  public StepSequence() { super((Pointer)null); allocate(); }
  private native void allocate();

  public StepSequence(@Const @ByRef StepSequence from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef StepSequence from);

  public native @ByRef @Name("operator =") StepSequence put(@Const @ByRef StepSequence from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef StepSequence default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const StepSequence internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(StepSequence other);
  public native void Swap(StepSequence other);
  

  // implements Message ----------------------------------------------

  public native StepSequence New();

  public native StepSequence New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef StepSequence from);
  public native void MergeFrom(@Const @ByRef StepSequence from);
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

  // int64 graph_key = 1;
  public native void clear_graph_key();
  @MemberGetter public static native int kGraphKeyFieldNumber();
  public static final int kGraphKeyFieldNumber = kGraphKeyFieldNumber();
  public native @Cast("google::protobuf::int64") long graph_key();
  public native void set_graph_key(@Cast("google::protobuf::int64") long value);

  // int64 next_step_id = 2;
  public native void clear_next_step_id();
  @MemberGetter public static native int kNextStepIdFieldNumber();
  public static final int kNextStepIdFieldNumber = kNextStepIdFieldNumber();
  public native @Cast("google::protobuf::int64") long next_step_id();
  public native void set_next_step_id(@Cast("google::protobuf::int64") long value);
}
