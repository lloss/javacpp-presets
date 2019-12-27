// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes cos of x element-wise.
 * 
 *    Given an input tensor, this function computes cosine of every
 *    element in the tensor. Input range is {@code (-inf, inf)} and
 *    output range is {@code [-1,1]}. If input lies outside the boundary, {@code nan}
 *    is returned.
 * 
 *    <pre>{@code python
 *    x = tf.constant([-float("inf"), -9, -0.5, 1, 1.2, 200, 10000, float("inf")])
 *    tf.math.cos(x) ==> [nan -0.91113025 0.87758255 0.5403023 0.36235774 0.48718765 -0.95215535 nan]
 *    }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Cos extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cos(Pointer p) { super(p); }

  public Cos(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Cos operation(Operation setter);
  public native @ByRef Output y(); public native Cos y(Output setter);
}
