// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Compute gradients for a FakeQuantWithMinMaxVars operation.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * gradients: Backpropagated gradients above the FakeQuantWithMinMaxVars operation.
 *  * inputs: Values passed as inputs to the FakeQuantWithMinMaxVars operation.
 *  min, max: Quantization interval, scalar floats.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * num_bits: The bitwidth of the quantization; between 2 and 8, inclusive.
 *  * narrow_range: Whether to quantize into 2^num_bits - 1 distinct values.
 * 
 *  Returns:
 *  * {@code Output} backprops_wrt_input: Backpropagated gradients w.r.t. inputs:
 *  {@code gradients * (inputs >= min && inputs <= max)}.
 *  * {@code Output} backprop_wrt_min: Backpropagated gradients w.r.t. min parameter:
 *  {@code sum(gradients * (inputs < min))}.
 *  * {@code Output} backprop_wrt_max: Backpropagated gradients w.r.t. max parameter:
 *  {@code sum(gradients * (inputs > max))}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FakeQuantWithMinMaxVarsGradient extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FakeQuantWithMinMaxVarsGradient(Pointer p) { super(p); }

  /** Optional attribute setters for FakeQuantWithMinMaxVarsGradient */
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
  
    /** The bitwidth of the quantization; between 2 and 8, inclusive.
     * 
     *  Defaults to 8 */
    
    ///
    public native @ByVal Attrs NumBits(@Cast("tensorflow::int64") long x);

    /** Whether to quantize into 2^num_bits - 1 distinct values.
     * 
     *  Defaults to false */
    public native @ByVal Attrs NarrowRange(@Cast("bool") boolean x);

    public native @Cast("tensorflow::int64") long num_bits_(); public native Attrs num_bits_(long setter);
    public native @Cast("bool") boolean narrow_range_(); public native Attrs narrow_range_(boolean setter);
  }
  public FakeQuantWithMinMaxVarsGradient(@Const @ByRef Scope scope,
                                  @ByVal Input gradients,
                                  @ByVal Input inputs, @ByVal Input min, @ByVal Input max) { super((Pointer)null); allocate(scope, gradients, inputs, min, max); }
  private native void allocate(@Const @ByRef Scope scope,
                                  @ByVal Input gradients,
                                  @ByVal Input inputs, @ByVal Input min, @ByVal Input max);
  public FakeQuantWithMinMaxVarsGradient(@Const @ByRef Scope scope,
                                  @ByVal Input gradients,
                                  @ByVal Input inputs, @ByVal Input min, @ByVal Input max, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, gradients, inputs, min, max, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                  @ByVal Input gradients,
                                  @ByVal Input inputs, @ByVal Input min, @ByVal Input max, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs NumBits(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs NarrowRange(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native FakeQuantWithMinMaxVarsGradient operation(Operation setter);
  public native @ByRef Output backprops_wrt_input(); public native FakeQuantWithMinMaxVarsGradient backprops_wrt_input(Output setter);
  public native @ByRef Output backprop_wrt_min(); public native FakeQuantWithMinMaxVarsGradient backprop_wrt_min(Output setter);
  public native @ByRef Output backprop_wrt_max(); public native FakeQuantWithMinMaxVarsGradient backprop_wrt_max(Output setter);
}
