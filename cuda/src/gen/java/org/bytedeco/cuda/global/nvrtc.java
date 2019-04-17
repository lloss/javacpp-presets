// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.global;

import org.bytedeco.cuda.nvrtc.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

public class nvrtc extends org.bytedeco.cuda.presets.nvrtc {
    static { Loader.load(); }

// Parsed from <nvrtc.h>

//
// NVIDIA_COPYRIGHT_BEGIN
//
// Copyright (c) 2014-2018, NVIDIA CORPORATION.  All rights reserved.
//
// NVIDIA CORPORATION and its licensors retain all intellectual property
// and proprietary rights in and to this software, related documentation
// and any modifications thereto.  Any use, reproduction, disclosure or
// distribution of this software and related documentation without an express
// license agreement from NVIDIA CORPORATION is strictly prohibited.
//
// NVIDIA_COPYRIGHT_END
//

// #ifndef __NVRTC_H__
// #define __NVRTC_H__

// #ifdef __cplusplus
// #endif /* __cplusplus */

// #include <stdlib.h>


/*************************************************************************//**
 *
 * \defgroup error Error Handling
 *
 * NVRTC defines the following enumeration type and function for API call
 * error handling.
 *
 ****************************************************************************/


/**
 * \ingroup error
 * \brief   The enumerated type nvrtcResult defines API call result codes.
 *          NVRTC API functions return nvrtcResult to indicate the call
 *          result.
 */
/** enum nvrtcResult */
public static final int
  NVRTC_SUCCESS = 0,
  NVRTC_ERROR_OUT_OF_MEMORY = 1,
  NVRTC_ERROR_PROGRAM_CREATION_FAILURE = 2,
  NVRTC_ERROR_INVALID_INPUT = 3,
  NVRTC_ERROR_INVALID_PROGRAM = 4,
  NVRTC_ERROR_INVALID_OPTION = 5,
  NVRTC_ERROR_COMPILATION = 6,
  NVRTC_ERROR_BUILTIN_OPERATION_FAILURE = 7,
  NVRTC_ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION = 8,
  NVRTC_ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION = 9,
  NVRTC_ERROR_NAME_EXPRESSION_NOT_VALID = 10,
  NVRTC_ERROR_INTERNAL_ERROR = 11;


/**
 * \ingroup error
 * \brief   nvrtcGetErrorString is a helper function that returns a string
 *          describing the given nvrtcResult code, e.g., NVRTC_SUCCESS to
 *          \c "NVRTC_SUCCESS".
 *          For unrecognized enumeration values, it returns
 *          \c "NVRTC_ERROR unknown".
 *
 * @param result [in] CUDA Runtime Compilation API result code.
 * @return  Message string for the given #nvrtcResult code.
 */
public static native @Cast("const char*") BytePointer nvrtcGetErrorString(@Cast("nvrtcResult") int result);


/*************************************************************************//**
 *
 * \defgroup query General Information Query
 *
 * NVRTC defines the following function for general information query.
 *
 ****************************************************************************/


/**
 * \ingroup query
 * \brief   nvrtcVersion sets the output parameters \p major and \p minor
 *          with the CUDA Runtime Compilation version number.
 *
 * @param major [out] CUDA Runtime Compilation major version number.
 * @param minor [out] CUDA Runtime Compilation minor version number.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *
 */
public static native @Cast("nvrtcResult") int nvrtcVersion(IntPointer major, IntPointer minor);
public static native @Cast("nvrtcResult") int nvrtcVersion(IntBuffer major, IntBuffer minor);
public static native @Cast("nvrtcResult") int nvrtcVersion(int[] major, int[] minor);
// Targeting ../nvrtc/_nvrtcProgram.java




/**
 * \ingroup compilation
 * \brief   nvrtcCreateProgram creates an instance of nvrtcProgram with the
 *          given input parameters, and sets the output parameter \p prog with
 *          it.
 *
 * @param prog [out]         CUDA Runtime Compilation program.
 * @param src [in]          CUDA program source.
 * @param name [in]         CUDA program name.\n
 *                             \p name can be \c NULL; \c "default_program" is
 *                             used when \p name is \c NULL.
 * @param numHeaders [in]   Number of headers used.\n
 *                             \p numHeaders must be greater than or equal to 0.
 * @param headers [in]      Sources of the headers.\n
 *                             \p headers can be \c NULL when \p numHeaders is
 *                             0.
 * @param includeNames [in] Name of each header by which they can be
 *                             included in the CUDA program source.\n
 *                             \p includeNames can be \c NULL when \p numHeaders
 *                             is 0.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_OUT_OF_MEMORY \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_PROGRAM_CREATION_FAILURE \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *
 * @see     ::nvrtcDestroyProgram
 */
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@ByPtrPtr _nvrtcProgram prog,
                               @Cast("const char*") BytePointer src,
                               @Cast("const char*") BytePointer name,
                               int numHeaders,
                               @Cast("const char*const*") PointerPointer headers,
                               @Cast("const char*const*") PointerPointer includeNames);
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@ByPtrPtr _nvrtcProgram prog,
                               @Cast("const char*") BytePointer src,
                               @Cast("const char*") BytePointer name,
                               int numHeaders,
                               @Cast("const char*const*") @ByPtrPtr BytePointer headers,
                               @Cast("const char*const*") @ByPtrPtr BytePointer includeNames);
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@Cast("_nvrtcProgram**") PointerPointer prog,
                               String src,
                               String name,
                               int numHeaders,
                               @Cast("const char*const*") @ByPtrPtr ByteBuffer headers,
                               @Cast("const char*const*") @ByPtrPtr ByteBuffer includeNames);
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@ByPtrPtr _nvrtcProgram prog,
                               @Cast("const char*") BytePointer src,
                               @Cast("const char*") BytePointer name,
                               int numHeaders,
                               @Cast("const char*const*") @ByPtrPtr byte[] headers,
                               @Cast("const char*const*") @ByPtrPtr byte[] includeNames);
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@Cast("_nvrtcProgram**") PointerPointer prog,
                               String src,
                               String name,
                               int numHeaders,
                               @Cast("const char*const*") @ByPtrPtr BytePointer headers,
                               @Cast("const char*const*") @ByPtrPtr BytePointer includeNames);
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@ByPtrPtr _nvrtcProgram prog,
                               @Cast("const char*") BytePointer src,
                               @Cast("const char*") BytePointer name,
                               int numHeaders,
                               @Cast("const char*const*") @ByPtrPtr ByteBuffer headers,
                               @Cast("const char*const*") @ByPtrPtr ByteBuffer includeNames);
