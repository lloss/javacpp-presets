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
 *  \class IErrorRecorder
 * 
 *  \brief Reference counted application-implemented error reporting interface for TensorRT objects.
 * 
 *  The error reporting mechanism is a user defined object that interacts with the internal state of the object
 *  that it is assigned to in order to determine information about abnormalities in execution. The error recorder
 *  gets both an error enum that is more descriptive than pass/fail and also a string description that gives more
 *  detail on the exact failure modes. In the safety context, the error strings are all limited to 128 characters
 *  in length.
 *  The ErrorRecorder gets passed along to any class that is created from another class that has an ErrorRecorder
 *  assigned to it. For example, assigning an ErrorRecorder to an IBuilder allows all INetwork's, ILayer's, and
 *  ITensor's to use the same error recorder. For functions that have their own ErrorRecorder accessor functions.
 *  This allows registering a different error recorder or de-registering of the error recorder for that specific
 *  object.
 * 
 *  The ErrorRecorder object implementation must be thread safe if the same ErrorRecorder is passed to different
 *  interface objects being executed in parallel in different threads. All locking and synchronization is
 *  pushed to the interface implementation and TensorRT does not hold any synchronization primitives when accessing
 *  the interface functions.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IErrorRecorder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IErrorRecorder(Pointer p) { super(p); }

    /**
     *  A typedef of a c-style string for reporting error descriptions.
     *  */
    
    
    //!
    //!

    /**
     *  A typedef of a 32bit integer for reference counting.
     *  */

    // Public API’s used to retrieve information from the error recorder.

    /**
     *  \brief Return the number of errors
     * 
     *  Determines the number of errors that occurred between the current point in execution
     *  and the last time that the clear() was executed. Due to the possibility of asynchronous
     *  errors occuring, a TensorRT API can return correct results, but still register errors
     *  with the Error Recorder. The value of getNbErrors must monotonically increases until clear()
     *  is called.
     * 
     *  @return Returns the number of errors detected, or 0 if there are no errors.
     * 
     *  @see clear
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException int getNbErrors();

    /**
     *  \brief Returns the ErrorCode enumeration.
     * 
     *  @param errorIdx A 32bit integer that indexes into the error array.
     * 
     *  The errorIdx specifies what error code from 0 to getNbErrors()-1 that the application
     *  wants to analyze and return the error code enum.
     * 
     *  @return Returns the enum corresponding to errorIdx.
     * 
     *  @see getErrorDesc, ErrorCode
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException ErrorCode getErrorCode(int errorIdx);

    /**
     *  \brief Returns the c-style string description of the error.
     * 
     *  @param errorIdx A 32bit integer that indexes into the error array.
     * 
     *  For the error specified by the idx value, return the string description of the error. The
     *  error string is a c-style string that is zero delimited. In the safety context there is a
     *  constant length requirement to remove any dynamic memory allocations and the error message
     *  may be truncated. The format of the string is "<EnumAsStr> - <Description>".
     * 
     *  @return Returns a string representation of the error along with a description of the error.
     * 
     *  @see getErrorCode
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException String getErrorDesc(int errorIdx);

    /**
     *  \brief Determine if the error stack has overflowed.
     * 
     *  In the case when the number of errors is large, this function is used to query if one or more
     *  errors have been dropped due to lack of storage capacity. This is especially important in the
     *  automotive safety case where the internal error handling mechanisms cannot allocate memory.
     * 
     *  @return true if errors have been dropped due to overflowing the error stack.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException boolean hasOverflowed();

    /**
     *  \brief Clear the error stack on the error recorder.
     * 
     *  Removes all the tracked errors by the error recorder.  This function must guarantee that after
     *  this function is called, and as long as no error occurs, the next call to getNbErrors will return
     *  zero.
     * 
     *  @see getNbErrors
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException void clear();

    // API’s used by TensorRT to report Error information to the application.

    /**
     *  \brief report an error to the error recorder with the corresponding enum and description.
     * 
     *  @param val The error code enum that is being reported.
     *  @param desc The string description of the error.
     * 
     *  Report an error to the user that has a given value and human readable description. The function returns false
     *  if processing can continue, which implies that the reported error is not fatal. This does not guarantee that
     *  processing continues, but provides a hint to TensorRT.
     * 
     *  @return True if the error is determined to be fatal and processing of the current function must end.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException boolean reportError(ErrorCode val, String desc);
    public native @Cast("bool") @NoException boolean reportError(@Cast("nvinfer1::ErrorCode") int val, @Cast("const char*") BytePointer desc);

    /**
     *  \brief Increments the refcount for the current ErrorRecorder.
     * 
     *  Increments the reference count for the object by one and returns the current value.
     *  This reference count allows the application to know that an object inside of TensorRT has
     *  taken a reference to the ErrorRecorder. If the ErrorRecorder is released before the
     *  reference count hits zero, then behavior in TensorRT is undefined. It is strongly recommended
     *  that the increment is an atomic operation. TensorRT guarantees that each incRefCount called on
     *  an objects construction is paired with a decRefCount call when an object is destructed.
     * 
     *  @return The current reference counted value.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::IErrorRecorder::RefCount") @NoException int incRefCount();

    /**
     *  \brief Decrements the refcount for the current ErrorRecorder.
     * 
     *  Decrements the reference count for the object by one and returns the current value. It is undefined behavior
     *  to call decRefCount when RefCount is zero. If the ErrorRecorder is destroyed before the reference count
     *  hits zero, then behavior in TensorRT is undefined. It is strongly recommended that the decrement is an
     *  atomic operation. TensorRT guarantees that each decRefCount called when an object is destructed is
     *  paired with a incRefCount call when that object was constructed.
     * 
     *  @return The current reference counted value.
     *  */
    public native @Cast("nvinfer1::IErrorRecorder::RefCount") @NoException int decRefCount();

}
