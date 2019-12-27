// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ClusterFunctionLibraryRuntime extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ClusterFunctionLibraryRuntime() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClusterFunctionLibraryRuntime(Pointer p) { super(p); }
}
