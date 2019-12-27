// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Gather specific elements from the TensorArray into output {@code value}.
 * 
 *  All elements selected by {@code indices} must have the same shape.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a TensorArray.
 *  * indices: The locations in the TensorArray from which to read tensor elements.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 *  * dtype: The type of the elem that is returned.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * element_shape: The expected shape of an element, if known. Used to
 *  validate the shapes of TensorArray elements. If this shape is not
 *  fully specified, gathering zero-size TensorArrays is an error.
 * 
 *  Returns:
 *  * {@code Output}: All of the elements in the TensorArray, concatenated along a new
 *  axis (the new dimension 0). */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayGather extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayGather(Pointer p) { super(p); }

  /** Optional attribute setters for TensorArrayGather */
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
  
    /** The expected shape of an element, if known. Used to
     *  validate the shapes of TensorArray elements. If this shape is not
     *  fully specified, gathering zero-size TensorArrays is an error.
     * 
     *  Defaults to <unknown> */
    public native @ByVal Attrs ElementShape(@ByVal PartialTensorShape x);

    public native @ByRef PartialTensorShape element_shape_(); public native Attrs element_shape_(PartialTensorShape setter);
  }
  public TensorArrayGather(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input indices, @ByVal Input flow_in,
                    @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, handle, indices, flow_in, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input indices, @ByVal Input flow_in,
                    @Cast("tensorflow::DataType") int dtype);
  public TensorArrayGather(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input indices, @ByVal Input flow_in,
                    @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, handle, indices, flow_in, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                    @ByVal Input indices, @ByVal Input flow_in,
                    @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs ElementShape(@ByVal PartialTensorShape x);

  public native @ByRef Operation operation(); public native TensorArrayGather operation(Operation setter);
  public native @ByRef Output value(); public native TensorArrayGather value(Output setter);
}
