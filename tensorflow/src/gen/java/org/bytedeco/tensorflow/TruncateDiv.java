// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns x / y element-wise for integer types.
 * 
 *  Truncation designates that negative numbers will round fractional quantities
 *  toward zero. I.e. -7 / 5 = -1. This matches C semantics but it is different
 *  than Python semantics. See {@code FloorDiv} for a division function that matches
 *  Python Semantics.
 * 
 *  *NOTE*: {@code TruncateDiv} supports broadcasting. More about broadcasting
 *  [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The z tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TruncateDiv extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TruncateDiv(Pointer p) { super(p); }

  public TruncateDiv(@Const @ByRef Scope scope, @ByVal Input x,
              @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
              @ByVal Input y);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native TruncateDiv operation(Operation setter);
  public native @ByRef Output z(); public native TruncateDiv z(Output setter);
}
