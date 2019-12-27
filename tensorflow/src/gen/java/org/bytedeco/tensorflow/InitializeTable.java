// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Table initializer that takes two tensors for keys and values respectively.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * table_handle: Handle to a table which will be initialized.
 *  * keys: Keys of type Tkey.
 *  * values: Values of type Tval.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InitializeTable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InitializeTable(Pointer p) { super(p); }

  public InitializeTable(@Const @ByRef Scope scope, @ByVal Input table_handle, @ByVal Input keys, @ByVal Input values) { super((Pointer)null); allocate(scope, table_handle, keys, values); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input table_handle, @ByVal Input keys, @ByVal Input values);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native InitializeTable operation(Operation setter);
}
