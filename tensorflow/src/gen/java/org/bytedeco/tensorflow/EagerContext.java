// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EagerContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EagerContext(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const tensorflow::uint64") long kInvalidContextId();
  public static final long kInvalidContextId = kInvalidContextId();

  public static native @Cast("tensorflow::uint64") long NewContextId();

  public EagerContext(@Const @ByRef SessionOptions opts,
                 @Cast("tensorflow::ContextDevicePlacementPolicy") int default_device_placement_policy,
                 @Cast("tensorflow::ContextMirroringPolicy") int default_mirroring_policy, @Cast("bool") boolean async,
                 @Const DeviceMgr device_mgr, @Cast("bool") boolean device_mgr_owned,
                 Rendezvous rendezvous,
                 @Const CustomKernelCreator custom_kernel_creator,
                 DistributedFunctionLibraryRuntime cluster_flr/*=nullptr*/) { super((Pointer)null); allocate(opts, default_device_placement_policy, default_mirroring_policy, async, device_mgr, device_mgr_owned, rendezvous, custom_kernel_creator, cluster_flr); }
  private native void allocate(@Const @ByRef SessionOptions opts,
                 @Cast("tensorflow::ContextDevicePlacementPolicy") int default_device_placement_policy,
                 @Cast("tensorflow::ContextMirroringPolicy") int default_mirroring_policy, @Cast("bool") boolean async,
                 @Const DeviceMgr device_mgr, @Cast("bool") boolean device_mgr_owned,
                 Rendezvous rendezvous,
                 @Const CustomKernelCreator custom_kernel_creator,
                 DistributedFunctionLibraryRuntime cluster_flr/*=nullptr*/);
  public EagerContext(@Const @ByRef SessionOptions opts,
                 @Cast("tensorflow::ContextDevicePlacementPolicy") int default_device_placement_policy,
                 @Cast("tensorflow::ContextMirroringPolicy") int default_mirroring_policy, @Cast("bool") boolean async,
                 @Const DeviceMgr device_mgr, @Cast("bool") boolean device_mgr_owned,
                 Rendezvous rendezvous,
                 @Const CustomKernelCreator custom_kernel_creator) { super((Pointer)null); allocate(opts, default_device_placement_policy, default_mirroring_policy, async, device_mgr, device_mgr_owned, rendezvous, custom_kernel_creator); }
  private native void allocate(@Const @ByRef SessionOptions opts,
                 @Cast("tensorflow::ContextDevicePlacementPolicy") int default_device_placement_policy,
                 @Cast("tensorflow::ContextMirroringPolicy") int default_mirroring_policy, @Cast("bool") boolean async,
                 @Const DeviceMgr device_mgr, @Cast("bool") boolean device_mgr_owned,
                 Rendezvous rendezvous,
                 @Const CustomKernelCreator custom_kernel_creator);

  // Returns the function library runtime for the given device.
  public native FunctionLibraryRuntime func_lib(@Const Device d);

  public native ProcessFunctionLibraryRuntime pflr();

  public native @Cast("std::function<void(std::function<void()>)>*") Pointer runner();

  // Specify a executor for this thread.
  public native void SetExecutorForThread(EagerExecutor executor);

  // TODO(apassos) make this return a constant reference
  public native DeviceMap device_map();

  // TODO(apassos) make this return a constant reference
  public native DeviceVector devices();
  public native @StdVector DeviceType prioritized_device_type_list();

  // Clears the kernel caches.
  public native void ClearCaches();

  // Sets the device placement policy for the current thread.
  public native void SetThreadLocalDevicePlacementPolicy(@Cast("tensorflow::ContextDevicePlacementPolicy") int policy);

  // Returns the device placement policy for the current thread.
  public native @Cast("tensorflow::ContextDevicePlacementPolicy") int GetDevicePlacementPolicy();

  // Sets the implicit copy policy for the current thread.
  public native void SetThreadLocalMirroringPolicy(@Cast("tensorflow::ContextMirroringPolicy") int arg0);

  // Returns the implicit copy policy for the current thread.
  public native @Cast("tensorflow::ContextMirroringPolicy") int GetMirroringPolicy();

  public native @Cast("bool") boolean MirrorTensors();

  public native @Cast("bool") boolean FindFunctionByName(@StdString BytePointer name);
  public native @Cast("bool") boolean FindFunctionByName(@StdString String name);

  public native @ByVal Status FindFunctionOpData(@StdString BytePointer name,
                              @Cast("const tensorflow::OpRegistrationData**") PointerPointer op_data);
  public native @ByVal Status FindFunctionOpData(@StdString BytePointer name,
                              @Const @ByPtrPtr OpRegistrationData op_data);
  public native @ByVal Status FindFunctionOpData(@StdString String name,
                              @Const @ByPtrPtr OpRegistrationData op_data);

  public native @Const FunctionDef FindFunctionDef(@StdString BytePointer name);
  public native @Const FunctionDef FindFunctionDef(@StdString String name);

  public native @ByVal Status FindDeviceByName(@StdString BytePointer name, @Cast("tensorflow::Device**") PointerPointer result);
  public native @ByVal Status FindDeviceByName(@StdString BytePointer name, @ByPtrPtr Device result);
  public native @ByVal Status FindDeviceByName(@StdString String name, @ByPtrPtr Device result);

  public native Device HostCPU();
  public native Device CanonicalDevice(Device d);

  public native GraphCollector GetGraphCollector();

  public native EagerExecutor Executor();

  public native @ByVal Status AddFunctionDef(@Const @ByRef FunctionDef fdef);

  public native @ByVal Status RemoveFunction(@StdString BytePointer func);
  public native @ByVal Status RemoveFunction(@StdString String func);

  public native @MoveUniquePtr("tensorflow::KernelAndDevice,tensorflow::core::RefCountDeleter") KernelAndDevice GetCachedKernel(@ByVal Fprint128 cache_key);

  public native void AddKernelToCache(@ByVal Fprint128 cache_key, KernelAndDevice kernel);

  public native @Cast("bool") boolean LogDevicePlacement();
  public native @Cast("bool") boolean AllowSoftPlacement();
  public native @Cast("bool") boolean LogMemory();

  public native Rendezvous GetRendezvous();
  public native Rendezvous CreateRendezvous(@Cast("const tensorflow::int64") long step_id);

  public native CollectiveExecutorMgrInterface collective_executor_mgr();
  public native @MoveUniquePtr CollectiveExecutor.Handle GetCollectiveExecutorHandle();

  public native @Const DeviceMgr local_device_mgr();
  public native @Const DeviceMgr remote_device_mgr();

  // TODO(apassos) remove the need for this
  public native void ReleaseDeviceMgr();

  // TODO(apassos) clean up RunMetadata storage.
  public native @Cast("tensorflow::mutex*") Pointer MetadataMu();
  public native @Cast("bool") boolean ShouldStoreGraphs();
  public native void SetShouldStoreGraphs(@Cast("bool") boolean value);
  public native RunMetadata RunMetadataProto();
  public native void ClearRunMetadata();

  public native void StartStep();
  public native void EndStep();
  public native ScopedStepContainer StepContainer();

  public native FunctionLibraryDefinition FuncLibDef();

