// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the gradient of {@code StridedSlice}.
 * 
 *  Since {@code StridedSlice} cuts out pieces of its {@code input} which is size
 *  {@code shape}, its gradient will have the same shape (which is passed here
 *  as {@code shape}). The gradient will be zero in any element that the slice
 *  does not select.
 * 
 *  Arguments are the same as StridedSliceGrad with the exception that
 *  {@code dy} is the input gradient to be propagated and {@code shape} is the
 *  shape of {@code StridedSlice}'s {@code input}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StridedSliceGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StridedSliceGrad(Pointer p) { super(p); }

  /** Optional attribute setters for StridedSliceGrad */
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
  
    /** Defaults to 0 */
    public native @ByVal Attrs BeginMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs EndMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs EllipsisMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs NewAxisMask(@Cast("tensorflow::int64") long x);

    /** Defaults to 0 */
    public native @ByVal Attrs ShrinkAxisMask(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long begin_mask_(); public native Attrs begin_mask_(long setter);
    public native @Cast("tensorflow::int64") long end_mask_(); public native Attrs end_mask_(long setter);
    public native @Cast("tensorflow::int64") long ellipsis_mask_(); public native Attrs ellipsis_mask_(long setter);
    public native @Cast("tensorflow::int64") long new_axis_mask_(); public native Attrs new_axis_mask_(long setter);
    public native @Cast("tensorflow::int64") long shrink_axis_mask_(); public native Attrs shrink_axis_mask_(long setter);
  }
  public StridedSliceGrad(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input begin, @ByVal Input end,
                   @ByVal Input strides, @ByVal Input dy) { super((Pointer)null); allocate(scope, shape, begin, end, strides, dy); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input begin, @ByVal Input end,
                   @ByVal Input strides, @ByVal Input dy);
  public StridedSliceGrad(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input begin, @ByVal Input end,
                   @ByVal Input strides, @ByVal Input dy, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, begin, end, strides, dy, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
                   @ByVal Input begin, @ByVal Input end,
                   @ByVal Input strides, @ByVal Input dy, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs BeginMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs EndMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs EllipsisMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs NewAxisMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs ShrinkAxisMask(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native StridedSliceGrad operation(Operation setter);
  public native @ByRef Output output(); public native StridedSliceGrad output(Output setter);
}
