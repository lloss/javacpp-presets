// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** DepthToSpace for tensors of type T.
 * 
 *  Rearranges data from depth into blocks of spatial data.
 *  This is the reverse transformation of SpaceToDepth. More specifically,
 *  this op outputs a copy of the input tensor where values from the {@code depth}
 *  dimension are moved in spatial blocks to the {@code height} and {@code width} dimensions.
 *  The attr {@code block_size} indicates the input block size and how the data is moved.
 * 
 *    * Chunks of data of size {@code block_size * block_size} from depth are rearranged
 *      into non-overlapping blocks of size {@code block_size x block_size}
 *    * The width the output tensor is {@code input_depth * block_size}, whereas the
 *      height is {@code input_height * block_size}.
 *    * The Y, X coordinates within each block of the output image are determined
 *      by the high order component of the input channel index.
 *    * The depth of the input tensor must be divisible by
 *      {@code block_size * block_size}.
 * 
 *  The {@code data_format} attr specifies the layout of the input and output tensors
 *  with the following options:
 *    "NHWC": {@code [ batch, height, width, channels ]}
 *    "NCHW": {@code [ batch, channels, height, width ]}
 *    "NCHW_VECT_C":
 *        {@code qint8 [ batch, channels / 4, height, width, 4 ]}
 * 
 *  It is useful to consider the operation as transforming a 6-D Tensor.
 *  e.g. for data_format = NHWC,
 *       Each element in the input tensor can be specified via 6 coordinates,
 *       ordered by decreasing memory layout significance as:
 *       n,iY,iX,bY,bX,oC  (where n=batch index, iX, iY means X or Y coordinates
 *                          within the input image, bX, bY means coordinates
 *                          within the output block, oC means output channels).
 *       The output would be the input transposed to the following layout:
 *       n,iY,bY,iX,bX,oC
 * 
 *  This operation is useful for resizing the activations between convolutions
 *  (but keeping all data), e.g. instead of pooling. It is also useful for training
 *  purely convolutional models.
 * 
 *  For example, given an input of shape {@code [1, 1, 1, 4]}, data_format = "NHWC" and
 *  block_size = 2:
 * 
 *  <pre>{@code
 *  x = [[[[1, 2, 3, 4]]]]
 * 
 *  }</pre>
 * 
 *  This operation will output a tensor of shape {@code [1, 2, 2, 1]}:
 * 
 *  <pre>{@code
 *     [[[[1], [2]],
 *       [[3], [4]]]]
 *  }</pre>
 * 
 *  Here, the input has a batch of 1 and each batch element has shape {@code [1, 1, 4]},
 *  the corresponding output will have 2x2 elements and will have a depth of
 *  1 channel (1 = {@code 4 / (block_size * block_size)}).
 *  The output element shape is {@code [2, 2, 1]}.
 * 
 *  For an input tensor with larger depth, here of shape {@code [1, 1, 1, 12]}, e.g.
 * 
 *  <pre>{@code
 *  x = [[[[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]]]]
 *  }</pre>
 * 
 *  This operation, for block size of 2, will return the following tensor of shape
 *  {@code [1, 2, 2, 3]}
 * 
 *  <pre>{@code
 *     [[[[1, 2, 3], [4, 5, 6]],
 *       [[7, 8, 9], [10, 11, 12]]]]
 * 
 *  }</pre>
 * 
 *  Similarly, for the following input of shape {@code [1 2 2 4]}, and a block size of 2:
 * 
 *  <pre>{@code
 *  x =  [[[[1, 2, 3, 4],
 *         [5, 6, 7, 8]],
 *        [[9, 10, 11, 12],
 *         [13, 14, 15, 16]]]]
 *  }</pre>
 * 
 *  the operator will return the following tensor of shape {@code [1 4 4 1]}:
 * 
 *  <pre>{@code
 *  x = [[[ [1],   [2],  [5],  [6]],
 *        [ [3],   [4],  [7],  [8]],
 *        [ [9],  [10], [13],  [14]],
 *        [ [11], [12], [15],  [16]]]]
 * 
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * block_size: The size of the spatial block, same as in Space2Depth.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DepthToSpace extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DepthToSpace(Pointer p) { super(p); }

  /** Optional attribute setters for DepthToSpace */
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
  
    /** Defaults to "NHWC" */
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
  }
  public DepthToSpace(@Const @ByRef Scope scope, @ByVal Input input, @Cast("tensorflow::int64") long block_size) { super((Pointer)null); allocate(scope, input, block_size); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Cast("tensorflow::int64") long block_size);
  public DepthToSpace(@Const @ByRef Scope scope, @ByVal Input input, @Cast("tensorflow::int64") long block_size, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, block_size, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Cast("tensorflow::int64") long block_size, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native DepthToSpace operation(Operation setter);
  public native @ByRef Output output(); public native DepthToSpace output(Output setter);
}