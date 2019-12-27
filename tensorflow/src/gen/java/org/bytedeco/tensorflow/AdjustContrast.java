// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup image_ops Image Ops
 *  \{
 <p>
 *  Adjust the contrast of one or more images.
 * 
 *  {@code images} is a tensor of at least 3 dimensions.  The last 3 dimensions are
 *  interpreted as {@code [height, width, channels]}.  The other dimensions only
 *  represent a collection of images, such as {@code [batch, height, width, channels].}
 * 
 *  Contrast is adjusted independently for each channel of each image.
 * 
 *  For each channel, the Op first computes the mean of the image pixels in the
 *  channel and then adjusts each component of each pixel to
 *  {@code (x - mean) * contrast_factor + mean}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: Images to adjust.  At least 3-D.
 *  * contrast_factor: A float multiplier for adjusting contrast.
 * 
 *  Returns:
 *  * {@code Output}: The contrast-adjusted image or images. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AdjustContrast extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdjustContrast(Pointer p) { super(p); }

  public AdjustContrast(@Const @ByRef Scope scope, @ByVal Input images,
                 @ByVal Input contrast_factor) { super((Pointer)null); allocate(scope, images, contrast_factor); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images,
                 @ByVal Input contrast_factor);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native AdjustContrast operation(Operation setter);
  public native @ByRef Output output(); public native AdjustContrast output(Output setter);
}
