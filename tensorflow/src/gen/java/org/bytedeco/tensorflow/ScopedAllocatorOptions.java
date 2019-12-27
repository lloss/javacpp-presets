// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ScopedAllocatorOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScopedAllocatorOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScopedAllocatorOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScopedAllocatorOptions position(long position) {
        return (ScopedAllocatorOptions)super.position(position);
    }

  public ScopedAllocatorOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ScopedAllocatorOptions(@Const @ByRef ScopedAllocatorOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ScopedAllocatorOptions from);

  public native @ByRef @Name("operator =") ScopedAllocatorOptions put(@Const @ByRef ScopedAllocatorOptions from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef ScopedAllocatorOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ScopedAllocatorOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ScopedAllocatorOptions other);
  public native void Swap(ScopedAllocatorOptions other);
  

  // implements Message ----------------------------------------------

  public native ScopedAllocatorOptions New();

  public native ScopedAllocatorOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ScopedAllocatorOptions from);
  public native void MergeFrom(@Const @ByRef ScopedAllocatorOptions from);
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

  // repeated string enable_op = 1;
  public native int enable_op_size();
  public native void clear_enable_op();
  @MemberGetter public static native int kEnableOpFieldNumber();
  public static final int kEnableOpFieldNumber = kEnableOpFieldNumber();
  public native @StdString BytePointer enable_op(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_enable_op(int index);
  public native void set_enable_op(int index, @StdString BytePointer value);
  public native void set_enable_op(int index, @StdString String value);
  public native void set_enable_op(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_enable_op(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_enable_op();
  public native void add_enable_op(@StdString BytePointer value);
  public native void add_enable_op(@StdString String value);
  public native void add_enable_op(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_enable_op(String value, @Cast("size_t") long size);
}
