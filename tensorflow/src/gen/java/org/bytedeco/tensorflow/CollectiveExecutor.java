// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A step-specific object that can execute a collective operation completely
// described by a CollectiveParams object.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveExecutor extends PeerAccessInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveExecutor(Pointer p) { super(p); }

  public native void StartAbort(@Const @ByRef Status s);

  public native void ExecuteAsync(OpKernelContext ctx,
                              @Const @ByRef CollectiveParams col_params,
                              @StdString BytePointer exec_key, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);
  public native void ExecuteAsync(OpKernelContext ctx,
                              @Const @ByRef CollectiveParams col_params,
                              @StdString String exec_key, @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native void CompleteParamsAsync(@StdString BytePointer device, CollectiveParams cp,
                                     CancellationManager cancel_mgr,
                                     @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);
  public native void CompleteParamsAsync(@StdString String device, CollectiveParams cp,
                                     CancellationManager cancel_mgr,
                                     @ByVal @Cast("tensorflow::StatusCallback*") Pointer done);

  public native PerStepCollectiveRemoteAccess remote_access();

  // `WaitForDependencies` and `Launched` are used for fine-grained control of
  // execution order between collective instances.  These functions are intended
  // to be called in `Run` function of collective implementations, and may be
  // used to make part, or whole, of the collective execution ordered with
  // respect to other collective instances.
  //
  // `WaitForDependencies` will block until it is safe to continue the callee's
  // execution, where safety is defined as: ordered with respect to the
  // collective instances defined in the callee's `wait_for` attribute.
  public native void WaitForDependencies(@Const @ByRef CollectiveParams col_params);
  // `Launched` unblocks the dependent collective instances by recording that
  // this callee device has completed the critical portion of the collective
  // execution.
  public native void Launched(@Const @ByRef CollectiveParams col_params);

  // Used to designate an invalid group or instance key.
  public static native @Cast("tensorflow::int64") long kInvalidId(); public static native void kInvalidId(long setter);

  // Lexically scoped handle for Ref.
  @NoOffset public static class Handle extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Handle(Pointer p) { super(p); }
  
    public Handle(CollectiveExecutor ce, @Cast("bool") boolean inherit_ref) { super((Pointer)null); allocate(ce, inherit_ref); }
    private native void allocate(CollectiveExecutor ce, @Cast("bool") boolean inherit_ref);
    public native CollectiveExecutor get();
  }
}
