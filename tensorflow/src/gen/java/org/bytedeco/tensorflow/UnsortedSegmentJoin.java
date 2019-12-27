// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Joins the elements of {@code inputs} based on {@code segment_ids}.
 * 
 *  Computes the string join along segments of a tensor.
 *  Given {@code segment_ids} with rank {@code N} and {@code data} with rank {@code N+M}:
 * 
 *      {@code output[i, k1...kM] = strings.join([data[j1...jN, k1...kM])}
 * 
 *  where the join is over all [j1...jN] such that segment_ids[j1...jN] = i.
 *  Strings are joined in row-major order.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *  inputs = [['Y', 'q', 'c'], ['Y', '6', '6'], ['p', 'G', 'a']]
 *  output_array = string_ops.unsorted_segment_join(inputs=inputs,
 *                                                  segment_ids=[1, 0, 1],
 *                                                  num_segments=2,
 *                                                  separator=':'))
 *  # output_array ==> [['Y', '6', '6'], ['Y:p', 'q:G', 'c:a']]
 * 
 * 
 *  inputs = ['this', 'is', 'a', 'test']
 *  output_array = string_ops.unsorted_segment_join(inputs=inputs,
 *                                                  segment_ids=[0, 0, 0, 0],
 *                                                  num_segments=1,
 *                                                  separator=':'))
 *  # output_array ==> ['this:is:a:test']
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: The input to be joined.
 *  * segment_ids: A tensor whose shape is a prefix of data.shape.  Negative segment ids are not
 *  supported.
 *  * num_segments: A scalar.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * separator: The separator to use when joining.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UnsortedSegmentJoin extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnsortedSegmentJoin(Pointer p) { super(p); }

  /** Optional attribute setters for UnsortedSegmentJoin */
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
  
    /** The separator to use when joining.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs Separator(@StringPiece BytePointer x);
    public native @ByVal Attrs Separator(@StringPiece String x);

    public native @StringPiece BytePointer separator_(); public native Attrs separator_(BytePointer setter);
  }
  public UnsortedSegmentJoin(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input segment_ids,
                      @ByVal Input num_segments) { super((Pointer)null); allocate(scope, inputs, segment_ids, num_segments); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input segment_ids,
                      @ByVal Input num_segments);
  public UnsortedSegmentJoin(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input segment_ids,
                      @ByVal Input num_segments, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, inputs, segment_ids, num_segments, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input segment_ids,
                      @ByVal Input num_segments, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Separator(@StringPiece BytePointer x);
  public static native @ByVal Attrs Separator(@StringPiece String x);

  public native @ByRef Operation operation(); public native UnsortedSegmentJoin operation(Operation setter);
  public native @ByRef Output output(); public native UnsortedSegmentJoin output(Output setter);
}
