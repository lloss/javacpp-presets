// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Used to store partitioned graphs from function-calling ops.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GraphCollector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphCollector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphCollector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GraphCollector position(long position) {
        return (GraphCollector)super.position(position);
    }

  public native @ByRef @Cast("tensorflow::mutex*") Pointer mu(); public native GraphCollector mu(Pointer setter);
  public native @StdVector GraphDef partitioned_graphs(); public native GraphCollector partitioned_graphs(GraphDef setter);
  public native @ByRef GraphDef raw_graph(); public native GraphCollector raw_graph(GraphDef setter);
  public native @ByRef GraphDef optimized_graph(); public native GraphCollector optimized_graph(GraphDef setter);

  public native @Cast("bool") boolean dirty(); public native GraphCollector dirty(boolean setter);

  public GraphCollector() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native void CollectRawGraph(@Const @ByRef GraphDef graph);

  public native void CollectOptimizedGraph(@Const @ByRef GraphDef graph);

  public native void CollectPartitionedGraph(@Const @ByRef GraphDef graph);

  public native void ClearGraphs();

  public native @Cast("bool") boolean HasUpdatedGraphs();
}
