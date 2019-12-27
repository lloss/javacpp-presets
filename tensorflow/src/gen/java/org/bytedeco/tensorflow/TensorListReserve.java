// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** List of the given size with empty elements.
 * 
 *  element_shape: the shape of the future elements of the list
 *  num_elements: the number of elements to reserve
 *  handle: the output list
 *  element_dtype: the desired type of elements in the list.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The handle tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListReserve extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListReserve(Pointer p) { super(p); }

  public TensorListReserve(@Const @ByRef Scope scope, @ByVal Input element_shape, @ByVal Input num_elements, @Cast("tensorflow::DataType") int element_dtype) { super((Pointer)null); allocate(scope, element_shape, num_elements, element_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input element_shape, @ByVal Input num_elements, @Cast("tensorflow::DataType") int element_dtype);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListReserve operation(Operation setter);
  public native @ByRef Output handle(); public native TensorListReserve handle(Output setter);
}
