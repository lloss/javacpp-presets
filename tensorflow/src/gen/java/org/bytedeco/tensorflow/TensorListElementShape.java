// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** The shape of the elements of the given list, as a tensor.
 * 
 *    input_handle: the list
 *    element_shape: the shape of elements of the list
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The element_shape tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorListElementShape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorListElementShape(Pointer p) { super(p); }

  public TensorListElementShape(@Const @ByRef Scope scope, @ByVal Input input_handle, @Cast("tensorflow::DataType") int shape_type) { super((Pointer)null); allocate(scope, input_handle, shape_type); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_handle, @Cast("tensorflow::DataType") int shape_type);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorListElementShape operation(Operation setter);
  public native @ByRef Output element_shape(); public native TensorListElementShape element_shape(Output setter);
}
