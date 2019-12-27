// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes gradients for the exponential linear (Elu) operation.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * gradients: The backpropagated gradients to the corresponding Elu operation.
 *  * outputs: The outputs of the corresponding Elu operation.
 * 
 *  Returns:
 *  * {@code Output}: The gradients: {@code gradients * (outputs + 1)} if outputs < 0,
 *  {@code gradients} otherwise. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EluGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EluGrad(Pointer p) { super(p); }

  public EluGrad(@Const @ByRef Scope scope, @ByVal Input gradients,
          @ByVal Input outputs) { super((Pointer)null); allocate(scope, gradients, outputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input gradients,
          @ByVal Input outputs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native EluGrad operation(Operation setter);
  public native @ByRef Output backprops(); public native EluGrad backprops(Output setter);
}