public static native @Cast("nvrtcResult") int nvrtcCreateProgram(@Cast("_nvrtcProgram**") PointerPointer prog,
                               String src,
                               String name,
                               int numHeaders,
                               @Cast("const char*const*") @ByPtrPtr byte[] headers,
                               @Cast("const char*const*") @ByPtrPtr byte[] includeNames);


/**
 * \ingroup compilation
 * \brief   nvrtcDestroyProgram destroys the given program.
 *
 * @param prog [in] CUDA Runtime Compilation program.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *
 * @see     ::nvrtcCreateProgram
 */
public static native @Cast("nvrtcResult") int nvrtcDestroyProgram(@ByPtrPtr _nvrtcProgram prog);
public static native @Cast("nvrtcResult") int nvrtcDestroyProgram(@Cast("_nvrtcProgram**") PointerPointer prog);


/**
 * \ingroup compilation
 * \brief   nvrtcCompileProgram compiles the given program.
 *
 * It supports compile options listed in \ref options.
 */
public static native @Cast("nvrtcResult") int nvrtcCompileProgram(_nvrtcProgram prog,
                                int numOptions, @Cast("const char*const*") PointerPointer options);
public static native @Cast("nvrtcResult") int nvrtcCompileProgram(_nvrtcProgram prog,
                                int numOptions, @Cast("const char*const*") @ByPtrPtr BytePointer options);
public static native @Cast("nvrtcResult") int nvrtcCompileProgram(_nvrtcProgram prog,
                                int numOptions, @Cast("const char*const*") @ByPtrPtr ByteBuffer options);
public static native @Cast("nvrtcResult") int nvrtcCompileProgram(_nvrtcProgram prog,
                                int numOptions, @Cast("const char*const*") @ByPtrPtr byte[] options);


/**
 * \ingroup compilation
 * \brief   nvrtcGetPTXSize sets \p ptxSizeRet with the size of the PTX
 *          generated by the previous compilation of \p prog (including the
 *          trailing \c NULL).
 *
 * @param prog [in]       CUDA Runtime Compilation program.
 * @param ptxSizeRet [out] Size of the generated PTX (including the trailing
 *                           \c NULL).
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *
 * @see     ::nvrtcGetPTX
 */
public static native @Cast("nvrtcResult") int nvrtcGetPTXSize(_nvrtcProgram prog, @Cast("size_t*") SizeTPointer ptxSizeRet);


/**
 * \ingroup compilation
 * \brief   nvrtcGetPTX stores the PTX generated by the previous compilation
 *          of \p prog in the memory pointed by \p ptx.
 *
 * @param prog [in] CUDA Runtime Compilation program.
 * @param ptx [out]  Compiled result.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *
 * @see     ::nvrtcGetPTXSize
 */