// #if !defined(IS_MOBILE_PLATFORM)
  public native @ByVal Status GetClient(Device device, @Cast("tensorflow::eager::EagerClient**") PointerPointer client);
  public native @ByVal Status GetClient(Device device, @ByPtrPtr EagerClient client);
  public native @ByVal Status GetClient(@Const @ByRef DeviceNameUtils.ParsedName device_name,
                     @Cast("tensorflow::eager::EagerClient**") PointerPointer client);
  public native @ByVal Status GetClient(@Const @ByRef DeviceNameUtils.ParsedName device_name,
                     @ByPtrPtr EagerClient client);

  public native @Cast("tensorflow::uint64") long GetContextId();

  // TODO(nareshmodi): Encapsulate remote state into a separate
  // class/struct.
  //
  // Enables the eager context to communicate with remote devices. When
  // initializing with this method, this context will be the master context,
  // which will kill all its slaves in shutdown.
  //
  // - server: A ServerInterface that exports the tensorflow.WorkerService.
  // Note that this class expects the server to already have been started.
  // - remote_eager_workers: A cache from which we can get "EagerClient"s to
  // communicate with remote eager services.
  // - remote_device_mgr: A DeviceMgr* which contains all remote devices
  // (should contain no local devices).
  // - remote_contexts: A vector containing task names.
  public native @ByVal Status InitializeRemoteMaster(
        @MoveUniquePtr ServerInterface server, WorkerEnv worker_env,
        @SharedPtr WorkerSession worker_session,
        @MoveUniquePtr EagerClientCache remote_eager_workers,
        @MoveUniquePtr DeviceMgr remote_device_manager,
        @Const @ByRef StringVector remote_contexts, @Cast("tensorflow::uint64") long context_id,
        Rendezvous r, DeviceMgr local_device_mgr, int keep_alive_secs,
        DistributedFunctionLibraryRuntime cluster_flr,
        @MoveUniquePtr("tensorflow::eager::RemoteMgr,std::function<void(tensorflow::eager::RemoteMgr*)>") RemoteMgr remote_mgr);

  // Similar with InitializeRemoteMaster but this context will not kill remote
  // contexts in shutdown.
  public native @ByVal Status InitializeRemoteWorker(
        @MoveUniquePtr EagerClientCache remote_eager_workers,
        @Const DeviceMgr remote_device_mgr,
        @Const @ByRef StringVector remote_contexts, @Cast("tensorflow::uint64") long context_id,
        @ByVal RendezvousCreator rendezvous_creator,
        @MoveUniquePtr("tensorflow::eager::RemoteMgr,std::function<void(tensorflow::eager::RemoteMgr*)>") RemoteMgr remote_mgr);

  public native @ByVal Status StoreCollectiveOpsServer(
        @MoveUniquePtr ServerInterface server, DeviceMgr device_mgr,
        CollectiveExecutorMgrInterface rpc_collective_executor_mgr);

  // TODO(fishx): Remove the custom deleter once we remove forward declaration.
  public native @MoveUniquePtr("tensorflow::eager::RemoteMgr,std::function<void(tensorflow::eager::RemoteMgr*)>") RemoteMgr RemoteMgr();

  // If true, then tensors should be shipped across processes via the
  // EagerService.SendTensor RPC. If false, _Send/_Recv ops should be used
  // instead (which in-turn use WorkerService.RecvTensor RPCs).
  public native @Cast("bool") boolean UseSendTensorRPC();

