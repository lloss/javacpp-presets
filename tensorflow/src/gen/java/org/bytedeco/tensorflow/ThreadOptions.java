// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \brief Options to configure a Thread.
 * 
 *  Note that the options are all hints, and the
 *  underlying implementation may choose to ignore it. */
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ThreadOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ThreadOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ThreadOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ThreadOptions position(long position) {
        return (ThreadOptions)super.position(position);
    }

  /** Thread stack size to use (in bytes). */
  public native @Cast("size_t") long stack_size(); public native ThreadOptions stack_size(long setter);  // 0: use system default value
  /** Guard area size to use near thread stacks to use (in bytes) */
  public native @Cast("size_t") long guard_size(); public native ThreadOptions guard_size(long setter);  // 0: use system default value
  public native int numa_node(); public native ThreadOptions numa_node(int setter);
}