public static native @Cast("nvrtcResult") int nvrtcGetPTX(_nvrtcProgram prog, @Cast("char*") BytePointer ptx);
public static native @Cast("nvrtcResult") int nvrtcGetPTX(_nvrtcProgram prog, @Cast("char*") ByteBuffer ptx);
public static native @Cast("nvrtcResult") int nvrtcGetPTX(_nvrtcProgram prog, @Cast("char*") byte[] ptx);


/**
 * \ingroup compilation
 * \brief   nvrtcGetProgramLogSize sets \p logSizeRet with the size of the
 *          log generated by the previous compilation of \p prog (including the
 *          trailing \c NULL).
 *
 * Note that compilation log may be generated with warnings and informative
 * messages, even when the compilation of \p prog succeeds.
 *
 * @param prog [in]       CUDA Runtime Compilation program.
 * @param logSizeRet [out] Size of the compilation log
 *                           (including the trailing \c NULL).
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *
 * @see     ::nvrtcGetProgramLog
 */
public static native @Cast("nvrtcResult") int nvrtcGetProgramLogSize(_nvrtcProgram prog, @Cast("size_t*") SizeTPointer logSizeRet);


/**
 * \ingroup compilation
 * \brief   nvrtcGetProgramLog stores the log generated by the previous
 *          compilation of \p prog in the memory pointed by \p log.
 *
 * @param prog [in] CUDA Runtime Compilation program.
 * @param log [out]  Compilation log.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *
 * @see     ::nvrtcGetProgramLogSize
 */
public static native @Cast("nvrtcResult") int nvrtcGetProgramLog(_nvrtcProgram prog, @Cast("char*") BytePointer log);
public static native @Cast("nvrtcResult") int nvrtcGetProgramLog(_nvrtcProgram prog, @Cast("char*") ByteBuffer log);
public static native @Cast("nvrtcResult") int nvrtcGetProgramLog(_nvrtcProgram prog, @Cast("char*") byte[] log);


/**
 * \ingroup compilation
 * \brief   nvrtcAddNameExpression notes the given name expression
 *          denoting the address of a __global__ function 
 *          or __device__/__constant__ variable.
 *
 * The identical name expression string must be provided on a subsequent
 * call to nvrtcGetLoweredName to extract the lowered name.
 * @param prog [in] CUDA Runtime Compilation program.
 * @param name_expression [in] constant expression denoting the address of
 *               a __global__ function or __device__/__constant__ variable.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_NO_NAME_EXPRESSIONS_AFTER_COMPILATION \endlink
 *
 * @see     ::nvrtcGetLoweredName
 */
public static native @Cast("nvrtcResult") int nvrtcAddNameExpression(_nvrtcProgram prog,
                                   @Cast("const char*") BytePointer name_expression);
public static native @Cast("nvrtcResult") int nvrtcAddNameExpression(_nvrtcProgram prog,
                                   String name_expression);

/**
 * \ingroup compilation
 * \brief   nvrtcGetLoweredName extracts the lowered (mangled) name
 *          for a __global__ function or __device__/__constant__ variable,
 *          and updates *lowered_name to point to it. The memory containing
 *          the name is released when the NVRTC program is destroyed by 
 *          nvrtcDestroyProgram.
 *          The identical name expression must have been previously
 *          provided to nvrtcAddNameExpression.
 *
 * @param prog [in] CUDA Runtime Compilation program.
 * @param name_expression [in] constant expression denoting the address of 
 *               a __global__ function or __device__/__constant__ variable.
 * @param lowered_name [out] initialized by the function to point to a
 *               C string containing the lowered (mangled)
 *               name corresponding to the provided name expression.
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_NO_LOWERED_NAMES_BEFORE_COMPILATION \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_NAME_EXPRESSION_NOT_VALID \endlink
 *
 * @see     ::nvrtcAddNameExpression
 */
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                @Cast("const char*") BytePointer name_expression,
                                @Cast("const char**") PointerPointer lowered_name);
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                @Cast("const char*") BytePointer name_expression,
                                @Cast("const char**") @ByPtrPtr BytePointer lowered_name);
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                String name_expression,
                                @Cast("const char**") @ByPtrPtr ByteBuffer lowered_name);
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                @Cast("const char*") BytePointer name_expression,
                                @Cast("const char**") @ByPtrPtr byte[] lowered_name);
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                String name_expression,
                                @Cast("const char**") @ByPtrPtr BytePointer lowered_name);
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                @Cast("const char*") BytePointer name_expression,
                                @Cast("const char**") @ByPtrPtr ByteBuffer lowered_name);
