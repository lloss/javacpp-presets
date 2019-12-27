// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Partitions {@code data} into {@code num_partitions} tensors using indices from {@code partitions}.
 * 
 *  For each index tuple {@code js} of size {@code partitions.ndim}, the slice {@code data[js, ...]}
 *  becomes part of {@code outputs[partitions[js]]}.  The slices with {@code partitions[js] = i}
 *  are placed in {@code outputs[i]} in lexicographic order of {@code js}, and the first
 *  dimension of {@code outputs[i]} is the number of entries in {@code partitions} equal to {@code i}.
 *  In detail,
 * 
 *  <pre>{@code python
 *      outputs[i].shape = [sum(partitions == i)] + data.shape[partitions.ndim:]
 * 
 *      outputs[i] = pack([data[js, ...] for js if partitions[js] == i])
 *  }</pre>
 * 
 *  {@code data.shape} must start with {@code partitions.shape}.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *      # Scalar partitions.
 *      partitions = 1
 *      num_partitions = 2
 *      data = [10, 20]
 *      outputs[0] = []  # Empty with shape [0, 2]
 *      outputs[1] = [[10, 20]]
 * 
 *      # Vector partitions.
 *      partitions = [0, 0, 1, 1, 0]
 *      num_partitions = 2
 *      data = [10, 20, 30, 40, 50]
 *      outputs[0] = [10, 20, 50]
 *      outputs[1] = [30, 40]
 *  }</pre>
 * 
 *  See {@code dynamic_stitch} for an example on how to merge partitions back.
 * 
 *  <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 *  <img style="width:100%" src="https://www.tensorflow.org/images/DynamicPartition.png" alt>
 *  </div>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * partitions: Any shape.  Indices in the range {@code [0, num_partitions)}.
 *  * num_partitions: The number of partitions to output.
 * 
 *  Returns:
 *  * {@code OutputList}: The outputs tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DynamicPartition extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DynamicPartition(Pointer p) { super(p); }

  public DynamicPartition(@Const @ByRef Scope scope, @ByVal Input data,
                   @ByVal Input partitions, @Cast("tensorflow::int64") long num_partitions) { super((Pointer)null); allocate(scope, data, partitions, num_partitions); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
                   @ByVal Input partitions, @Cast("tensorflow::int64") long num_partitions);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public native @ByRef Operation operation(); public native DynamicPartition operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector outputs(); public native DynamicPartition outputs(OutputVector setter);
}
