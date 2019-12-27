// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Forwards the input to the output.
 * 
 *  This operator represents the loop termination condition used by the
 *  "pivot" switches of a loop.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A boolean scalar, representing the branch predicate of the Switch op.
 * 
 *  Returns:
 *  * {@code Output}: The same tensor as {@code input}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class LoopCond extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LoopCond(Pointer p) { super(p); }

  public LoopCond(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native LoopCond operation(Operation setter);
  public native @ByRef Output output(); public native LoopCond output(Output setter);
}
