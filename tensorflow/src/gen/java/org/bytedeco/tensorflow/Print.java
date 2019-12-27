// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Prints a list of tensors.
 * 
 *  Passes {@code input} through to {@code output} and prints {@code data} when evaluating.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The tensor passed to {@code output}
 *  * data: A list of tensors to print out when op is evaluated.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * message: A string, prefix of the error message.
 *  * first_n: Only log {@code first_n} number of times. -1 disables logging.
 *  * summarize: Only print this many entries of each tensor.
 * 
 *  Returns:
 *  * {@code Output}: = The unmodified {@code input} tensor */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Print extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Print(Pointer p) { super(p); }

  /** Optional attribute setters for Print */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** A string, prefix of the error message.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Message(@StringPiece BytePointer x);
    public native @ByVal Attrs Message(@StringPiece String x);

    /** Only log {@code first_n} number of times. -1 disables logging.
     * 
     *  Defaults to -1 */
    
    ///
    public native @ByVal Attrs FirstN(@Cast("tensorflow::int64") long x);

    /** Only print this many entries of each tensor.
     * 
     *  Defaults to 3 */
    public native @ByVal Attrs Summarize(@Cast("tensorflow::int64") long x);

    public native @StringPiece BytePointer message_(); public native Attrs message_(BytePointer setter);
    public native @Cast("tensorflow::int64") long first_n_(); public native Attrs first_n_(long setter);
    public native @Cast("tensorflow::int64") long summarize_(); public native Attrs summarize_(long setter);
  }
  public Print(@Const @ByRef Scope scope, @ByVal Input input,
        @ByVal InputList data) { super((Pointer)null); allocate(scope, input, data); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
        @ByVal InputList data);
  public Print(@Const @ByRef Scope scope, @ByVal Input input,
        @ByVal InputList data, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, data, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
        @ByVal InputList data, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Message(@StringPiece BytePointer x);
  public static native @ByVal Attrs Message(@StringPiece String x);
  public static native @ByVal Attrs FirstN(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Summarize(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native Print operation(Operation setter);
  public native @ByRef Output output(); public native Print output(Output setter);
}
