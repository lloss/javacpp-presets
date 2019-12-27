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
 *  \class ILayer
 * 
 *  \brief Base class for all layer classes in a network definition.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ILayer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ILayer(Pointer p) { super(p); }

    /**
     *  \brief Return the type of a layer.
     * 
     *  @see LayerType
     *  */
    
    
    //!
    //!
    //!
    //!
    public native LayerType getType();

    /**
     *  \brief Set the name of a layer.
     * 
     *  This method copies the name string.
     * 
     *  @see getName()
     *  */
    
    
    //!
    //!
    //!
    public native void setName(String name);
    public native void setName(@Cast("const char*") BytePointer name);

    /**
     *  \brief Return the name of a layer.
     * 
     <p>
     *  @see setName()
     *  */
    
    
    //!
    //!
    public native String getName();

    /**
     *  \brief Get the number of inputs of a layer.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getNbInputs();

    /**
     *  \brief Get the layer input corresponding to the given index.
     * 
     *  @param index The index of the input tensor.
     * 
     *  @return The input tensor, or nullptr if the index is out of range or the tensor is optional
     *  (\ref ISliceLayer, \ref IRNNLayer and \ref IRNNv2Layer).
     *  */
    
    
    //!
    //!
    public native ITensor getInput(int index);

    /**
     *  \brief Get the number of outputs of a layer.
     *  */
    
    
    //!
    //!
    //!
    public native int getNbOutputs();

    /**
     *  \brief Get the layer output corresponding to the given index.
     * 
     *  @return The indexed output tensor, or nullptr if the index is out of range or the tensor is optional
     *  (\ref IRNNLayer and \ref IRNNv2Layer).
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native ITensor getOutput(int index);

    /**
     *  \brief Replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor */
    //
    /** Except for IShuffleLayer, ISliceLayer, IResizeLayer and ILoopOutputLayer, this method cannot change the number of inputs to a layer.
    /** The index argument must be less than the value of getNbInputs().
    /**
    /** See overloaded setInput() comments for the layers special behavior.
    /**
    /** @param index the index of the input to modify.
    /** @param tensor the new input tensor
    /** */
    
    
    //!
    //!
    //!
    //!
    public native void setInput(int index, @ByRef ITensor tensor);

    /**
     *  \brief Set the computational precision of this layer
     * 
     *  Setting the precision allows TensorRT to choose implementation which run at this computational precision.
     *  Layer input type would also get inferred from layer computational precision. TensorRT could still choose a
     *  non-conforming fastest implementation ignoring set layer precision. Use BuilderFlag::kSTRICT_TYPES to force
     *  choose implementations with requested precision. In case no implementation is found with requested precision,
     *  TensorRT would choose available fastest implementation. If precision is not set, TensorRT will select the layer
     *  computational precision and layer input type based on performance considerations and the flags specified to the
     *  builder.
     * 
     *  @param precision the computational precision.
     * 
     *  @see getPrecision() precisionIsSet() resetPrecision() */

    
    
    //!
    //!
    //!
    public native void setPrecision(DataType dataType);
    public native void setPrecision(@Cast("nvinfer1::DataType") int dataType);

    /**
     *  \brief get the computational precision of this layer
     * 
     *  @return the computational precision
     * 
     *  @see setPrecision() precisionIsSet() resetPrecision() */

    
    
    //!
    //!
    //!
    public native DataType getPrecision();

    /**
     *  \brief whether the computational precision has been set for this layer
     * 
     *  @return whether the computational precision has been explicitly set
     * 
     *  @see setPrecision() getPrecision() resetPrecision() */

    
    
    //!
    //!
    public native @Cast("bool") boolean precisionIsSet();

    /**
     *  \brief reset the computational precision for this layer
     * 
     *  @see setPrecision() getPrecision() precisionIsSet() */

    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native void resetPrecision();

    /**
     *  \brief Set the output type of this layer
     * 
     *  Setting the output type constrains TensorRT to choose implementations which generate output data with the
     *  given type. If it is not set, TensorRT will select output type based on layer computational precision. TensorRT
     *  could still choose non-conforming output type based on fastest implementation. Use BuilderFlag::kSTRICT_TYPES to
     *  force choose requested output type. In case layer precision is not specified, output type would depend on
     *  chosen implementation based on performance considerations and the flags specified to the builder.
     * 
     *  This method cannot be used to set the data type of the second output tensor of the TopK layer. The data type of
     *  the second output tensor of the topK layer is always Int32. Also the output type of all layers that are shape
     *  operations must be DataType::kINT32, and all attempts to set the output type to some other data type will be
     *  ignored except for issuing an error message.
     * 
     *  Note that the layer output type is generally not identical to the data type of the output tensor, as TensorRT may insert
     *  implicit reformatting operations to convert the former to the latter. Calling layer->setOutputType(i, type)
     *  has no effect on the data type of the i-th output tensor of layer, and users need to call layer->getOutput(i)->setType(type)
     *  to change the tensor data type. This is particularly relevant if the tensor is marked as a network output, since only
     *  setType() [but not setOutputType()] will affect the data representation in the corresponding output binding.
     * 
     *  @param index the index of the output to set
     *  @param dataType the type of the output
     * 
     *  @see getOutputType() outputTypeIsSet() resetOutputType() */

    
    
    //!
    //!
    //!
    public native void setOutputType(int index, DataType dataType);
    public native void setOutputType(int index, @Cast("nvinfer1::DataType") int dataType);

    /**
     *  \brief get the output type of this layer
     * 
     *  @param index the index of the output
     *  @return the output precision. If no precision has been set, DataType::kFLOAT will be returned,
     *          unless the output type is inherently DataType::kINT32.
     * 
     *  @see getOutputType() outputTypeIsSet() resetOutputType() */

    
    
    //!
    //!
    //!
    public native DataType getOutputType(int index);

    /**
     *  \brief whether the output type has been set for this layer
     * 
     *  @param index the index of the output
     *  @return whether the output type has been explicitly set
     * 
     *  @see setOutputType() getOutputType() resetOutputType() */

    
    
    //!
    //!
    //!
    public native @Cast("bool") boolean outputTypeIsSet(int index);

    /**
     *  \brief reset the output type for this layer
     * 
     *  @param index the index of the output
     * 
     *  @see setOutputType() getOutputType() outputTypeIsSet() */

    public native void resetOutputType(int index);
}
