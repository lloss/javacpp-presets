// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CreateSessionRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CreateSessionRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CreateSessionRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CreateSessionRequest position(long position) {
        return (CreateSessionRequest)super.position(position);
    }

  public CreateSessionRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CreateSessionRequest(@Const @ByRef CreateSessionRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CreateSessionRequest from);

  public native @ByRef @Name("operator =") CreateSessionRequest put(@Const @ByRef CreateSessionRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef CreateSessionRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CreateSessionRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CreateSessionRequest other);
  public native void Swap(CreateSessionRequest other);
  

  // implements Message ----------------------------------------------

  public native CreateSessionRequest New();

  public native CreateSessionRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CreateSessionRequest from);
  public native void MergeFrom(@Const @ByRef CreateSessionRequest from);
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

  // string target = 3;
  public native void clear_target();
  @MemberGetter public static native int kTargetFieldNumber();
  public static final int kTargetFieldNumber = kTargetFieldNumber();
  public native @StdString BytePointer target();
  public native void set_target(@StdString BytePointer value);
  public native void set_target(@StdString String value);
  public native void set_target(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_target(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_target();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_target();
  public native void set_allocated_target(@StdString @Cast({"char*", "std::string*"}) BytePointer target);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_target();
  public native void unsafe_arena_set_allocated_target(
        @StdString @Cast({"char*", "std::string*"}) BytePointer target);

  // .tensorflow.GraphDef graph_def = 1;
  public native @Cast("bool") boolean has_graph_def();
  public native void clear_graph_def();
  @MemberGetter public static native int kGraphDefFieldNumber();
  public static final int kGraphDefFieldNumber = kGraphDefFieldNumber();
  public native @Const @ByRef GraphDef graph_def();
  public native GraphDef release_graph_def();
  public native GraphDef mutable_graph_def();
  public native void set_allocated_graph_def(GraphDef graph_def);
  public native void unsafe_arena_set_allocated_graph_def(
        GraphDef graph_def);
  public native GraphDef unsafe_arena_release_graph_def();

  // .tensorflow.ConfigProto config = 2;
  public native @Cast("bool") boolean has_config();
  public native void clear_config();
  @MemberGetter public static native int kConfigFieldNumber();
  public static final int kConfigFieldNumber = kConfigFieldNumber();
  public native @Const @ByRef ConfigProto config();
  public native ConfigProto release_config();
  public native ConfigProto mutable_config();
  public native void set_allocated_config(ConfigProto config);
  public native void unsafe_arena_set_allocated_config(
        ConfigProto config);
  public native ConfigProto unsafe_arena_release_config();
}
