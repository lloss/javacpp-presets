// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Scatter the data from the input value into specific TensorArray elements.
 * 
 *  {@code indices} must be a vector, its length must match the first dim of {@code value}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a TensorArray.
 *  * indices: The locations at which to write the tensor elements.
 *  * value: The concatenated tensor to write to the TensorArray.
 *  * flow_in: A float scalar that enforces proper chaining of operations.
 * 
 *  Returns:
 *  * {@code Output}: A float scalar that enforces proper chaining of operations. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorArrayScatter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorArrayScatter(Pointer p) { super(p); }

  public TensorArrayScatter(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input indices, @ByVal Input value, @ByVal Input flow_in) { super((Pointer)null); allocate(scope, handle, indices, value, flow_in); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle, @ByVal Input indices, @ByVal Input value, @ByVal Input flow_in);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TensorArrayScatter operation(Operation setter);
  public native @ByRef Output flow_out(); public native TensorArrayScatter flow_out(Output setter);
}
