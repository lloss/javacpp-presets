// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Component-wise divides a SparseTensor by a dense Tensor.
 * 
 *  *Limitation*: this Op only broadcasts the dense side to the sparse side, but not
 *  the other direction.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * sp_indices: 2-D.  {@code N x R} matrix with the indices of non-empty values in a
 *  SparseTensor, possibly not in canonical ordering.
 *  * sp_values: 1-D.  {@code N} non-empty values corresponding to {@code sp_indices}.
 *  * sp_shape: 1-D.  Shape of the input SparseTensor.
 *  * dense: {@code R}-D.  The dense Tensor operand.
 * 
 *  Returns:
 *  * {@code Output}: 1-D.  The {@code N} values that are operated on. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseDenseCwiseDiv extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseDenseCwiseDiv(Pointer p) { super(p); }

  public SparseDenseCwiseDiv(@Const @ByRef Scope scope, @ByVal Input sp_indices, @ByVal Input sp_values,
                      @ByVal Input sp_shape, @ByVal Input dense) { super((Pointer)null); allocate(scope, sp_indices, sp_values, sp_shape, dense); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sp_indices, @ByVal Input sp_values,
                      @ByVal Input sp_shape, @ByVal Input dense);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseDenseCwiseDiv operation(Operation setter);
  public native @ByRef Output output(); public native SparseDenseCwiseDiv output(Output setter);
}