public static native @Cast("nvrtcResult") int nvrtcGetLoweredName(_nvrtcProgram prog,
                                String name_expression,
                                @Cast("const char**") @ByPtrPtr byte[] lowered_name);


/**
 * \defgroup options Supported Compile Options
 *
 * NVRTC supports the compile options below.
 * Option names with two preceding dashs (\c --) are long option names and
 * option names with one preceding dash (\c -) are short option names.
 * Short option names can be used instead of long option names.
 * When a compile option takes an argument, an assignment operator (\c =)
 * is used to separate the compile option argument from the compile option
 * name, e.g., \c "--gpu-architecture=compute_30".
 * Alternatively, the compile option name and the argument can be specified in
 * separate strings without an assignment operator, .e.g,
 * \c "--gpu-architecture" \c "compute_30".
 * Single-character short option names, such as \c -D, \c -U, and \c -I, do
 * not require an assignment operator, and the compile option name and the
 * argument can be present in the same string with or without spaces between
 * them.
 * For instance, \c "-D=<def>", \c "-D<def>", and \c "-D <def>" are all
 * supported.
 *
 * The valid compiler options are:
 *
 *   - Compilation targets
 *     - \c --gpu-architecture=\<arch\> (\c -arch)\n
 *       Specify the name of the class of GPU architectures for which the
 *       input must be compiled.\n
 *       - Valid <c>\<arch\></c>s:
 *         - \c compute_30
 *         - \c compute_32
 *         - \c compute_35
 *         - \c compute_37
 *         - \c compute_50
 *         - \c compute_52
 *         - \c compute_53
 *         - \c compute_60
 *         - \c compute_61
 *         - \c compute_62
 *         - \c compute_70
 *         - \c compute_72
 *       - Default: \c compute_30
 *   - Separate compilation / whole-program compilation
 *     - \c --device-c (\c -dc)\n
 *       Generate relocatable code that can be linked with other relocatable
 *       device code.  It is equivalent to --relocatable-device-code=true.
 *     - \c --device-w (\c -dw)\n
 *       Generate non-relocatable code.  It is equivalent to
 *       \c --relocatable-device-code=false.
 *     - \c --relocatable-device-code={true|false} (\c -rdc)\n
 *       Enable (disable) the generation of relocatable device code.
 *       - Default: \c false
 *   - Debugging support
 *     - \c --device-debug (\c -G)\n
 *       Generate debug information.
 *     - \c --generate-line-info (\c -lineinfo)\n
 *       Generate line-number information.
 *   - Code generation
 *     - \c --maxrregcount=\<N\> (\c -maxrregcount)\n
 *       Specify the maximum amount of registers that GPU functions can use.
 *       Until a function-specific limit, a higher value will generally
 *       increase the performance of individual GPU threads that execute this
 *       function.  However, because thread registers are allocated from a
 *       global register pool on each GPU, a higher value of this option will
 *       also reduce the maximum thread block size, thereby reducing the amount
 *       of thread parallelism.  Hence, a good maxrregcount value is the result
 *       of a trade-off.  If this option is not specified, then no maximum is
 *       assumed.  Value less than the minimum registers required by ABI will
 *       be bumped up by the compiler to ABI minimum limit.
 *     - \c --ftz={true|false} (\c -ftz)\n
 *       When performing single-precision floating-point operations, flush
 *       denormal values to zero or preserve denormal values.
 *       \c --use_fast_math implies \c --ftz=true.
 *       - Default: \c false
 *     - \c --prec-sqrt={true|false} (\c -prec-sqrt)\n
 *       For single-precision floating-point square root, use IEEE
 *       round-to-nearest mode or use a faster approximation.
 *       \c --use_fast_math implies \c --prec-sqrt=false.
 *       - Default: \c true
 *     - \c --prec-div={true|false} (\c -prec-div)\n
 *       For single-precision floating-point division and reciprocals, use IEEE
 *       round-to-nearest mode or use a faster approximation.
 *       \c --use_fast_math implies \c --prec-div=false.
 *       - Default: \c true
 *     - \c --fmad={true|false} (\c -fmad)\n
 *       Enables (disables) the contraction of floating-point multiplies and
 *       adds/subtracts into floating-point multiply-add operations (FMAD,
 *       FFMA, or DFMA).  \c --use_fast_math implies \c --fmad=true.
 *       - Default: \c true
 *     - \c --use_fast_math (\c -use_fast_math)\n
 *       Make use of fast math operations.
 *       \c --use_fast_math implies \c --ftz=true \c --prec-div=false
 *       \c --prec-sqrt=false \c --fmad=true.
 *   - Preprocessing
 *     - \c --define-macro=\<def\> (\c -D)\n
 *       \c \<def\> can be either \c \<name\> or \c \<name=definitions\>.
 *       - \c \<name\> \n
 *         Predefine \c \<name\> as a macro with definition \c 1.
 *       - \c \<name\>=\<definition\> \n
 *         The contents of \c \<definition\> are tokenized and preprocessed
 *         as if they appeared during translation phase three in a \c \#define
 *         directive.  In particular, the definition will be truncated by
 *         embedded new line characters.
 *     - \c --undefine-macro=\<def\> (\c -U)\n
 *       Cancel any previous definition of \c \<def\>.
 *     - \c --include-path=\<dir\> (\c -I)\n
 *       Add the directory \c \<dir\> to the list of directories to be
 *       searched for headers.  These paths are searched after the list of
 *       headers given to ::nvrtcCreateProgram.
 *     - \c --pre-include=\<header\> (\c -include)\n
 *       Preinclude \c \<header\> during preprocessing.
 *   - Language Dialect
 *     - \c --std={c++11|c++14} (\c -std={c++11|c++14})\n
 *       Set language dialect to C++11 or C++14.
 *     - \c --builtin-move-forward={true|false} (\c -builtin-move-forward)\n
 *       Provide builtin definitions of \c std::move and \c std::forward,
 *       when C++11 language dialect is selected.
 *       - Default: \c true
 *     - \c --builtin-initializer-list={true|false}
 *       (\c -builtin-initializer-list)\n
 *       Provide builtin definitions of \c std::initializer_list class and
 *       member functions when C++11 language dialect is selected.
 *       - Default: \c true
 *   - Misc.
 *     - \c --disable-warnings (\c -w)\n
 *       Inhibit all warning messages.
 *     - \c --restrict (\c -restrict)\n
 *       Programmer assertion that all kernel pointer parameters are restrict
 *       pointers.
 *     - \c --device-as-default-execution-space
 *       (\c -default-device)\n
 *       Treat entities with no execution space annotation as \c __device__
 *       entities.
 *
 * @param prog [in]       CUDA Runtime Compilation program.
 * @param numOptions [in] Number of compiler options passed.
 * @param options [in]    Compiler options in the form of C string array.\n
 *                          \p options can be \c NULL when \p numOptions is 0.
 *
 * @return
 *   - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_OUT_OF_MEMORY \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_INPUT \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_PROGRAM \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_INVALID_OPTION \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_COMPILATION \endlink
 *   - \link #nvrtcResult NVRTC_ERROR_BUILTIN_OPERATION_FAILURE \endlink
 */


