// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedConcreteFunction extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedConcreteFunction(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedConcreteFunction(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedConcreteFunction position(long position) {
        return (SavedConcreteFunction)super.position(position);
    }

  public SavedConcreteFunction() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedConcreteFunction(@Const @ByRef SavedConcreteFunction from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedConcreteFunction from);

  public native @ByRef @Name("operator =") SavedConcreteFunction put(@Const @ByRef SavedConcreteFunction from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SavedConcreteFunction default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedConcreteFunction internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedConcreteFunction other);
  public native void Swap(SavedConcreteFunction other);
  

  // implements Message ----------------------------------------------

  public native SavedConcreteFunction New();

  public native SavedConcreteFunction New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedConcreteFunction from);
  public native void MergeFrom(@Const @ByRef SavedConcreteFunction from);
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

  // repeated int32 bound_inputs = 2;
  public native int bound_inputs_size();
  public native void clear_bound_inputs();
  @MemberGetter public static native int kBoundInputsFieldNumber();
  public static final int kBoundInputsFieldNumber = kBoundInputsFieldNumber();
  public native @Cast("google::protobuf::int32") int bound_inputs(int index);
  public native void set_bound_inputs(int index, @Cast("google::protobuf::int32") int value);
  public native void add_bound_inputs(@Cast("google::protobuf::int32") int value);

  // .tensorflow.StructuredValue canonicalized_input_signature = 3;
  public native @Cast("bool") boolean has_canonicalized_input_signature();
  public native void clear_canonicalized_input_signature();
  @MemberGetter public static native int kCanonicalizedInputSignatureFieldNumber();
  public static final int kCanonicalizedInputSignatureFieldNumber = kCanonicalizedInputSignatureFieldNumber();
  public native @Const @ByRef StructuredValue canonicalized_input_signature();
  public native StructuredValue release_canonicalized_input_signature();
  public native StructuredValue mutable_canonicalized_input_signature();
  public native void set_allocated_canonicalized_input_signature(StructuredValue canonicalized_input_signature);
  public native void unsafe_arena_set_allocated_canonicalized_input_signature(
        StructuredValue canonicalized_input_signature);
  public native StructuredValue unsafe_arena_release_canonicalized_input_signature();

  // .tensorflow.StructuredValue output_signature = 4;
  public native @Cast("bool") boolean has_output_signature();
  public native void clear_output_signature();
  @MemberGetter public static native int kOutputSignatureFieldNumber();
  public static final int kOutputSignatureFieldNumber = kOutputSignatureFieldNumber();
  public native @Const @ByRef StructuredValue output_signature();
  public native StructuredValue release_output_signature();
  public native StructuredValue mutable_output_signature();
  public native void set_allocated_output_signature(StructuredValue output_signature);
  public native void unsafe_arena_set_allocated_output_signature(
        StructuredValue output_signature);
  public native StructuredValue unsafe_arena_release_output_signature();
}
