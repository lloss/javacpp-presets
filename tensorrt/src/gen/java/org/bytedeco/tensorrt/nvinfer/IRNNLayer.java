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
 *  \class IRNNLayer
 * 
 *  \brief A RNN layer in a network definition.
 * 
 *  This layer applies an RNN operation on the inputs. This layer only works with networks that
 *  that have an implicit batch dimension. For dynamic shapes and explicit batch dimension networks,
 *  use IRNNv2Layer.
 * 
 *  @deprecated This interface is superseded by IRNNv2Layer.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRNNLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRNNLayer(Pointer p) { super(p); }

    /**
     *  \brief Get the number of layers in the RNN.
     * 
     *  @return The number of layers in the RNN.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("unsigned") int getLayerCount();

    /**
     *  \brief Get the size of the hidden layers.
     * 
     *  The hidden size is the value of hiddenSize parameter passed into addRNN().
     * 
     *  @return The internal hidden layer size for the RNN.
     *  @see getDirection(), addRNN()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("std::size_t") long getHiddenSize();

    /**
     *  \brief Get the sequence length.
     * 
     *  The sequence length is the maximum number of time steps passed into the addRNN() function.
     *  This is also the maximum number of input tensors that the RNN can process at once.
     * 
     *  @return the maximum number of time steps that can be executed by a single call RNN layer.
     *  */
    
    
    //!
    //!
    //!
    public native int getSeqLength();

    /**
     *  \brief Set the operation of the RNN layer.
     * 
     *  @see getOperation(), RNNOperation
     *  */
    
    
    //!
    //!
    //!
    public native void setOperation(RNNOperation op);
    public native void setOperation(@Cast("nvinfer1::RNNOperation") int op);

    /**
     *  \brief Get the operation of the RNN layer.
     * 
     *  @see setOperation(), RNNOperation
     *  */
    
    
    //!
    //!
    //!
    public native RNNOperation getOperation();

    /**
     *  \brief Set the operation of the RNN layer.
     * 
     *  @see getInputMode(), RNNInputMode
     *  */
    
    
    //!
    //!
    //!
    public native void setInputMode(RNNInputMode op);
    public native void setInputMode(@Cast("nvinfer1::RNNInputMode") int op);

    /**
     *  \brief Get the operation of the RNN layer.
     * 
     *  @see setInputMode(), RNNInputMode
     *  */
    
    
    //!
    //!
    //!
    public native RNNInputMode getInputMode();

    /**
     *  \brief Set the direction of the RNN layer.
     * 
     *  The direction determines if the RNN is run
     *  as a unidirectional(left to right) or
     *  bidirectional(left to right and right to left).
     *  In the ::kBIDIRECTION case the
     *  output is concatenated together, resulting
     *  in output size of 2x getHiddenSize().
     *  @see getDirection(), RNNDirection
     *  */
    
    
    //!
    //!
    //!
    public native void setDirection(RNNDirection op);
    public native void setDirection(@Cast("nvinfer1::RNNDirection") int op);

    /**
     *  \brief Get the direction of the RNN layer.
     * 
     *  @see setDirection(), RNNDirection
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native RNNDirection getDirection();

    /**
     *  @param weights The weight structure holding the weight parameters.
     * 
     *  \brief Set the weight parameters for the RNN.
     * 
     *  The trained weights for the weight parameter matrices of the RNN.
     *  The #DataType for this structure must be ::kFLOAT or ::kHALF, and must be the same
     *  datatype as the input tensor.
     * 
     *  The layout of the weight structure depends on the #RNNOperation, #RNNInputMode, and
     *  #RNNDirection of the layer.  The array specified by {@code weights.values} contains a sequence of
     *  parameter matrices, where each parameter matrix is linearly appended after the previous
     *  without padding; e.g., if parameter matrix 0 and 1 have M and N elements respectively, then
     *  the layout of {@code weights.values} in memory looks like:
     * 
     *  ~~~
     *  index | 0 1 2 3 4 ...  M-2 M-1 | M M+1  ... M+N-2 M+N-1 | M+N M+N+1 M+N+2 ...    | ...
     *  data  |-- parameter matrix 0 --|-- parameter matrix 1 --|-- parameter matrix 2 --| ...
     *  ~~~
     * 
     *  The following sections describe \ref setRNNWeightsOrder "the order of weight matrices" and
     *  \ref setRNNWeightsLayout "the layout of elements within a weight matrix".
     * 
     *  \section setRNNWeightsOrder Order of weight matrices
     * 
     *  The parameter matrices are ordered as described below:
     * 
     *  ~~~
     *     Let G(op, l) be defined to be a function that produces lists of parameter names, as follows:
     * 
     *          G(::kRELU, l) := [ Wl[i], Rl[i] ]
     *          G(::kTANH, l) := [ Wl[i], Rl[i] ]
     *          G(::kLSTM, l) := [ Wl[f], Wl[i], Wl[c], Wl[o], Rl[f], Rl[i], Rl[c], Rl[o] ]
     *          G(::kGRU, l)  := [ Wl[z], Wl[r], Wl[h], Rl[z], Rl[r], Rl[h] ]
     * 
     *     where Wl[g] and Rl[g] are the names of the input and recurrent
     *     input weight matrices for gate g, layer index l.
     * 
     *     See RNNOperation for an overview of the naming convention used for gates.
     * 
     *     If getDirection() == ::kUNIDIRECTION, then l identifies the stacked layer of the
     *     RNN, with l=0 being the first recurrent layer and l=L-1 being the last recurrent layer.
     * 
     *     If getDirection() == ::kBIDIRECTION, then (l % 2) identifies the direction of the
     *     recurrent layer (forward if 0, or backward if 1), and (l / 2) identifies the position
     *     of the recurrent layer within the (forward or backward) stack.
     * 
     *     Let op := getOperation(),
     *         L  := { ::kUNIDIRECTION => getLayerCount()
     *               { ::kBIDIRECTION => (2 * getLayerCount())
     * 
     *     Then the ordering of parameter matrices is the list produced by concatenating
     *     G(op, 0), G(op, 1), G(op, 2), ..., G(op, L-1).
     *  ~~~
     * 
     *  For example:
     * 
     *     - an RNN with {@code getLayerCount() == 3}, {@code getDirection() == ::kUNIDIRECTION},
     *       and {@code getOperation() == ::kRELU} has the following order:
     * 
     *       {@code [ W0[i], R0[i], W1[i], R1[i], W2[i], R2[i] ]}
     * 
     *     - an RNN with {@code getLayerCount() == 2}, {@code getDirection() == ::kUNIDIRECTION},
     *       and {@code getOperation() == ::kGRU} has the following order:
     * 
     *       {@code [ W0[z], W0[r], W0[h], R0[z], R0[r], R0[h], W1[z], W1[r], W1[h], R1[z], R1[r], R1[h] ]}
     * 
     *     - an RNN with {@code getLayerCount() == 2}, {@code getDirection() == ::kBIDIRECTION},
     *       and {@code getOperation() == ::kRELU} has the following order:
     * 
     *       {@code [ W0_fw[i], R0_fw[i], W0_bw[i], R0_bw[i], W1_fw[i], R1_fw[i], W1_bw[i], R1_bw[i] ]}
     * 
     *       (fw = "forward", bw = "backward")
     * 
     *  \section setRNNWeightsLayout Layout of elements within a weight matrix
     * 
     *  Each parameter matrix is row-major in memory, and has the following dimensions:
     * 
     *  ~~~
     *      Let K := { ::kUNIDIRECTION => 1
     *               { ::kBIDIRECTION => 2
     *          l := layer index (as described above)
     *          H := getHiddenSize()
     *          E := getDataLength() (the embedding length)
     *          isW := true if the matrix is an input (W) matrix, and false if
     *                 the matrix is a recurrent input (R) matrix.
     * 
     *     if isW:
     *        if l < K and ::kSKIP:
     *           (numRows, numCols) := (0, 0) # input matrix is skipped
     *        elif l < K and ::kLINEAR:
     *           (numRows, numCols) := (H, E) # input matrix acts on input data size E
     *        elif l >= K:
     *           (numRows, numCols) := (H, K * H) # input matrix acts on previous hidden state
     *     else: # not isW
     *        (numRows, numCols) := (H, H)
     *  ~~~
     * 
     *  In other words, the input weights of the first layer of the RNN (if
     *  not skipped) transform a {@code getDataLength()}-size column
     *  vector into a {@code getHiddenSize()}-size column vector.  The input
     *  weights of subsequent layers transform a {@code K*getHiddenSize()}-size
     *  column vector into a {@code getHiddenSize()}-size column vector.  {@code K=2} in
     *  the bidirectional case to account for the full hidden state being
     *  the concatenation of the forward and backward RNN hidden states.
     * 
     *  The recurrent weight matrices for all layers all have shape {@code (H, H)},
     *  both in the unidirectional and bidirectional cases.  (In the
     *  bidirectional case, each recurrent weight matrix for the (forward or
     *  backward) RNN cell operates on the previous (forward or
     *  backward) RNN cell's hidden state, which is size {@code H}).
     * 
     *  @see getWeights(), #RNNOperation
     *  */
    
    
    //!
    //!
    //!
    public native void setWeights(@ByVal Weights weights);

    /**
     *  \brief Get the W weights for the RNN.
     * 
     *  @see setWeights()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Weights getWeights();

    /**
     *  @param bias The weight structure holding the bias parameters.
     * 
     *  \brief Set the bias parameters for the RNN.
     * 
     *  The trained weights for the bias parameter vectors of the RNN.
     *  The #DataType for this structure must be ::kFLOAT or ::kHALF, and must be the same
     *  datatype as the input tensor.
     * 
     *  The layout of the weight structure depends on the #RNNOperation, #RNNInputMode, and
     *  #RNNDirection of the layer.  The array specified by {@code weights.values} contains a sequence of
     *  bias vectors, where each bias vector is linearly appended after the previous
     *  without padding; e.g., if bias vector 0 and 1 have M and N elements respectively, then
     *  the layout of {@code weights.values} in memory looks like:
     * 
     *  ~~~
     *  index | 0 1 2 3 4 ...  M-2 M-1 | M M+1  ... M+N-2 M+N-1 | M+N M+N+1 M+N+2 ...   | ...
     *  data  |--   bias vector 0    --|--   bias vector 1    --|--   bias vector 2   --| ...
     *  ~~~
     * 
     *  The ordering of bias vectors is similar to the \ref setRNNWeightsOrder "ordering of weight matrices"
     *  as described in setWeights().  To determine the order of bias vectors for a given RNN configuration,
     *  determine the ordered list of weight matrices {@code [ W0, W1, ..., Wn ]}.  Then replace each weight matrix
     *  with its corresponding bias vector, i.e. apply the following transform (for layer {@code l}, gate {@code g}):
     * 
     *  - {@code Wl[g]} becomes {@code Wbl[g]}
     *  - {@code Rl[g]} becomes {@code Rbl[g]}
     * 
     *  For example:
     * 
     *     - an RNN with {@code getLayerCount() == 3}, {@code getDirection() == ::kUNIDIRECTION},
     *       and {@code getOperation() == ::kRELU} has the following order:
     * 
     *       {@code [ Wb0[i], Rb0[i], Wb1[i], Rb1[i], Wb2[i], Rb2[i] ]}
     * 
     *     - an RNN with {@code getLayerCount() == 2}, {@code getDirection() == ::kUNIDIRECTION},
     *       and {@code getOperation() == ::kGRU} has the following order:
     * 
     *       {@code [ Wb0[z], Wb0[r], Wb0[h], Rb0[z], Rb0[r], Rb0[h], Wb1[z], Wb1[r], Wb1[h], Rb1[z], Rb1[r], Rb1[h] ]}
     * 
     *     - an RNN with {@code getLayerCount() == 2}, {@code getDirection() == ::kBIDIRECTION},
     *       and {@code getOperation() == ::kRELU} has the following order:
     * 
     *       {@code [ Wb0_fw[i], Rb0_fw[i], Wb0_bw[i], Rb0_bw[i], Wb1_fw[i], Rb1_fw[i], Wb1_bw[i], Rb1_bw[i] ]}
     * 
     *       (fw = "forward", bw = "backward")
     * 
     *  Each bias vector has a fixed size, getHiddenSize().
     * 
     *  @see getBias(), #RNNOperation
     *  */
    
    
    //!
    //!
    //!
    public native void setBias(@ByVal Weights bias);

    /**
     *  \brief Get the bias parameter vector for the RNN.
     * 
     *  @see setBias()
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal Weights getBias();

    /**
     *  \brief Get the length of the data being processed by the RNN for use in computing
     *  other values.
     * 
     *  @see setHiddenState(), setCellState()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native int getDataLength();

    /**
     *  @param hidden The initial hidden state of the RNN.
     * 
     *  \brief Set the initial hidden state of the RNN with the provided \p hidden ITensor.
     * 
     *  The layout for \p hidden is a linear layout of a 3D matrix:
     *   - C - The number of layers in the RNN, it must match getLayerCount().
     *   - H - The number of mini-batches for each time sequence.
     *   - W - The size of the per layer hidden states, it must match getHiddenSize().
     * 
     *  If getDirection() is ::kBIDIRECTION, the amount of space required is doubled and C is equal to
     *  getLayerCount() * 2.
     * 
     *  If hidden is not specified, then the initial hidden state is set to zero.
     * 
     *  @see getHiddenState()
     *  */
    
    
    //!
    //!
    //!
    public native void setHiddenState(@ByRef ITensor hidden);

    /**
     *  \brief Get the initial hidden state of the RNN.
     * 
     *  @return nullptr if no initial hidden tensor was specified, the initial hidden data otherwise.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native ITensor getHiddenState();

    /**
     *  @param cell The initial cell state of the RNN.
     * 
     *  \brief Set the initial cell state of the RNN with the provided \p cell ITensor.
     * 
     *  The layout for \p cell is a linear layout of a 3D matrix:
     *   - C - The number of layers in the RNN, it must match getLayerCount().
     *   - H - The number of mini-batches for each time sequence.
     *   - W - The size of the per layer hidden states, it must match getHiddenSize().
     * 
     *  If \p cell is not specified, then the initial cell state is set to zero.
     * 
     *  If getDirection() is ::kBIDIRECTION, the amount of space required is doubled and C is equal to
     *  getLayerCount() * 2.
     * 
     *  The cell state only affects LSTM RNN's.
     * 
     *  @see getCellState()
     *  */
    
    
    //!
    //!
    //!
    public native void setCellState(@ByRef ITensor cell);

    /**
     *  \brief Get the initial cell state of the RNN.
     * 
     *  @return nullptr if no initial cell tensor was specified, the initial cell data otherwise.
     *  */
    public native ITensor getCellState();
}
