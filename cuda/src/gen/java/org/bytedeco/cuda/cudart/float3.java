// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


// #endif /* !__CUDACC__ && __arm__ && __ARM_PCS_VFP &&
//           __GNUC__ == 4&& __GNUC_MINOR__ == 6 */

@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class float3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public float3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public float3 position(long position) {
        return (float3)super.position(position);
    }

    public native float x(); public native float3 x(float setter);
    public native float y(); public native float3 y(float setter);
    public native float z(); public native float3 z(float setter);
}