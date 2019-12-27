// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;
     // "SYCL"

@Name("tensorflow::DeviceName<Eigen::ThreadPoolDevice>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceName extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DeviceName() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeviceName(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceName(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DeviceName position(long position) {
        return (DeviceName)super.position(position);
    }

  @MemberGetter public static native @StdString BytePointer value();
}
