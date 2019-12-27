// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Summary_Value extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Summary_Value(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Summary_Value(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Summary_Value position(long position) {
        return (Summary_Value)super.position(position);
    }

  public Summary_Value() { super((Pointer)null); allocate(); }
  private native void allocate();

  public Summary_Value(@Const @ByRef Summary_Value from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef Summary_Value from);

  public native @ByRef @Name("operator =") Summary_Value put(@Const @ByRef Summary_Value from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef Summary_Value default_instance();

  /** enum tensorflow::Summary_Value::ValueCase */
  public static final int
    kSimpleValue = 2,
    kObsoleteOldStyleHistogram = 3,
    kImage = 4,
    kHisto = 5,
    kAudio = 6,
    kTensor = 8,
    VALUE_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const Summary_Value internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(Summary_Value other);
  public native void Swap(Summary_Value other);
  

  // implements Message ----------------------------------------------

  public native Summary_Value New();

  public native Summary_Value New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef Summary_Value from);
  public native void MergeFrom(@Const @ByRef Summary_Value from);
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

  // string tag = 1;
  public native void clear_tag();
  @MemberGetter public static native int kTagFieldNumber();
  public static final int kTagFieldNumber = kTagFieldNumber();
  public native @StdString BytePointer tag();
  public native void set_tag(@StdString BytePointer value);
  public native void set_tag(@StdString String value);
  public native void set_tag(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_tag(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tag();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_tag();
  public native void set_allocated_tag(@StdString @Cast({"char*", "std::string*"}) BytePointer tag);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_tag();
  public native void unsafe_arena_set_allocated_tag(
        @StdString @Cast({"char*", "std::string*"}) BytePointer tag);

  // string node_name = 7;
  public native void clear_node_name();
  @MemberGetter public static native int kNodeNameFieldNumber();
  public static final int kNodeNameFieldNumber = kNodeNameFieldNumber();
  public native @StdString BytePointer node_name();
  public native void set_node_name(@StdString BytePointer value);
  public native void set_node_name(@StdString String value);
  public native void set_node_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_node_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_node_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_node_name();
  public native void set_allocated_node_name(@StdString @Cast({"char*", "std::string*"}) BytePointer node_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_node_name();
  public native void unsafe_arena_set_allocated_node_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer node_name);

  // .tensorflow.SummaryMetadata metadata = 9;
  public native @Cast("bool") boolean has_metadata();
  public native void clear_metadata();
  @MemberGetter public static native int kMetadataFieldNumber();
  public static final int kMetadataFieldNumber = kMetadataFieldNumber();
  public native @Const @ByRef SummaryMetadata metadata();
  public native SummaryMetadata release_metadata();
  public native SummaryMetadata mutable_metadata();
  public native void set_allocated_metadata(SummaryMetadata metadata);
  public native void unsafe_arena_set_allocated_metadata(
        SummaryMetadata metadata);
  public native SummaryMetadata unsafe_arena_release_metadata();
  public native void clear_simple_value();
  @MemberGetter public static native int kSimpleValueFieldNumber();
  public static final int kSimpleValueFieldNumber = kSimpleValueFieldNumber();
  public native float simple_value();
  public native void set_simple_value(float value);
  public native void clear_obsolete_old_style_histogram();
  @MemberGetter public static native int kObsoleteOldStyleHistogramFieldNumber();
  public static final int kObsoleteOldStyleHistogramFieldNumber = kObsoleteOldStyleHistogramFieldNumber();
  public native @StdString BytePointer obsolete_old_style_histogram();
  public native void set_obsolete_old_style_histogram(@StdString BytePointer value);
  public native void set_obsolete_old_style_histogram(@StdString String value);
  public native void set_obsolete_old_style_histogram(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_obsolete_old_style_histogram();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_obsolete_old_style_histogram();
  public native void set_allocated_obsolete_old_style_histogram(@StdString @Cast({"char*", "std::string*"}) BytePointer obsolete_old_style_histogram);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_obsolete_old_style_histogram();
  public native void unsafe_arena_set_allocated_obsolete_old_style_histogram(
        @StdString @Cast({"char*", "std::string*"}) BytePointer obsolete_old_style_histogram);

  // .tensorflow.Summary.Image image = 4;
  public native @Cast("bool") boolean has_image();
  public native void clear_image();
  @MemberGetter public static native int kImageFieldNumber();
  public static final int kImageFieldNumber = kImageFieldNumber();
  public native @Const @ByRef Summary_Image image();
  public native Summary_Image release_image();
  public native Summary_Image mutable_image();
  public native void set_allocated_image(Summary_Image image);
  public native void unsafe_arena_set_allocated_image(
        Summary_Image image);
  public native Summary_Image unsafe_arena_release_image();

  // .tensorflow.HistogramProto histo = 5;
  public native @Cast("bool") boolean has_histo();
  public native void clear_histo();
  @MemberGetter public static native int kHistoFieldNumber();
  public static final int kHistoFieldNumber = kHistoFieldNumber();
  public native @Const @ByRef HistogramProto histo();
  public native HistogramProto release_histo();
  public native HistogramProto mutable_histo();
  public native void set_allocated_histo(HistogramProto histo);
  public native void unsafe_arena_set_allocated_histo(
        HistogramProto histo);
  public native HistogramProto unsafe_arena_release_histo();

  // .tensorflow.Summary.Audio audio = 6;
  public native @Cast("bool") boolean has_audio();
  public native void clear_audio();
  @MemberGetter public static native int kAudioFieldNumber();
  public static final int kAudioFieldNumber = kAudioFieldNumber();
  public native @Const @ByRef Summary_Audio audio();
  public native Summary_Audio release_audio();
  public native Summary_Audio mutable_audio();
  public native void set_allocated_audio(Summary_Audio audio);
  public native void unsafe_arena_set_allocated_audio(
        Summary_Audio audio);
  public native Summary_Audio unsafe_arena_release_audio();

  // .tensorflow.TensorProto tensor = 8;
  public native @Cast("bool") boolean has_tensor();
  public native void clear_tensor();
  @MemberGetter public static native int kTensorFieldNumber();
  public static final int kTensorFieldNumber = kTensorFieldNumber();
  public native @Const @ByRef TensorProto tensor();
  public native TensorProto release_tensor();
  public native TensorProto mutable_tensor();
  public native void set_allocated_tensor(TensorProto tensor);
  public native void unsafe_arena_set_allocated_tensor(
        TensorProto tensor);
  public native TensorProto unsafe_arena_release_tensor();

  public native void clear_value();
  public native @Cast("tensorflow::Summary_Value::ValueCase") int value_case();
}
