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
 *  \class ILogger
 * 
 *  \brief Application-implemented logging interface for the builder, engine and runtime.
 * 
 *  Note that although a logger is passed on creation to each instance of a IBuilder or safe::IRuntime interface, the logger is internally considered a singleton, and thus
 *  multiple instances of safe::IRuntime and/or IBuilder must all use the same logger.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ILogger extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ILogger(Pointer p) { super(p); }

    /**
     *  \enum Severity
     * 
     *  The severity corresponding to a log message.
     *  */
    public enum Severity {
        /** An internal error has occurred. Execution is unrecoverable. */
        kINTERNAL_ERROR(0),
        /** An application error has occurred. */
        kERROR(1),
        /** An application error has been discovered, but TensorRT has recovered or fallen back to a default. */
        kWARNING(2),
        /** Informational messages with instructional information. */
        kINFO(3),
        /** Verbose messages with debugging information. */
        kVERBOSE(4);

        public final int value;
        private Severity(int v) { this.value = v; }
        private Severity(Severity e) { this.value = e.value; }
        public Severity intern() { for (Severity e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /**
     *  A callback implemented by the application to handle logging messages;
     * 
     *  @param severity The severity of the message.
     *  @param msg The log message, null terminated.
     *  */
    @Virtual(true) public native void log(Severity severity, String msg);

    
    /** Default native constructor. */
    public ILogger() { super((Pointer)null); allocate(); }
    private native void allocate();
}
