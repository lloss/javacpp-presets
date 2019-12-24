// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for fixed size list data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FixedSizeListType extends NestedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedSizeListType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  // List can contain any other logical value type
  public FixedSizeListType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type, int list_size) { super((Pointer)null); allocate(value_type, list_size); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type, int list_size);

  public FixedSizeListType(@Const @SharedPtr @ByRef Field value_field, int list_size) { super((Pointer)null); allocate(value_field, list_size); }
  private native void allocate(@Const @SharedPtr @ByRef Field value_field, int list_size);

  public native @SharedPtr @ByVal Field value_field();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type();

  public native @ByVal DataTypeLayout layout();

  public native @StdString String ToString();

  public native @StdString String name();

  public native int list_size();
}