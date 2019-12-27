// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
  // namespace Eigen

@Namespace("tensorflow::thread") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EigenEnvironment extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public EigenEnvironment() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EigenEnvironment(Pointer p) { super(p); }
}
