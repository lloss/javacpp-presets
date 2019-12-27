// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// An interface that defines input streaming operations.
@Namespace("tensorflow::io") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InputStreamInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InputStreamInterface(Pointer p) { super(p); }


  // Reads the next bytes_to_read from the file. Typical return codes:
  //  * OK - in case of success.
  //  * OUT_OF_RANGE - not enough bytes remaining before end of file.
  public native @ByVal Status ReadNBytes(@Cast("tensorflow::int64") long bytes_to_read, @StdString @Cast({"char*", "std::string*"}) BytePointer result);

// #if defined(PLATFORM_GOOGLE)
// #endif

  // Skips bytes_to_skip before next ReadNBytes. bytes_to_skip should be >= 0.
  // Typical return codes:
  //  * OK - in case of success.
  //  * OUT_OF_RANGE - not enough bytes remaining before end of file.
  public native @ByVal Status SkipNBytes(@Cast("tensorflow::int64") long bytes_to_skip);

  // Return the offset of the current byte relative to the beginning of the
  // file.
  // If we Skip / Read beyond the end of the file, this should return the length
  // of the file.
  // If there are any errors, this must return -1.
  public native @Cast("tensorflow::int64") long Tell();

  // Resets the stream to the beginning.
  public native @ByVal Status Reset();
}