// #endif  // IS_MOBILE_PLATFORM

  // Closes remote eager contexts, waits for all RPCs to finish, and
  // destroys the EagerClientCache. No RPCs can be made through this context
  // after this method has been called.
  // This method exists to aid a clean shutdown. It causes all RPCs to finish
  // and remote TensorHandles to release their references to this context.
  // To avoid deadlocks, this method must not be called on the thread
  // processing RPCs because it makes RPCs and waits for their completion.
  //
  // On mobile, it just cleans the caches.
  public native void WaitForAndCloseRemoteContexts();

  public native @Cast("bool") boolean PinSmallOpsToCPU();

  public native Env TFEnv();

  public native @ByVal Status FindDeviceFromName(@Cast("const char*") BytePointer device_name, @Cast("tensorflow::Device**") PointerPointer device);
  public native @ByVal Status FindDeviceFromName(@Cast("const char*") BytePointer device_name, @ByPtrPtr Device device);
  public native @ByVal Status FindDeviceFromName(String device_name, @ByPtrPtr Device device);

  public native @Cast("bool") boolean OnSameTask(@Const Device first, @Const Device second);
  // Gets the CPU device on the task of device.
  public native @ByVal Status CPUDeviceOnTask(@Const Device device, @Cast("tensorflow::Device**") PointerPointer cpu_device);
  public native @ByVal Status CPUDeviceOnTask(@Const Device device, @ByPtrPtr Device cpu_device);
  public native @Cast("bool") boolean IsLocalDeviceName(@Const @ByRef DeviceNameUtils.ParsedName device_name);
}
