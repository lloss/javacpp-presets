// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup linalg_ops Linalg Ops
 *  \{
 <p>
 *  Computes the Cholesky decomposition of one or more square matrices.
 * 
 *  The input is a tensor of shape {@code [..., M, M]} whose inner-most 2 dimensions
 *  form square matrices.
 * 
 *  The input has to be symmetric and positive definite. Only the lower-triangular
 *  part of the input will be used for this operation. The upper-triangular part
 *  will not be read.
 * 
 *  The output is a tensor of the same shape as the input
 *  containing the Cholesky decompositions for all input submatrices {@code [..., :, :]}.
 * 
 *  **Note**: The gradient computation on GPU is faster for large matrices but
 *  not for large batch dimensions when the submatrices are small. In this
 *  case it might be faster to use the CPU.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Shape is {@code [..., M, M]}.
 * 
 *  Returns:
 *  * {@code Output}: Shape is {@code [..., M, M]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Cholesky extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cholesky(Pointer p) { super(p); }

  public Cholesky(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Cholesky operation(Operation setter);
  public native @ByRef Output output(); public native Cholesky output(Output setter);
}
