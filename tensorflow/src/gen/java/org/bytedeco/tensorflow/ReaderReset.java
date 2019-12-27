// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Restore a Reader to its initial clean state.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * reader_handle: Handle to a Reader.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReaderReset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReaderReset(Pointer p) { super(p); }

  public ReaderReset(@Const @ByRef Scope scope, @ByVal Input reader_handle) { super((Pointer)null); allocate(scope, reader_handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input reader_handle);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native ReaderReset operation(Operation setter);
}
