// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the last element of the input list as well as a list with all but that element.
 * 
 *  Fails if the list is empty.
 * 
 *  input_handle: the input list
 *  tensor: the withdrawn last element of the list
 *  element_dtype: the type of elements in the list
 *  element_shape: the shape of the output tensor
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output} output_handle
 *  * {@code Output} tensor */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListPopBack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListPopBack(Pointer p) { super(p); }

  public TensorListPopBack(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype) { super((Pointer)null); allocate(scope, input_handle, element_shape, element_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @ByVal Input element_shape, @Cast("tensorflow::DataType") int element_dtype);

  public native @ByRef Operation operation(); public native TensorListPopBack operation(Operation setter);
  public native @ByRef Output output_handle(); public native TensorListPopBack output_handle(Output setter);
  public native @ByRef Output tensor(); public native TensorListPopBack tensor(Output setter);
}
