// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup lookup_ops Lookup Ops
 *  \{
 <p>
 *  Creates a non-initialized hash table.
 * 
 *  This op creates a hash table, specifying the type of its keys and values.
 *  Before using the table you will have to initialize it.  After initialization the
 *  table will be immutable.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * key_dtype: Type of the table keys.
 *  * value_dtype: Type of the table values.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * container: If non-empty, this table is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this table is shared under the given name across
 *  multiple sessions.
 *  * use_node_name_sharing: If true and shared_name is empty, the table is shared
 *  using the node name.
 * 
 *  Returns:
 *  * {@code Output}: Handle to a table. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class HashTable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HashTable(Pointer p) { super(p); }

  /** Optional attribute setters for HashTable */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If non-empty, this table is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this table is shared under the given name across
     *  multiple sessions.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    /** If true and shared_name is empty, the table is shared
     *  using the node name.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseNodeNameSharing(@Cast("bool") boolean x);

    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
    public native @Cast("bool") boolean use_node_name_sharing_(); public native Attrs use_node_name_sharing_(boolean setter);
  }
  public HashTable(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int key_dtype, @Cast("tensorflow::DataType") int value_dtype) { super((Pointer)null); allocate(scope, key_dtype, value_dtype); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int key_dtype, @Cast("tensorflow::DataType") int value_dtype);
  public HashTable(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int key_dtype, @Cast("tensorflow::DataType") int value_dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, key_dtype, value_dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int key_dtype, @Cast("tensorflow::DataType") int value_dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);
  public static native @ByVal Attrs UseNodeNameSharing(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native HashTable operation(Operation setter);
  public native @ByRef Output table_handle(); public native HashTable table_handle(Output setter);
}
