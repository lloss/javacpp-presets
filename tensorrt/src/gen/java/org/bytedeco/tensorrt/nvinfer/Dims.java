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
 *  \class Dims
 *  \brief Structure to define the dimensions of a tensor.
 * 
 *  \note: Currently the following formats are supported for layer inputs and outputs:
 *  * zero or more index dimensions followed by one channel and two spatial dimensions (e.g. CHW)
 *  * one time series dimension followed by one index dimension followed by one channel dimension (i.e. TNC)
 * 
 *  TensorRT can also return an invalid dims structure. This structure is represented by nbDims == -1
 *  and d[i] == 0 for all d.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Dims extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Dims() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dims(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dims(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Dims position(long position) {
        return (Dims)super.position(position);
    }

    /** The maximum number of dimensions supported for a tensor. */
    @MemberGetter public static native int MAX_DIMS();
    public static final int MAX_DIMS = MAX_DIMS();
    /** The number of dimensions. */
    public native int nbDims(); public native Dims nbDims(int setter);
    /** The extent of each dimension. */
    public native int d(int i); public native Dims d(int i, int setter);
    @MemberGetter public native IntPointer d();
    /** The type of each dimension. */
    public native @Deprecated DimensionType type(int i); public native Dims type(int i, DimensionType setter);
    @MemberGetter public native @Deprecated @Cast("nvinfer1::DimensionType*") IntPointer type();
}
