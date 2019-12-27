// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;

/**
 *  \file NvInferRuntimeCommon.h
 * 
 *  This is the top-level API file for TensorRT core runtime library.
 *  */

// forward declare some CUDA types to avoid an include dependency

@Opaque @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class cublasContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cublasContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cublasContext(Pointer p) { super(p); }
}
