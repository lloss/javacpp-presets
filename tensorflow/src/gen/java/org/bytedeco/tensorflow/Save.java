// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Saves the input tensors to disk.
 * 
 *  The size of {@code tensor_names} must match the number of tensors in {@code data}. {@code data[i]}
 *  is written to {@code filename} with name {@code tensor_names[i]}.
 * 
 *  See also {@code SaveSlices}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * filename: Must have a single element. The name of the file to which we write
 *  the tensor.
 *  * tensor_names: Shape {@code [N]}. The names of the tensors to be saved.
 *  * data: {@code N} tensors to save.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Save extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Save(Pointer p) { super(p); }

  public Save(@Const @ByRef Scope scope, @ByVal Input filename,
       @ByVal Input tensor_names, @ByVal InputList data) { super((Pointer)null); allocate(scope, filename, tensor_names, data); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input filename,
       @ByVal Input tensor_names, @ByVal InputList data);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native Save operation(Operation setter);
}
