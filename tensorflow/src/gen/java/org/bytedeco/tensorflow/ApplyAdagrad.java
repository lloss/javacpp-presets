// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' according to the adagrad scheme.
 * 
 *  accum += grad * grad
 *  var -= lr * grad * (1 / sqrt(accum))
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * accum: Should be from a Variable().
 *  * lr: Scaling factor. Must be a scalar.
 *  * grad: The gradient.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If {@code True}, updating of the var and accum tensors will be protected
 *  by a lock; otherwise the behavior is undefined, but may exhibit less
 *  contention.
 * 
 *  Returns:
 *  * {@code Output}: Same as "var". */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApplyAdagrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApplyAdagrad(Pointer p) { super(p); }

  /** Optional attribute setters for ApplyAdagrad */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If {@code True}, updating of the var and accum tensors will be protected
     *  by a lock; otherwise the behavior is undefined, but may exhibit less
     *  contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    /** Defaults to true */
    public native @ByVal Attrs UpdateSlots(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
    public native @Cast("bool") boolean update_slots_(); public native Attrs update_slots_(boolean setter);
  }
  public ApplyAdagrad(@Const @ByRef Scope scope, @ByVal Input var,
               @ByVal Input accum, @ByVal Input lr,
               @ByVal Input grad) { super((Pointer)null); allocate(scope, var, accum, lr, grad); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
               @ByVal Input accum, @ByVal Input lr,
               @ByVal Input grad);
  public ApplyAdagrad(@Const @ByRef Scope scope, @ByVal Input var,
               @ByVal Input accum, @ByVal Input lr,
               @ByVal Input grad, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, accum, lr, grad, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
               @ByVal Input accum, @ByVal Input lr,
               @ByVal Input grad, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);
  public static native @ByVal Attrs UpdateSlots(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ApplyAdagrad operation(Operation setter);
  public native @ByRef Output out(); public native ApplyAdagrad out(Output setter);
}
