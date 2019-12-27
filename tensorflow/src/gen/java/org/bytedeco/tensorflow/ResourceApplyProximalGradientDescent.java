// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' as FOBOS algorithm with fixed learning rate.
 * 
 *  prox_v = var - alpha * delta
 *  var = sign(prox_v)/(1+alpha*l2) * max{|prox_v|-alpha*l1,0}
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * alpha: Scaling factor. Must be a scalar.
 *  * l1: L1 regularization. Must be a scalar.
 *  * l2: L2 regularization. Must be a scalar.
 *  * delta: The change.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If True, the subtraction will be protected by a lock;
 *  otherwise the behavior is undefined, but may exhibit less contention.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResourceApplyProximalGradientDescent extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResourceApplyProximalGradientDescent(Pointer p) { super(p); }

  /** Optional attribute setters for ResourceApplyProximalGradientDescent */
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
  
    /** If True, the subtraction will be protected by a lock;
     *  otherwise the behavior is undefined, but may exhibit less contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ResourceApplyProximalGradientDescent(@Const @ByRef Scope scope,
                                       @ByVal Input var,
                                       @ByVal Input alpha,
                                       @ByVal Input l1,
                                       @ByVal Input l2,
                                       @ByVal Input delta) { super((Pointer)null); allocate(scope, var, alpha, l1, l2, delta); }
  private native void allocate(@Const @ByRef Scope scope,
                                       @ByVal Input var,
                                       @ByVal Input alpha,
                                       @ByVal Input l1,
                                       @ByVal Input l2,
                                       @ByVal Input delta);
  public ResourceApplyProximalGradientDescent(@Const @ByRef Scope scope,
                                       @ByVal Input var,
                                       @ByVal Input alpha,
                                       @ByVal Input l1,
                                       @ByVal Input l2,
                                       @ByVal Input delta, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, alpha, l1, l2, delta, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                       @ByVal Input var,
                                       @ByVal Input alpha,
                                       @ByVal Input l1,
                                       @ByVal Input l2,
                                       @ByVal Input delta, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResourceApplyProximalGradientDescent operation(Operation setter);
}
