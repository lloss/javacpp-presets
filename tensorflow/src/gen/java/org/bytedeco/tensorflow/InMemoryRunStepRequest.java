// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Specialized (and mutable) wrapper for RunStep requests between a client and
// master in the same address space.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InMemoryRunStepRequest extends MutableRunStepRequestWrapper {
    static { Loader.load(); }
    /** Default native constructor. */
    public InMemoryRunStepRequest() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InMemoryRunStepRequest(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InMemoryRunStepRequest(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public InMemoryRunStepRequest position(long position) {
        return (InMemoryRunStepRequest)super.position(position);
    }

  // RunStepRequestWrapper methods.
  public native @StdString BytePointer session_handle();
  public native @StdString BytePointer partial_run_handle();
  public native @Cast("size_t") long num_feeds();
  public native @StdString BytePointer feed_name(@Cast("size_t") long i);
  public native @ByVal Status FeedValue(@Cast("size_t") long i, Tensor out_tensor);
  public native @ByVal Status FeedValue(@Cast("size_t") long i, TensorProto out_tensor);
  public native @Cast("size_t") long num_fetches();
  public native @StdString BytePointer fetch_name(@Cast("size_t") long i);
  public native @Cast("size_t") long num_targets();
  public native @StdString BytePointer target_name(@Cast("size_t") long i);
  public native @Const @ByRef RunOptions options();
  public native @StdString BytePointer DebugString();
  public native @Const @ByRef RunStepRequest ToProto();
  public native @Cast("bool") boolean store_errors_in_response_body();
  public native @Cast("tensorflow::int64") long request_id();

  // MutableRunStepRequestWrapper methods.
  public native void set_session_handle(@StdString BytePointer handle);
  public native void set_session_handle(@StdString String handle);
  public native void set_partial_run_handle(@StdString BytePointer handle);
  public native void set_partial_run_handle(@StdString String handle);
  public native void add_feed(@StdString BytePointer name, @Const @ByRef Tensor value);
  public native void add_feed(@StdString String name, @Const @ByRef Tensor value);
  public native void add_fetch(@StdString BytePointer name);
  public native void add_fetch(@StdString String name);
  public native void add_target(@StdString BytePointer name);
  public native void add_target(@StdString String name);
  public native RunOptions mutable_options();
  public native void set_store_errors_in_response_body(@Cast("bool") boolean store_errors);
}
