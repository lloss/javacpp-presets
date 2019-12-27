// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns 0 if x == 0, and x / y otherwise, elementwise.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Xdivy extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Xdivy(Pointer p) { super(p); }

  public Xdivy(@Const @ByRef Scope scope, @ByVal Input x,
        @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
        @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Xdivy operation(Operation setter);
  public native @ByRef Output z(); public native Xdivy z(Output setter);
}
