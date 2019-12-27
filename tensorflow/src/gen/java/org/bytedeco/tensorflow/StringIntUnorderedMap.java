// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::unordered_map<tensorflow::string,tensorflow::int32>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringIntUnorderedMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringIntUnorderedMap(Pointer p) { super(p); }
    public StringIntUnorderedMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef StringIntUnorderedMap put(@ByRef StringIntUnorderedMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native int get(@StdString BytePointer i);
    public native StringIntUnorderedMap put(@StdString BytePointer i, int value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator*().second") @MemberGetter int second();
    }
}