// #ifdef __cplusplus
// #endif /* __cplusplus */


/* The utility function 'nvrtcGetTypeName' is not available by default. Define
   the macro 'NVRTC_GET_TYPE_NAME' to a non-zero value to make it available.
*/
   
// #if NVRTC_GET_TYPE_NAME || __DOXYGEN_ONLY__

// #if NVRTC_USE_CXXABI || __clang__ || __GNUC__ || __DOXYGEN_ONLY__
// #include <cxxabi.h>
// #include <cstdlib>

// #elif defined(_WIN32)
// #include <Windows.h>
// #include <DbgHelp.h>
// #endif /* NVRTC_USE_CXXABI || __clang__ || __GNUC__ */


// #include <string>
// #include <typeinfo>


/*************************************************************************//**
 *
 * \defgroup hosthelper Host Helper
 *
 * NVRTC defines the following functions for easier interaction with host code.
 *
 ****************************************************************************/

/**
 * \ingroup hosthelper
 * \brief   nvrtcGetTypeName stores the source level name of the template type argument
 *          T in the given std::string location.
 *
 * This function is only provided when the macro NVRTC_GET_TYPE_NAME is
 * defined with a non-zero value. It uses abi::__cxa_demangle or UnDecorateSymbolName
 * function calls to extract the type name, when using gcc/clang or cl.exe compilers,
 * respectively. If the name extraction fails, it will return NVRTC_INTERNAL_ERROR,
 * otherwise *result is initialized with the extracted name.
 * 
 * @param result [in] : pointer to std::string in which to store the type name.
 * @return
 *  - \link #nvrtcResult NVRTC_SUCCESS \endlink
 *  - \link #nvrtcResult NVRTC_ERROR_INTERNAL_ERROR \endlink
 *
 */
// #endif  /* NVRTC_GET_TYPE_NAME */

// #endif /* __NVRTC_H__ */


}