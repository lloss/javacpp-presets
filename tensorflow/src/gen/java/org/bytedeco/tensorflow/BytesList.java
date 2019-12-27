// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BytesList extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BytesList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BytesList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BytesList position(long position) {
        return (BytesList)super.position(position);
    }

  public BytesList() { super((Pointer)null); allocate(); }
  private native void allocate();

  public BytesList(@Const @ByRef BytesList from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef BytesList from);

  public native @ByRef @Name("operator =") BytesList put(@Const @ByRef BytesList from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef BytesList default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const BytesList internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(BytesList other);
  public native void Swap(BytesList other);
  

  // implements Message ----------------------------------------------

  public native BytesList New();

  public native BytesList New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef BytesList from);
  public native void MergeFrom(@Const @ByRef BytesList from);
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

  // repeated bytes value = 1;
  public native int value_size();
  public native void clear_value();
  @MemberGetter public static native int kValueFieldNumber();
  public static final int kValueFieldNumber = kValueFieldNumber();
  public native @StdString BytePointer value(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_value(int index);
  public native void set_value(int index, @StdString BytePointer value);
  public native void set_value(int index, @StdString String value);
  public native void set_value(int index, @Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_value();
  public native void add_value(@StdString BytePointer value);
  public native void add_value(@StdString String value);
  public native void add_value(@Const Pointer value, @Cast("size_t") long size);
}
