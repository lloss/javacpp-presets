// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the number of work units this Reader has finished processing.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * reader_handle: Handle to a Reader.
 * 
 *  Returns:
 *  * {@code Output}: The units_completed tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReaderNumWorkUnitsCompleted extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReaderNumWorkUnitsCompleted(Pointer p) { super(p); }

  public ReaderNumWorkUnitsCompleted(@Const @ByRef Scope scope,
                              @ByVal Input reader_handle) { super((Pointer)null); allocate(scope, reader_handle); }
  private native void allocate(@Const @ByRef Scope scope,
                              @ByVal Input reader_handle);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ReaderNumWorkUnitsCompleted operation(Operation setter);
  public native @ByRef Output units_completed(); public native ReaderNumWorkUnitsCompleted units_completed(Output setter);
}
