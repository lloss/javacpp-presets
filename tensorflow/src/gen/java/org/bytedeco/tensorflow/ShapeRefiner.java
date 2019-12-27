// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ShapeRefiner performs shape inference for TensorFlow Graphs.  It is
// responsible for instantiating InferenceContext objects for each
// Node in the Graph, and providing/storing the 'input_tensor' Tensors
// used by Shape Inference functions, when available at graph
// construction time.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ShapeRefiner extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeRefiner(Pointer p) { super(p); }

  public ShapeRefiner(int graph_def_version, @Const OpRegistryInterface ops) { super((Pointer)null); allocate(graph_def_version, ops); }
  private native void allocate(int graph_def_version, @Const OpRegistryInterface ops);

  // Same as ShapeRefiner(versions.producer(), ops)
  public ShapeRefiner(@Const @ByRef VersionDef versions, @Const OpRegistryInterface ops) { super((Pointer)null); allocate(versions, ops); }
  private native void allocate(@Const @ByRef VersionDef versions, @Const OpRegistryInterface ops);

  // Performs validation of 'node' and runs 'node's shape function,
  // storing its shape outputs.
  //
  // All inputs of 'node' must be added to ShapeRefiner prior to
  // adding 'node'.
  //
  // Returns an error if:
  //  - the shape function for 'node' was not registered.
  //  - 'node' was added before its inputs.
  //  - The shape inference function returns an error.
  public native @ByVal Status AddNode(@Const Node node);

  // Sets 'node's 'output_port' output to have shape 'shape'.
  //
  // Returns an error if 'node' was not previously added to this
  // object, if 'output_port' is invalid, or if 'shape' is
  // not compatible with the existing shape of the output.
  public native @ByVal Status SetShape(@Const Node node, int output_port,
                    @ByVal ShapeHandle shape);

  // Update the input shapes of node in case the shapes of the fan-ins of 'node'
  // have themselves been modified (For example, in case of incremental shape
  // refinement). If 'relax' is true, a new shape with the broadest set of
  // information will be set as the new input (see InferenceContext::RelaxInput
  // for full details and examples). Sets refined to true if any shapes have
  // changed (in their string representations). Note that shapes may have been
  // updated to newer versions (but with identical string representations) even
  // if <*refined> is set to false.
  public native @ByVal Status UpdateNode(@Const Node node, @Cast("bool") boolean relax, @Cast("bool*") BoolPointer refined);
  public native @ByVal Status UpdateNode(@Const Node node, @Cast("bool") boolean relax, @Cast("bool*") boolean... refined);

  // Returns the InferenceContext for 'node', if present.
  public native InferenceContext GetContext(@Const Node node);

  // Returns the ExtendedInferenceContext for 'node', if present.

  // Getters and setters for graph_def_version_.
  public native int graph_def_version();
  public native void set_graph_def_version(int version);

  public native void set_require_shape_inference_fns(@Cast("bool") boolean require_shape_inference_fns);
  public native void set_disable_constant_propagation(@Cast("bool") boolean disable);

  // Set function library to enable function shape inference.
  // Without function library, function inference always yields unknown shapes.
  // With this enabled, shape inference can take more time since it descends
  // into all function calls. It doesn't do inference once for each function
  // definition, but once for each function call.
  // The function library must outlive the shape refiner.
  public native void set_function_library_for_shape_inference(
        @Const FunctionLibraryDefinition lib);

  public native @Cast("bool") boolean function_shape_inference_supported();

  // Call this to keep nested shapes information for user-defined functions:
  // nested inferences will be available on the ExtendedInferenceContext for
  // each function node, forming a tree of shape inferences corresponding to the
  // tree of nested function calls. By default this setting is disabled, and
  // only the shapes for the top-level function node will be reported on the
  // InferenceContext for each function node, to reduce memory usage.
  //
  // This flag has no effect when the function inference is not enabled via
  // set_function_library_for_shape_inference.
  public native void set_keep_nested_shape_inferences();
}
