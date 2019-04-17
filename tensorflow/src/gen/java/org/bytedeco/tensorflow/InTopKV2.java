// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Says whether the targets are in the top {@code K} predictions.
 * 
 *  This outputs a {@code batch_size} bool array, an entry {@code out[i]} is {@code true} if the
 *  prediction for the target class is among the top {@code k} predictions among
 *  all predictions for example {@code i}. Note that the behavior of {@code InTopK} differs
 *  from the {@code TopK} op in its handling of ties; if multiple classes have the
 *  same prediction value and straddle the top-{@code k} boundary, all of those
 *  classes are considered to be in the top {@code k}.
 * 
 *  More formally, let
 * 
 *    \(predictions_i\) be the predictions for all classes for example {@code i},
 *    \(targets_i\) be the target class for example {@code i},
 *    \(out_i\) be the output for example {@code i},
 * 
 *  $$out_i = predictions_{i, targets_i} \in TopKIncludingTies(predictions_i)$$
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * predictions: A {@code batch_size} x {@code classes} tensor.
 *  * targets: A {@code batch_size} vector of class ids.
 *  * k: Number of top elements to look at for computing precision.
 * 
 *  Returns:
 *  * {@code Output}: Computed precision at {@code k} as a {@code bool Tensor}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InTopKV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InTopKV2(Pointer p) { super(p); }

  public InTopKV2(@Const @ByRef Scope scope, @ByVal Input predictions,
           @ByVal Input targets, @ByVal Input k) { super((Pointer)null); allocate(scope, predictions, targets, k); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input predictions,
           @ByVal Input targets, @ByVal Input k);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native InTopKV2 operation(Operation setter);
  public native @ByRef Output precision(); public native InTopKV2 precision(Output setter);
}